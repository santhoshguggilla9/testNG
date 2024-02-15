package parallelDemo;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ParallelExecution {
	
	WebDriver driver;
	
	@Test
	public void openGoogle()
	{
		driver = new FirefoxDriver();
		
		driver.get("https://www.google.com");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		System.out.println("the current thread: " +Thread.currentThread());
	}
	
	@Test
	public void openfacebook()
	{
		driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		System.out.println("the current thread: " +Thread.currentThread());
	}
}
