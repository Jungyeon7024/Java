package com.kh.example.practice2;
//import 는 최초 1회에 상단에 작성
public class ProductRun {

	public static void main(String[] args) {
		// product 생성 3개 하고 
		// 각각 상품명 가격 브랜드명 출력하기
		Product product1 = new Product("ㅇㅁㅇ",2000,"나이스");
		Product product2 = new Product("ㅇㅅㅇ",2200,"아디스");
		Product product3 = new Product("ㅇㅈㅇ",2300,"푸마");
		
		product1.information();
		product2.information();
		product3.information();

	}

}
