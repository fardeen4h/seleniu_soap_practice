package intro;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class checkbox_spiceject {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\SoapUi_Scripts\\Selinum\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
	    driver.get("chrome://settings/clearBrowserData");
//	    driver.findElement(By.xpath("//*[@id='dropdownMenu']")).click();
//	    Select s= new Select(driver.findElement(By.id("dropdownMenu")));
//	    s.selectByValue("1");
	    driver.findElement(By.xpath("//settings-ui")).sendKeys(Keys.ENTER);
	    
		
		driver.get("https://spicejet.com/");
		//input[id*SeniorCitizenDiscount]
		Dimension d = new Dimension(1920,1080);
		driver.manage().window().setSize(d);
		Thread.sleep(15000);
		Assert.assertFalse(driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).isSelected());
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		Thread.sleep(2000);
		Assert.assertTrue(driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).isSelected());
		Thread.sleep(2000);
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
		{
			Assert.assertTrue(true);
		}
		else{
			Assert.assertTrue(false);
		}
		
		Assert.assertTrue(driver.findElement(By.id("Div1")).isEnabled());
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("a[value='BOM']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='flightSearchContainer']//div[@class='right1']//a[contains(.,'Kolkata (CCU)')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".ui-state-highlight")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("div[id='divpaxinfo']")).click();
		Thread.sleep(10000);

//		driver.findElement(By.id("ctl00_mainContent_ddl_Adult")).click();
		Select s= new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
		s.selectByValue("4");
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")).click();
		Thread.sleep(2000);
		Select c =new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		c.selectByValue("USD");
		Thread.sleep(2000);
		Assert.assertFalse(driver.findElement(By.cssSelector("#ctl00_mainContent_SeniorCitizenDiv")).isSelected());
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.cssSelector("#ctl00_mainContent_SeniorCitizenDiv")).isSelected());
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#ctl00_mainContent_SeniorCitizenDiv")).click();
		Thread.sleep(2000);
		Assert.assertFalse(driver.findElement(By.cssSelector("#ctl00_mainContent_SeniorCitizenDiv")).isSelected());
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.cssSelector("div[id='divpaxinfo']")).getAttribute("style"));
		Thread.sleep(2000);
		
		if(driver.findElement(By.id("divpaxinfo")).getAttribute("style").contains("block"))
		{
			driver.findElement(By.id("divAdult")).getText();
			System.out.println(driver.findElement(By.id("divAdult")).getText());
		}
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		
//		Assert.assertFalse(driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).isSelected());
		
//		System.out.println(driver.findElement(By.cssSelector("#ctl00_mainContent_SeniorCitizenDiv")).isSelected());
		
//		driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).click();
//		
//		Thread.sleep(10000);
//		
//		Assert.assertTrue(driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).isSelected());
//		
//		System.out.println(driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).isSelected());
//		Thread.sleep(2000);
//		driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).click();
//		Thread.sleep(2000);
//		Assert.assertFalse(driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).isSelected());
////		Assert.assertTrue(driver.findElement(By.cssSelector("#ctl00_mainContent_SeniorCitizenDiv")).isSelected());
//		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
	}

}
