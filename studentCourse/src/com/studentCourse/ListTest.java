package com.studentCourse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListTest {
	//新建用于存储课程的类型
	@SuppressWarnings("rawtypes")
	public List courseToSelect;
	//构造方法
	@SuppressWarnings("rawtypes")
	public ListTest() {
		this.courseToSelect = new ArrayList();
	}
	//新建存储课程的方法
	@SuppressWarnings("unchecked")
	public void testAdd1() {
		/*
		 * 存储课程的方法一
		 */
		//新建课程对象
		Course c1 = new Course("1","数据结构");
		//将课程增加到课程列表中
		courseToSelect.add(c1);
		//获取课程列表中的第一门课程
		Course temp = (Course) courseToSelect.get(0);
		System.out.println("第"+temp.id+"门课程为："+temp.name);
		//新增课程对象
		Course c2 = new Course("2","C++");
		//将课程增加到课程列表的第一位
		courseToSelect.add(0, c2);
		//获取课程列表第一位
		Course temp2 = (Course) courseToSelect.get(0);
		System.out.println("第"+temp2.id+"门课程为："+temp2.name);
		/*
		 * 存储课程的方法二
		 */
		//新建课程数组
		Course[] course = {new Course("3","高等数学"),new Course("4","离散数学")};
		//将课程增加到课程列表中
		courseToSelect.addAll(Arrays.asList(course));
		//获取课程
		Course temp3 = (Course)courseToSelect.get(2);
		Course temp4 = (Course)courseToSelect.get(3);
		//输出课程
		System.out.println("第"+temp3.id+"门课程为："+temp3.name);
		System.out.println("第"+temp4.id+"门课程为："+temp4.name);
	}
	
	public static void main(String[] args) {
		//实现存储课程方法
		ListTest lt1 = new ListTest();
		lt1.testAdd1();
		
	}
}
