package com.liangxin.demo;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class NewTest {
	@BeforeTest
	public void int1(){
		try{
		int[] a={1,2,3,4,5};
		int b=a[2];//初始化异常
		}catch(Exception e){
			System.out.println("error:初始化错误错误，代码不执行");
			
		}}
		@Test
		public void int12(){
			try{
			int[] a={1,2,3,4,5};
			int b=a[8];//初始化异常
			}catch(Exception e){
				System.out.println("error:初始化错误错误，代码不执行");
				
			}
	}
	
	
  @Test
  public void f() {
	  try{
	  int[] a={1,2,3,4,5};
		int b=a[8];//业务执行错误
	  }catch(Exception e){
		System.out.println(e.toString());
		Assert.fail("error:代码错误");
		  
	  }
  }
}
