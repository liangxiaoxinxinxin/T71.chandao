/**
 * @auther liangxin
 * @date  2017年10月23日
 */
package com.liangxin.utils;

import org.testng.Assert;

/**
 * @author liangxin
 * @date 2017年10月23日
 * @版本 v1.0
 */
public class AssertUtils {
	

	//比较整型
	public void checkIntNumber(int actual,int expected,String...com){
		try{
		Assert.assertEquals(actual, expected);
	}catch(AssertionError e){
		Assert.fail("断言失败");
		}
	}
    
	//比较字符串
	public void checkString(String actual,String expected){
		try{
		Assert.assertEquals(actual, expected);
		}catch(AssertionError e){
			Assert.fail("断言失败");
		}
	}
	//字符串包含
	public void checkStringContains(String actual,String expected,String...com){
		try{
		Assert.assertEquals(true, actual.contains(expected));
		}catch(AssertionError e){
			Assert.fail("断言失败");
		}
	
	}
	//非空
	public void checkNotNull(Object actual,String...com){
		try{
		Assert.assertNotNull(actual);
		}catch(AssertionError e){
			Assert.fail("断言失败");
		}
		
		
	}
	//
	}
	//

