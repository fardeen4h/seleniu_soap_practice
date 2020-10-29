package Academy.E2EProjct;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObject.LandingPage;
import pageObject.LoginPage;
import resources.base;

public class hompage extends base{
	public WebDriver driver;
	public static Logger log = LogManager.getLogger(base.class.getName());
	@BeforeTest
	public void vuserinit() throws InterruptedException, IOException 
	{
		driver=intailizedriver();
		log.info("driver intialized");
	}
	@Test(dataProvider="getdata")
	public void basepagenavigation(String username,String pwd,String text) throws IOException, InterruptedException 
	{
		
//		driver=intailizedriver();
		String url=prop.getProperty("url");
		driver.get(url);
		log.info("Hitting home page");
		String wait=prop.getProperty("wait");
		int wait1 = Integer.valueOf(wait);
		log.info("waitng for 5 sec");
		Thread.sleep(wait1);
		
		LandingPage l=new LandingPage(driver);
		log.info("waiting for 5 secs ");
		Thread.sleep(wait1);
		LoginPage lp=l.getlogin();
		log.info("hitting sign in page");
//		LoginPage lp=new LoginPage(driver);
		lp.emailbox().sendKeys(username);
		log.info("passing username");
		lp.pwdbox().sendKeys(pwd);
		log.info("passing pwd");
//		System.out.println(text);
		log.info(text);
		lp.submitbuttn().click();
		log.info("Clicking submit button");
		driver.navigate().back();
		log.info("Hitting back button");
//		driver.close();
		
	}
	
	@AfterTest
	public void vuserend() 
	{
		driver.close();
		log.info("driver closed");
	}
	
	@DataProvider
	public Object[][] getdata() 
	{
		//row stands for how many didferent data are being sent 
		//coulmn stands for what all is being sent like username , pwd etc 
		
		Object[][] data= new Object[4][3];
		//0 th row
		data[0][0]="nonrestriceduse@mail.com";
		data[0][1]="pwd123";
		data[0][2]="nonrestriced user";
		log.info("passing first suer data");
		//1st row
		data[1][0]="restricteduser@mail.com";
		data[1][1]="pwd456";
		data[1][2]="restriced user";
		log.info("passing second user data");
		//2nd row
		data[2][0]="nonrestricteduser@mail.com";
		data[2][1]="pwd789";
		data[2][2]="nonrestriced user";
		log.info("passing 3rd user data");
		//3rd row
		data[3][0]="nouserdata@mail.com";
		data[3][1]="12333";
		data[3][2]="nouser data";
		log.info("passing 4th user data");
		return data;
	}
}
