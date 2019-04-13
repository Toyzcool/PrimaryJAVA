package com.primary.newAbstract;

public class Rectangle extends Shape {

	@Override
	public float circumference(float x, float y) {
		// TODO Auto-generated method stub
		return (x+y)*2;
	}

	@Override
	public float area(float x, float y) {
		// TODO Auto-generated method stub
		return x*y;
	}

}
