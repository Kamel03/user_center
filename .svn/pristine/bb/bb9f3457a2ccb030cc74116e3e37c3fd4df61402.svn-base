package com.tianque.core.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.StringReader;
import java.io.UnsupportedEncodingException;

import org.exolab.castor.mapping.Mapping;
import org.exolab.castor.xml.MarshalException;
import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;
import org.exolab.castor.xml.ValidationException;
import org.exolab.castor.xml.XMLContext;

import com.tianque.exception.base.SystemUtilException;

public class ConvertXmlAndBean {

	public Object xmlToBean(InputStreamReader inputStreamReader,
			Class className, String mapInputPermissionPath) {
		return getBeanByInputStream(className, mapInputPermissionPath,
				inputStreamReader);
	}

	public Object xmlToBean(String xml, Class className, String map)
			throws FileNotFoundException, MarshalException,
			ValidationException, UnsupportedEncodingException {
		if (xml.endsWith(".xml")) {

			InputStreamReader inputStreamReader = new InputStreamReader(
					new FileInputStream(ConvertXmlAndBean.class
							.getResource("/").getPath() + xml), "UTF-8");
			return getBeanByInputStream(className, map, inputStreamReader);

		} else {
			StringReader stringReader = new StringReader(xml);
			return Unmarshaller.unmarshal(className, stringReader);
		}
	}

	private Object getBeanByInputStream(Class className, String map,
			InputStreamReader inputStreamReader) {
		try {
			XMLContext context = new XMLContext();
			Mapping mapping = context.createMapping();
			mapping.loadMapping(map);
			context.addMapping(mapping);
			Unmarshaller unmarshaller = new Unmarshaller(mapping);
			unmarshaller.setClass(className);
			return unmarshaller.unmarshal(inputStreamReader);
		} catch (Exception e) {
			throw new SystemUtilException("将XML转化成bean异常", e);
		}
	}

	public boolean beanToXml(Object object, String pathName, String map) {
		try {
			Mapping mapping = new Mapping();
			mapping.loadMapping(map);
			if (pathName.endsWith(".xml")) {
				File file = new File(pathName);
				FileOutputStream fileOutputStream = new FileOutputStream(file);
				OutputStreamWriter outputStreamWriter = new OutputStreamWriter(
						fileOutputStream, "UTF-8");
				Marshaller marshaller = new Marshaller(outputStreamWriter);
				marshaller.setSuppressXSIType(true);
				marshaller.setMapping(mapping);
				marshaller.marshal(object);
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			throw new SystemUtilException("将bean转化成XML异常", e);
		}
	}
}
