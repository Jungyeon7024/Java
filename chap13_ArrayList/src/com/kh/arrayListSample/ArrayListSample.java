package com.kh.arrayListSample;

import java.util.ArrayList;



public class ArrayListSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> fruits = new ArrayList<>();
		System.out.println("fruits : "+ fruits);

		fruits.add("사과");
		System.out.println("사과 추가 : " + fruits);
		fruits.add("바나나");
		System.out.println("바나나 추가 : " + fruits);
		fruits.add("딸기");
		System.out.println("딸기 추가 : " + fruits);
		
		int size = fruits.size();
		System.out.println("과일 목록의 크기 : " + size); 
		
		
		// 인덱스를 사용하여 요소에 접근하자
		String firstFruits = fruits.get(0);
		System.out.println("첫번째 과일 : " + firstFruits); 
		String fourFruits = fruits.get(2);
		System.out.println("첫번째 과일 : " + fourFruits); 
		
		//요소 수정하기
		fruits.set(2, "체리");
		System.out.println("수정본 : " + fruits); 
		
		//요소 제거
		fruits.remove(1);
		System.out.println("수정본 : " + fruits); 
		
		//ArrayList 순회해서 요소 출력 for
		System.out.println("모든 과일 목록");
		
		for(String        fruit:fruits) {
			System.out.println(fruit);
		}
			
		
		
		
		
		//ArrayList 장바구니 비우기
		fruits.clear();
		System.out.println("비우기 : " + fruits); 
		
	}

}
