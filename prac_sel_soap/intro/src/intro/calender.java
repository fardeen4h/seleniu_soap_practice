package intro;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class calender {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\SoapUi_Scripts\\Selinum\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.path2usa.com/travel-companions");
		Thread.sleep(8000);
		driver.findElement(By.xpath("//input[@id='travel_date']")).click();
		//now how to grab the month try the below code 
		String month_year= driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText();
		System.out.println(month_year);
		String date= "23";
		
		String month_to_be_selected = "March 2022";
		
		//grab the common attribute put it in a list and itterrate with a for loop 
		while(!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains(month_to_be_selected)) {
			driver.findElement(By.cssSelector("div[class='datepicker-days'] [class='next']")).click();
		}
		List<WebElement> dates=driver.findElements(By.className("day"));
		
		int count=dates.size();
		
		for(int i=0;i<count;i++) {
			String text=driver.findElements(By.className("day")).get(i).getText();
			if(text.equalsIgnoreCase(date)) {
				driver.findElements(By.className("day")).get(i).click();
				break;
			}
		}
//		Thread.sleep(15000);
//		driver.findElement(By.xpath("//div[@style='position: absolute; top: 0px; left: 0px; bottom: 0px; right: 0px; box-shadow: rgba(0, 0, 0, 0) 0px 0px 0px inset;']")).click();
		driver.close();
	}

}
