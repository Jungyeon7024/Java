package com.kh.genericsMain;

public class GenericExam {

	public static void main(String[] args) {
		// 정수형 데이터를 저장하는 Book 인스턴스 생성
	/*	Book<Integer> intBook = new Book<>();
		intBook.put(42);
		intBook.put(30);
		int intValue = intBook.get(); // 형변환 필요 x
		
		
		//문자열 데이터를 저장하는 Book 인스턴스 생성
		Book<String> strBook = new Book<>();
		strBook.put("Hello");
		strBook.put("안녕");
		strBook.put("ni hao");
		String strValue = strBook.get()	;
		
		
		// 제너릭 클래스를 사용해서 다양한 데이터를 유형을 처리할 수 있고
		System.out.println("Int Value : "+ intValue);
		System.out.println("Str Value : "+ strValue);
	} */
	public void practice2() {
		
		Box<Integer> intBox = new Box<>();
		intBox.put(123);
		intBox.put(451);
		
		int intValue = intBox.get();
		
		
		
		Box<String > strBox = new Box<>();
		
		strBox.put("캔");
		strBox.put("종이");
		strBox.put("알루미늄");
		String strValue = strBox.get();
		
	
		
		
	}
}
