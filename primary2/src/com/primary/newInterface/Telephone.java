package com.primary.newInterface;
/*接口
 * 定义：接口定义了某些类必须遵循的规范，规定了这些类中需要提供的方法
 * 特点：
 * 1.内部有若干个常量和若干个抽象方法，abstract
 * 2.一个类可以实现多个接口，implement
 */
public abstract class Telephone {
	public abstract void call();
	public abstract void sendMessage();
}
