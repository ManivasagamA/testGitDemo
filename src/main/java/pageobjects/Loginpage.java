package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Loginpage {
	WebDriver driver;
	By email = By.cssSelector("input#user_email");
	By password =  By.cssSelector("input#user_password");
	By login= By.xpath("//input[@name='commit']");
public Loginpage(WebDriver driver) {
		// TODO Auto-generated constructor stub
	this.driver=driver;
	}


public WebElement email()
{
	return driver.findElement(email);
}
public WebElement password()
{
	return driver.findElement(password);
}
public WebElement login()
{
	return driver.findElement(login);
}
}
