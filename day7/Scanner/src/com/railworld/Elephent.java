package com.railworld;

public class Elephent implements Animal{

	@Override
	public void noise() {
		System.out.println("elephent is whispering");
		
	}

	@Override
	public void Eat() {
		System.out.println("elephant is herbivore");
	}

	@Override
	public void walk() {
		System.out.println("elephant is walking");
	}

	@Override
	public void sleep() {
		System.out.println("elephent is sleeping");
	}

}
