package com.primary;
//导入方法
import java.util.Scanner;
/*
 * 功能描述：为指定成绩加分，直到分数大于等于 60 为止，输出加分前和加分后的成绩，并统计加分的次数
 * 步骤：
 * 1.导入java.util.Scanner
 * 2.创建Scanner类
 * 3.使用Scanner
 */
public class numCalculate {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入考试成绩：");
		int score = input.nextInt();
		int count = 0;
		//循环
		while (score < 60) {
			score++;
			count++;
		}
		System.out.println("修改后成绩为："+score);
		System.out.println("共修改次数为："+count);
	}
}
