package intro;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tables_handaling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//		https://www.cricbuzz.com/live-cricket-scorecard/30380/rr-vs-kkr-12th-match-indian-premier-league-2020
			System.setProperty("webdriver.chrome.driver", "E:\\SoapUi_Scripts\\Selinum\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.get("https://www.cricbuzz.com/live-cricket-scorecard/30380/rr-vs-kkr-12th-match-indian-premier-league-2020");
	Thread.sleep(8000);
	
	WebElement table=driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
	int count=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();
	int sum = 0;
	for(int i=0;i<count-2;i++) {
		String value=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText();
		int valueinteger=  Integer.parseInt(value);
		sum=sum+valueinteger;
			
	}
	String Extras=driver.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText();
	int extrasValue=Integer.parseInt(Extras);
	int TotalSumValue=sum+extrasValue;
	System.out.println(TotalSumValue);
	String ActualTotal=driver.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText();
	int ActualTotalVAlue=Integer.parseInt(ActualTotal);
	if(ActualTotalVAlue==TotalSumValue)
	{
	System.out.println("Count Matches");
	}
	else
	{
	System.out.println("count fails");
	}
	}
	

}
