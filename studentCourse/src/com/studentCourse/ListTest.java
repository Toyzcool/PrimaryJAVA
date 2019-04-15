package com.studentCourse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
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
		Course c2 = new Course("2","C语言");
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
		/*
		 * 存储课程的方法三
		 */
		Course[] course2 = {new Course("5","JAVA"),new Course("6","大学英语")};
		courseToSelect.addAll(2,Arrays.asList(course2));
		Course temp5 = (Course)courseToSelect.get(2);
		Course temp6 = (Course)courseToSelect.get(3);
		System.out.println("第"+temp5.id+"门课程为："+temp5.name);
		System.out.println("第"+temp6.id+"门课程为："+temp6.name);
		/*
		 * 普通遍历输出课程表
		 */
		System.out.println("有以下课程待选");
		//获取课程表长度
		int size = courseToSelect.size();
		//循环输出
		for(int i = 0 ; i < size ; i ++) {
			Course cr = (Course)courseToSelect.get(i);
			System.out.println("第"+cr.id+"门课程为："+cr.name);
		}
	}
	/*
	 * 迭代器输出课程表
	 */
	//建立迭代器方法
	@SuppressWarnings("rawtypes")
	public void testIterator() {
		System.out.println("有以下课程待选(通过迭代器)");
		Iterator it = courseToSelect.iterator();
		//输出
		while(it.hasNext()) {
			Course cr = (Course)it.next();
			System.out.println("第"+cr.id+"门课程为："+cr.name);
		}
	}
	/*
	 * for-each 输出课程表
	 */
	//建立for-each方法
	public void testForEach() {
		System.out.println("有以下课程待选(通过for-each)");
		for(Object obj : courseToSelect) {
			Course temp = (Course)obj;
			System.out.println("第"+temp.id+"门课程为："+temp.name);
		}
	}
	
	public static void main(String[] args) {
		//实现存储课程方法
		ListTest lt1 = new ListTest();
		lt1.testAdd1();
		//实现迭代器输出课表
		ListTest lt2 = new ListTest();
		lt2.testAdd1();
		lt2.testIterator();
		//实现for-each输出课表
		ListTest lt3 = new ListTest();
		lt3.testAdd1();
		lt3.testForEach();

	}
}
