/**
 * @auther liangxin
 * @date  2017年10月21日
 */
package com.liangxin.pages;

import org.dom4j.DocumentException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.liangxin.config.LocalConfig;
import com.liangxin.uiframework.BasePage;
import com.liangxin.uiframework.Locator;



public class LoginPage extends BasePage {
	
	
    public WebDriver getDriver() {
		return driver;
	}

	   private Alert alert;
   
    public LoginPage(WebDriver driver){
    	super(driver);
    	openWeb(LocalConfig.url);  
    }
	Locator usernameInputbox=getLocator("usernameInputbox");
   	Locator passwordInputbox=getLocator("passwordInputbox");
   	Locator loginButton=getLocator("loginButton");
   	public void inputUsername(String name){
   		input(usernameInputbox,name);
   		
   	}
	public void inputPassword(String password){
   		input(passwordInputbox,password);
   		
   	}
	public void clickLoginButton(){
     	click(loginButton);
   		
   	}
	/**
	 * @auther liangxin
	 * @date 2017年10月29日下午3:13:19
	 * @版本 v1.0
	 * @@param string
	 * @@param string2
	 * @@return
	 */
	
public void wait (int seconds){
	try {
		Thread.sleep(seconds*1000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
}
}
