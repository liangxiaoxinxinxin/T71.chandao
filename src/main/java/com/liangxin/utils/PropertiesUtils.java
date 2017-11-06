/**
 * @auther liangxin
 * @date  2017年10月23日
 */
package com.liangxin.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;



/**
 * @author liangxin
 * @date 2017年10月23日
 * @版本 v1.0
 */
public class PropertiesUtils {

private static Properties properties=null;
private static String propertiesFileName;
public PropertiesUtils(String path){
	this.propertiesFileName=path;
}


public static String getPropertisValue(String KeyName){
	properties=new Properties();
	  InputStream in = PropertiesUtils.class.getClassLoader().getResourceAsStream("com/liangxin/config/"+propertiesFileName);
	  String value=null;
	 try {
		properties.load(in);
		value=properties.getProperty(KeyName);
	} catch (IOException e) {
		
		e.printStackTrace();
	}
	return value;
	
	
}
}