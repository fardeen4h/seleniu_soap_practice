package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
	
	public WebDriver driver;
//	By signin=By.xpath("//a[.='Login']");
	public LandingPage(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
//	@FindBy(css="a[href*='sign_in']")
	private @FindBy(css="a[href='https://courses.rahulshettyacademy.com/sign_in']")
	WebElement signin;

	public LoginPage getlogin() 
	{
		signin.click();
		LoginPage lp=new LoginPage(driver);
		return lp;
	}

	private By text=By.xpath("//strong[contains(.,'Learn Earn & Shine')]");
	public WebElement getText()
	{
		return driver.findElement(text);
	}
	
	private @FindBy(xpath="//div[@class='header-top']//div[@class='clearfix']")
	WebElement header;
	public WebElement headerbar()
	{
		return header;
	}
	
}