package testNgListeners;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListenersDemo.class)
@Test
public class ListenDemo {

	@BeforeMethod
	public void first()
	{
		System.out.println("this is first method");
	}
	
	//failed testcase
	@Test()
	public void second()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		WebElement element = driver.findElement(By.id("q"));
		element.sendKeys("testing");
		
	}
	
	@Test  // Skip Test
	public void SkipTest() {
		throw new SkipException("Skipping The Test Method ");
	}
	@AfterMethod
	public void after()
	{
		System.out.println("this is last method");
	}
}
