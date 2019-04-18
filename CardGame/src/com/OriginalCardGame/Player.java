package com.OriginalCardGame;

import java.util.ArrayList;
import java.util.List;

public class Player {
	//定义玩家基本属性
	public int id;
	public String name;
	public List<Card> hasCard;
	/*
	 * 构造方法，有参和无参构造方法。无参为主要使用到的方法
	 */
	public Player(int id, String name, List<Card> hasCard) {
		super();
		this.id = id;
		this.name = name;
		this.hasCard = new ArrayList<Card>();
	}
	public Player() {
		super();
		this.hasCard = new ArrayList<Card>();
	}
	/*
	 * get和set方法
	 */
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	/*
	 * 获取最大手牌的方法
	 */
	public Card getMaxCard() {
		Card max = hasCard.get(0);
		for(int i = 0 ; i < hasCard.size() - 1 ; i ++) {
			if(max.compareTo(hasCard.get(i+1)) < 0 ) {
				max = hasCard.get(i+1);
			}else
				continue;
		}
		return max;
	}
}
