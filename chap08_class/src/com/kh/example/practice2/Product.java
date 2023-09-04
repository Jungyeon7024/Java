package com.kh.example.practice2;
/*
  com.kh.example.practice2.model.vo
 Product
 -pName : String
 -price : int
 -brand : Stirng
 +Product()
 +information() : void
 * */

public class Product {
	//1. 멤버변수 생성
	//-pName : String
	String pname;
	int price;
	String brand;

	//2. 생성자 this를 활용해서 만들어야함
	// +Product()
	public Product(String pname,int price, String brand) {
		this.pname =pname;
		this.price =price;
		this.brand= brand;
	}
	//3. 정보 출력 메소드 만들기
	// +information() : void
	public void information() {
	//sysout + ctrl + space => System.out.println()
		System.out.println("상품명 : "+ pname);
		System.out.println("가 격 :" + price+"원");
		System.out.println("브랜드 :"+ brand);
	}

}
