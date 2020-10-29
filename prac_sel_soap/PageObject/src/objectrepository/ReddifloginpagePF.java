package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReddifloginpagePF {
	
	WebDriver driver;
	
	public ReddifloginpagePF(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
/*	By username=By.xpath("//input[@id='login1']");
	By Password=By.name("passwd");
	By go=By.name("proceed");
	By hmbutn= By.xpath("//a[@class='f12']");*/
	
	@FindBy(xpath="//input[@id='login1']")
	WebElement username;
	
	@FindBy(name="passwd")
	WebElement password;
	
	@FindBy(name="proceed")
	WebElement go;
	
	@FindBy(xpath="//a[@class='f12']")
	WebElement hmbtn;
	
	public WebElement email()
	{
		return username;
	}
	public WebElement pwd()
	{
		return password;
	}
	public WebElement go()
	{
		return go;
	}

	public WebElement homebutton()
	{
		return hmbtn;
	}
	
}
