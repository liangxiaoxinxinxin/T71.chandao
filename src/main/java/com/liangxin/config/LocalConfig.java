/**
 * @auther liangxin
 * @date  2017年10月23日
 */
package com.liangxin.config;

import com.liangxin.utils.PropertiesUtils;

/**
 * @author liangxin
 * @date 2017年10月23日
 * @版本 v1.0
 */
public class LocalConfig {
	static PropertiesUtils propertiesUtils=new PropertiesUtils("/local.properties");
	   public static final String url=propertiesUtils.getPropertisValue("url");
	   public static final String CHROME_PATH=propertiesUtils.getPropertisValue("chromedriverpath");
	   public static final String FIREFOX_PATH=propertiesUtils.getPropertisValue("FireFoxedriverpath");
	   public static final String IE_PATH=propertiesUtils.getPropertisValue("iedriverpath");
	   public static final String SCRRNSSHORTPATH=propertiesUtils.getPropertisValue("shotPath");
	   
}
