package Academy.E2EProjct;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObject.LandingPage;
import resources.base;

public class validateText extends base{

	public WebDriver driver;
	public static Logger log = LogManager.getLogger(base.class.getName());
	@BeforeTest
	public void vuserinit() throws InterruptedException, IOException 
	{
		driver=intailizedriver();
		log.info("driver initalized");
		String url=prop.getProperty("url");
		driver.get(url);
		log.info("naviagted to home page");
		String wait=prop.getProperty("wait");
		int wait1 = Integer.valueOf(wait);
		Thread.sleep(wait1);
		log.info("waiting for 5 secs");
	}
	@Test
	public void validationText() throws IOException, InterruptedException 
	{
		
		LandingPage l=new LandingPage(driver);
		
		Assert.assertEquals(l.getText().getText(), "Learn Earn & Shine1");
		log.info("Succesfully validated");
		
		
		
	}
	@AfterTest
	public void vuserend() 
	{
		driver.close();
		log.info("driver closed");
	}
	
}
