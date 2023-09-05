package com.kh.example.practice5.model.vo.Product;

public class Product {
	/*
	
	pName : String
	price : int
	brand : String
	*/
	String pname;
	int price;
	String brand;
	
	public Product(String pname,int price,String brand){ 
		this.pname = pname;
		this.price = price;
		this.brand =brand;
		
	}
	
	public void information() {
		System.out.println("품명 :"+ pname);
		System.out.println("가격 :"+ price);
		System.out.println("브랜드 :"+ brand);
	}
}
