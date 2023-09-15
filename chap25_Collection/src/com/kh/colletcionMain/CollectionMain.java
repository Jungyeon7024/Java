package com.kh.colletcionMain;

import java.util.ArrayList;
import java.util.List;
import java.util.Set; 
import java.util.HashSet; 
import java.util.Map;
import java.util.HashMap;
public class CollectionMain {
	public static void main(String[] args) {
		List<String> myList = new ArrayList<>();
		myList.add("사과");
		myList.add("바나나");
		myList.add("딸기");
		
		System.out.println("List :");
		
		for(String fruit : myList) {
			System.out.println(fruit);
		}
		// Set 예제
		Set<Integer> myset = new HashSet<>();
		myset.add(1);
		myset.add(2);
		myset.add(3);
		myset.add(2);
		for(Integer number : myset) {
			System.out.println(number);
		}
		Map<String, Integer> myMap = new HashMap<>();
		myMap.put("한국", 1);
		myMap.put("미국", 2);
		myMap.put("스페인",45);
		myMap.put("스페인",42);
		
		for(String country:myMap.keySet()) {
			int code = myMap.get(country);
			System.out.println(country + " : "+code);
		}
		
		
		
		
	}
	

	
	
	
}
