/**
 * @auther liangxin
 * @date  2017年10月23日
 */
package com.liangxin.uiframework;

/**
 * @author liangxin
 * @date 2017年10月23日
 * @版本 v1.0
 */
public class Locator {
	public enum ByType{
		xpath,id,linkText,name,className,cssSelector,partialLinkText,tagName
	}
  private String elementName;//元素名称
  private String locatorInfo;//元素定位信息
  private int timeout;//等待时间
  private ByType byType;//识别方法
 
  public Locator(String element,int timeout,ByType byType,String name){
	  this.elementName=name;
	  this.locatorInfo=element;
	  this.timeout=timeout;
	  this.byType=byType;
	  
  }

public String getElementName() {
	return elementName;
}

public String getLocatorInfo() {
	return locatorInfo;
}

public int getTimeOut() {
	return timeout;
}

public ByType getByType() {
	return byType;
}

/**
 * @auther liangxin
 * @date 2017年10月24日下午5:18:16
 * @版本 v1.0
 * @@return
 */

  
}
