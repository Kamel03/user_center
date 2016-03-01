package com.tianque.controller.vo;

import java.util.ArrayList;
import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.tianque.core.vo.Tree;
import com.tianque.domain.Organization;
import com.tianque.domain.property.OrganizationType;

public class TreeData implements Tree {
	private String id;
	private String data;
	private String jsaction;
	private String state;
	private String icons;
	private String leafIcon;
	private boolean haschild;
	private boolean selected;
	private List children = new ArrayList();

	public TreeData(Organization organization, boolean isRoot) {
		// if(isRoot){
		// selected=true;
		// }
		this.id = organization.getId().toString();
		this.jsaction = "#";
		this.data = organization.getOrgName();
		if (organization.getSubCount() > 0) {
			this.haschild = true;
		} else {
			this.haschild = false;
		}
		state = "";
		icons = "";
		if (organization.getOrgType().getInternalId() == OrganizationType.FUNCTIONAL_ORG) {
			leafIcon = ServletActionContext.getRequest().getContextPath()
					+ FUN_LEAF;
			icons = ServletActionContext.getRequest().getContextPath()
					+ FUN_LEAF;
		} else if (organization.getOrgType().getInternalId() == OrganizationType.OTHER) {
			leafIcon = ServletActionContext.getRequest().getContextPath()
					+ LEAF;
			icons = ServletActionContext.getRequest().getContextPath() + LEAF;
		} else {
			leafIcon = ServletActionContext.getRequest().getContextPath()
					+ "/resource/js/adubyTree/themes/vista/images/Folder.gif";
			icons = ServletActionContext.getRequest().getContextPath()
					+ "/resource/js/adubyTree/themes/vista/images/Folder.gif";
		}
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getIcons() {
		return icons;
	}

	public void setIcons(String icons) {
		this.icons = icons;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getJsaction() {
		return jsaction;
	}

	public void setJsaction(String jsaction) {
		this.jsaction = jsaction;
	}

	public boolean isHaschild() {
		return haschild;
	}

	public void setHaschild(boolean haschild) {
		this.haschild = haschild;
	}

	public List getChildren() {
		return children;
	}

	public void setChildren(List children) {
		this.children = children;
	}

	public boolean isSelected() {
		return selected;
	}

	public void setSelected(boolean selected) {
		this.selected = selected;
	}

	public String getLeafIcon() {
		return leafIcon;
	}

	public void setLeafIcon(String leafIcon) {
		this.leafIcon = leafIcon;
	}
}
