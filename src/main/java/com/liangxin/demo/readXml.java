package com.liangxin.demo;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import com.liangxin.uiframework.Locator;
import com.liangxin.uiframework.Locator.ByType;
import com.liangxin.utils.xmlUtils;

/**
 * @author liangxin
 * @date 2017年10月23日
 * @版本 v1.0
 */
public class readXml  {
	
	/**
	 * @throws Exception 
	 * @auther liangxin
	 * @date 2017年10月23日下午7:37:59
	 * @版本 v1.0
	 * @@param args
	 */
	public static void main(String[] args)throws DocumentException {
		HashMap<String,Locator> ls=xmlUtils.readElementInfo("LoginPage.xml");
		ls.get("fantilink").getElementName();
		
		
		
		
		
		
	}}		