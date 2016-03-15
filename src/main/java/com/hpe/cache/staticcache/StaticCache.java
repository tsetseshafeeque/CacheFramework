package com.hpe.cache.staticcache;

import com.hpe.cache.interf.CacheInterface;
import java.util.LinkedHashMap;

public class StaticCache extends LinkedHashMap<Integer, String> implements CacheInterface {

	  private static final long serialVersionUID = 1L;
	  private int capacity;

	
	public StaticCache(int capacity){
		   super(capacity+1, 1.0f, true); 
	       this.capacity = capacity;
	   }
	
	  
	@Override
	public boolean delCache(int key) {
            return true;
		
	}

	@Override
	public boolean update(int key, String value) {
	
                return true;
	}
	
	@Override
	public void addCache(int key, String value) {
              	put(1,"Piyush");
                put(2,"Sam");
                put(3,"Minu");
                put(4,"Avi");
                put(5,"Nilay");
                put(6,"Anchal");
	}

	@Override
	public String getCache(int key) {
		return get(key);
		
	}
    
}
