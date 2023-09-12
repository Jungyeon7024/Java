package com.kh.abstractSample;
//추상클래스 정의
abstract class Shape {
	//일반 필드
	private String color;
	
	
	//추상 메서드
	abstract double calculateArea();
	
	//생성자
	public Shape(String color) {
		this.color = color;
	}
	
	//일반 메서드
	public void setShape(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}
	
	
	
	
	
	
	
	

}
