package intro;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class actions {

	public static void main(final String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"E:\\SoapUi_Scripts\\Selinum\\chromedriver_win32\\chromedriver.exe");
		final WebDriver driver = new ChromeDriver();
		driver.get("https://amazon.com/");
		// Dimension d = new Dimension(1920,1080);
		driver.manage().window().maximize();

		final WebDriverWait w = new WebDriverWait(driver, 5);

		final WebElement move = driver.findElement(By.cssSelector("a[id='nav-link-accountList']"));
		final Actions a = new Actions(driver);
		w.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("twotabsearchtextbox"))));
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
		
		//moves to specific element 
		a.moveToElement(move).contextClick().build().perform();
		
	}

}
