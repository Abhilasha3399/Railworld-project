package com.railworld;

public interface Animal {
	
	default void info() {
		System.out.println(" animal is the part of nature");
	}
	
	public void noise();
	public void Eat();
	public void walk();
	public void sleep();

}
