package com.kh.pattern.mvc.controller;

public class UserView {
	
	//정보를 화면에 출력
	public void dispalyInfo(String userName, int userAge) {
		System.out.println("학생 정보");
		System.out.println("이름 : "	+ userName);
		System.out.println("나이 : "	+ userAge);
	}
	

}
