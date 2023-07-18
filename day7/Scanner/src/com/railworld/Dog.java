package com.railworld;

public class Dog implements Animal{

	@Override
	public void noise() {
		System.out.println("dog is barking");
		
	}

	@Override
	public void Eat() {
		System.out.println("Dog is omnivores");
		
	}

	@Override
	public void walk() {
		System.out.println("dog is walking");
		
	}

	@Override
	public void sleep() {
		System.out.println("dog is sleeping");
	}

}
