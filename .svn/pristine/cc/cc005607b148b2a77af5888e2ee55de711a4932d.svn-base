package com.tianque.init.util;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.springframework.core.io.Resource;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import com.tianque.init.ContextType;

public class XmlUtil {

	public static InputStream[] getPermissionInputSteams(ContextType contextType)
			throws Exception {
		return getStreamArrayByFileNames(contextType,
				getTextValueByTagName(contextType, "permission-init-xml"));
	}

	public static InputStream[] getSqlInputStreams(ContextType contextType)
			throws Exception {
		return getStreamArrayByFileNames(contextType,
				getTextValueBatchByTagName(contextType, "sql-file"));
	}

	public static String[] getSystemPropertiesInitClasses(
			ContextType contextType) throws Exception {
		return getTextValueByTagName(contextType, "property-init-class");
	}

	private static InputStream[] getStreamArrayByFileNames(
			ContextType contextType, String[] files) throws IOException {
		InputStream[] inputStreams = new InputStream[files.length];
		for (int i = 0; i < files.length; i++) {
			System.out.println(files[i]);
			Resource resource = ApplicationContextFactory.getInstance()
					.getApplicationContext(contextType)
					.getResource("classpath:" + files[i]);
			inputStreams[i] = resource.getInputStream();
		}
		return inputStreams;
	}

	private static String[] getTextValueByTagName(ContextType contextType,
			String tagName) throws Exception {
		Resource[] resources = ApplicationContextFactory.getInstance()
				.getApplicationContext(contextType)
				.getResources("classpath:*tq-plugin.xml");
		List<String> textValues = new ArrayList<String>();
		for (Resource resource : resources) {
			System.out.println("正在读取：" + resource.getFilename());
			if (resource.exists()) {
				String propertyValue = read(resource.getInputStream(), tagName);
				System.out.println("正在读取：" + propertyValue);
				if (null != propertyValue && !"".equals(propertyValue)) {
					textValues.add(propertyValue);
				}
			}
		}
		String[] textArray = new String[textValues.size()];
		System.out.println("读取完毕：" + textValues);
		return textValues.toArray(textArray);
	}

	private static String read(InputStream file, String property)
			throws Exception {
		Document doc = getDocument(file);
		Element root = doc.getDocumentElement();
		if (root == null)
			return null;
		NodeList pluginNodes = root.getChildNodes();
		if (pluginNodes == null)
			return null;
		for (int i = 0; i < pluginNodes.getLength(); i++) {
			Node childNode = pluginNodes.item(i);
			if (childNode != null
					&& childNode.getNodeType() == Node.ELEMENT_NODE
					&& property.equals(childNode.getNodeName())) {
				return childNode.getTextContent();
			}
		}
		return null;
	}

	private static Document getDocument(InputStream file)
			throws ParserConfigurationException, FileNotFoundException,
			SAXException, IOException {
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = dbf.newDocumentBuilder();
		Document doc = builder.parse(file);
		return doc;
	}

	private static String[] getTextValueBatchByTagName(ContextType contextType,
			String tagName) throws Exception {
		Resource[] resources = ApplicationContextFactory.getInstance()
				.getApplicationContext(contextType)
				.getResources("classpath:*tq-plugin.xml");
		List<String> textValues = new ArrayList<String>();
		for (Resource resource : resources) {
			System.out.println("正在读取：" + resource.getFilename());
			if (resource.exists()) {
				String propertyValue = read(resource.getInputStream(), tagName);
				System.out.println("正在读取：" + propertyValue);
				if (null != propertyValue && !"".equals(propertyValue)) {
					String[] temp = propertyValue.trim().split(";");
					for (String value : temp) {
						if (null != value && !"".equals(value.trim()))
							textValues.add(value.trim());
					}
				}
			}
		}
		String[] textArray = new String[textValues.size()];
		System.out.println("读取完毕：" + textValues);
		return textValues.toArray(textArray);
	}
}
