package intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/* validation of css 
$(#mydomainLink)
validation of xpath
$x("//*[@id='forgot_password_link']")*/

public class salseforceloginpage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\SoapUi_Scripts\\Selinum\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();//creating of driver object 

		driver.get("https://login.salesforce.com/");
		driver.findElement(By.cssSelector("#username")).sendKeys("Hi my name is slim shaddy");
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div[2]/div[3]/form/input[1]")).sendKeys("This is eminem");
		driver.findElement(By.xpath("//*[@id=\"Login\"]")).click();
		System.out.println(driver.findElement(By.cssSelector("div#error.loginError")).getText());
	}
	
}
