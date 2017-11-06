/**
 * @auther liangxin
 * @date  2017年10月23日
 */
package com.liangxin.uiframework;

import java.io.IOException;
import java.util.Arrays;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.liangxin.config.LocalConfig;
import com.liangxin.utils.Log;


/**
 * @author liangxin
 * @date 2017年10月23日
 * @版本 v1.0
 */
public class DriverFactory {
  private static WebDriver driver;
  static Runtime runtime=Runtime.getRuntime();
  private static Log log =new Log(DriverFactory.class);
  
  public static WebDriver getChromeDriver(){
	  try{
		  runtime.exec("taskkill /F /IM chrome.exe");
		  log.info("杀死Chrome浏览器进程成功");
	  }catch(IOException e){
		  
		  log.error("杀死进程出现异常");
	  }
	
	  String driverpath=System.getProperty("user.dir")+LocalConfig.CHROME_PATH;
	  System.setProperty("webdirver.chromedriver", "driverpath");
	 ChromeOptions options=new ChromeOptions();
		DesiredCapabilities capabilities=DesiredCapabilities.chrome();
		capabilities.setCapability("chrome.switches", Arrays.asList("--start-maximized"));
		options.addArguments("--test-type","--start-maximized");
		driver=new ChromeDriver(options);
		return driver;

	   
  }
  public static void main(String[] args) {
	System.out.println(System.getProperty("user.dir")+LocalConfig.CHROME_PATH);
}
}
