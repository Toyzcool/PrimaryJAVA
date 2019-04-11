package com.primary2;

public class Iphone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//实例化
		Telephone iphone =  new Telephone();
		//初值
		iphone.sendMessage();
		//设置值
		iphone.cpu = 2.2f;
		iphone.screen = 4.5f;
		iphone.mem = 35.4f;
		//输出设置值
		iphone.sendMessage();
		iphone.call();
	}
}
