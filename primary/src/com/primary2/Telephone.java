package com.primary2;
/*
 * 用户介绍类的属性和方法定义过程
 * 1.类是对象的类型；2.类的组成分为 属性和方法
 * 2.定义类的步骤：1.定义类名（class 类名）;2.编写类的属性（属性的类型 属性1）;3.编写类的方法（方法1）
 */
public class Telephone {
	//属性（成员变量）
	float screen;
	float cpu;
	float mem;
	int var = 10;
	//方法
	void call() {
		//局部变量的优先级大于成员变量
		//成员变量可以不赋值（默认为零），局部变量需要赋值
		int var = 30;
		System.out.println(var);
		System.out.println("phone is use to make a call!");
	}
	void sendMessage() {
		System.out.println("screen:"+screen+" cpu:"+cpu+" mem:"+mem+" It can send messages");
	}
}