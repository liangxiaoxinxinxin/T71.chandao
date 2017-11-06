/**
 * @auther liangxin
 * @date  2017年10月23日
 */
package com.liangxin.utils;

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


public class xmlUtils {
public static HashMap<String,Locator> readElementInfo(String filename) throws DocumentException {
   //String xmlfilepath=System.getProperty("user.dir"+"/webElementdata/"+filename);
	 //提取xml里面的数据，存入一个Map
	   Map<String,Locator> elementinfos=new HashMap<String,Locator>();
	  	SAXReader saxReader =new SAXReader();
	    Document document =	saxReader.read(new File(filename));
	    //提取根节点
      Element root=document.getRootElement();
  	List<Element> childList =root.elements("locator");//根节点下所有子节点
      for(Element e:childList){
     	 String value=e.attributeValue("value").toString();
          int timeOut=Integer.parseInt(e.attributeValue("timeout"));
          String name=e.attributeValue("name").toString();
          String type=e.attributeValue("type").toString();  	
          Locator locator=new Locator(value,timeOut,getType(type),name);
          String keyName=e.getText();
     	  
          elementinfos.put(keyName, locator);
     	 
      }
     
    return (HashMap<String,Locator>) elementinfos; 
     
}
	 public static ByType getType(String value){
 	 ByType type=null;
 	 switch(value){
 	 case "css":
     	 type=ByType.cssSelector;
     	 break;
 	 case "xpath":
     	 type=ByType.xpath;
     	break;
 	 case "id":
     	 type=ByType.id;
     	break; 
 
 	 case "name":
     	 type=ByType.name;
     	break; 
 
 	 case "className":
     	 type=ByType.className;
     	break;
 	
 	 case "partialLinkText":
     	 type=ByType.partialLinkText;
     	break; 
 	 
	
 	 case "tagName":
     	 type=ByType.tagName;
     	break;
 	 case "linkTest":
     	 type=ByType.linkText;
     	break;
 			 
 	 }
		return type;
 	 
      
	} 
}

