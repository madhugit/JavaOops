package com.parkwest.collections;

import java.util.HashMap;

public class ExHashMap {
	public static void main(String[] args) {
		HashMap<String, Double> hm = new HashMap<>();
		hm.put("John", 10000.10);
		hm.put("Mary", 20000.20);
		hm.put("Carlos", 30000.30);
		System.out.println(hm.get("Mary"));
		}
}
