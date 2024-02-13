package Basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleSearchTest {

	WebDriver driver;
	String url="https://www.google.com";
	@BeforeMethod
	public void setup()
	{

		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}
	@Test(priority=1)
	public void openUrl()
	{
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));

	}
	@Test(priority=2)
	public void testGoogle()
	{
		driver.get(url);
		driver.findElement(By.name("q")).sendKeys("Testing" + Keys.ENTER);

		String actual = driver.getTitle();
		String expected = "Testing - Google Search";

		Assert.assertEquals(actual, expected);
	}
	@AfterMethod
	public void teardown()
	{
		driver.close();
	}
}
