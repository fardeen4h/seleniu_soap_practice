package stepDefinations;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import pageObject.LandingPage;
import pageObject.LoginPage;
import pageObject.portalHomepage;
import resources.base;

import org.junit.Assert;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class stepDefination extends base{

	@Given("^Intialize the browser with \"([^\"]*)\"$")
	public void intialize_the_browser_with(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver=intailizedriver();
	}

	@And("^Navigate to \"([^\"]*)\" site$")
	public void navigate_to_site(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.get(arg1);
		Thread.sleep(5000);
	}

	@Given("^Click on login link in home page to land on secure sign in page$")
	public void click_on_login_link_in_home_page_to_land_on_secure_sign_in_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		LandingPage l=new LandingPage(driver);
		Thread.sleep(5000);
//		LoginPage lp=l.getlogin();
		l.getlogin();
		
	}
	
	@When("^User enters (.+) and (.+) and logs in$")
    public void user_enters_and_and_logs_in(String username, String password) throws Throwable {
		LoginPage lp=new LoginPage(driver);
		lp.emailbox().sendKeys(username);
		lp.pwdbox().sendKeys(password);
		lp.submitbuttn().click();
    }

	

	@Then("^Verify that the user is successfully logged in$")
	public void verify_that_the_user_is_successfully_logged_in() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    portalHomepage p= new portalHomepage(driver);
	    String t=p.textcheck().getText();
//	    String t=p.toString();
	    Assert.assertEquals(t, "One more step");
	    
	}

	@And("^Close browser$")
    public void close_browser() throws Throwable {
		driver.quit();
    }

}