package intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class aivi {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
			//String[] itemsneeded = {"Cucumber","Cauliflower","Beetroot"} ;
	System.setProperty("webdriver.chrome.driver", "E:\\SoapUi_Scripts\\Selinum\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://127.0.0.1:8000/login.html");
	Thread.sleep(5000);
	driver.findElement(By.id("homebutton")).click();
	
	}

}
