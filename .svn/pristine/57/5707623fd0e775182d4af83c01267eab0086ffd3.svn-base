package com.tianque.core.datatransfer;

import java.beans.PropertyDescriptor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ognl.Ognl;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tianque.core.datatransfer.dataconvert.DataConvertionHelper;
import com.tianque.core.datatransfer.dataconvert.ValidateHelper;
import com.tianque.core.validate.ValidateResult;
import com.tianque.domain.Organization;
import com.tianque.domain.PropertyDict;
import com.tianque.exception.base.OperationFailedException;
import com.tianque.sysadmin.service.OrganizationService;

@Component("excelImportHelper")
public class ExcelImportHelper {

	public final static Logger logger = LoggerFactory
			.getLogger(ExcelImportHelper.class);

	protected static DataConvertionHelper convertHelper;
	public final static int USER_IMPORT_DATA = 2;
	public final static int IMPORT_DATA = 3;

	protected static ValidateHelper validateHelper;

	private static Map<String, String> dataColumMap = new HashMap<String, String>();
	public static ThreadLocal<Boolean> isImport = new ThreadLocal<Boolean>();
	public static ThreadLocal<Integer> realRow = new ThreadLocal<Integer>();
	public static ThreadLocal<Boolean> isUpdateSolrIndex = new ThreadLocal<Boolean>();
	public static ThreadLocal<HashMap<String, HashMap<String, Long>>> importIdRange = new ThreadLocal<HashMap<String, HashMap<String, Long>>>();
	protected static OrganizationService organizationService;

	@Autowired
	public void setConvertHelper(DataConvertionHelper convertHelper) {
		ExcelImportHelper.convertHelper = convertHelper;
	}

	@Autowired
	public void setConvertHelper(ValidateHelper validateHelper) {
		ExcelImportHelper.validateHelper = validateHelper;
	}

	@Autowired
	public void setOrganizationService(OrganizationService organizationService) {
		ExcelImportHelper.organizationService = organizationService;
	}

	/***
	 * 验证网格的org并且赋值给object的org属性(表格上社区要在网格前面)
	 * 
	 * @param beanDatas
	 * @param cellValues
	 * @param uploadOrganization
	 * @param i
	 * @param object
	 * @param falg
	 * @param mapMessages
	 * @return
	 */
	private static boolean validateGridOrg(String[][] beanDatas,
			String[] cellValues, Organization uploadOrganization, int i,
			Object object, Boolean falg, Map<String, String> mapMessages) {

		if (DataType.DATA_TYPE_GRID_ORG.equals(beanDatas[1][i])) {
			falg = true;
			Organization org = null;
			try {
				/** 内省获取赋值后的组织机构（村社区） */
				PropertyDescriptor organization = new PropertyDescriptor(
						beanDatas[0][i], object.getClass());
				organization.getReadMethod().setAccessible(true);
				org = (Organization) organization.getReadMethod()
						.invoke(object);

			} catch (Exception e) {
				throw new OperationFailedException(
						"类ExcelImportHelper的newProcTownLeaderImportDate方法出现异常，原因：",
						e);
			}
			if (null == org || null == org.getId()) {
				mapMessages.put(String.valueOf(i + 1), beanDatas[2][i] + "不正确");
				return false;
			}
			org = convertHelper.convertToOrganization(org, cellValues[i]);
			if (null == org || null == org.getId()) {
				mapMessages.put(String.valueOf(i + 1), beanDatas[2][i] + "不正确");

				return false;
			}
			setProperty(object, beanDatas[0][i], org);
			return false;
		}
		return true;
	}

	/**
	 * 验证社区的org并且赋值给object的org属性(表格上社区要在网格前面)
	 * 
	 * @param beanDatas
	 * @param cellValues
	 * @param uploadOrganization
	 * @param i
	 * @param object
	 * @param falg
	 * @param mapMessages
	 * @return
	 */
	private static boolean validateVillageOrg(String[][] beanDatas,
			String[] cellValues, Organization uploadOrganization, int i,
			Object object, Boolean falg, Map<String, String> mapMessages) {
		if (DataType.DATA_TYPE_VILLAGE_ORG.equals(beanDatas[1][i])) {
			falg = true;
			Organization org = convertHelper.convertToOrganization(
					uploadOrganization, cellValues[i]);
			if (null == org || null == org.getId()) {
				mapMessages.put(String.valueOf(i + 1), beanDatas[2][i] + "不正确");

				return false;
			}
			setProperty(object, beanDatas[0][i], org);
		}
		return true;
	}

	public static Object newProcImportDate(String[][] beanDatas,
			String[] cellValues, Organization uploadOrganization,
			Object object, ValidateResult vr) {
		Map<String, String> mapMessages = new HashMap<String, String>();
		ExcelImportHelper.isImport.set(true);
		// 防止数组下标异常
		int length = beanDatas[0].length > cellValues.length ? cellValues.length
				: beanDatas[0].length;
		Boolean falg = false;
		for (int i = 0; i < length; i++) {

			putDataColumMap(beanDatas[0][i], i);
			if (!validateVillageOrg(beanDatas, cellValues, uploadOrganization,
					i, object, falg, mapMessages)) {
				continue;
			}
			if (!validateGridOrg(beanDatas, cellValues, uploadOrganization, i,
					object, falg, mapMessages)) {
				continue;
			}
			if (!validateOrg(beanDatas, cellValues, uploadOrganization, i,
					object, falg, mapMessages)) {
				continue;
			}
			if (StringUtils.isEmpty(cellValues[i])) {
				continue;
			}
			if (!validateDict(beanDatas, cellValues, i, object, falg,
					mapMessages)) {
				continue;
			}
			if (!validateDate(beanDatas, cellValues, i, object, falg,
					mapMessages)) {
				continue;
			}
			if (!validateBoolean(beanDatas, cellValues, i, object, falg,
					mapMessages)) {
				continue;
			}
			if (!validateDictList(beanDatas, cellValues, i, object, falg,
					mapMessages)) {
				continue;
			}
			if (!validateInteger(beanDatas, cellValues, i, object, falg,
					mapMessages)) {
				continue;
			}
			if (!validateInt(beanDatas, cellValues, i, object, falg,
					mapMessages)) {
				continue;
			}
			if (!validateDouble(beanDatas, cellValues, i, object, falg,
					mapMessages)) {
				continue;
			}
			if (!validateLong(beanDatas, cellValues, i, object, falg,
					mapMessages)) {
				continue;
			}
			if (!StringUtils.isEmpty(cellValues[i])
					&& !StringUtils.isEmpty(beanDatas[0][i]) && !falg) {
				setProperty(object, beanDatas[0][i], cellValues[i]);
			}
		}

		vr.setMapMessages(mapMessages);
		return object;
	}

	private static boolean validateOrg(String[][] beanDatas,
			String[] cellValues, Organization uploadOrganization, int i,
			Object object, Boolean falg, Map<String, String> mapMessages) {
		if (DataType.DATA_TYPE_ORG.equals(beanDatas[1][i])) {
			falg = true;
			Organization org = convertHelper.convertToOrganization(
					uploadOrganization, cellValues[i]);
			if (null == org || null == org.getId()) {
				mapMessages.put(String.valueOf(i + 1), beanDatas[2][i] + "不正确");

				return false;
			}
			// if (!org.getOrgInternalCode().startsWith(
			// organizationService.getSimpleOrgById(
			// ThreadVariable.getUser().getOrganization().getId())
			// .getOrgInternalCode())) {
			// mapMessages.put(String.valueOf(i + 1), beanDatas[2][i]
			// + "不正确,权限越界，不能将数据导入到该网格下！");
			// return false;
			// }
			setProperty(object, beanDatas[0][i], org);
			return false;
		}
		return true;
	}

	private static boolean validateDict(String[][] beanDatas,
			String[] cellValues, int i, Object object, Boolean falg,
			Map<String, String> mapMessages) {
		if (DataType.DATA_TYPE_DICT.equals(beanDatas[1][i])) {
			falg = true;
			PropertyDict dict = convertHelper.convertToPropertyDict(
					beanDatas[2][i], cellValues[i]);
			if (!validateHelper.emptyString(cellValues[i])) {
				if (null == dict || null == dict.getId()) {
					mapMessages.put(String.valueOf(i + 1), beanDatas[2][i]
							+ "输入不正确");
					return false;
				}
			}
			setProperty(object, beanDatas[0][i], dict);
			return false;
		}
		return true;
	}

	private static boolean validateDate(String[][] beanDatas,
			String[] cellValues, int i, Object object, Boolean falg,
			Map<String, String> mapMessages) {
		if (DataType.DATA_TYPE_DATE.equals(beanDatas[1][i])) {
			falg = true;
			try {
				if (validateHelper.illegalDate(cellValues[i])) {
					mapMessages.put(String.valueOf(i + 1), beanDatas[2][i]
							+ "输入格式不正确");
					return false;
				}
			} catch (IndexOutOfBoundsException e) {
				// fateson add 修复（如果日期 输入 成2015-0 就会抱错 ，页面呈现 模板错误bug）
				mapMessages.put(String.valueOf(i + 1), beanDatas[2][i]
						+ "输入格式不正确");
				return false;
			}
			setProperty(object, beanDatas[0][i],
					convertHelper.convertToDate(cellValues[i]));
			return false;
		}
		return true;
	}

	private static boolean validateBoolean(String[][] beanDatas,
			String[] cellValues, int i, Object object, Boolean falg,
			Map<String, String> mapMessages) {
		if (DataType.DATA_TYPE_BOOLEAN.equals(beanDatas[1][i])
				|| DataType.DATA_TYPE_BOOLEANS.equals(beanDatas[1][i])) {
			falg = true;
			if ((cellValues[i] != null && cellValues[i].toString().length() != 0)
					&& !"是".equals(cellValues[i])
					&& !"有".equals(cellValues[i])
					&& !"否".equals(cellValues[i]) && !"无".equals(cellValues[i])) {
				mapMessages.put(String.valueOf(i + 1), beanDatas[2][i]
						+ "输入格式不正确");
				return false;
			}
			if ("是".equals(cellValues[i]) || "有".equals(cellValues[i])) {
				setProperty(object, beanDatas[0][i], Long.valueOf("1"));
			} else {
				setProperty(object, beanDatas[0][i], Long.valueOf("0"));
			}
			return false;
		}
		return true;
	}

	private static Boolean validateDictList(String[][] beanDatas,
			String[] cellValues, int i, Object object, boolean falg,
			Map<String, String> mapMessages) {
		if (DataType.DATA_TYPE_DICT_LIST.equals(beanDatas[1][i])) {
			falg = true;
			if ("是".equals(cellValues[i]) || "有".equals(cellValues[i])) {
				List<PropertyDict> dicts = null;
				if (null == getValueByOgnl(beanDatas[0][i], object)) {
					dicts = new ArrayList<PropertyDict>();
					dicts.add(convertHelper.convertToPropertyDict(
							beanDatas[2][i], beanDatas[3][i]));

					setProperty(object, beanDatas[0][i], dicts);
				} else {
					dicts = (List<PropertyDict>) getValueByOgnl(
							beanDatas[0][i], object);
					dicts.add(convertHelper.convertToPropertyDict(
							beanDatas[2][i], beanDatas[3][i]));
					setProperty(object, beanDatas[0][i], dicts);
				}

				if (beanDatas.length > 6) {
					if (!"".contains(beanDatas[5][i])) {
						setProperty(object, beanDatas[4][i],
								convertHelper.convertToPropertyDict(
										beanDatas[5][i], beanDatas[6][i]));
					} else {
						setProperty(object, beanDatas[4][i], beanDatas[6][i]);
					}
				}

			}
			return false;
		}
		return true;

	}

	private static boolean validateInteger(String[][] beanDatas,
			String[] cellValues, int i, Object object, boolean falg,
			Map<String, String> mapMessages) {
		if (DataType.DATA_TYPE_INTEGER.equals(beanDatas[1][i])) {
			falg = true;
			if (validateHelper.illegalInteger(cellValues[i])) {
				mapMessages.put(String.valueOf(i + 1), beanDatas[2][i]
						+ "输入格式不正确");
				return false;
			}
			setProperty(object, beanDatas[0][i],
					convertHelper.convertToInteger(cellValues[i]));
			return false;
		}
		return true;

	}

	private static boolean validateInt(String[][] beanDatas,
			String[] cellValues, int i, Object object, boolean falg,
			Map<String, String> mapMessages) {
		if (DataType.DATA_TYPE_INT.equals(beanDatas[1][i])) {
			falg = true;
			if (validateHelper.illegalNum(cellValues[i])) {
				mapMessages.put(String.valueOf(i + 1), beanDatas[2][i]
						+ "输入格式不正确");
				return false;
			}
			setProperty(object, beanDatas[0][i],
					convertHelper.convertToInteger(cellValues[i]));
			return false;
		}
		return true;

	}

	private static boolean validateDouble(String[][] beanDatas,
			String[] cellValues, int i, Object object, boolean falg,
			Map<String, String> mapMessages) {
		if (DataType.DATA_TYPE_DOUBLE.equals(beanDatas[1][i])) {
			falg = true;
			if (validateHelper.illegalPointNumber(cellValues[i])) {
				mapMessages.put(String.valueOf(i + 1), beanDatas[2][i]
						+ "输入格式不正确");
				return false;
			}
			setProperty(object, beanDatas[0][i],
					convertHelper.convertToDouble(cellValues[i]));
			return false;
		}
		return true;

	}

	private static boolean validateLong(String[][] beanDatas,
			String[] cellValues, int i, Object object, boolean falg,
			Map<String, String> mapMessages) {
		if (DataType.DATA_TYPE_LONG.equals(beanDatas[1][i])) {
			falg = true;
			if (validateHelper.illegalNum(cellValues[i])) {
				mapMessages.put(String.valueOf(i + 1), beanDatas[2][i]
						+ "输入格式不正确");
				return false;
			}
			setProperty(object, beanDatas[0][i],
					convertHelper.convertToLong(cellValues[i]));
			return false;
		}
		return true;
	}

	public static void putDataColumMap(String key, int value) {
		dataColumMap.put(key, String.valueOf(value));
	}

	public static Object procImportDate(String[][] excelDefines,
			String[] cellValues, Organization uploadOrganization,
			Object object, ValidateResult vr) {
		ExcelImportHelper.isImport.set(true);
		String lineNumber = "第[" + ExcelImportHelper.realRow.get() + "]行";
		// 防止数组下标异常
		int length = excelDefines.length > cellValues.length ? cellValues.length
				: excelDefines.length;
		for (int i = 0; i < length; i++) {
			putDataColumMap(excelDefines[i][1], excelDefines[i][0]);

			if (DataType.DATA_TYPE_ORG.equals(excelDefines[i][3])) {
				Organization org = convertHelper.convertToOrganization(
						uploadOrganization, cellValues[i]);
				if (null == org || null == org.getId()) {
					vr.addErrorMessage(lineNumber + "第["
							+ (Integer.valueOf(excelDefines[i][0]) + 1)
							+ "]列输入" + excelDefines[i][2] + "不正确");
					continue;
				}
				// if (!org.getOrgInternalCode().startsWith(
				// organizationService.getSimpleOrgById(
				// ThreadVariable.getUser().getOrganization()
				// .getId()).getOrgInternalCode())) {
				// vr.addErrorMessage(lineNumber + "第["
				// + (Integer.valueOf(excelDefines[i][0]) + 1)
				// + "]列输入" + excelDefines[i][2]
				// + "不正确,权限越界，不能将数据导入到该网格下！");
				// continue;
				// }
				setProperty(object, excelDefines[i][1], org);
				continue;
			}

			if (StringUtils.isEmpty(cellValues[i])) {
				continue;
			}
			if (DataType.DATA_TYPE_DICT.equals(excelDefines[i][3])) {
				PropertyDict dict = convertHelper.convertToPropertyDict(
						excelDefines[i][4], cellValues[i]);
				if (!validateHelper.emptyString(cellValues[i])) {
					if (null == dict || null == dict.getId()) {
						vr.addErrorMessage(lineNumber + "第["
								+ (Integer.valueOf(excelDefines[i][0]) + 1)
								+ "]列输入" + excelDefines[i][2] + "不正确");
						continue;
					}
				}
				setProperty(object, excelDefines[i][1], dict);
				continue;
			}
			if (DataType.DATA_TYPE_DATE.equals(excelDefines[i][3])) {
				if (validateHelper.illegalDate(cellValues[i])) {
					vr.addErrorMessage(lineNumber + "第["
							+ (Integer.valueOf(excelDefines[i][0]) + 1) + "]列"
							+ excelDefines[i][2] + "格式不正确");
					continue;
				}
				setProperty(object, excelDefines[i][1],
						convertHelper.convertToDate(cellValues[i]));
				continue;
			}
			if (DataType.DATA_TYPE_BOOLEAN.equals(excelDefines[i][3])
					|| DataType.DATA_TYPE_BOOLEANS.equals(excelDefines[i][3])) {
				if ("是".equals(cellValues[i]) || "有".equals(cellValues[i])) {
					setProperty(object, excelDefines[i][1], Long.valueOf("1"));
				} else {
					setProperty(object, excelDefines[i][1], Long.valueOf("0"));
				}
				continue;
			}
			if (DataType.DATA_TYPE_DICT_LIST.equals(excelDefines[i][3])) {
				if ("是".equals(cellValues[i]) || "有".equals(cellValues[i])) {
					List<PropertyDict> dicts = null;
					if (null == getValueByOgnl(excelDefines[i][1], object)) {
						dicts = new ArrayList<PropertyDict>();
						dicts.add(convertHelper.convertToPropertyDict(
								excelDefines[i][4], excelDefines[i][5]));
						setProperty(object, excelDefines[i][1], dicts);
					} else {
						dicts = (List<PropertyDict>) getValueByOgnl(
								excelDefines[i][1], object);
						dicts.add(convertHelper.convertToPropertyDict(
								excelDefines[i][4], excelDefines[i][5]));
					}
					if (excelDefines[i].length > 9) {
						if (excelDefines[i][7].length() > 0) {
							setProperty(object, excelDefines[i][6],
									convertHelper.convertToPropertyDict(
											excelDefines[i][7],
											excelDefines[i][8]));
						} else {
							setProperty(object, excelDefines[i][6],
									excelDefines[i][8]);
						}
					}
				}
				continue;
			} else if (DataType.DATA_TYPE_INTEGER.equals(excelDefines[i][3])) {
				if (validateHelper.illegalNum(cellValues[i])) {
					vr.addErrorMessage(lineNumber + "第["
							+ (Integer.valueOf(excelDefines[i][0]) + 1) + "]列"
							+ excelDefines[i][2] + "格式不正确");
					continue;
				}
				setProperty(object, excelDefines[i][1],
						convertHelper.convertToInteger(cellValues[i]));
				continue;
			} else if (DataType.DATA_TYPE_DOUBLE.equals(excelDefines[i][3])) {
				if (validateHelper.illegalPointNumber(cellValues[i])) {
					vr.addErrorMessage(lineNumber + "第["
							+ (Integer.valueOf(excelDefines[i][0]) + 1) + "]列"
							+ excelDefines[i][2] + "格式不正确");
					continue;
				}
				setProperty(object, excelDefines[i][1],
						convertHelper.convertToDouble(cellValues[i]));
				continue;
			} else if (DataType.DATA_TYPE_LONG.equals(excelDefines[i][3])) {
				if (validateHelper.illegalNum(cellValues[i])) {
					vr.addErrorMessage(lineNumber + "第["
							+ (Integer.valueOf(excelDefines[i][0]) + 1) + "]列"
							+ excelDefines[i][2] + "格式不正确");
					continue;
				}
				setProperty(object, excelDefines[i][1],
						convertHelper.convertToLong(cellValues[i]));
				continue;
			} else {
				if (!StringUtils.isEmpty(cellValues[i])
						&& !StringUtils.isEmpty(excelDefines[i][1])) {
					setProperty(object, excelDefines[i][1], cellValues[i]);
				}
			}
		}
		return object;
	}

	private static Object getValueByOgnl(String expression, Object root) {
		try {
			return Ognl.getValue(expression, root);
		} catch (Exception e) {
			throw new OperationFailedException("从ognl取值异常", e);
		}
	}

	private static void setProperty(Object bean, String name, Object value) {
		try {
			BeanUtils.setProperty(bean, name, value);
		} catch (Exception e) {
			throw new OperationFailedException("设置属性值异常", e);
		}
	}

	public static String getDataColumMap(String key) {
		return dataColumMap.get(key);
	}

	public static void putDataColumMap(String key, String value) {
		dataColumMap.put(key, value);
	}

	public static String getColumNo(String key) {
		StringBuffer bf = new StringBuffer();
		if (!StringUtils.isEmpty(ExcelImportHelper.getDataColumMap(key))) {
			bf.append("第[").append(ExcelImportHelper.realRow.get())
					.append("]行");
			bf.append("第[")
					.append(Integer.valueOf(ExcelImportHelper
							.getDataColumMap(key)) + 1).append("]列");
		} else {
			bf.append("");
		}
		return bf.toString();
	}
}
