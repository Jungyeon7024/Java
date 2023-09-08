package com.kh.pattern.mvc.controller;


public class UserClient {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * MVC패턴을 사용해서 학생 정보를 다루는 곳
		 * */
		UserModel user = new UserModel("홍길동",20);
		
		UserView view = new UserView();
		
		//컨트롤러 객체성 및 모델 뷰 설정
		UserController controller = new UserController(user,view);
		
	}

}
