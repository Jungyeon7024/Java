package com.kh.abstractSample;

public class Rectangle extends Shape {
	private double width;
	private double length;
	
	public Rectangle(String color, double width, double length) {
		super(color);
		this.length = length;
		this.width = width;
	
	}
	
	
	
	@Override
	public double calculateArea() {
		return width * length;
		
	}
	
}
