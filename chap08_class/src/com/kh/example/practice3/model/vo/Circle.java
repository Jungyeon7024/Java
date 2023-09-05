package com.kh.example.practice3.model.vo;

public class Circle {
	
	double PI;
	int radius;
	
	public Circle(double PI,int radius) {
		this.PI = 3.14;
		this.radius=1;
	}
	public double getPI() {
		return PI;
	}
	public void setPI(double pI) {
		PI = pI;
	}
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public void incrementRadius() {
		System.out.println("반지름 :"	+ radius);
		
	}
	public void getAreaOfCircle() {
		double area =  PI * radius*radius;
		System.out.println("원의 넓이:	" +PI * radius*radius);
	}
	public void getSizeOfCircle() {
		
		System.out.println("지름:" +radius);
	}
}
