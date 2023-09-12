package com.kh.LinkedListSample;

import java.util.List;
import java.util.LinkedList;

public class LinkedListExam {

	public static void main(String[] args) {
		// List 인터페이스 LinkedList 객체 활용해서 값 넣고 출력
		//String
		List<String> linkedList = new LinkedList<>();
		
		linkedList.add("첫 번쨰");
		linkedList.add("두 번쨰");
		linkedList.add("세 번쨰");
		
		//LinkedList 객체 new LinkedList 객체
		//int 값 넣고 수정 삭제 출력
		System.out.println("LinkedList :"+ linkedList);		
		
		linkedList.remove(2);
			
		System.out.println("삭제 후  :"+ linkedList);		
		
		boolean isTrue = linkedList.contains("두 번째");
		System.out.println("두 번쨰 요소 포함 여부 :" +isTrue);
		
		
		int size = linkedList.size();
		System.out.println("크기 : "+ size );
		
	}

}
