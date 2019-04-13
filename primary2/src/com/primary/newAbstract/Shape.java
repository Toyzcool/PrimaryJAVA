package com.primary.newAbstract;
/*抽象类
 * 1.抽象类规定了子类必须具备的方法
 */
public abstract class Shape {
	//求周长的方法
	public abstract float circumference(float x,float y);
	//求面积的方法
	public abstract float area(float x,float y);
}
