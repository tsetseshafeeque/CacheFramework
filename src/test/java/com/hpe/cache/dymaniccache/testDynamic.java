package com.hpe.cache.dymaniccache;

import org.junit.Test;
import static org.junit.Assert.*;
public class testDynamic{

	@Test
	public void test() 
	{
		DynamicCache DC = new DynamicCache(3);
		System.out.println("AddKey Testing : Added");
		DC.addCache(1, "piyush");
		DC.addCache(2, "sam");
		DC.addCache(3, "minu");
		assertEquals(1,"piyush");
		assertEquals(2,"sam");
		assertEquals(3,"minu");
		System.out.println("GetKey Testing");
		System.out.println("added Key:" + DC.getCache(1));  
		System.out.println("added Key:" + DC.getCache(2));
		System.out.println("added Key:" + DC.getCache(3));
		DC.update(2, "diya");
		assertEquals(2,"diya");
		System.out.println("updated key is:" +DC.getCache(2));
			
	}

}

	
