package dataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DProvider {

	@DataProvider(name ="Values")
	public Object[][] dataProvider()
	{
		return new Object[][] {{"santhosh", 100,200}};
	}
	
	
	@Test(dataProvider ="Values")
	public void myTest(String val,int x,int y)
	{
		int res = x + y;
		System.out.println("The String value: " + val);
		System.out.println("The int x value: " + x);
		System.out.println("The int y value: " + y);
		System.out.println("The sum value: " + res);
		
		
	}
}
