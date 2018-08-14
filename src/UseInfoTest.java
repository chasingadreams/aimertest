

import static org.junit.Assert.*;

import org.junit.Test;

public class UseInfoTest {

	@Test
	public void testGetUserName()
	{
		assertEquals(new UseInfo().getUserName(),("µÏ°ÍÀ­7"));
	}

	@Test
	public void testGetUserId() 
	{
		assertEquals(new UseInfo().getUserId(),("10"));
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
