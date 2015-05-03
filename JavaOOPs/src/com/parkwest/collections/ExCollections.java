package com.parkwest.collections;

import java.util.ArrayList;
import java.util.List;

public class ExCollections {
	public static void main(String[] args) {
		String name[] = new String[10];
		name[0] = "John";
		name[9] = "Mary";
		
//		name[10] = "king";
		
		List list = new ArrayList();
		list.add("john");
		list.add("mary");
		list.add(100);
		list.add(true);

//		for(String temp : list){
//			System.out.println(temp);
//		}
		
		for(Object temp : list){
			System.out.println(temp);
		}
		System.out.println("==============");
		
		//generic list can only add specific
		List<String> gList = new ArrayList<>();
		gList.add("john");
		gList.add("mary");
		gList.add("king");
		gList.add("carlos");
		gList.add("jack");
		//gList.add(100); 
		gList.remove(2);
		gList.remove("Four");
		gList.add(0, "Start");
		for(String temp : gList){
			System.out.println(temp);
		}
	}
}
