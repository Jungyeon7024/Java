package com.kh.genericsMain;

public class Box<B> {
	
	B content; // T는 Type의 약자 아무거나 사용가능
		
	public void put(B tem) {
		this.content = tem;
	}
	
	public B get() {
		return content;
	}
}
