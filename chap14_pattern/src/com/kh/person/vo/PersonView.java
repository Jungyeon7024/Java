package com.kh.person.vo;
import java.util.Scanner;
public class PersonView {
	public String getNameInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력하세요");
		
		return sc.next();
	}
	public String getHobbyInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("취미를 입력하세요");
		
		return sc.next();
	}
	public void displayResult(String name,String hobby){
		System.out.println("이름은 :" + name);
		System.out.println("취미는 :"+ hobby);
	}
	
	
}
