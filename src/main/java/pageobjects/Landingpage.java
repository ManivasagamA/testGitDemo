package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Landingpage {
	WebDriver driver;
	private By Signin = By.cssSelector("a[href*='sign_in']");
	private By title = By.cssSelector("div.text-center>h2");
	private  By navbar =  By.cssSelector("ul.nav.navbar-nav.navbar-right");
	private By popupwelcome=By.xpath("//div[@class='sumome-react-wysiwyg-popup-animation-group']");
	By popupclose=By.xpath("//*[contains(@class,'wysiwyg-close-button')]");
public Landingpage(WebDriver driver) {
		// TODO Auto-generated constructor stub
	this.driver=driver;
	}


public WebElement getlogin()
{
	return driver.findElement(Signin);
}
public WebElement title()
{
	return driver.findElement(title);
}
public WebElement navbar()
{
	System.out.println("Hii");
	return driver.findElement(navbar);
}
public WebElement wcpop()
{
	return driver.findElement(popupwelcome);
}
public WebElement popupclose()
{
	return driver.findElement(popupclose);
}
}
