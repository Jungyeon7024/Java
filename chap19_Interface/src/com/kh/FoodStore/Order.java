package com.kh.FoodStore;
import java.util.ArrayList;
import java.util.List;

// 주문 객체
public class Order implements foodStore{
	private List<Menu>	OrderMenus;
	
	public Order() {
		OrderMenus = new ArrayList();
		
	}
	
	@Override
	public void addMenu(String menu) {
		Menu menuA = new Menu(menu);
		OrderMenus.add(menuA);
		
	}
	
	@Override
	public void removeMenu(String menu) {
		System.out.println();
	}
	//@Override
	
		public void printMenu() {
			System.out.println("주문내역");
			for (Menu menuA : OrderMenus) {
				System.out.println(menuA.getItem());
			}
			
			
}
}
