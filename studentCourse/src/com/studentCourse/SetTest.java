package com.studentCourse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/*学生选课程序
 * 运用了Set类型
 */
public class SetTest {
	public List<Course> courseToSelect;
	private Scanner console;
	//构造方法
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public SetTest() {
		this.courseToSelect = new ArrayList();
		this.console = new Scanner(System.in);
	}
	//创建课程表方法，并添加课程
	public void addCourse() {
		Course[] c1 = {new Course("1","数学"),new Course("2","物理"),new Course("3","英语"),new Course("4","化学"),new Course("5","生物"),new Course("6","政治")};
		courseToSelect.addAll(Arrays.asList(c1));
	}
	//输出课表的方法
	public void forEachCourse() {
		for(Course c2 : courseToSelect) {
			System.out.println("课程"+c2.id+"："+c2.name);
		}
	}
	//使用contain的方法确认是否已存在课程——Course类的equals方法
	public void testContain() {
		//获取用户希望搜索的课程
		System.out.println("请输入想查找的课程");
		String courseName = console.next();
		//需要将courseName输入到Course类中
		Course course = new Course();
		course.name = courseName;
		//调用Course类中重写的equals判断相同的方法
		System.out.println("希望查找的课程为："+courseName+"——"+"查找结果为:"+courseToSelect.contains(course));
	}
	//使用
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SetTest st1 = new SetTest();
		st1.addCourse();
		//查找课程
		st1.forEachCourse();
		st1.testContain();
		//创建一个学生类
		Student stu = new Student("1","Toyz");
		System.out.println("欢迎学生"+stu.name+"来选课");
		//获取学生输入的课程数字
		@SuppressWarnings("resource")
		Scanner con = new Scanner(System.in);
		for(int i = 0 ; i < 3 ; i++) {
			System.out.println("请输入选择的课程序号");
			//将用户输入的数字赋值给变量
			String courseID = con.next();
			//遍历课程表，符合id的课程加到学生的课程表中
			for(Course cr : st1.courseToSelect) {
				if(cr.id.equals(courseID)) {
					stu.courses.add(cr);
				}
			}
		}
		//输出学生的课程表
		for(Course cr : stu.courses) {
			System.out.println("选择了课程"+cr.id+"."+cr.name);
		}
	}

}
