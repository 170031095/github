package github1;

import static org.junit.Assert.*;

import org.junit.Test;

public class programTest 
{
	@Test
	public void test() 
	{
		
		program p=new program();
		assertEquals("valid",p.age(19));
	}

}
