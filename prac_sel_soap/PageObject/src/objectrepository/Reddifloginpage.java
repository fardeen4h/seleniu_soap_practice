package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Reddifloginpage {
	
	WebDriver driver;
	
	public Reddifloginpage(WebDriver driver) 
	{
		this.driver=driver;
	}
	By username=By.xpath("//input[@id='login1']");
	By Password=By.name("passwd");
	By go=By.name("proceed");
	By hmbutn= By.xpath("//a[@class='f12']");
	public WebElement email()
	{
		return driver.findElement(username);
	}
	public WebElement pwd()
	{
		return driver.findElement(Password);
	}
	public WebElement go()
	{
		return driver.findElement(go);
	}

	public WebElement homebutton()
	{
		return driver.findElement(hmbutn);
	}
	
}
