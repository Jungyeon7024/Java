package com.kh.finalSimple;

import java.util.ArrayList;

public class MyMusic {
	public void runFruit() {
		ArrayList<Music> list = new ArrayList<Music>();
		list.add(new Music("발라드","슬픔"));
		list.add(new Music("댄스","신남"));
		//list.add("음악");
		
		for(int i = 0; i <=list.size(); i++) {
			Music m = list.get(i);
			System.out.println(list.get(i));
			
		}
		
	}
}
