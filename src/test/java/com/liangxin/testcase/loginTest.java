package com.liangxin.testcase;

import java.util.concurrent.TimeUnit;

import org.dom4j.DocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.liangxin.actions.LoginOperate;
import com.liangxin.actions.LoginfailOperate;
import com.liangxin.pages.LoginPage;
import com.liangxin.pages.MainPage;
import com.liangxin.uiframework.DriverFactory;
import com.liangxin.utils.AssertUtils;

public class loginTest {
	   WebDriver driver;
	   AssertUtils assertUtils;
  @BeforeTest
  public void setUP(){try{
	  assertUtils=new AssertUtils();
	  driver=DriverFactory.getChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  }catch(Exception e){
	  Assert.fail("测试初始化报错");
	  
  }
  }
  @Test
  public void lodinTest01()throws DocumentException {
     LoginOperate.serDriver(driver);
	  String value=LoginOperate.getLoginName("admin", "liangxin123456");
    
      assertUtils.checkStringContains(value, "admin", "登录测试失败");
  //    Assert.assertEquals(value.contains("admin"), true,"登录测试失败");
  
  }
  @Test
  public void faillodinTest01() throws DocumentException{
     LoginOperate.serDriver(driver);
	  String value=LoginfailOperate.getLoginName("admin", "123456");
	  assertUtils.checkStringContains(value, "登录失败" ,"登录测试失败");
	//  Assert.assertEquals(value.contains("登录失败，请检查您的用户名或密码是否填写正确"), true,"登录测试失败");
  }

  @AfterTest
  public void tearDown()throws InterruptedException{
	  Thread.sleep(3000);
	  driver.quit();
	  
  }
  
}
