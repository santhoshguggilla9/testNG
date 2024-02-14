package testNgParams;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Sum {

	@Parameters({"a","b"})
	@Test
	public void sum(int c, int d)
	{
		int res = c+d;
		System.out.println("Sum " + res);
	}
	
	@Parameters({"a","b"})
	@Test
	public void mul(int c, int d)
	{
		int res = c+d;
		System.out.println("Mul " + res);
	}
	
	@Parameters({"a","b"})		
	@Test                 
	public void sub(int c, int d)     
	{                     
		   int res = c-d;                  
	  		System.out.println("Sub " + res);
	}
}
