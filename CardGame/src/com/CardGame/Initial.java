package com.CardGame;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Initial {
	public static void main(String[] args) {
		//新建扑克牌集合
		List<Card> cardList = new ArrayList<Card>();
		/*
		 * 新建扑克牌
		 */
		System.out.println("-----创建扑克牌-----");
		String[] suit = {"黑桃","红桃","梅花","方块"};
		String[] point = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
		for(int i = 0 ; i < suit.length ; i ++) {
			for(int j = 0 ; j < point.length ; j ++) {
				Card p = new Card(suit[i],point[j]);
				cardList.add(p);
			}
		}
		System.out.println("-----创建成功-----");
		//输出洗牌前顺序
		System.out.println("-----洗牌前-----");
		for (Card card : cardList) {
			System.out.println(card.suit+card.point);
		}
		/*
		 * 洗牌
		 */
		Random random = new Random();
		//新建乱序序列
		List<Card> newList = new ArrayList<Card>();
		for(int i = 0 ; i < cardList.size() ; i ++) {
			//获取随机数，用于获取随机值
			int index = random.nextInt(cardList.size());
			//判断随机值是否已经在乱序序列中，不存在时将随机值加入新序列中，存在则i-1
			if(!(newList.contains(cardList.get(index)))){
				newList.add(cardList.get(index));
			}else
				i -= 1;
		}
		//输出洗牌后顺序
		System.out.println("-----洗牌后-----");
		for (Card card2 : newList) {
			System.out.println(card2.suit+card2.point);
		}
		System.out.println("-----洗牌结束-----");
		/*
		 * 创建玩家
		 */
		Player player1 = new Player();
		Player player2 = new Player();
		List<Player> playerList = new ArrayList<Player>();
		playerList.add(player1);
		playerList.add(player2);
		Scanner console = new Scanner(System.in);
		//获取用户输入的玩家id
		int k = 1;
		for(int i = 0 ; i < 2 ; i ++) {
			System.out.println("请输入第"+k+"位玩家ID和NAME");
			System.out.print("ID：");
			int playerId = console.nextInt();
			System.out.print("NAME：");
			String playerName = console.next();
			playerList.get(i).id = playerId;
			playerList.get(i).name = playerName;
			k++;
		}
		System.out.println("-----创建成功-----");
		//输出创建的玩家
		for (Player player : playerList) {
			System.out.println("玩家ID:"+player.id+"  "+"玩家NAME："+player.name);
		}
		//Tip
		System.out.println("-----匹配成功-----");
		System.out.println("-----开始发牌-----");
		/*
		 * 发牌
		 * 从顶端开始，一人一张发，每人两张
		 */
		for(int i = 0 ; i < 10 ; i ++) {
			if(i % 2 == 0) {
				player1.hasCard.add(newList.get(i));
			}else{
				player2.hasCard.add(newList.get(i));
			}
		}
		//Tip
		System.out.println("-----发牌结束-----");
		System.out.println("-----游戏开始-----");
		/*
		 * 游戏开始，比较大小
		 */
		Card Max1 = player1.getMaxHasCard(player1.hasCard);
		Card Max2 = player2.getMaxHasCard(player2.hasCard);
		if(Max1.compareTo(Max2) > 0) {
			System.out.println("玩家："+player1.name+"获胜");
		}else {
			System.out.println("玩家："+player2.name+"获胜");
		}
		//Tip
		System.out.println("-----游戏结束-----");
		/*
		 * 亮手牌
		 */
		//player1亮手牌
		System.out.print("玩家："+player1.name+"手牌为：");
		for(int i = 0 ; i < 2 ; i ++) {
		System.out.print(player1.hasCard.get(i).suit+player1.hasCard.get(i).point+"  ");
		}
		System.out.println("");
		//player2亮手牌
		System.out.print("玩家："+player2.name+"手牌为：");
		for(int i = 0 ; i < 2 ; i ++) {
			System.out.print(player2.hasCard.get(i).suit+player2.hasCard.get(i).point+"  ");
			}
	}
}
