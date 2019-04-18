package com.OriginalCardGame;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Initial {
	public static void main(String[] args) {
		List<Card> cardList = new ArrayList<Card>();
		//Tip
		System.out.println("------创建游戏------");
		System.out.println("------创建扑克牌------");
		/*
		 * 创建扑克牌
		 */
		String[] suit = {"黑桃","红桃","梅花","方块"};
		String[] point = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
		for( int i = 0 ; i < suit.length ; i ++ ) {
			for( int k = 0 ; k < point.length ; k ++) {
				Card card = new Card(suit[i],point[k]);
				cardList.add(card);
			}
		}
		//Tip
		System.out.println("------创建成功------");
		System.out.println("------未洗牌顺序------");
		/*
		 * 输出未洗牌的顺序
		 */
		for (Card card : cardList) {
			System.out.println(card.suit+card.point);
		}
		//Tip
		System.out.println("-----洗牌中------");
		/*
		 * 洗牌
		 */
		//获取随机数，用于随机取cardList中的值
		Random random = new Random();
		//新建牌组，用于存储乱序的牌组
		List<Card> newList = new ArrayList<Card>();
		//给新牌组赋值
		for( int i = 0 ; i < cardList.size() ; i ++ ) {
			if( !(newList.contains(cardList.get(random.nextInt(cardList.size()))))) {
				newList.add(cardList.get(random.nextInt(cardList.size())));
			}else
				i -= 1;
		}
		/*
		 * 输出洗牌后的顺序
		 */
		System.out.println("-----洗牌后------");
		for (Card card2 : newList) {
			System.out.println(card2.suit+card2.point);
		}
		//Tip
		System.out.println("-----请创建玩家-----");
		/*
		 * 新建玩家
		 */
		//新建玩家对象，用于存储玩家属性
		Player player1 = new Player();
		Player player2 = new Player();
		//用于for-each方法遍历
		List<Player> playerList = new ArrayList<Player>();
		playerList.add(player1);
		playerList.add(player2);
		//新建用户方法类
		@SuppressWarnings("resource")
		Scanner console = new Scanner(System.in);
		//获取输入的ID和NAME，并赋值
		for(int i = 0 ; i < 2 ; i ++) {
			try {
				System.out.println("请输入第"+(i+1)+"个玩家");
				System.out.println("玩家ID：");
				//获取输入的ID
				int id = console.nextInt();
				for (Player playerSearch : playerList) {
					if(playerSearch.id == id) {
						System.out.println("该ID已经被占用");
						throw new Exception();
					}
				}
				playerList.get(i).id = id;
			} catch (InputMismatchException e) {
				System.out.println("输入错误");
			}catch (Exception e) {
			}
			//获取输入的NAME
			System.out.println("玩家NAME：");
			String name = console.next();
			//赋值，并加入到玩家列表中
			playerList.get(i).name = name;
		}
		//Tip
		System.out.println("-----以下为参与的玩家------");
		//输出玩家
		for (Player player3 : playerList) {
			System.out.println("玩家ID："+player3.id+"  "+"玩家NAME："+player3.name);
		}
		//Tip
		System.out.println("-----开始发牌-----");
		/*
		 * 发牌
		 */
		for(int i = 0 ; i < 4 ; i ++) {
			if(i % 2 == 0) {
				player1.hasCard.add(newList.get(i));
				System.out.println("玩家"+player1.name+"拿牌");
			}else {
				player2.hasCard.add(newList.get(i));
				System.out.println("玩家"+player2.name+"拿牌");
			}
		}
		//Tip
		System.out.println("-----发牌结束-----");
		System.out.println("-----游戏开始-----");
		/*
		 * 获取最大手牌，并比较大小
		 */
		//获取玩家一最大手牌
		Card max1 = player1.getMaxCard();
		System.out.println("玩家"+player1.name+"最大手牌为："+max1.suit+max1.point);
		//获取玩家二最大手牌
		Card max2 = player2.getMaxCard();
		System.out.println("玩家"+player2.name+"最大手牌为："+max2.suit+max2.point);
		//比较手牌大小
		if(max1.compareTo(max2) > 0) {
			System.out.println("玩家"+player1.name+"获胜");
		}else
			System.out.println("玩家"+player2.name+"获胜");
		//Tip
		System.out.println("-----游戏结束-----");
		System.out.println("-----复盘中-----");
		/*
		 * 输出各个手牌
		 */
		for (Player player : playerList) {
			System.out.println("玩家"+player.name+"手牌"+":"+player.hasCard.get(0).suit+player.hasCard.get(0).point+"   "+player.hasCard.get(1).suit+player.hasCard.get(1).point);
		}
	}

}
