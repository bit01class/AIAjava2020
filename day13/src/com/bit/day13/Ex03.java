package com.bit.day13;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Ex03 {

	public static void main(String[] args) {
		Map<String,Integer> map;
		map=new HashMap<String,Integer>();
		
		map.put("key1", 1111);
		map.put("key2", 2222);
//		map.put(3333, 3333);
//		map.put("key3", "test");
		map.put("", 5555);
		map.put(null, 6666);
		map.put("key7", null);
		
		Set<String> keys = map.keySet();
		Iterator<String> ite = keys.iterator();
		while(ite.hasNext()) {
			String key = ite.next();
			
		}
	}

}









