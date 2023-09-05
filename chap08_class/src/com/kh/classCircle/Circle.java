package com.kh.classCircle;

public class Circle {
	// 멤버 변수	
	final double PI =3.14;
	private int radius =1;
	
	
	//생성자
	
	public Circle() {
		// 기본 생성자 
		
	}
	//메소드
	//반지름의 길이를 출력
	public void inRadius() {
		//반지름의 증가 증가시킬 양을 지정할 수 있다!
		System.out.println("반지름 : " + radius);
	}
	//원의 넓이를 출력
	public void AreaCircle() {
		double area = PI * radius * radius ;
		System.out.println("원의 넓이 : "+ area);
	
	}
	public void SizeOfCircle() {
		System.out.println("원의 크기(반지름)"+radius);
	}
}
