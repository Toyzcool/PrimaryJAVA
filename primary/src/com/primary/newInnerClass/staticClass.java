package com.primary.newInnerClass;
/*静态内部类
 * 特点
 * 1.静态内部类不能直接访问外部类的非静态成员，但可以通过"new.外部类().成员"访问
 * 2.创建静态内部类的对象时，可直接创建
 */
public class staticClass {
	//外部类静态变量
	public static int score = 90;
	//创建静态内部类
	public static class SInner{
		//创建内部变量
		int score = 80;
		//创建内部方法
		public void showScore() {
			//输出外部静态变量
			System.out.println("外部静态变量分数为："+staticClass.score);
			//输出内部静态类的变量
			System.out.println("内部变量分数为："+score);
		}
	}
	public static void main(String[] args) {
		//创建内部静态对象
		SInner si = new SInner();
		si.showScore();
	}
}
