package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ReddifHomepage {
	
	WebDriver driver;
	
	public ReddifHomepage(WebDriver driver) 
	{
		this.driver=driver;
	}
	By searchbx=By.id("srchword");
	By searchbtn=By.xpath("//input[@class='newsrchbtn'][1]");
	public WebElement searchbox()
	{
		return driver.findElement(searchbx);
	}
	public WebElement searchbutton()
	{
		return driver.findElement(searchbtn);
	}
	
}
