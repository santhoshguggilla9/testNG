package retryInterface;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestToRetry{

	@Test(retryAnalyzer=retryInterface.IRetryInterface.class)
	public void Test1()
	{
		Assert.assertEquals(false, true);;
	}
	
	@Test
	public void Test2()
	{
		Assert.assertEquals(false, true);
		
	}
}
