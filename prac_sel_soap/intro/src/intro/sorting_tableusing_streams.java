package intro;

import java.lang.reflect.Array;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class sorting_tableusing_streams {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

//		https://rahulshettyacademy.com/seleniumPractise/#/offers
			System.setProperty("webdriver.chrome.driver", "E:\\SoapUi_Scripts\\Selinum\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
	Thread.sleep(3000);
	//click on the column 
	driver.findElement(By.cssSelector("th[role='columnheader'] [class='sort-icon sort-descending']")).click();
	//caputre all the web element in a list 
	List<WebElement> we=driver.findElements(By.xpath("//td[1]"));

	//capture text of all ement and save to  a new list
	List<String> ls=we.stream().map(s->s.getText()).collect(Collectors.toList());
	System.out.println("This is Orignal list" + ls);
	//perofrm sort to the orinal list 
	List<String> newls=ls.stream().sorted().collect(Collectors.toList());
	System.out.println("This is the list after sorting " + newls);
	//save the sorted list and compare with orignal list 
	Assert.assertTrue(ls.equals(newls));
	
	//scan the column with get text and if you find Beans -> then print the price 
	List<String> pricelist=we.stream().filter(s->s.getText().contains("Beans")).
			map(s->getPriceVeggie(s)).collect(Collectors.toList());
	pricelist.forEach(a->System.out.println(a));
	}

	public static String getPriceVeggie(WebElement s) {
		String picevalue= s.findElement(By.xpath("following-sibling::td[1]")).getText();
		 return picevalue;
	}
}
