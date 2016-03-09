package com.hpe.cache.dymaniccache;

import org.junit.Test;

public class testDynamic{

	@Test
	public void testDynamic() 
	{
		DynamicCache DC = new DynamicCache(3);
		System.out.println("AddKey Testing : Added");
		DC.addCache(1, "piyush");
		DC.addCache(2, "sam");
		DC.addCache(3, "minu");
		assertEquals(1,"piyush", 0);
		assertEquals(2,"sam",0);
		assertEquals(3,"minu",0);
		System.out.println("GetKey Testing");
		System.out.println("added Key:" + DC.getCache(1));  
		System.out.println("added Key:" + DC.getCache(2));
		System.out.println("added Key:" + DC.getCache(3));
		DC.update(2, "diya");
		assertEquals(2,"diya", 0);
		System.out.println("updated key is:" +DC.getCache(2));
			
	}

	private void assertEquals(int i, String value, int j) {
		// TODO Auto-generated method stub
		
	}

}

	
