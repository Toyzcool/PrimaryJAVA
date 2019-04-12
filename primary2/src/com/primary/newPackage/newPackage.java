package com.primary.newPackage;
/*知识点：属性的封装
 * 封装步骤：
 * 1.将属性的修饰符修改为private
 * 2.创建getter和setter方法来调取和修改被封装的属性值
 * 3.在getter和setter中增加属性控制语句
 */
public class newPackage {
	//封装属性
	private float screen;
	private float cpu;
	private float mem;
	//创建修改属性的方法
	public void setScreen(float newScreen) {
		screen = newScreen;
	}
	//创建取属性的方法
	public float getScreen() {
		return screen;
	}
}
