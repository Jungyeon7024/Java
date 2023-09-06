package com.kh.Inheritance.animal;

public class Cat extends Animal {
	public Cat(String name) {
		super(name);
	}
	public void run() {
		System.out.println(getName()+ " 주인이 달려온다");
	}
	@Override
	//animal에 적혀있는 eat을 고양이안에서만 다시 저으이를 내린다.
	public void eat() {
		System.out.println(getName()+ " 먹는데 중간에 먹이통을 뻇을 것");
	}
	
	
}
