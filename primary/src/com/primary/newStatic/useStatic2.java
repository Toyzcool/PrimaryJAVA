package com.primary.newStatic;
/*知识点：静态初始化、初始化的使用
 * 1.静态初始化块只在类加载时执行，且只会执行一次，同时静态初始化块只能给静态变量赋值，不能初始化普通的成员变量。
 * 以下实例执行顺序：
 * 1.静态初始化
 * 2.构造对象后，执行构造方法，然后初始化
 * 3.执行对象的普通方法
 */
public class useStatic2 {
	String name;
	String sex;
	static int age;
	//构造方法
	public useStatic2() {
		System.out.println("构造方法给name赋值");
		name = "Toyz";
	}
	//初始化
	{
		System.out.println("初始化方法给sex赋值");
		sex = "boy";
	}
	//静态初始化
	static {
		age = 25;
		System.out.println("静态初始化，输出age"+age);
	}
	//输出内容方法
	public void show() {
		System.out.println("人名："+name+" 性别："+sex+" 年龄："+age);
	}
	public static void main(String[] args) {
		useStatic2 per = new useStatic2();
		per.show();
	}
}
