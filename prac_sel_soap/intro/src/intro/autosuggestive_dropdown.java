package intro;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autosuggestive_dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\SoapUi_Scripts\\Selinum\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://makemytrip.com");
		Thread.sleep(3000);
//		driver.findElement(By.className("loginModal displayBlock modalLogin dynHeight personal ")).click();
//		driver.findElement(By.id("fromCity")).click();
		driver.findElement(By.id("fromCity")).click();
		driver.findElement(By.id("fromCity")).sendKeys("Mum");
		driver.findElement(By.id("fromCity")).sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
		
		WebElement desbox=driver.findElement(By.cssSelector("[placeholder='To']"));
		desbox.click();
		desbox.sendKeys("del");
		desbox.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
		
	}

}
