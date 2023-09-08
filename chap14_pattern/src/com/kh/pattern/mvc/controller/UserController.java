package com.kh.pattern.mvc.controller;


public class UserController {

	/*
	 * 모델과 뷰를 연결하는 곳
	 * 사용자 입력을 처리하는 곳
	 * 
	 * */
	private UserModel usermodel;
	

	private UserView userview;
	
	public UserController(UserModel model,UserView userview) {
		this.usermodel = model;
		this.userview = userview;
	}
	public UserModel getModel() {
		return usermodel;
	}

	public void setModel(UserModel model) {
		this.usermodel = model;
	}

	public UserView getuserview() {
		return userview;
	}

	public void setuserview(UserModel UserView) {
		this.userview = userview;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
