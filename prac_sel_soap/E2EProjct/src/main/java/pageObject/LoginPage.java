package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public WebDriver driver;
//	By signin=By.xpath("//a[.='Login']");
	public LoginPage(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	By email=By.id("user_email");
	
	public WebElement emailbox() 
	{
		return driver.findElement(email);
	}
	
	@FindBy(name="user[password]")
	WebElement signin;

	public WebElement pwdbox() 
	{
		
		return signin;
	}
	
	By submit=By.name("commit");
	public WebElement submitbuttn() 
	{
		return driver.findElement(submit);
	}

	
	
}
