package com.primary;
/*
 * 要求：
 * 1.要求通过定义无参带返回值的方法来实现，返回值为最大年龄
 * 2.方法中将​学生年龄保存在数组 ages 中，数组元素依次为 18 ,23 ,21 ,19 ,25 ,29 ,17
 * 运行效果为：最大年龄为：29
 */
public class method_demo1 {
	public static void main(String[] args) {
		//创建对象
		method_demo1 hello = new method_demo1();
		//调用方法
		int maxScore = hello.getMaxAge();
		//输出结果
		System.out.print(maxScore);
	}
	/*
	 * 功能：输出学生年龄的最大值 
     * 定义一个无参的方法，返回值为年龄的最大值
     * 参考步骤：
     * 1、定义一个整形数组 ages ，保存学生年龄，数组元素依次为 18 ,23 ,21 ,19 ,25 ,29 ,17
     * 2、定义一个整形变量 max ,保存学生最大年龄，初始时假定数组中的第一个元素为最大值
     * 3、使用 for 循环遍历数组中的元素，并与假定的最大值比较，如果比假定的最大值要大，则替换当前的最大值
     * 4、使用 return 返回最大值
	 */
	public int getMaxAge() {
		int maxscore = 0;
		int[] ages = {18,23,21,19,25,29,17};
		for( int i = 0 ; i < ages.length ; i++ ) {
			if( ages[i] > maxscore ) {
				maxscore = ages[i];
			}
		}
		return maxscore;
	}
}
