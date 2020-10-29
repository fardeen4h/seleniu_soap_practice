package intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class updateddropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\SoapUi_Scripts\\Selinum\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://spicejet.com/");
		Thread.sleep(10000L);
//		driver.findElement(By.id("divpaxinfo")).click();
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
//		driver.findElement(By.name("Adult1")).click();
//		Thread.sleep(2000L);
//		Select s = new Select(driver.findElement(By.xpath("//div[@id='divpaxinfo'] //select[@id='ctl00_mainContent_ddl_Adult']")));
//		s.selectByValue("5");
		
		driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_originStation1'] //option[@value='MAA']")).click();
		Thread.sleep(5000L);
	}

}
