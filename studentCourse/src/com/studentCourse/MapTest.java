package com.studentCourse;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class MapTest {
	//定义map类变量
	public Map<String,Student> student;
	private Scanner console;
	//构造方法初始化变量
	public MapTest() {
		this.student = new HashMap<String,Student>();
		this.console = new Scanner(System.in);
	}
	/*
	 * 新建添加学生方法，如果已存在该学生，则直接输出已经在学生的姓名
	 */
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
	/*
	 * 新建获取map中的键值方法
	 */
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
	/*
	 * 新建删除学生信息的方法
	 */
	public void testRemove() {
		System.out.println("请输入希望删除的学生id");
		Scanner console = new Scanner(System.in);
		while (true) {
			//获取用户希望搜索的学生id
			String inputId = console.next();
			Student testStu = student.get(inputId);
			//判断是否存在当前学生
			if( testStu == null ) {
				System.out.println("当前学生不存在，删除失败");
				continue;
			}else {
				student.remove(inputId, testStu);
				System.out.println("已经删除学生："+testStu.name);
				break;
			}
		}
	}
	/*
	 * 使用entrySet方法遍历
	 */
	public void testEntrySet() {
		Set<Entry<String,Student>> entrySet = student.entrySet();
		for(Entry<String,Student> entry : entrySet) {
			System.out.print("学生序号为："+entry.getValue().id+"的");
			System.out.println("姓名为："+entry.getValue().name);
		}
	}
	/*
	 * 修改学生信息
	 */
	public void testModify() {
		System.out.println("请输入要修改的学生id");
		Scanner console = new Scanner(System.in);
		while(true) {
			//获取用户输入的id
			String inputId = console.next();
			Student testStu = student.get(inputId);
			//判断学生是否存在
			if(testStu == null) {
				System.out.println("学生不存在，请重新输入");
				continue;
			}
			System.out.println("当前学生姓名为："+testStu.name);
			System.out.println("请输入修改后的姓名：");
			//获取修改后的姓名
			String newStu = console.next();
			Student newStudent = new Student(testStu.id,newStu);
			//修改
			student.put(inputId, newStudent);
			System.out.println("修改成功");
			break;
		}
	}
	/*
	 * 测试Map中，是否包含某个Key值或者Value值
	 */
	public void testContainsKeyOrValue() {
		//获取用户查询的学生ID
		System.out.println("请输入查询的学生ID");
		String inputId = console.next();
		//用containKey()方法判断是否存在
		System.out.println("您输入的学生"+inputId+"存在情况为："+student.containsKey(inputId));
		if(student.containsKey(inputId)) {
			System.out.println("学生ID为："+inputId+"学生，姓名为："+student.get(inputId).name);
		}else {
			System.out.println("您查询的学生不存在");
		}
		//获取用户查询的学生姓名
		System.out.println("请输入查询的学生姓名");
		String inputName = console.next();
		//用containValue()方法判断是否存在，需要在Student类中重写hasHash方法——Student.java
				System.out.println("您输入的学生"+inputName+"存在情况为："+student.containsValue(new Student(null,inputName)));
				if(student.containsValue(new Student(null,inputName))) {
					System.out.println("学生列表中确实包含学生："+inputName);
				}else {
					System.out.println("您查询的学生不存在");
				}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MapTest mt = new MapTest();
		mt.testPut();
		mt.getKey();
		//使用查询学生方法
		mt.testContainsKeyOrValue();
		//使用删除学生的方法
		mt.testRemove();
		//使用entry方法遍历输出
		mt.testEntrySet();
		//使用put方法修改
		mt.testModify();
		mt.testEntrySet();

	}

}
