/**
 * @auther liangxin
 * @date  2017年10月29日
 */
package com.liangxin.actions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

import com.liangxin.pages.LoginPage;

/**
 * @author liangxin
 * @date 2017年10月29日
 * @版本 v1.0
 */
public class LoginfailOperate{
	 private  static WebDriver driver;
	  public static WebDriver getDriver(){
		return driver;
		
	}
		public static void serDriver(WebDriver driver){
			LoginfailOperate.driver=driver;
		}	
		static LoginPage loginPage;
		static String loginName;
public String LoginfailOperate(String name,String password){	

	loginPage=new LoginPage(getDriver());

		 loginPage.inputUsername(name);
		 loginPage.inputPassword(password);
		 loginPage.clickLoginButton();
		  try {
			wait(2);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	    	Alert alert=driver.switchTo().alert();
	    	String value=alert.getText();
	    	alert.accept();
	    	return value;


}
public static String getLoginName(String name,String password){
	
	loginName=LoginfailOperate.getLoginName(name,password);
	return loginName;
}
}
 