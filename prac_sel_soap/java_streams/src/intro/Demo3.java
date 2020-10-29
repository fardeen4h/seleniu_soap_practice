package intro;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// intaiting  Internetexplorer.exe --- this exe file has to be downlaoded from selenium.dev site in the browser drop down 
		//webdriver.chrome.driver is a key word for chrome driver and the path that you have mentioned is the path where you have kept the chromedriver.exe file 
		
		System.setProperty("webdriver.ie.driver", "E:\\SoapUi_Scripts\\Selinum\\IEDriverServer_x64_3.150.1\\IEDriverServer.exe");
		//In the below step we create the object "driver" for driving the test 
		WebDriver driver = new InternetExplorerDriver();
		//The Below step helps us to kick start the browser 
		driver.get("http://google.com");
		System.out.println(driver.getTitle()); 
	}

}
