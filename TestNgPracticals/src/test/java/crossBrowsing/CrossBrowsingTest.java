package crossBrowsing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowsingTest {

	WebDriver driver;
	
	@Parameters("browser")
	@BeforeClass
	public void openBrowser(String browser)
	{
		if(browser.equalsIgnoreCase("firefox"))
		{
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
		}
		else if(browser.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
			driver.manage().window().maximize();
		}
		else if(browser.equalsIgnoreCase("edge"))
		{
			driver = new EdgeDriver();
			driver.manage().window().maximize();
		}
			
	}
	@Test
	public void openUrl()
	{
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Testing");
		System.out.println("windows title is: " +driver.getTitle());
	}
	
	@AfterClass
	public void teardown()
	{
		driver.close();
	}
}
