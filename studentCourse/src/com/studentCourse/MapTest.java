package com.studentCourse;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MapTest {
	//定义map类变量
	public Map<String,Student> student;
	//构造方法初始化变量
	public MapTest() {
		this.student = new HashMap<String,Student>();
	}
	//新建添加学生方法，如果已存在该学生，则直接输出已经在学生的姓名
	public void testPut() {
		//获取用户输入的ID
		@SuppressWarnings("resource")
		Scanner console = new Scanner(System.in);
		//循环输入三个学生信息
		int i = 0;
		while(i < 3) {
			System.out.println("请输入想要添加的学生ID");
			String inputId = console.next();
			//新建变量存储ID检索到的学生
			Student inputStu = student.get(inputId);
			//判断检索结果是否为空
			if( inputStu == null ) {
				System.out.println("请输入学生姓名");
				//获取用户添加的学生姓名
				String stuName = console.next();
				//新建学生类型
				Student newStu = new Student(inputId,stuName);
				//将学生添加到学生列表中
				student.put(inputId, newStu);
				i++;
			}else {
				System.out.println("学生已存在，且姓名为："+inputStu.name);
				continue;
			}
		}
	}
	//新建获取map中的键值方法
	public void getKey() {
		Set<String> key = student.keySet();
		System.out.println("学生列表如下");
		//使用for-each方法输出学生列表
		for(String stu : key) {
			//新建学生类用于存储获取到的学生类型和内容
			Student getStu = student.get(stu);
			System.out.println(getStu.id+"."+getStu.name);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MapTest mt = new MapTest();
		mt.testPut();
		mt.getKey();

	}

}
