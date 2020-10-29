package intro;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment_table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver", "E:\\SoapUi_Scripts\\Selinum\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.get("https://rahulshettyacademy.com/AutomationPractice/");
			
			WebElement table=driver.findElement(By.id("product"));
			int rowcount=table.findElements(By.tagName("tr")).size();
			WebElement row=table.findElement(By.tagName("tr"));
			int columncount=row.findElements(By.tagName("th")).size();
			System.out.println(rowcount);
			System.out.println(columncount);
			WebElement rowobj=driver.findElement(By.xpath("//tr[3]"));
			int obj= rowobj.findElements(By.tagName("td")).size();
	//		System.out.println(obj);
			for(int i=0;i<obj;i++) {
				System.out.println(rowobj.findElements(By.tagName("td")).get(i).getText());
						}
			driver.close();
	}

}
