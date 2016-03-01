package com.tianque.init;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.tianque.core.datatransfer.ExcelReader;
import com.tianque.core.datatransfer.data.ExcelData;
import com.tianque.core.util.FileUtil;
import com.tianque.domain.Organization;
import com.tianque.domain.OrganizationDepartmentNo;
import com.tianque.domain.PropertyDict;
import com.tianque.domain.property.OrganizationLevel;
import com.tianque.domain.property.OrganizationType;
import com.tianque.sysadmin.service.OrganizationService;
import com.tianque.sysadmin.service.PropertyDictService;

public class OrganizationExcelInit implements Initialization {

	private static Logger logger = LoggerFactory
			.getLogger(OrganizationExcelInit.class);

	List<Organization> arrayList = new ArrayList<Organization>();
	private boolean isProvinceInit = false;
	PropertyDictService propertyDictService;
	OrganizationService organizationService;
	Organization country = new Organization();
	private ExcelData excelData = new ExcelData();
	private final int sumLevel = OrganizationLevel.COUNTRY;

	public int getSumLevel() {
		return sumLevel;
	}

	public boolean isProvinceInit() {
		return isProvinceInit;
	}

	public void setProvinceInit(boolean isProvinceInit) {
		this.isProvinceInit = isProvinceInit;
	}

	public ExcelData getExcelData() {
		return excelData;
	}

	public void setExcelData(ExcelData excelData) {
		this.excelData = excelData;
	}

	public List<Organization> getArrayList() {
		return arrayList;
	}

	public void setArrayList(List<Organization> arrayList) {
		this.arrayList = arrayList;
	}

	public Organization getCountry() {
		return country;
	}

	public void setCountry(Organization country) {
		this.country = country;
	}

	public OrganizationExcelInit(PropertyDictService propertyDictService,
			OrganizationService organizationService, boolean isProvinceInit) {
		this.propertyDictService = propertyDictService;
		this.organizationService = organizationService;
		this.isProvinceInit = isProvinceInit;
	}

	@Override
	public void init() throws Exception {
		try {
			country = organizationService
					.addOrganization(getRootOrganization());
			for (int j = 0; j < sumLevel; j++) {
				arrayList.add(getRootOrganization());
			}
			chooseOrganizationExcel();
		} catch (Exception e) {
			logger.error("错误信息:", e);
		}
	}

	public ExcelData getExcelData(String filePath) {
		try {
			File file = new File(filePath);
			FileInputStream fileInputStream = new FileInputStream(file);
			ExcelData excelData = ExcelReader.readFile(fileInputStream);
			return excelData;
		} catch (Exception e) {
			System.err.println("读取excel文件时出现问题!");
		}
		return excelData;
	}

	public void executeHashMapSheet(ExcelData excelData) throws Exception {
		String[][] table = excelData.getSheetDatas(0);
		if (table.length > 1) {
			executeTable(table);
		}
	}

	public void executeTable(String[][] table) throws Exception {
		for (int i = 0; i < table.length; i++) {
			String[] row = table[i];
			validateRow(row);
			if (i != 0) {
				try {
					executeRow(row);
				} catch (Exception e) {
					System.err.println("第" + i
							+ "行出现问题！请注意组织机构名不要和上一条重复!或者部门编号也不要重复!");
				}
			}
		}
	}

	public void validateRow(String[] row) throws Exception {
		if (row.length % 2 != 0) {
			System.err.println(row.length);
			throw new Exception("给的表的格式有问题!");
		}
	}

	public void executeRow(String[] row) throws Exception {
		for (int i = 0; i < row.length; i++) {
			if (i % 2 == 0) {
				String name = row[i];
				String orgInternalCode = row[i + 1].trim();
				if (name.equals("") && orgInternalCode.equals("")) {
					continue;
				}
				try {
					executeColumn(name, orgInternalCode, i);
				} catch (Exception e) {
					e.printStackTrace();
					throw new Exception();
				}
			}
		}
	}

	public void executeColumn(String name, String departmentNo, int column) {
		if (validateRepeatOrgNameOrDepartmentNo(name, departmentNo)) {
			return;
		}
		if (column == 0) {
			addProvince(name, departmentNo);
			return;
		}
		Organization organization = updateArrayList(name, departmentNo, column);
		organization.setParentOrg(arrayList
				.get(getIndexInArrayListByColumn(column) - 1));
		organization = organizationService.addOrganization(organization);
		arrayList.set(getIndexInArrayListByColumn(column), organization);
	}

	private int getIndexInArrayListByColumn(int column) {
		return column / 2;
	}

	private boolean validateRepeatOrgNameOrDepartmentNo(String orgName,
			String departmentNo) {
		for (int i = 0; i < arrayList.size(); i++) {
			if (arrayList.get(i).getOrgName().equals(orgName)
					|| arrayList.get(i).getOrgInternalCode()
							.equals(departmentNo)) {
				if (null != arrayList.get(i).getId()) {
					return true;
				}
			}
		}
		return false;
	}

	private void addProvince(String name, String deparmentNo) {
		Organization organization = new Organization();
		organization.setOrgName(name);
		organization.setCreateDate(Calendar.getInstance().getTime());
		organization.setOrgType(getAdministrativeRegionOrgType().get(0));
		organization
				.setOrgLevel(getOrgLevelByLevel(OrganizationLevel.PROVINCE));
		organization.setCreateUser("超级管理员");
		organization.setParentOrg(country);
		organization.setOrgInternalCode(deparmentNo);
		organization.setDepartmentNo(deparmentNo);
		arrayList.set(0, organizationService.addOrganization(organization));
	}

	private boolean validateRegion(String orgInternalCode) {
		String regex = "[a-zA-Z]+";
		Matcher matcher = Pattern.compile(regex).matcher(orgInternalCode);
		return matcher.find();
	}

	/**
	 * 更新存储父Organization的arrayList
	 * 
	 * @return
	 */
	public Organization updateArrayList(String name, String departmentNo,
			int column) {
		Organization organization = new Organization();
		organization.setOrgName(name.trim());
		organization.setCreateUser("超级管理员");
		addOrgTypeToOrg(departmentNo, organization);
		organization.setOrgLevel(getOrgLevelsByDepartmentNo(departmentNo)
				.get(0));
		organization.setCreateDate(Calendar.getInstance().getTime());
		organization.setOrgInternalCode(departmentNo);
		organization.setDepartmentNo(departmentNo);
		arrayList.set(getIndexInArrayListByColumn(column), organization);
		return organization;
	}

	private void addOrgTypeToOrg(String departmentNo, Organization organization) {
		if (!validateRegion(departmentNo)) {
			organization.setOrgType(getAdministrativeRegionOrgType().get(0));
		} else {
			organization.setOrgType(getFunctionalOrgType().get(0));
		}
	}

	private void chooseOrganizationExcel() throws Exception {
		if (!isProvinceInit) {
			this.executeHashMapSheet(getExcelData(getDevelopOrgPath()));
		} else {
			this.executeHashMapSheet(getExcelData(FileUtil.getWebRoot()
					+ "/WEB-INF/classes/organizationConfig-production.xls"));
		}
	}

	protected String getDevelopOrgPath() {
		return FileUtil.getWebRoot()
				+ "/WEB-INF/classes/organizationConfig-development.xls";
	}

	private List<PropertyDict> getFunctionalOrgType() {
		List<PropertyDict> orgTypes = propertyDictService
				.findPropertyDictByDomainNameAndInternalId(
						OrganizationType.ORG_TYPE_KEY,
						OrganizationType.FUNCTIONAL_ORG);
		return orgTypes;
	}

	private List<PropertyDict> getOrgLevelsByDepartmentNo(String departmentNo) {
		List<PropertyDict> orgLevels = propertyDictService
				.findPropertyDictByDomainNameAndInternalId(
						OrganizationLevel.ORG_LEVEL_KEY,
						OrganizationDepartmentNo
								.getOrganizationDepartmentNoByLength(
										departmentNo.length())
								.getDepartmentNoLevel());
		return orgLevels;
	}

	private List<PropertyDict> getAdministrativeRegionOrgType() {
		List<PropertyDict> orgTypes = propertyDictService
				.findPropertyDictByDomainNameAndInternalId(
						OrganizationType.ORG_TYPE_KEY,
						OrganizationType.ADMINISTRATIVE_REGION);
		return orgTypes;
	}

	public Organization getRootOrganization() {
		Organization organization = new Organization();
		organization.setOrgName("中国");
		organization.setCreateUser("超级管理员");
		organization.setOrgInternalCode("1.");
		organization.setOrgType(getAdministrativeRegionOrgType().get(0));

		organization.setOrgLevel(getOrgLevelByLevel(OrganizationLevel.COUNTRY));
		organization.setCreateDate(Calendar.getInstance().getTime());
		return organization;
	}

	private PropertyDict getOrgLevelByLevel(int orgLevel) {
		List<PropertyDict> orgLevels = propertyDictService
				.findPropertyDictByDomainNameAndInternalId(
						OrganizationLevel.ORG_LEVEL_KEY, orgLevel);
		return orgLevels.get(0);
	}
}
