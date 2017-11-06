
package com.liangxin.uiframework;

import java.util.HashMap;

import org.dom4j.DocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.liangxin.uiframework.Locator.ByType;
import com.liangxin.utils.Log;
import com.liangxin.utils.xmlUtils;


/**
 * @author liangxin
 * @date 2017年10月23日
 * @版本 v1.0
 */
public class WebElementUtils extends DriverUtils {
protected HashMap<String,Locator> locatorMap;
protected String path;
protected Log log =new Log(WebElementUtils.class);
	public WebElementUtils(WebDriver driver)  {
		super(driver);
		path=System.getProperty("user.dir")+"/webElementdata/"
		+this.getClass().getSimpleName()+".xml";
		System.out.println(path);

			
		try {
			locatorMap=xmlUtils.readElementInfo(path);
		} catch (DocumentException e) {
		
			e.printStackTrace();
		}
		
	}	
	
//1.获取元素
	public WebElement getElement(Locator locator){
		WebElement el=null;
		ByType type=locator.getByType();
		try{
		switch(type){
		case id:
		el=driver.findElement(By.id(locator.getLocatorInfo()));
		break;
		case name:
			el=driver.findElement(By.name(locator.getLocatorInfo()));
			break;
		
	   case className:
		el=driver.findElement(By.className(locator.getLocatorInfo()));
		break;
	   case xpath:
			el=driver.findElement(By.xpath(locator.getLocatorInfo()));
			break;
	   case cssSelector:
			el=driver.findElement(By.cssSelector(locator.getLocatorInfo()));
			break;
	   case linkText:
			el=driver.findElement(By.linkText(locator.getLocatorInfo()));
			break;
		
		}

	
	
		}catch(Exception e){
			takeScreenShot("findElementErrorImage");
			log.info("元素："+locator.getElementName()+"识别异常");
			Assert.fail("error:元素识别失败，停止代码执行");
			}
		return el;

		}
	//2.显示等待
	public WebElement findElement( Locator locator ){
		WebDriverWait wait=new WebDriverWait(driver,locator.getTimeOut());
		WebElement el=wait.until(new ExpectedCondition<WebElement>(){
			public WebElement apply(WebDriver d){
				return getElement(locator);
		
			}
		});
		return el;
		
	}
   //3.click:单击对象
    public void click(Locator locator ){
    	WebElement el=findElement(locator);
    	
		el.click();
		log.info("点击元素："+locator.getElementName());
}
	//4.sendkeys:在对象上模拟按键输出
	public void input(Locator locator ,String content){
	  	WebElement el=findElement(locator);
    	
	   el.sendKeys(content);
		log.info("在元素："+locator.getElementName()+"输入："+content);
	}

	//5.getText
	public String getText(Locator locator ){
		WebElement el=findElement(locator);
		log.info("获取元素："+locator.getElementName()+"文本值");
		return el.getText();
		
	} 
 //6.submit
		public void submit(Locator locator){
			WebElement el=findElement(locator);
			el.submit();
		}
		
	//7.获取文件属性
		public String getAttribute(Locator locator,String attribute){
			WebElement el=findElement(locator);
			log.info("获取文本属性："+locator.getElementName()+"文本属性");
			return el.getAttribute(attribute);}
		
	public Locator getLocator(String locatorName){
		Locator locator=locatorMap.get(locatorName);
		return locator;
	}}

