package com.kh.Inheritance.animal;

public class Lion extends Animal {
	public Lion(String name) {
		super(name);
	}
	

	public void eat() {
		System.out.println(getName()+ " 밥 내놔");
	}
}
