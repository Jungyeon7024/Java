package com.kh.practice;

import java.util.Map;
import java.util.HashMap;

public class UserExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Map<String,Integer> user = new HashMap<>();
			
			user.put("Won", 25);
			user.put("Kim", 27);
			user.put("Han", 24);
			user.put("Jo ", 26);
			
			String userName = "Won"	;
			
			if(user.containsKey(userName)) {
				int age =user.get(userName);
				System.out.println(userName  +  age + " 세 ");
				
			} else {
				System.out.println(userName + " 그런 사람 없음");
			}
			
			for(Map.Entry<String, Integer> entry : user.entrySet()) {
				String name =entry.getKey();
				int age = entry.getValue();
				
				System.out.println(name + " : "+ age);
			}
			
	}

}
