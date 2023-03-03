package TestNG_Pack;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClassAnnotation 
{	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("BeforeClass");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("BeforeMethod");
	}
	
	@Test  
	public void testA() 
	{
		System.out.println("Test-A");
	}

	@Test 
	public void testB()  
	{
		System.out.println("Test-B");
	}
	
	@Test 
	public void testC() 
	{
		System.out.println("Test-C");
	}
	@Test 
	public void testD() 
	{
		System.out.println("Test-D");
	}
	@Test 
	public void testE() 
	{
		System.out.println("Test-E");
	}
	
	@Test 
	public void testF() 
	{
		System.out.println("Test-F");
	}
	@Test
	public void testG() 
	{
		System.out.println("Test-G");
	}
	
	@Test 
	public void testH() 
	{
		System.out.println("Test-H");
	}

	@AfterMethod
	public void afterMethod()
	{
		System.out.println("AfterMethod");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("AfterClass");
	}
	

}
