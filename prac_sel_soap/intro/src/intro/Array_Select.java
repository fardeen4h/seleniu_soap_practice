package intro;

import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Array_Select {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		String[] itemsneeded = {"Cucumber","Cauliflower","Beetroot"} ;
		System.setProperty("webdriver.chrome.driver", "E:\\SoapUi_Scripts\\Selinum\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		
//		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		driver.get("https://netflix.com");
//		Thread.sleep(5000);
		
		addItems(driver,itemsneeded);
		checkout(driver, itemsneeded);
		driver.close();
			
		}

	
	public static void addItems(WebDriver driver, String[] itemsneeded) throws InterruptedException {
		// TODO Auto-generated method stub
		List<WebElement> products= driver.findElements(By.cssSelector("h4[class='product-name']"));
		int j=0;
//		System.out.println(products.size());
		List<String> itemsneededList = Arrays.asList(itemsneeded);
		int size=products.size();
		for(int i=0;i<size;i++) {
			String name = products.get(i).getText();
			String[] splittedname = name.split("-");
			String actaulname = splittedname[0].trim();
			if(itemsneededList.contains(actaulname)) {
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				j++;
				if(j==itemsneeded.length) {
					break;
				}
			}
		}
		
	}

	public static void checkout(WebDriver driver, String[] itemsneeded) {
		WebDriverWait wait=new WebDriverWait(driver, 5);
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		WebElement itemsincart= driver.findElement(By.cssSelector("ul.cart-items"));
		List<WebElement> size= itemsincart.findElements(By.tagName("li"));
		
//		System.out.println(size.size());
		
		Assert.assertEquals(itemsneeded.length, size.size());
		driver.findElement(By.xpath("//button[.='PROCEED TO CHECKOUT']")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promocode")));
		driver.findElement(By.cssSelector("input.promocode")).sendKeys("Rahul");
		driver.findElement(By.cssSelector("button[class='promoBtn']")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='promoInfo']")));
		
		System.out.println(driver.findElement(By.xpath("//span[@class='promoInfo']")).getText());
		
	}

	
}



