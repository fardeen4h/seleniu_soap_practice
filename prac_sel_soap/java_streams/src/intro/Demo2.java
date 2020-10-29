package intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*<input type="text" class="inputtext _55r1 _6luy" name="email" id="email" data-testid="royal_email" placeholder="Email address or phone number" autofocus="1" aria-label="Email address or phone number" dir="ltr" style="direction: ltr;">
//tagName[@attribute='value']--- this is how you write an xpath
//input[@name='email']--- this is example for the input tag and name attribute
 also if you fell tag name is chaging you can witre the x path as 
 //*[@attribute='value']*/

/*<input type="text" class="inputtext _55r1 _6luy" name="email" id="email" data-testid="royal_email" placeholder="Email address or phone number" autofocus="1" aria-label="Email address or phone number" dir="ltr" style="direction: ltr;">
 * for css generation follow this 
 * tagNme[attribute='value']
 * so for above eg the css path will be 
 * input[id='email'] 
 * */

/*<input type="text" class="inputtext _55r1 _6luy" name="email" id="email" data-testid="royal_email" placeholder="Email address or phone number" autofocus="1" aria-label="Email address or phone number" dir="ltr" style="direction: ltr;">
 *another way of css generation is by the follwing 
 * tagNme#id
 * so for above eg the css path will be 
 * input#email
 * */

/*<input type="text" class="inputtext _55r1 _6luy" name="emal" id="email" data-testid="royal_email" placeholder="Email address or phone number" autofocus="1" aria-label="Email address or phone number" dir="ltr" style="direction: ltr;">
 *another way of xpath generartion through regular expression is as follows 
 //tagname[contains(@attribute='value')]
 * so for above eg the xpath will be 
//
 */ //input[contains(@name='email')]*/

/*<input type="text" class="inputtext _55r1 _6luy" name="email" id="email" data-testid="royal_email" placeholder="Email address or phone number" autofocus="1" aria-label="Email address or phone number" dir="ltr" style="direction: ltr;">
 *another way of cssgenerartion through regular expression is as follows 
 //tagname[Atrribute*='value']
 * so for above eg the css path will be 
//
 input[name*='email'] */


public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// intaiting  chromedriver.exe --- this exe file has to be downlaoded from selenium.dev site in the browser drop down 
		//webdriver.chrome.driver is a key word for chrome driver and the path that you have mentioned is the path where you have kept the chromedriver.exe file 
		
		System.setProperty("webdriver.chrome.driver", "E:\\SoapUi_Scripts\\Selinum\\chromedriver_win32\\chromedriver.exe");
		//In the below step we create the object "driver" for driving the test 
		WebDriver driver = new ChromeDriver();
		//The Below step helps us to kick start the browser 
		driver.get("http://facebook.com");//This will hit the URL in the browser 
//		driver.findElement(By.xpath("//input[@placeholder='Email address or phone number']")).sendKeys("Hi i am a robo trying to enter this feild");
//		driver.close();
//		driver.findElement(By.cssSelector("input[id='email']")).sendKeys("Tom marvalo riddle");
		driver.findElement(By.cssSelector("input#email")).sendKeys("Bigpopappomp");
		driver.findElement(By.name("pass")).sendKeys("The robo password");
		driver.findElement(By.xpath("//button[@data-testid='royal_login_button']")).click();
		System.out.println(driver.findElement(By.xpath("//div[@class='_9ay7']")).getText());
//		driver.findElement(By.linkText("Forgotten password?")).click();
		}

}
