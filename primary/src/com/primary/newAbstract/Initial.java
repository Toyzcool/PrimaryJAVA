package com.primary.newAbstract;

public class Initial {
	public static void main(String[] args) {
		//父类引用指向子类对象
		Shape circle1 = new Circle();
		Shape rectangle1 = new Rectangle();
		//获取圆的周长和面积
		float circleCircumference = circle1.circumference(2, 3);
		float circleArea = circle1.area(2, 3);
		System.out.println("圆的周长为："+circleCircumference);
		System.out.println("圆的面积为："+circleArea);
		//获取长方形的周长和面积
		float rectangleCircuference = rectangle1.circumference(2, 3);
		float rectangleArea = rectangle1.area(2, 3);
		System.out.println("长方形的周长为："+rectangleCircuference);
		System.out.println("长方形的面积为："+rectangleArea);
		
	}
}
