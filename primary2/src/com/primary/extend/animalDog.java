package com.primary.extend;
/*子类的重写
 * 1.重写的方法保证相同：访问修饰符、返回值类型、方法名
 */
/*super关键字
 * 1.在对象的内部使用，可以代表父类对象
 */
//定义animal的子类animalDog
public class animalDog extends Animal {
	int age;
	public animalDog() {
		//super方法其实是隐藏式的，必须在第一行
		super();
		System.out.println("子类的构造方法，默认有super方法");
	}
	//重写的方法
	public void eat() {
		System.out.println("年龄："+age);
		System.out.println("狗能吃很多东西");
	}
	//super的使用方法
	public void superMethod() {
		super.eat();
	}
	public static void main(String[] args) {
		animalDog dog = new animalDog();
		dog.age = 10;
		//子类方法的重写后使用
		dog.eat();
		//子类方法调用父类方法后使用
		dog.superMethod();
		
	}
	//toString方法
	@Override
	public String toString() {
		return "animalDog [age=" + age + "]";
	}
}
