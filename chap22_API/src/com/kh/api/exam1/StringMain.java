package com.kh.api.exam1;

public class StringMain {

	public static void main(String[] args) {
		String greeting = "Hellow World";
		
		//만약에 문자열이 같을 때 나올 문구 == equals
		if(greeting.equals("Hellow World")) {
			System.out.println("문자열이 같습니다.");
		}
		String name = "Alice";
		String msg = "Hello," + name + "!";
		System.out.println(msg);
	}

}
