package TestNG_Script;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Listener.class)
public class TestCases {

	@Test
	void testCase()
	{
		Assert.assertTrue(true);
		
	}
	@Test
	void testCase1()
	{
		Assert.assertTrue(false);
		
	}
	@Test
	void testCase2()
	{
		throw new SkipException("");
		
	}
}
