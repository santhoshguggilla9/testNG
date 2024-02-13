package Basics;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationAttributes {
	
	@Test(priority=3)
	public void banana()
	{
		System.out.println("Test Case banana executed!");
	}
	@BeforeTest
	@Test(priority=4,dependsOnMethods= {"doll","banana"})
	public void Apple()
	{
		System.out.println("Test Case apple executed!");
	}
	
	@Test(priority=1)
	public void cat()
	{
		System.out.println("Test Case cat executed!");
	}
	@Test(priority=2)
	public void doll()
	{
		System.out.println("Test Case doll for description!");
		//Assert.assertTrue(false);
	}

}
