package com.primary.newInterface;
/*接口
 * 定义：接口定义了某些类必须遵循的规范，是抽象方法的集合
 * 特点：
 * 1.内部有若干个常量和若干个抽象方法，abstract
 * 2.一个类可以实现多个接口，implement
 * 3.一个实现接口的类，必须实现接口内所描述的所有方法。否则，类必须声明为抽象的类。
 */
public abstract class Telephone {
	public abstract void call();
	public abstract void sendMessage();
}
