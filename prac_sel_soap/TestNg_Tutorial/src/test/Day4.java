package test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Day4 {

	@Test
	public void webLoginhomeloan() {
		//selenium automation
		System.out.println("WebLoginhome");
	}
	
	@Test
	public void MobileLoginhomeloan() {
		//appium automation
		System.out.println("MobileLoginhome");
	}
	
	@Test
	public void RestAPILoginhomeloan() {
		//Rest API automation
		System.out.println("restAPIloginhome");
	}
	@DataProvider
	public void getdata() {
		//1 st combination with username and pwd - good credit history 
		//2 nd username pwd - no credit history 
		//3 rd username pwd -fradulent credit history 
		
		//first creat a multidimesional array 
		Object[][] data = new Object[3][2];
		
		
	}
	
}
