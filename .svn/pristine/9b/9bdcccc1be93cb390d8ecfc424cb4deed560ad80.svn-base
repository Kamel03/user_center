package com.tianque.init;

import java.io.InputStream;

import com.tianque.exception.base.OperationFailedException;
import com.tianque.init.ContextType;
import com.tianque.init.impl.PermissionXmlInit;
import com.tianque.init.util.XmlUtil;
import com.tianque.sysadmin.service.PermissionService;

public class PermissionPluginInitialization extends PermissionXmlInit {
	private ContextType contextType;

	public PermissionPluginInitialization(PermissionService permissionService,
			ContextType contextType) {
		super(permissionService);
		this.contextType = contextType;
	}

	@Override
	public void init() {
		initPlugin();
	}

	private void initPlugin() {
		try {
			InputStream[] xmls = XmlUtil.getPermissionInputSteams(contextType);
			for (InputStream xml : xmls) {
				initPermission(xml);
			}

		} catch (Exception e) {
			throw new OperationFailedException("初始化权限插件异常", e);
		}
	}
}
