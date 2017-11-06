/**
 * @auther liangxin
 * @date  2017年10月23日
 */
package com.liangxin.uiframework;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

/**
 * @author liangxin
 * @date 2017年10月23日
 * @版本 v1.0
 */
public class BasePage extends WebElementUtils {

	/**
	 * @param driver
	 * @throws Exception 
	 */
	public BasePage(WebDriver driver) {
		super(driver);
	}
//1.获取网站源代码
	public String getPageSource(){
		return driver.getPageSource();
		
	}
	//2.js提示框确认、
	public void AlertAccept(){
		Alert alert=driver.switchTo().alert();
		alert.accept();
	}
	//3.js提示框取消
	public void AlertDismiss(){
		Alert alert=driver.switchTo().alert();
		alert.dismiss();
	
	}
	//4.js提示框输入数据
		public void inputAlert(String value){
			Alert alert=driver.switchTo().alert();
			alert.sendKeys(value);
		}
	//5.获取提示信息
		public String getText(){
		Alert alert=driver.switchTo().alert();
		return alert.getText();
}}
