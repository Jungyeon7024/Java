package com.kh.colletcionMain;

import java.util.HashMap;
import java.util.Map;
import java.util.Map;
import java.util.HashMap;
public class UserMamExam {

	public static void main(String[] args) {
		// HashMap 생성 UserAge
		
		Map<String,Integer> user = new HashMap<>();
		
		
		//유저의 이름과 나이
		user.put("Won", 25);
		user.put("Kim", 27);
		user.put("Han", 24);
		user.put("Jo ", 26);
		
		//특정 유저 검색
		String userName = "Won"	;
		
		
		
		//모든 학생과 성적 출력
		System.out.print("전체 학생 성적 : ");
		for(Map.Entry<String, Integer> entry : user.entrySet()) {
			String name = entry.getKey();
			int grade =entry.getValue()	;
			System.out.println(name+ "  :  "+ grade);
			
		}
		
		// 유저 나이 수정
		String userUpdate = "Kim";
		int newAge = 99;
		user.put(userUpdate, newAge);
		System.out.println(user + "의 나이를 "+ newAge + "로 수정했다.");
		
		
		//유저 탈퇴
		String removeUser= "Jo";
		user.remove(removeUser);
		
		//최종 유저 이름 나이 출력
		System.out.println("최종 학생 성적 :  ");
		for (Map.Entry<String,Integer>entry: user.entrySet()) {
			String name = entry.getKey();
			int age= entry.getValue();
			System.out.println();
		}
		
	}

}
