package StepDefinitions;

import java.io.IOException;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.Landingpage;
import pageobjects.Loginpage;
import resources.base;

public class StepDefinition extends base{
	
		@Given("Initialise the browser with chrome")
		public void initialise_the_browser_with_chrome() throws IOException{
		    // Write code here that turns the phrase above into concrete actions
			driver= initializeDriver();
			driver.manage().window().maximize();
			
		}


		@Given("Navigate to {string} site")
		public void navigate_to_site(String string) {
		    // Write code here that turns the phrase above into concrete actions
			driver.get(string);
		}
		@Given("Click on Login button in home page and navigate to SSO page")
		public void click_on_login_button_in_home_page_and_navigate_to_sso_page() {
		    // Write code here that turns the phrase above into concrete actions
			Landingpage lp = new Landingpage(driver);
			lp.getlogin().click();
		}
		@When("^User logs in with id (.+) and pwd (.+)$")
	    public void user_login_with_id_and_pwd(String username, String password) throws Throwable {
	
			Loginpage lp1 = new Loginpage(driver);
			lp1.email().sendKeys(username);
			lp1.password().sendKeys(password);
			lp1.login().click();
		}
		@Then("Verify user logged in successfully")
		public void verify_user_logged_in_successfully() {
		    // Write code here that turns the phrase above into concrete actions
			System.out.println("Hi Mani");
			driver.quit();
		}



}
