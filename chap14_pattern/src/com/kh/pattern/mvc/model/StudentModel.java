package com.kh.pattern.mvc.model;

public class StudentModel {

	
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
	
	
	public void StudentModel(String name, int age) {
		this.name = name;
		this.age =age;
	}
}
