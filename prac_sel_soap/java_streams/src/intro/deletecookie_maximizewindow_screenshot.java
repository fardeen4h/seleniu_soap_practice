package intro;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class deletecookie_maximizewindow_screenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\SoapUi_Scripts\\Selinum\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
//		driver.manage().deleteCookieNamed("aba");
		driver.get("https://google.com");
		
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//do import the jar of filutils if not found add the ajr to build path 
		FileUtils.copyFile(src,new File("E:\\SoapUi_Scripts\\Selinum\\screenshot.jpg"));
		
	}

}
