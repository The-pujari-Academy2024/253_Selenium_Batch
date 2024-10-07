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
		
		System.out.println("hello");
		
	}
	@Test
	void testCase1()
	{
		Assert.assertTrue(false);
		System.out.println("hello world");
		
	}
	@Test
	void testCase2()
	{
		throw new SkipException("");
		
	}
}
