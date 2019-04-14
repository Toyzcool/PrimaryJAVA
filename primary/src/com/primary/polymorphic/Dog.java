package com.primary.polymorphic;

public class Dog extends Animal {
	//方法的多态
	public void eat() {
		System.out.println("狗能吃");
	}
	public void watchDoor() {
		System.out.println("狗能看门");
	}
}
