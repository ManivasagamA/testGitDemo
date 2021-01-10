package Manivasagam;

import java.io.IOException;

import org.apache.logging.log4j.*;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageobjects.Landingpage;
import resources.base;

public class titlevalidation  extends base {
	public 	WebDriver driver;
	public static Logger log = LogManager.getLogger(base.class.getName());
@BeforeTest
public  void initialize () throws IOException   {
	// TODO Auto-generated method stub
	driver= initializeDriver();
	driver.manage().window().maximize();
	driver.get(prop.getProperty("URL"));
}

@Test
public  void basenavigation () throws IOException   {
		// TODO Auto-generated method stub
		Landingpage lp1 =new Landingpage(driver);
Assert.assertEquals(lp1.title().getText(), "FEATURED COURSES");
Assert.assertTrue(lp1.navbar().isDisplayed());
log.error("Nav bar is displayed now");
}

@AfterTest
public void teardown()
{
driver.close();
}
}