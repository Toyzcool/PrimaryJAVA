package com.primary;
import java.util.Scanner;//导入方法
/*
 * 功能实现：实现接收三个班级各四个学生的成绩信息，然后计算每个班级学员的平均分；
 * 知识点：二重循环、外层循环控制班级数量，内层循环控制每个班级的学员数量；
 * 步骤：
 * 1.导入java.util.Scanner类；
 * 2.创建Scanner方法；
 * 3.循环使用Scanner方法；
 */
public class numCalculate_demo2 {
	public static void main(String[] args) {
		int classNum = 3;//班级数量
		int stuNum = 4;//学生数量
		double sum = 0;//总分
		double avg = 0;//平均分
		Scanner input = new Scanner(System.in);
		for( int i = 1; i <= classNum ; i++ ) {
			for(int j = 1 ; j <= stuNum ; j++) {
			System.out.print("请输入"+i+"班"+"第"+j+"个学生成绩：");
			double score = input.nextDouble();
			sum += score;
			}
		}
		avg = sum / (classNum * stuNum);
		System.out.print("平均分为："+avg);
	}
}
