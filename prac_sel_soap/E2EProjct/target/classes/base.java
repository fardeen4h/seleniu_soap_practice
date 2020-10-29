package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class base {

	public WebDriver driver;
	public Properties prop;
	
	public WebDriver intailizedriver() throws IOException 
	{
		//chrome
		//firefox
		//ie
		
		prop= new Properties();
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\resources\\data.properties");
		prop.load(fis);
		String browsername=System.getProperty("browser");//---this line is to set it as a maven property--//
//		String browsername=prop.getProperty("browser");
		String wait=prop.getProperty("wait");
		int wait1 = Integer.valueOf(wait);
		if(browsername.contains("chrome")) 
		{
			//execute in chrome
			WebDriverManager.chromedriver().setup();//--this line helps in execution without chromedriver.exe
//			System.setProperty("webdriver.chrome.driver","E:\\Selenium_jenkins_soapuiscripts\\Selinum\\chromedriver_win32\\chromedriver.exe");
			ChromeOptions options= new ChromeOptions();
			if(browsername.contains("headless")) 
			{
			options.addArguments("--headless");
			}
			driver =new ChromeDriver(options);
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
		}
		else if (browsername.equalsIgnoreCase("firefox")) 
		{
			//execute in firefox browser \src\main\java\resources
			System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\src\\main\\java\\resources\\geckodriver.exe");
			driver =new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
		}
		else if (browsername.equalsIgnoreCase("IE"))
		{
			//execute in ie browser 
			System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"\\src\\main\\java\\resources\\IEDriverServer.exe");
			//In the below step we create the object "driver" for driving the test 
			driver = new org.openqa.selenium.ie.InternetExplorerDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
		}
		else 
		{
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\main\\java\\resources\\chromedriver.exe");
			driver =new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			
		}
		driver.manage().timeouts().implicitlyWait(wait1, TimeUnit.MILLISECONDS);
		
		return driver;
		
	}
	
	public String getScreenShots(String testCaseName,WebDriver driver) throws IOException 
	{
		TakesScreenshot ts= (TakesScreenshot) driver;
		File sorce=ts.getScreenshotAs(OutputType.FILE);
		String destfile= System.getProperty("user.dir")+"\\reports\\"+testCaseName+".png";
		FileUtils.copyFile(sorce,new File(destfile));
		return destfile;
	}

}

