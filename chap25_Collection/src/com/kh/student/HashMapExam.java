package com.kh.student;

import java.util.Map;
import java.util.HashMap;

public class HashMapExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Integer> studentGrades = new HashMap<>()	;
		
		
		
		studentGrades.put("kh   ", 95);
		studentGrades.put("Park ", 80);
		studentGrades.put("Choi	", 77);
		studentGrades.put("Kim	", 92);
		
		//특정 학생의 성적 검색
		String studentName = "Kim";
		
		
		
		//모든 학생과 성적 출력
		System.out.print("전체 학생 성적 : ");
		for(Map.Entry<String, Integer> entry : studentGrades.entrySet()) {
			String name = entry.getKey();
			int grade =entry.getValue()	;
			System.out.println(name+ "  :  "+ grade);
			
		}
		
		String StrudentUpdate = "kh";
		int newGrade = 99;
		studentGrades.put(StrudentUpdate, newGrade);
		System.out.println(studentGrades + "의 성적을 "+ newGrade + "로 수정했다.");
		
		//학생 제거
		String removeStudent= "Choi";
		studentGrades.remove(removeStudent);
		
		System.out.println(removeStudent + " 의 성적을 삭제했습니다.");
		
		System.out.println("최종 학생 성적 :  ");
		for (Map.Entry<String,Integer>entry: studentGrades.entrySet()) {
			String name = entry.getKey();
			int grade = entry.getValue();
			System.out.println();
		}
		
		
		
		
		
		
		
	}

}
