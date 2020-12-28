package com.bit.day12;

import java.util.HashMap;

public class Ex14 {

	public static void main(String[] args) {
		// key(중복x),val(중복o)쌍으로
		java.util.Map map=new HashMap();
		map.put("key1", "val1");
		map.put("key2", "val2");
		map.put("key3", "val3");
		map.put("key4", 1234);
		map.put("key5", 3.14);
		map.put(1111, "val6");
		map.put(11.11, "val7");
		map.put(null, "val8");
		map.put("key9", null);
		map.put("key2", 4321);
		map.put("key3", "val1");
		map.put(null, "val88");
		map.remove("key1");
		
		System.out.println(map.get("key1"));
		System.out.println(map.get("key2"));
		System.out.println(map.get("key3"));
		System.out.println(map.get("key4"));
		System.out.println(map.get("key5"));
		System.out.println(map.get(1111));
		System.out.println(map.get(11.11));
		System.out.println(map.get(null));
		System.out.println(map.get("key9"));
		System.out.println(map.get("key10"));
	}

}
