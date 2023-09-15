package com.kh.genericsMain;

// 제너릭 클래스 정의
public class Book<T> {
	
	T content; // T는 Type의 약자 아무거나 사용가능
		
	public void put(T item) {
		this.content = item;
	}
	
	public T get() {
		return content;
	}
	
	
	
	
}
