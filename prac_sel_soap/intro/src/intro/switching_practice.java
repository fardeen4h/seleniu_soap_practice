package intro;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class switching_practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\SoapUi_Scripts\\Selinum\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com");
		
		driver.findElement(By.xpath("//a[.='Multiple Windows']")).click();
		
		
		driver.findElement(By.xpath("//a[.='Click Here']")).click();
		Set<String> Id=driver.getWindowHandles();
		Iterator<String> it=Id.iterator();
		String parentid=it.next();
		String childid1=it.next();
		
		driver.switchTo().window(childid1);
		System.out.println(driver.findElement(By.cssSelector("h3")).getText());
		
		
		driver.switchTo().window(parentid);
		System.out.println(driver.findElement(By.cssSelector("h3")).getText());
//		driver.switchTo().window(childid1);
//		System.out.println(driver.findElement(By.cssSelector("h3")).getText());
	}

}
