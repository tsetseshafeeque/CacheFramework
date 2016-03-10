package com.hpe.cache.staticcahe;
import static org.junit.Assert.*;
import org.junit.Test;

public class StaticCacheTest
{

        @Test
        public void test() {
       StaticCache sc=new StaticCache(4);
        sc.addCache(1,"aaaa");
        sc.addCache(2,"bbbb");                                                  
        sc.addCache(3,"cccc");
        sc.addCache(4,"dddd");

         assertEquals("cccc",sc.getCache(3));
         assertNotEquals("cccc",sc.getCache(2));


         assertEquals("bbbb",sc.getCache(2));
         assertNotEquals("bbbb",sc.getCache(4));
}
}

