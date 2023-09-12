package com.kh.FoodStore;

public class Main {

	public static void main(String[] args) {
		

			foodStore order = new Order();
			order.addMenu("짬뽕주문");
			order.addMenu("짜장면 주문");
			order.addMenu("굴짬뽕 주문");
			order.printMenu();
	}
	
	
	}

	

