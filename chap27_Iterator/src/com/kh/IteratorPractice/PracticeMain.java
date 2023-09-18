package com.kh.IteratorPractice;
import java.util.ArrayList;
import java.util.Iterator;
public class PracticeMain {

	public static void main(String[] args) {
		
		ArrayList<String> classs = new ArrayList<>();
		
		classs.add("Arcanist");
		classs.add("Reaper");
		classs.add("Striker");
		classs.add("Blaster");
		
		
		Iterator<String> iter = classs.iterator();
		
		while(iter.hasNext()){
			String cls = iter.next();
			System.out.println(cls);
		}
		iter = classs.iterator(); 
		while(iter.hasNext()) {
			String cls = iter.next();
			
			if (cls.equals("Blaster")) {
				iter.remove();
			System.out.println(cls);
		}
		
		
		}
		
		
		
		System.out.println("삭제 후 출력 ");
		for(String a : classs) {
			System.out.println(a);
		}
		

	}

}
