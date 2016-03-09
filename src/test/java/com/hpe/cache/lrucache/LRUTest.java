package com.hpe.cache.lruache;

import static org.junit.Assert.*;

import org.junit.Test;

public class LRUTest {

	@Test
	public void test() {
		LRUCache LC=new LRUCache(2);
		LC.addCache(1, "piyush");
		LC.addCache(2, "sam");
		LC.getCache(2);
	}

}
