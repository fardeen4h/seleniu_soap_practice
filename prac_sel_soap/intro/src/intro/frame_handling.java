package intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class frame_handling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\SoapUi_Scripts\\Selinum\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable");
		driver.manage().window().maximize();
//		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		//below two codes can be applied if you arent sure of farme locator 
		//you can simply find the counts of the frame in the site and choose an index in switch to frame method 
//		also not index start from 0 
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		driver.switchTo().frame(0);
//		driver.findElement(By.id("draggable")).click();
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop= driver.findElement(By.id("droppable"));
		
		Actions a = new Actions(driver);
		a.dragAndDrop(drag, drop).build().perform();
		//below line is to come out of frame
		driver.switchTo().defaultContent();
	}

}
