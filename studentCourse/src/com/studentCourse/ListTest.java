package com.studentCourse;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
	//创建list类型的属性
	@SuppressWarnings("rawtypes")
	public List courseToSelect;
	//创建构造方法
	@SuppressWarnings("rawtypes")
	public ListTest() {
		this.courseToSelect = new ArrayList();
	}
	//创建添加课程的方法
	@SuppressWarnings("unchecked")
	public void testAdd() {
		//创建课程对象，并构造对象
		Course cr1 = new Course("1","程序设计");
		//使用添加课程的方法
		courseToSelect.add(cr1);
		//获取课程列表中的课程内容，并转换格式
		Course temp = (Course) courseToSelect.get(0);
		System.out.println("添加了id为"+temp.id+"的课程,课程名为："+temp.name);
		//再次新建课程对象，并构造对象
		Course cr2 = new Course("2","C++");
		//使用添加课程的方法,并添加到队头
		courseToSelect.add(0, cr2);;
		//获取课程列表中的课程内容，并转换格式
		Course temp2 = (Course) courseToSelect.get(0);
		System.out.println("添加了id为"+temp2.id+"的课程,课程名为："+temp2.name);
		
	}
	public static void main(String[] args) {
		ListTest lt1 = new ListTest();
		lt1.testAdd();
	}
	
}
