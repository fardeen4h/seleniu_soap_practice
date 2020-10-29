package intro;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class auto_suggestive_assignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\SoapUi_Scripts\\Selinum\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/AutomationPractice");
		
//		WebElement box=driver.findElement(By.id("autocomplete"));
//		box.sendKeys("new");
//		Thread.sleep(3000);
//		int numdest=box.findElements(By.className("ui-menu-item")).size();
//		System.out.println(numdest);
//		Thread.sleep(3000);
//		box.sendKeys(Keys.ARROW_DOWN);
//		Thread.sleep(3000);
//		box.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
		driver.findElement(By.id("autocomplete")).sendKeys("ind");

	    Thread.sleep(2000);

	    driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);

	    driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);

	   System.out.println(driver.findElement(By.id("autocomplete")).getAttribute("value")); 
//		box.sendKeys(Keys.ENTER);

	}

}
