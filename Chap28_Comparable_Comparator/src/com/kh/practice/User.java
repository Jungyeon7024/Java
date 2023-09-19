package com.kh.practice;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import chap28_Comparator.ComparatorMain;

import java.util.ArrayList;

public class User {

	
	
	
	
	public static void main(String[] args) {
		List<String>emotion = new ArrayList<>();
		emotion.add("ㅇㅁㅇ");
		emotion.add("ㅁㅇㅁ");
		emotion.add("ㅎㅁㅎ");

		
		Collections.sort(emotion,new ComparatorMain());
				
		
		
		
		
		for (String e : emotion) {
			System.out.println(e);
		}
	}
}