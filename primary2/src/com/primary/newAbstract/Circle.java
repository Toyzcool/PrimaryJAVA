package com.primary.newAbstract;

public class Circle extends Shape {

	@Override
	public float circumference(float x, float y) {
		// TODO Auto-generated method stub
		//使用半径求周长
		return (float) (6.28*x);
	}

	@Override
	public float area(float x, float y) {
		return (float) (x*x*3.14);
		// TODO Auto-generated method stub

	}

}
