package com.studentCourse;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MapTest {
	//新建一个map类,用于承载学生对象
	public Map<String,Student> student;
	//构造器中初始化student属性
	public MapTest() {
		this.student = new HashMap<String,Student>();
	}
	//新建添加学生的方法，
	public void testPut() {
		Scanner console = new Scanner(System.in);
		int i = 0;
		while (i < 3) {
			System.out.println("请输入希望添加的学生ID");
			//获取用户输入的学生id
			String ID = console.next();
			//判断id是否重复
			Student id = student.get(ID);
			//如果未被占用，则添加该学生信息
			if( id == null ) {
				System.out.println("请输入学生姓名");
				//获取学生姓名
				String Name = console.next();
				//新建学生对象
				Student stu = new Student(ID,Name);
				//使用student的Put方法，添加学生
				student.put(ID, stu);
				System.out.println("成功添加学生"+student.get(ID).name);
				i++;
			}else {
				System.out.println("当前ID已经存在");
			}
			
		}
	}
	//测试Map的KeySet方法
	public void testKeySet() {
		//通过KeySet方法，返回Map中的所有键
		Set<String> keySet = student.keySet();
		System.out.println("学生列表如下");
		//用for-each循环输出结果
		for(String stu : keySet) {
			Student st = student.get(stu);
			System.out.println(st.id+"."+st.name);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MapTest mt = new MapTest();
		mt.testPut();
		mt.testKeySet();
	}

}
