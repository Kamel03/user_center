package com.tianque.domain;

import java.util.HashMap;
import java.util.Map;

import com.tianque.domain.property.OrganizationLevel;

public class OrganizationDepartmentNo {
	private int departmentNoLevel;
	private int departmentNoLength;
	private final static Map<Integer, Integer> lengthToLevel = new HashMap<Integer, Integer>();
	private final static Map<Integer, Integer> levelToLength = new HashMap<Integer, Integer>();
	static {
		lengthToLevel.put(0, OrganizationLevel.COUNTRY);
		lengthToLevel.put(2, OrganizationLevel.PROVINCE);
		lengthToLevel.put(4, OrganizationLevel.CITY);
		lengthToLevel.put(6, OrganizationLevel.DISTRICT);
		lengthToLevel.put(9, OrganizationLevel.TOWN);
		lengthToLevel.put(12, OrganizationLevel.VILLAGE);
		lengthToLevel.put(15, OrganizationLevel.GRID);

		levelToLength.put(OrganizationLevel.COUNTRY, 0);
		levelToLength.put(OrganizationLevel.PROVINCE, 2);
		levelToLength.put(OrganizationLevel.CITY, 4);
		levelToLength.put(OrganizationLevel.DISTRICT, 6);
		levelToLength.put(OrganizationLevel.TOWN, 9);
		levelToLength.put(OrganizationLevel.VILLAGE, 12);
		levelToLength.put(OrganizationLevel.GRID, 15);

	}

	public OrganizationDepartmentNo() {

	}

	public OrganizationDepartmentNo(int departmentNoLevel, int departmentNoLength) {
		this.departmentNoLength = departmentNoLength;
		this.departmentNoLevel = departmentNoLevel;
	}

	public int getDepartmentNoLevel() {
		return departmentNoLevel;
	}

	public void setDepartmentNoLevel(int departmentNoLevel) {
		this.departmentNoLevel = departmentNoLevel;
	}

	public int getDepartmentNoLength() {
		return departmentNoLength;
	}

	public void setDepartmentNoLength(int departmentNoLength) {
		this.departmentNoLength = departmentNoLength;
	}

	public static OrganizationDepartmentNo getOrganizationDepartmentNoByLength(int length) {
		if (null == lengthToLevel.get(new Integer(length))) {
			return null;
		}
		OrganizationDepartmentNo organizationDepartmentNo = new OrganizationDepartmentNo(
				lengthToLevel.get(new Integer(length)), length);
		return organizationDepartmentNo;
	}

	public static OrganizationDepartmentNo getOrganizationDepartmentNoByLevel(int level) {
		if (null == levelToLength.get(new Integer(level))) {
			return null;
		}
		OrganizationDepartmentNo organizationDepartmentNo = new OrganizationDepartmentNo(
				levelToLength.get(new Integer(level)), level);
		return organizationDepartmentNo;
	}
}
