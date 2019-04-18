package com.CardGame;

import java.util.ArrayList;
import java.util.List;

public class Player {
	//玩家基本属性
	public int id;
	public String name;
	public List<Card> hasCard;
	//构造方法
	public Player(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		this.hasCard = new ArrayList<Card>();
	}
	public Player() {
		// TODO Auto-generated constructor stub
		super();
		this.hasCard = new ArrayList<Card>();
	}
	//取得最大手牌的方法
	public Card getMaxHasCard(List<Card> hascard) {
		Card max = hascard.get(0);
		for(int i = 0 ; i < hascard.size() - 1 ; i++ ) {
			if (max.compareTo(hascard.get(i+1)) < 0 ){
				max = hascard.get(i+1);
			}
		}
		return max;
		
	}
}
