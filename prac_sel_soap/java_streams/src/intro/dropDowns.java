package intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class dropDowns {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\SoapUi_Scripts\\Selinum\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://spicejet.com/");
//		WebElement passanger = driver.findElement(By.cssSelector("div#divpaxinfo.paxinfo"));
//		System.out.println(passanger);
//		new WebDriverWait(driver, 15).until(ExpectedConditions.elementToBeClickable(passanger));
//		passanger.click();
		Select s = new Select(driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_DropDownListCurrency\"]")));
		s.selectByValue("AED");
//		driver.wait(60000);
		s.selectByIndex(2);
		s.selectByVisibleText("INR");
	}

}
