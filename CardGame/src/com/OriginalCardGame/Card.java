package com.OriginalCardGame;

public class Card implements Comparable<Card>{
	//定义基本属性，花色和点数
	public String suit;
	public String point;
	/*
	 * 定义构造方法
	 */
	public Card(String suit, String point) {
		super();
		this.suit = suit;
		this.point = point;
	}
	/*
	 * 定义花色取值
	 */
	public int getSuitValue() {
		//定义value变量，用于定义花色大小
		int value = 0 ;
		switch(suit) {
		case "黑桃":
			value = 4;
			break;
		case "红桃":
			value = 3;
			break;
		case "梅花":
			value = 2;
			break;
		case "方块":
			value = 1;
			break;
		}
		return value;
	}
	/*
	 * 定义点数取值
	 */
	public int getPointValue() {
		//定义value变量，用于定义点数大小
		int value = 0;
		switch(point) {
		case "2":
		case "3":
		case "4":
		case "5":
		case "6":
		case "7":
		case "8":
		case "9":
		case "10":
			value = Integer.parseInt(point);
			break;
		case "J":
			value = 11;
			break;
		case "Q":
			value = 12;
			break;
		case "K":
			value = 13;
			break;
		case "A":
			value = 14;
			break;
		}
		return value;
	}
	/*
	 * 定义比较大小方法,返回正数为大于，负数为小于
	 */
	@Override
	public int compareTo(Card o) {
		if(this.getPointValue() > o.getPointValue()) {
			return 1;
		}else if(this.getPointValue() == o.getPointValue()) {
			if(this.getSuitValue() > o.getSuitValue()) {
				return 1;
			}else if(this.getSuitValue() == o.getSuitValue()) {
				return 0;
			}else
				return -1;
		}else
			return -1;
	}
}








