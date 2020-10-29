import java.io.File;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"E:\\SoapUi_Scripts\\Selinum\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		driver.get("https://amazon.com/");
		// Dimension d = new Dimension(1920,1080);
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/angularpractice/");

		//Switching Window
		driver.switchTo().newWindow(WindowType.WINDOW);

		Set<String> handles=driver.getWindowHandles();

		

		Iterator<String> it=handles.iterator();

		String parentWindowId = it.next();

		String childWindow =it.next();

		driver.switchTo().window(childWindow);

		driver.get("https://rahulshettyacademy.com/");

		String courseName = driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p']"))

		.get(1).getText();

		driver.switchTo().window(parentWindowId);

		WebElement name=driver.findElement(By.cssSelector("[name='name']"));

		name.sendKeys(courseName);

		//Screenshot

		File file=name.getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(file, new File("logo.png"));

		//driver.quit();

		//GEt Height & Width

		System.out.println(name.getRect().getDimension().getHeight());

		System.out.println(name.getRect().getDimension().getWidth());

	}

}
