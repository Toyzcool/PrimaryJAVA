package com.primary;
/*
 * 要求：
 * 1.考试成绩已保存在数组 scores 中，数组元素依次为 89 , -23 , 64 , 91 , 119 , 52 , 73
 * 2.要求通过自定义方法来实现成绩排名并输出操作，将成绩数组作为参数传入
 * 3.要求判断成绩的有效性（ 0—100 ），如果成绩无效，则忽略此成绩
 * 步骤：
 * 1.定义数组
 * 2.新建自定义方法
 * 3.对成绩排序
 * 4.循环遍历删除无效成绩
 * 5.获取最后三个成绩
 */
import java.util.Arrays;//导入Arrays方法

public class method_getThird {
	public static void main(String[] args) {
		//新建数组
		int[] scores = {89 , -23 , 64 , 91 , 119 , 52 , 73};
		//创建对象
		method_getThird hello = new method_getThird();
		//调用自定义方法
		int[] scoreResult = hello.getThird(scores);
		//输出目标数组
		for( int k = 0 ; k < 3 ; k ++ ) {
			System.out.println(scoreResult[k]);
		}
	}
	//创建自定义方法
	public int[] getThird(int[] scores) {
		//新建数组，用于排序和储存有效值
		int[] third = new int[scores.length];
		//数组排序
		Arrays.sort(scores);
		int j = 0;
		//数组筛选
		for( int i = scores.length -1 ; i >= 0 ; i-- ) {
			if( scores[i] < 0 || scores[i] > 100 ) {
				continue;
			}
			third[j] = scores[i];
			j++;
		}
		return third;
	}
}