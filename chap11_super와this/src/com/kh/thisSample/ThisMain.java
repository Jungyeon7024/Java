package com.kh.thisSample;


/*
int x = 10;
		int y = x;
		
		x = 20;
		System.out.println("y : "+y);
		
		int[] list1 = {1,2,3};
		int[] list2 = list1; //list2 list1


this  인스턴스 자신을 가리키는 참조변수 객체(=인스턴스)의 주소가 저장
this () 현재 클래스의 다른 생성자를 호출하는데 사용

 * */

class Myclass {
	int myField;
	
	Myclass(){
		this(0);	//this()사용해서 다른 생성자 호출
	}
	
	MyClass(int value){
		this.myField =value;
	
	}
	void printValue() {
		System.out.println("myField의 값:"this.myField);
	}
	}


public class ThisMain {
	public static void main(String[]args) {
		MyClass obj1 = new Myclass();
		MyClass obj2 = new Myclass(10);
		
		obj1.printValue();
		obj2.printValue();
	
	
	
	}	
}
