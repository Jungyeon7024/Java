package com.kh.pattern.mvc;

public class MVCStudent {
	//1. model
	public MVCStudent(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	private String name;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	private int age;
	
	//2.Controller
	public class SController{
		private MVCStudent model;
		private MVCStudent view;
		
	public SController() {
		this.model = model;
		this.view = view;
	
	}
	public void updateview() {
		view.printInfo();

	}
	
		
	}
		
	
	//3. view
	public void printInfo() {
		System.out.println("학생들의 정보");
	}
	
	
	public static void main(String[] args) {
		//model

	}

}
