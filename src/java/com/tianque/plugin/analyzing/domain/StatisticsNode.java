/**
 * 
 */
package com.tianque.plugin.analyzing.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.tianque.domain.Organization;
import com.tianque.domain.property.OrganizationType;
import com.tianque.sysadmin.service.OrganizationService;

/**
 * 领导视图统计数据树node
 * 
 * @author 曾利民<br>
 *         email:zenglimin@hztianque.com <br>
 *         date:2014年9月19日
 */
public class StatisticsNode implements Serializable, Cloneable {

	private static final long serialVersionUID = 1L;
	private final static Logger logger = LoggerFactory
			.getLogger(StatisticsNode.class);
	private Organization organization;
	private boolean isCount;// 是否已经统计过总数
	private boolean root;
	private int level;
	private StatisticsBaseInfoAddCountVo statisticsCountVo;
	private List<StatisticsNode> children = new ArrayList<StatisticsNode>();
	private Map<Long, StatisticsNode> allMap = new HashMap<Long, StatisticsNode>();

	public Organization getOrganization() {
		return organization;
	}

	public void setOrganization(Organization organization) {
		this.organization = organization;
	}

	public StatisticsBaseInfoAddCountVo getStatisticsCountVo() {
		return statisticsCountVo;
	}

	public void setStatisticsCountVo(
			StatisticsBaseInfoAddCountVo statisticsCountVo) {
		this.statisticsCountVo = statisticsCountVo;
	}

	public boolean isRoot() {
		return root;
	}

	public void setRoot(boolean root) {
		this.root = root;
	}

	public Map<Long, StatisticsNode> getAllMap() {
		return allMap;
	}

	public StatisticsNode findNodeByOrgId(Long orgId) {
		return allMap.get(orgId);
	}

	public boolean isLeaf() {
		return children == null || children.isEmpty();
	}

	public void addChild(Long orgId, StatisticsNode child) {
		if (children == null) {
			children = new ArrayList<StatisticsNode>();
		}
		children.add(child);
	}

	/**
	 * 计算统计数据
	 */
	public void executeCount() {
		if (statisticsCountVo == null || !isLeaf())
			statisticsCountVo = new StatisticsBaseInfoAddCountVo();
		if (organization != null)
			statisticsCountVo.setStatisticsType(organization.getOrgName());
		for (StatisticsNode node : children) {
			if (node.isCount)
				continue;
			if (node.getStatisticsCountVo() == null) {
				StatisticsBaseInfoAddCountVo vo = new StatisticsBaseInfoAddCountVo();
				if (node.getOrganization() != null)
					vo.setStatisticsType(node.getOrganization().getOrgName());
				vo.setSeq(node.getOrganization().getSeq());
				node.setStatisticsCountVo(vo);
			}
			count(node.getStatisticsCountVo(), node.children, false);
		}
		count(statisticsCountVo, children, true);
		isCount = true;
	}

	/**
	 * 递归统计
	 * 
	 * @param statisticsCountVo
	 * @param childrenMap
	 * @param countChild
	 *            true：只计算子节点的和，false：从网格节点开始计算
	 */
	private void count(StatisticsBaseInfoAddCountVo statisticsCountVo,
			List<StatisticsNode> children, boolean countChild) {
		for (StatisticsNode node : children) {
			if (node.isLeaf() || countChild || node.isCount) {
				StatisticsBaseInfoAddCountVo child = node
						.getStatisticsCountVo();
				if (child != null) {
					statisticsCountVo.setTodayAddCount(statisticsCountVo
							.getTodayAddCount() + child.getTodayAddCount());
					statisticsCountVo.setThisMonthCount(statisticsCountVo
							.getThisMonthCount() + child.getThisMonthCount());
					statisticsCountVo.setAllCount(statisticsCountVo
							.getAllCount() + child.getAllCount());
					statisticsCountVo.setAttentionCount(statisticsCountVo
							.getAttentionCount() + child.getAttentionCount());
					statisticsCountVo.setInvolveSinkiangCount(statisticsCountVo
							.getInvolveSinkiangCount()
							+ child.getInvolveSinkiangCount());
					statisticsCountVo.setInvolveTibetCount(statisticsCountVo
							.getInvolveTibetCount()
							+ child.getInvolveTibetCount());
				}
			} else {
				count(statisticsCountVo, node.children, countChild);
			}
		}
	}

	/**
	 * 获取统计数据，包括一个合计和下属组织的数据
	 * 
	 * @return
	 */
	public List<StatisticsBaseInfoAddCountVo> getStatisticsResult() {
		List<StatisticsBaseInfoAddCountVo> result = new ArrayList<StatisticsBaseInfoAddCountVo>();
		for (StatisticsNode node : children) {
			result.add(node.getStatisticsCountVo());
		}
		Collections.sort(result);
		StatisticsBaseInfoAddCountVo count = statisticsCountVo.clone();
		count.setStatisticsType("合计");
		result.add(count);
		return result;
	}

	/**
	 * 递归初始化组织树
	 * 
	 * @param organization
	 * @param root
	 * @param organizaitonService
	 */
	public void setChildren(Organization organization, StatisticsNode root,
			OrganizationService organizationService) {
		Map<Long, List<Organization>> map = new HashMap<Long, List<Organization>>();
		List<Organization> orgList = organizationService
				.findAllOrgByParentOrgCode(organization.getOrgInternalCode(),
						OrganizationType.ADMINISTRATIVE_KEY);
		for (Organization org : orgList) {
			if (org.getParentOrg() == null) {
				continue;
			}
			Long parentId = org.getParentOrg().getId();
			if (map.containsKey(parentId)) {
				map.get(parentId).add(org);
			} else {
				List<Organization> temp = new ArrayList<Organization>();
				temp.add(org);
				map.put(parentId, temp);
			}
		}
		setChildren(organization, root, map, 0);
	}

	public void setChildren(Organization organization, StatisticsNode root,
			Map<Long, List<Organization>> map, int level) {
		if (organization != null && root != null && map != null) {
			allMap.put(organization.getId(), root);
			List<Organization> children = map.get(organization.getId());
			if (children != null) {
				level++;
				for (Organization child : children) {
					StatisticsNode node = new StatisticsNode();
					node.setOrganization(child);
					node.setLevel(level);
					root.addChild(child.getId(), node);
					setChildren(child, node, map, level);
				}
			}
		}
	}

	public void initAllMap() {
		allMap = new HashMap<Long, StatisticsNode>();
		allMap.put(organization.getId(), this);
		initAllMap(allMap);
	}

	private void initAllMap(Map<Long, StatisticsNode> map) {
		for (StatisticsNode statisticsNode : children) {
			if (statisticsNode.getOrganization() != null) {
				map.put(statisticsNode.getOrganization().getId(),
						statisticsNode);
			}
			if (statisticsNode.children != null) {
				statisticsNode.initAllMap(map);
			}
		}
	}

	@Override
	public StatisticsNode clone() {
		try {
			StatisticsNode other = (StatisticsNode) super.clone();
			other.statisticsCountVo = null;
			List<StatisticsNode> temp = new ArrayList<StatisticsNode>();
			for (StatisticsNode statisticsNode : children) {
				temp.add(statisticsNode.clone());
			}
			other.children = temp;
			if (root) {
				other.initAllMap();
			}
			return other;
		} catch (CloneNotSupportedException e) {
			logger.error("", e);
		}
		return null;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}
}
