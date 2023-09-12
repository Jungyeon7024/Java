package com.kh.abstractSampleAnimal;

public class Dog extends Animal {
	private String sound;
	private String name;
	public Dog(String name) {
		super(name);
		this.name =name;
	}
	
	@Override
	public String makeSound() {
		System.out.println("멍");
		return name;
	}
}

