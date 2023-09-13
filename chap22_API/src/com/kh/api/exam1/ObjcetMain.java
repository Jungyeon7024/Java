package com.kh.api.exam1;

public class ObjcetMain {

	public static void main(String[] args) {
		// Object 클래스 예제
		
		//객체 생성	
		Object obj = new Object();
		Object obj2 = new Object();
		
		//equals() 메소드를 사용
		boolean isEqual = obj.equals(obj2);
		System.out.println("obj와 obj2는 같은가?: "+ isEqual);
		
		// 해쉬 코드 메소드를 사용해 객체의 해시 코드 출력
		int hashcode1 = obj.hashCode();
		int hashcode2 = obj2.hashCode();
		System.out.println("obj의 해시코드 :" + hashcode1);
		System.out.println("ob2의 해시코드 :" + hashcode2);
		
		//toString () 메소드를 사용하여 객체를 문자열로 표현
		String objString =obj.toString();
		String obj2String =obj2.toString();
		System.out.println("obj1의 문자열 표현 :" + objString);
		System.out.println("obj2의 문자열 표현 :" + obj2String);
		
		
		//getClass() 메소드를 사용하여 객체의 클래스 정보 출력
		Class<?> classOfObj1 = obj.getClass();
		Class<?> classOfObj2 = obj2.getClass();
		System.out.println("obj 클래스" + classOfObj1.getName());
		System.out.println("obj 클래스" + classOfObj2.getName());
		
		
		
		
		
		
	}

}
