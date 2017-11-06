/**
 * @auther liangxin
 * @date  2017年10月23日
 */
package com.liangxin.uiframework;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

/**
 * @author liangxin
 * @date 2017年10月23日
 * @版本 v1.0
 */
public class KeyBoardUtils {
	private Actions action;
	public KeyBoardUtils(WebDriver dr){
		this.action=new Actions(dr);
	}
	
	
	//向下的按键
	public void pressDown(int times){
		Robot robot;
		try{
			robot=new Robot();
			for(int i=0;i<times;i++){
				robot.keyPress(KeyEvent.VK_DOWN);
				Thread.sleep(1000);
			}
		}catch(Exception e){
				e.printStackTrace();
			}
			
		
		}
	
//封装好的按下tab键
	public void pressTabKey(){
		Robot robot=null;
		try{
			robot=new Robot();
			
		}catch(AWTException el){
			el.printStackTrace();}
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		}
	 //封装好的按下enter键
	public void pressEnterKey(){
		Robot robot=null;
		try{
		robot =new Robot();
		}catch(AWTException el)
		{el.printStackTrace();
		}
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
}
	//封装好的粘贴函数
	public void setAndctrlVClipboardData (String string){
		StringSelection stringSelection=new StringSelection(string);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection,null);
		Robot robot=null;
		try{
		robot =new Robot();
		}catch(AWTException el){
		el.printStackTrace();}
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		}

}
