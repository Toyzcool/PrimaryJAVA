package com.primary.newPackage;
/*知识点：java中包的使用
 * 1.可以通过import com.primary.newStatic.*来调用其他包中的类
 */
import com.primary.newStatic.useStatic;;
public class newPackage3 {
	public static void main(String[] args) {
		useStatic sum = new useStatic();
		System.out.println(sum.sum());
}
}
