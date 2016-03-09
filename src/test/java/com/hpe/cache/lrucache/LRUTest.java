package com.hpe.cache.lrucache.LRUCache;

import static org.junit.Assert.*;

import org.junit.Test;

public class LRUTest {

	
		
	@Test
	public void test() {
		LRUCache lru = new LRUCache(6);
		lru.addCache(1,"asdf");
		lru.addCache(2,"qwer");
		lru.addCache(3,"erty");
		lru.addCache(4,"dfgh");
		lru.addCache(5,"vbnm");
		lru.addCache(6,"tyui");
		
		assertEquals("vbnm",lru.getCache(5));
		assertNotEquals("vbnm",lru.getCache(1));
		
		lru.addCache(7, "dfgh");
		assertEquals("asdf",lru.getCache(1));
		
		
		lru.update(5, "aaaa");
		
		assertEquals("aaaa",lru.getCache(5));
		
		lru.delCache(2);
		
		assertNull(lru.getCache(2));
		
		//fail("Not yet implemented");
		
		
	}

}

