package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectrepository.ReddifHomepage;
import objectrepository.ReddifloginpagePF;

public class LoginApplication {
	
	//the login page is in Page factory style
	//the home page is in page object class style
	
	@Test
	public void login() 
	{
		System.setProperty("webdriver.chrome.driver","E:\\Selenium_jenkins_soapuiscripts\\Selinum\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		ReddifloginpagePF rl=new ReddifloginpagePF(driver);
		rl.email().sendKeys("hellqw");
		rl.pwd().sendKeys("oppsee");
		rl.homebutton().click();
//		Reddifloginpage rl= new Reddifloginpage(driver);
//		rl.email().sendKeys("hellzy");
//		rl.pwd().sendKeys("noozy");
//		rl.go().click();
//		rl.homebutton().click();
		ReddifHomepage rh=new ReddifHomepage(driver);
		rh.searchbox().sendKeys("tintutut");
		rh.searchbutton().click();
		
		
	}
}
