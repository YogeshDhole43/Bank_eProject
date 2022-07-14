package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Baseclass 

{
	protected WebDriver driver;
@BeforeClass
public void browser_launch() 
{
	String key = "webdriver.chrome.driver";
	String value = "G:\\Automation Project Guru99\\Guru99\\driver\\chromedriver_103\\chromedriver.exe";
	System.setProperty(key, value);
	String url = "https://www.demo.guru99.com/V4/";
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(url);

	
}

@AfterClass
public void browser_close()
{
	driver.quit();
}
}
