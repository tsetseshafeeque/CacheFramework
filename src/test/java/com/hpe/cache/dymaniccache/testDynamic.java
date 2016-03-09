package com.hpe.cache.dymaniccache;
import static org.junit.Assert.*;
import org.junit.Test;

public class testDynamic{

	@Test
	public void test() 
	{
		DynamicCache DC = new DynamicCache(3);
		//System.out.println("AddKey Testing : Added");
		DC.addCache(1, "piyush");
		DC.addCache(2, "sam");
		DC.addCache(3, "minu");
		assertEquals("piyush",DC.getCache(1));
		assertEquals("sam",DC.getCache(2));
		assertEquals("minu",DC.getCache(3));
	        DC.update(2, "diya");
		assertEquals("diya",DC.getCache(2));
	
			
	}

}

	
