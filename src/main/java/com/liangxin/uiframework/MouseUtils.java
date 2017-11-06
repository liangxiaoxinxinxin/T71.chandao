/**
 * @auther liangxin
 * @date  2017年10月23日
 */
package com.liangxin.uiframework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

/**
 * @author liangxin
 * @date 2017年10月23日
 * @版本 v1.0
 */
public class MouseUtils {

	

private WebDriver driver;
private Actions action;
public MouseUtils(WebDriver dr){
	this.driver=dr;
	action=new Actions(driver);
}
 //1.rightclick():右击
public void rightClick(WebElement el){
	action.contextClick(el).perform();
	
}
//2.poubleclick():双击
public void doubleClick(WebElement el){
	action.doubleClick(el).perform();
}
//3.moveToElement:鼠标移动到一个元素
public void moveToElement(WebElement el){
	action.moveToElement(el).perform();
}
//4.release:鼠标释放
public void release(WebElement el){
	action.click(el).release().perform();
}
//5.clickAndHold:在一个对象上按住鼠标左键
public void clickAndHold(WebElement el){
	action.clickAndHold(el).perform();
}

	
}

