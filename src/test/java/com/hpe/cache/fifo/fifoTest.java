package com.hpe.cache.fifo;

import static org.junit.Assert.*;

import org.junit.Test;

public class fifoTest {

	@Test
	public void test() {
		FifoCache FC= new FifoCache(5);
		FC.getCache(1);
		FC.getCache(2);
		FC.getCache(3);
		FC.getCache(4);
		FC.getCache(5);
	}

}
