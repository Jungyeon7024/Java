package com.kh.example.practice5.model.vo.Product;

public class Product {
	/*
	
	pName : String
	price : int
	brand : String
	*/
	private String pname;
	private int price;
	private String brand;
	
	public Product(){ 
		pname = "ㅇㅂㅇ";
		price = 100;
		brand ="ㅇㅈㅇ";
		
	}
	
	public void information() {
		System.out.println("품명 :"+ pname);
		System.out.println("가격 :"+ price);
		System.out.println("브랜드 :"+ brand);
	}
}
