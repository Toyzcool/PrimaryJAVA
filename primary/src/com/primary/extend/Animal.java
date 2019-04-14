package com.primary.extend;
/*继承
 * 子类继承父类的变量和方法，如animalDog
 * 继承初始化顺序：父类对象——父类属性——父类构造方法——子类对象——子类属性——子类构造方法
 */
public class Animal {
	public int age;
	public String name;
	public void eat() {
		System.out.println("年龄："+age);
		System.out.println("动物有吃的能力");
	}
}
