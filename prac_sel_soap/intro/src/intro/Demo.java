package intro;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// intaiting  gegco.exe --- this exe file has to be downlaoded from selenium.dev site in the browser drop down 
		//webdriver.gecko.driver is a key word for firefox driver and the path that you have mentioned is the path where you have kept the chromedriver.exe file 
		
		System.setProperty("webdriver.gecko.driver", "E:\\SoapUi_Scripts\\Selinum\\geckodriver-v0.27.0-win64\\geckodriver.exe");
		//In the below step we create the object "driver" for driving the test 
		WebDriver driver = new FirefoxDriver();
		//The Below step helps us to kick start the browser 
		driver.get("http://google.com");
		System.out.println(driver.getTitle()); 
	}

}
