package intro;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scope {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//1.find how many links are there on the web page
		System.setProperty("webdriver.chrome.driver", "E:\\SoapUi_Scripts\\Selinum\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElements(By.tagName("a")).size());
		//2. find out the no. of links in the footer section 
		WebElement footerdriver = driver.findElement(By.id("gf-BIG"));
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
//		driver.close();
		
		WebElement column=footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(column.findElements(By.tagName("a")).size());
//		Actions a= new Actions(driver);
		//4. check if all the tabs are opining 
		//below code helps in opening of tab by using control key and enter 
		for(int i=1;i<column.findElements(By.tagName("a")).size();i++) {
			String clickonlink=Keys.chord(Keys.CONTROL,Keys.ENTER);
			column.findElements(By.tagName("a")).get(i).sendKeys(clickonlink);
			Thread.sleep(5000);
		}
		
		//5. get the titles of all the pages 
		//below code gets the title of all the pages 
			Set<String> abc=driver.getWindowHandles();
			Iterator<String> It=abc.iterator();
			while(It.hasNext()) {
				driver.switchTo().window(It.next());
				System.out.println(driver.getTitle());
			}
			
		driver.quit();
			
		

	}

}
