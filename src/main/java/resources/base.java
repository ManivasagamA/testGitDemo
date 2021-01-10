package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
//import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class base {
public 	WebDriver driver;
public Properties prop;
	@SuppressWarnings("deprecation")
	public WebDriver initializeDriver() throws IOException {
		// TODO Auto-generated method stub
		
		  prop =new Properties();
		  String userdir= System.getProperty("user.dir");
FileInputStream fis = new  FileInputStream(userdir+"\\src\\main\\java\\resources\\data.properties");

prop.load(fis);
//String browsername= System.getProperty("browser");
String browsername= prop.getProperty("browser");
System.out.println(browsername);
if(browsername.contains("chrome"))
{
	System.setProperty("webdriver.chrome.driver", userdir+"\\src\\main\\java\\resources\\chromedriver.exe");
	ChromeOptions options =new ChromeOptions();
	if (browsername.contains("headless"))
	{
	options.addArguments("headless");
	}
	driver= new ChromeDriver(options);
}
else if(browsername.equals("firefox"))
{
	System.setProperty("webdriver.gecko.driver", userdir+"\\src\\main\\java\\resources\\geckodriver.exe");
	 driver= new FirefoxDriver();
}
else if(browsername.equals("IE"))
{
	System.setProperty("webdriver.ie.driver", userdir+"\\src\\main\\java\\resources\\IEDriverServer.exe");
	driver= new ChromeDriver();
}
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//WebDriverWait wait =new WebDriverWait (driver,Duration.ofSeconds(10));
return driver;
	}
	public String screenshot(String tcname,WebDriver driver) throws IOException
	{
		TakesScreenshot ts =(TakesScreenshot) driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		String dest= System.getProperty("user.dir")+"\\reports\\"+tcname+".png";
		FileUtils.copyFile(source, new File(dest));
		return dest;
	}
	}
	
