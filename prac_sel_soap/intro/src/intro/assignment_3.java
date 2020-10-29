package intro;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class assignment_3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\SoapUi_Scripts\\Selinum\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.id("checkBoxOption2")).click();
		String labelofcheckbox= driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]")).getText();
		System.out.println(labelofcheckbox);
		Select s=new Select(driver.findElement(By.id("dropdown-class-example")));
		s.selectByVisibleText(labelofcheckbox);
		driver.findElement(By.id("name")).sendKeys(labelofcheckbox);
		driver.findElement(By.xpath("//input[@id='alertbtn']")).click();
		String alertmessage=driver.switchTo().alert().getText();
		if(alertmessage.contains(labelofcheckbox))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("Fail");
		}
		driver.quit();
	}

}
