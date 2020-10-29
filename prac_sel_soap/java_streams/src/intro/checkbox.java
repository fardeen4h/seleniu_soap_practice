package intro;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class checkbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\SoapUi_Scripts\\Selinum\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//input[id*SeniorCitizenDiscount]
		Dimension d = new Dimension(1920,1080);
		driver.manage().window().setSize(d);
		Thread.sleep(2000);
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).isSelected());
		
//		System.out.println(driver.findElement(By.cssSelector("#ctl00_mainContent_SeniorCitizenDiv")).isSelected());
		
		driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).click();
		
		Thread.sleep(10000);
		
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).isSelected());
		
		System.out.println(driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).isSelected());
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).click();
		Thread.sleep(2000);
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).isSelected());
//		Assert.assertTrue(driver.findElement(By.cssSelector("#ctl00_mainContent_SeniorCitizenDiv")).isSelected());
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
	}

}
