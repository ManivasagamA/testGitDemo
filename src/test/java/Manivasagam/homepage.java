package Manivasagam;

import java.io.IOException;

import org.apache.logging.log4j.*;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageobjects.Landingpage;
import pageobjects.Loginpage;
import resources.base;

public class homepage extends base {
	public static Logger log = LogManager.getLogger(base.class.getName());
	public 	WebDriver driver;
	@BeforeTest
	public  void initialize () throws IOException   {
		// TODO Auto-generated method stub
		driver= initializeDriver();
		log.info("Driver is initialized");
		driver.manage().window().maximize();
		log.info("Window is maximised");
	}
	
	@Test(dataProvider="getData")
	public  void basenavigation(String username,String password) throws IOException, InterruptedException   {
		// TODO Auto-generated method stub
		driver.get(prop.getProperty("URL"));
		Landingpage lp = new Landingpage(driver);
		lp.getlogin().click();
		log.info("Sign in button is clicked");
Loginpage lp1 = new Loginpage(driver);
lp1.email().sendKeys(username);
lp1.password().sendKeys(password);
lp1.login().click();
log.info("Successfully logged in");
	}
	@AfterTest
	public void teardown()
	{
	driver.close();
	}
@DataProvider
public Object[][] getData()
{
Object[][] data = new 	Object[2][2];
data[0][0]="mani@test.com";
data[0][1]="mani1";
data[1][0]="vasagam@test.com";
data[1][1]="vasagam";
return data;
}}

