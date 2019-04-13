package com.primary.newInterface;
/*匿名内部类
 * 
 */
public class Initial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//接口的引用指向一个实现了接口的对象
		smartPhone ph1 = new smartPhone();
		IPlayGame ph2 = new pspGame();
		//使用方法
		ph1.playGame();
		ph2.playGame();
		//匿名内部类的使用
		System.out.println("——————匿名内部类————————");
		//方法一
		IPlayGame ip3 = new IPlayGame() {
			public void playGame() {
				System.out.println("匿名内部类实现玩游戏1");
			}
		};
		ip3.playGame();
		//方法二
		new IPlayGame() {
			public void playGame() {
				System.out.println("匿名内部类实现玩游戏2");
			}
		}.playGame();
	}
}
