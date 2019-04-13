package com.primary.extend;
/*Object
 * 1.是所有未声明父类的类的父类
 * 重点的方法
 * 1.toString:返回对象的哈希code码（对象地址字符串），使用菜单栏source
 */
public class newObject extends Animal {
	public static void main(String[] args) {
		animalDog dog = new animalDog();
		//输出dog对象中age属性的值
		System.out.println(dog);
	}
}
