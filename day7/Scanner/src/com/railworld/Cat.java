package com.railworld;

public class Cat implements Animal{

	@Override
	public void noise() {
		System.out.println("cat is mewo");
	}

	@Override
	public void Eat() {
		System.out.println("cat is herbivore");
	}

	@Override
	public void walk() {
		System.out.println("cat is walking");
	}

	@Override
	public void sleep() {
		System.out.println("cat is sleeping");
		
	}

}
