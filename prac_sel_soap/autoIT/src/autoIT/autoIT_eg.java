package autoIT;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class autoIT_eg {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		String downloadPath=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\resources\\chromedriver.exe");
		HashMap<String, Object> chromePrefs = new HashMap<String, Object>();

		chromePrefs.put("profile.default_content_settings.popups", 0);

		chromePrefs.put("download.default_directory", downloadPath);

		ChromeOptions options=new ChromeOptions();

		options.setExperimentalOption("prefs", chromePrefs);
		ChromeDriver driver= new ChromeDriver(options);
//		driver.get("https://the-internet.herokuapp.com/");
		driver.get("https://smallpdf.com/pdf-to-word");
		//for basic authentication pop up you can use the follwoing notaion 
		//http://Username:Password@SiteURL
		//we can pass the above driver.get() like this 
//		driver.get("https://admin:admin@the-internet.herokuapp.com/");
//		driver.findElement(By.linkText("Basic Auth")).click();
		driver.findElement(By.xpath("//span[@class='sc-1rkezdt-7 cxlSWI']")).click();;
//		driver.findElement(By.linkText("File Upload")).click();
//		driver.findElement(By.xpath("//input[@id='file-upload']")).click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec(System.getProperty("user.dir")+"\\resources\\uploadfile.exe");
		WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='kov65o-0 iPohUv']//div[1]//div[@class='sc-1an4xct-0 kuIGAX']")));
//		Thread.sleep(7000);
		driver.findElement(By.xpath("//div[@class='kov65o-0 iPohUv']//div[1]//div[@class='sc-1an4xct-0 kuIGAX']")).click();
//		Thread.sleep(7000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='sc-1mvwhop-0 bqmdbl']")));
		driver.findElement(By.xpath("//button[@class='sc-1mvwhop-0 bqmdbl']")).click();
//		Runtime.getRuntime().exec("E:\\autoitexe\\uploadfile.exe");
//		Thread.sleep(7000);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//span[@class='wnolmd-2 etrSPs']")));
		driver.findElement(By.xpath("//span[@class='wnolmd-2 etrSPs']")).click();
		Thread.sleep(7000);
		File f=new File(downloadPath+"\\Exit Formality-converted.docx");
		if(f.exists()) 
		{
			Assert.assertTrue(f.exists());
			if(f.delete())
				System.out.println("file deleted");
		}
		
//		driver.findElement(By.id("file-submit")).click();
		
	}

}
