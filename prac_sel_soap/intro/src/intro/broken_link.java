package intro;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import okhttp3.internal.http2.Http2Connection;
//import sun.net.www.protocol.http.HttpURLConnection;

public class broken_link {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\SoapUi_Scripts\\Selinum\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/AutomationPractice");
		SoftAssert a = new SoftAssert();
		
		WebElement footerbox=driver.findElement(By.id("gf-BIG"));
		List<WebElement> linksinfooter=footerbox.findElements(By.tagName("a"));
		
		for(WebElement link : linksinfooter) {
			String url=link.getAttribute("href");
			URLConnection conn= new URL(url).openConnection();
			((HttpURLConnection) conn).setRequestMethod("HEAD");
			conn.connect();
			int respcode=((java.net.HttpURLConnection) conn).getResponseCode();
			System.out.println(respcode);
			a.assertTrue(respcode<400, "the link "+ link.getText() + "is broken with code"+ respcode);
//			if(respcode>400) {
//				System.out.println("the link "+ link.getText() + "is broken with code"+ respcode);
//				Assert.assertTrue(false);
//			}
			
		}
		a.assertAll();
	}
	

}
