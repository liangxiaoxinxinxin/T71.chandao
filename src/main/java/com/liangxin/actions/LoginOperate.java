/**
 * @auther liangxin
 * @date  2017年10月29日
 */
package com.liangxin.actions;

import org.openqa.selenium.WebDriver;

import com.liangxin.pages.LoginPage;
import com.liangxin.pages.MainPage;

public class LoginOperate {
  private  static WebDriver driver;
  public static WebDriver getDriver(){
	return driver;
	
}
	public static void serDriver(WebDriver driver){
		LoginOperate.driver=driver;
	}
	static LoginPage loginPage;
	static MainPage mainPage;
	public static MainPage LoginSuccess(String name,String password){
	loginPage =new LoginPage(getDriver());
    loginPage.inputUsername(name);
    loginPage.inputPassword(password);
    loginPage.clickLoginButton();
	return new MainPage(getDriver());
		
	}
	public static String getLoginName(String name,String password){
		mainPage=LoginSuccess(name,password);
		return mainPage.getLoginUserName();
	}
}


