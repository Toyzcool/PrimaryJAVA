package com.primary.newBulidMethod;
/*知识点：构造方法
 * 构造方法用途：创建对象
 * 特点：
 * 1.与类同名，但是没有返回值
 * 2.当没有指定的构造方法时，系统会自动添加无参数的构造方法
 * 3.当有指定的构造方法时，系统不会自动添加无参数或有参数的构造方法
 * 4.构造方法会重载
 * 5.构造方法能够给对象赋值
 */
public class Telephone {
	//属性（成员变量）
	float screen;
	float cpu;
	float mem;
	//无参数的构造方法
	public Telephone(){
		System.out.println("无参数的构造方法");
	}
	//有参数的构造方法
	public Telephone(float newScreen,float newCpu,float newMem) {
		if(newScreen < 3.5) {
			screen = 3.5f;
			System.out.println("由于屏幕尺寸输入有误，自动改为3.5");
		}else{
			screen = newScreen;
			}
			cpu = newCpu;
			mem = newMem;
			System.out.println(screen+" "+cpu+" "+mem);
	}
}
