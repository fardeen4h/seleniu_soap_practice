package introduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import com.acme.example.ListUsers

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a driver object 
		//invoke driver.exe file 
		System.setProperty("webdriver.chrome.driver", "E:\\SoapUi_Scripts\\Selinum\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver  = new ChromeDriver();
//		ChromeDriver driver  = new ChromeDriver();
		
		driver.get("http://google.com");

	}

}
