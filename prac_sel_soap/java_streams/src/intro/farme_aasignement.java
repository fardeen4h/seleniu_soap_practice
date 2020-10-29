package intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class farme_aasignement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\SoapUi_Scripts\\Selinum\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com");
		driver.findElement(By.xpath("//a[.='Nested Frames']")).click();
		System.out.println(driver.findElements(By.tagName("frameset")).size());
		driver.switchTo().frame(0);
		System.out.println(driver.findElements(By.tagName("frame")).size());
		driver.switchTo().frame(driver.findElement(By.name("frame-middle")));
		System.out.println(driver.findElement(By.id("content")).getText());
		driver.switchTo().defaultContent();
		driver.close();
//		System.out.println(driver.findElements(By.tagName("frameset")).size());
//		driver.switchTo().frame(driver.findElement(By.name("frame-middle")));
//		System.out.println(driver.fid);
//		driver.switchTo().frame(0);
		
		
//		
//		driver.switchTo().frame(driver.findElement(By.cssSelector("frameset[frameborder='1']")));
//			driver.switchTo().frame(driver.findElement(By.name("frameset-middle")));
//				driver.switchTo().frame(driver.findElement(By.name("frame-middle")));
//				System.out.println(driver.findElement(By.id("frame-middle")).getText());
//				driver.switchTo().defaultContent();
//				driver.switchTo().defaultContent();
//				driver.switchTo().defaultContent();
//		WebElement frame1= driver.findElement(By.name("frameset-middle"));
//		WebElement innerframe= driver.findElement(By.name("frame-middle"));
//		driver.switchTo().frame(innerframe);
		
		
		
		
	}

}
