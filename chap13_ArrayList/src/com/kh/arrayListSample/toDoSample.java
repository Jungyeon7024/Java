package com.kh.arrayListSample;
import java.util.ArrayList;

/*
 * 할일 3개 만들고
 * 수정하기 2개
 * 지우기 1개
 * 전부 다 지우기
 * 
 * 
 * */
public class toDoSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> todo = new ArrayList<>(); 
		
		
		todo.add("집 가기");
		todo.add("컴퓨터 켜기");
		todo.add("복습 하기");
		System.out.println("할일 : "+ todo);
		
		
		todo.set(1, "컴퓨터 끄기");
		todo.set(2, "잠 자기");
		System.out.println("수정 : "+ todo);
		
		todo.remove(0);
		System.out.println("하나 지우기 : " + todo); 
		
		todo.clear();
		System.out.println("비우기 : " + todo); 
		
		
		
		
		
		
		

	}

}
