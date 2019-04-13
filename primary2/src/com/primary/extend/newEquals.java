package com.primary.extend;
/*equals
 * 1.用于判断两个对象是否相同，哈希地址所指的地址相同
 * 2.如果不同，那就重写equals方法，在菜单栏source方法
 * 关联class：equalsIphone1、equalsIphone2、equalsIphone
 */
public class newEquals {
	public static void main(String[] args) {
		//创建不同类的对象
		equalsIphone1 phone1 = new equalsIphone1();
		equalsIphone2 phone2 = new equalsIphone2();
		//比较对象是否相同
		if(phone1.equals(phone2)) {
			System.out.println("两个相同");
		}else {
			System.out.println("两个不同");
		}
		//创建同一类的对象
		equalsIphone1 phone3 = new equalsIphone1();
		equalsIphone1 phone4 = new equalsIphone1();
		if(phone3.equals(phone4)) {
			System.out.println("两个相同");
		}else {
			System.out.println("两个不同");
		}
	}
}
