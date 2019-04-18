package com.CardGame;

import java.util.Comparator;

public class Card implements Comparable<Card>{
	//定义card基本属性
	//定义花色属性
	public String suit;
	//定义号码属性
	public String point;
	//定义构造方法
	public Card(String suit, String point) {
		super();
		this.suit = suit;
		this.point = point;
	}
	//get和set方法
	public String getSuit() {
		return suit;
	}


	public String getPoint() {
		return point;
	}


	public void setSuit(String suit) {
		this.suit = suit;
	}


	public void setPoint(String point) {
		this.point = point;
	}

	//设置花色的值
	public int getSuitValue() {
		int value = 0;
		switch(this.suit) {
		case "黑桃" :
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
	//设置点数的值
	public int getPointValue() {
		int value = 0 ;
		switch(this.point) {
		case "2":
		case "3":
		case "4":
		case "5":
		case "6":
		case "7":
		case "8":
		case "9":
		case "10":
			value = Integer.parseInt(this.getPoint());
			break;
		case "J":
			value = 11;
			break;
		case "Q":
			value = 12;
			break;
		case "A":
			value = 13;
			break;
		}
		return value;
	}
	//重写compare方法
	public int compareTo(Card c1) {
		if(this.getPointValue() > c1.getPointValue()) {
			return 1;
		}else if(this.getPointValue() == c1.getPointValue()) {
			if(this.getSuitValue() > c1.getSuitValue()) {
				return 1;
			}else {
				return -1;
			}
		}else {
			return -1;
		}
	}
}
