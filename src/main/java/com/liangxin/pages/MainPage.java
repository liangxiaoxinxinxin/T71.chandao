/**
 * @auther liangxin
 * @date  2017年10月21日
 */
package com.liangxin.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.liangxin.uiframework.BasePage;
import com.liangxin.uiframework.Locator;

/**
 * @author liangxin
 * @date 2017年10月21日
 * @版本 v1.0
 */
public class MainPage extends BasePage{
//	private WebDriver driver;
//	private WebElement userMenu;
	 
	public MainPage(WebDriver driver) {
	super(driver);
		//this.userMenu=driver.findElement(By.cssSelector("div#userMenu"));
	 
	}
	Locator userMenu=getLocator("userMenu");
public String getLoginUserName(){
	return getText(userMenu);
}
}