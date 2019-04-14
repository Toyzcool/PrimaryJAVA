package com.primary.newInterface;

public class smartPhone extends Telephone implements IPlayGame {

	@Override
	public void playGame() {
		// TODO Auto-generated method stub
		System.out.println("玩游戏功能");
	}

	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("打电话功能");
	}

	@Override
	public void sendMessage() {
		// TODO Auto-generated method stub
		System.out.println("发短信功能");
	}

}
