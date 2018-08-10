package TestContainer;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import TestAim.UseInfo;

public class UseInfoTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		System.out.println("this is setUpBeforeClass()...");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		System.out.println("this is tearDownAfterClass()...");
	}

	@Before
	public void setUp() throws Exception 
	{
		System.out.println("this is setUp()...");
	}

	@After
	public void tearDown() throws Exception 
	{
		System.out.println("this is tearDown()...");
	}

	@Test
	public void testGetUserName()
	{
		assertEquals(new UseInfo().getUserName(),("µÏ°ÍÀ­"));
	}

	@Test
	public void testGetUserId() 
	{
		assertEquals(new UseInfo().getUserId(),("30"));
	}

	@Test
	public void testGetUserAge() 
	{
		assertEquals(new UseInfo().getUserAge(),("24"));
	}

	@Test
	public void testGetuserSex() 
	{
		assertEquals(new UseInfo().getuserSex(),("ÄÐ"));
	}

}
