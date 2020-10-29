package intro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chromedriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// intaiting  chromedriver.exe --- this exe file has to be downlaoded from selenium.dev site in the browser drop down 
		//webdriver.chrome.driver is a key word for chrome driver and the path that you have mentioned is the path where you have kept the chromedriver.exe file 
		
		System.setProperty("webdriver.chrome.driver", "E:\\SoapUi_Scripts\\Selinum\\chromedriver_win32\\chromedriver.exe");
		//In the below step we create the object "driver" for driving the test 
		WebDriver driver = new ChromeDriver();
		//The Below step helps us to kick start the browser 
		driver.get("http://google.com");//This will hit the URL in the browser 
		System.out.println(driver.getTitle()); //This will help to validate the title of the page 
		driver.getCurrentUrl();
		System.out.println(driver.getCurrentUrl());//this is to validate if you have landed on the correct page 
		
		driver.getPageSource();
//		System.out.println(driver.getPageSource());//This gives the page scource 
		
		driver.get("https://Yahoo.com");
		System.out.println(driver.getTitle()); //This will help to validate the title of the page 
		driver.getCurrentUrl();
		System.out.println(driver.getCurrentUrl());
		driver.navigate().back();
		System.out.println(driver.getTitle()); //This will help to validate the title of the page 
		driver.getCurrentUrl();
		System.out.println(driver.getCurrentUrl());
		driver.navigate().forward();
		System.out.println(driver.getTitle()); //This will help to validate the title of the page 
		driver.getCurrentUrl();
		System.out.println(driver.getCurrentUrl());
		driver.close();//Closes the current window 
		driver.quit();//closes all the windows 
	}

}
