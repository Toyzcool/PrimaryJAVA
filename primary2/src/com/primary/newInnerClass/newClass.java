package com.primary.newInnerClass;
/*知识点：成员内部类
 * 使用方法
 * 1.内部类能够使用任意访问控制符
 * 2.内部类能够使用外部类变量和方法，外部类需要先创建内部类对象才能使用内部变量和方法
 * 3.创建内部类对象需要用外部类对象来创建，如 内部类 对象名 = 外部类对象.new 内部类( )
 * 4.如果外部类和内部类具有相同的成员变量或方法，内部类默认访问自己的成员变量或方法，如果要访问外部类的成员变量，可以使用 this 关键字
 */
public class newClass {
	//定义外部类私有变量
	private String name = "Stark";
	//定义外部类默认变量
	int num = 45;
	//定义内部类
	public class InnerClass {
		//定义内部类变量
		String name = "Toyz";
		public void showName() {
			System.out.println("外部类的name："+newClass.this.name);
			System.out.println("内部类的name："+name);
			System.out.println("外部类的num："+num);
		}
	}
	public static void main(String[] args) {
		//创建外部类对象
		newClass boy = new newClass();
		//创建内部类对象
		InnerClass son = boy.new InnerClass();
		//调用内部类方法
		son.showName();
	}
}

