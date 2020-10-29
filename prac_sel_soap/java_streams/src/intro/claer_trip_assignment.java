package intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class claer_trip_assignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		String text = "Indigo" ;
		System.setProperty("webdriver.chrome.driver", "E:\\SoapUi_Scripts\\Selinum\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.cleartrip.com/");
		Thread.sleep(5000);

		driver.findElement(By.id("Adults")).click();
		
		Select s = new Select(driver.findElement(By.id("Adults")));
		s.selectByValue("4");
		driver.findElement(By.id("Childrens")).click();
		Select c = new Select(driver.findElement(By.id("Childrens")));
		c.selectByValue("3");
		driver.findElement(By.id("DepartDate")).click();
		driver.findElement(By.cssSelector(".ui-state-highlight")).click();
		driver.findElement(By.cssSelector("a[title='More search options']")).click();
		driver.findElement(By.xpath("//input[@id='AirlineAutocomplete']")).sendKeys(text);
		driver.findElement(By.id("SearchBtn")).click();
		System.out.println(driver.findElement(By.id("homeErrorMessage")).getText());
	}

}
