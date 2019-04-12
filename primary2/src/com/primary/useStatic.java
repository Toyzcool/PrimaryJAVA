package com.primary;
/*
 * 知识点！！！
 * 静态方法的注意点：
 * 1.静态方法无法调用非静态成员或变量，只能调用静态成员或变量。原因：静态成员在类加载时已存在并分配内存，非静态成员属于类的对象，需要类实例化后才分配内存
 * 2.普通成员方法能调用静态和非静态变量！！！原因：普通成员方法可以调用静态和非静态变量，调用静态原因看第一条；普通成员方法在调用非静态变量时，必须先满足实例化才能调用普通成员方法，一旦实例化，那非静态变量也就分配到内存了（原因看第二条）。所以系统不担心你在普通成员方法中调用非静态变量，因为你要用普通成员方法的前提就是实例化，实例化就满足了第二条规则。
 */
public class useStatic {
	//定义静态变量1
	static int score1 = 45 ;
	//定义静态变量2
	static int score2 = 50 ; 
	//定义静态方法，调用两个静态变量，计算总分
	public static int sum() {
		return (score1+score2);
	}
	public static void main(String[] args) {
		//调用静态方法
		int sum = useStatic.sum();
		System.out.println("学生总分为："+sum);
	}
	
}
