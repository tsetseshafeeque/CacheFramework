/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.hpe.cache.staticcahe;

import com.hpe.cache.interf.CacheInterface;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 *
 * @author purvesh
 */
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
		
		put(key,value);
              /*	put(1,"Piyush");
                put(2,"Sam");
                put(3,"Minu");
                put(4,"Avi");
                put(5,"Nilay");
                put(6,"Anchal"); */
	}

	@Override
	public String getCache(int key) {
		return get(key);
		
	}
    
}
