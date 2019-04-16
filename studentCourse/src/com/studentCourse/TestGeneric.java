package com.studentCourse;

import java.util.ArrayList;
import java.util.List;

/*泛型
 *List类型创建时，提前规定放入的内容类型
 */
public class TestGeneric {
	//新建List类型
	public List<Course> courses;
	//创建构造方法
	public TestGeneric() {
		this.courses = new ArrayList<Course>();
	}
	//创建添加课程方法
	public void testAdd() {
		courses.add(new Course("1","课程设计"));
		//泛型后，无法添加除规定外的类型
		//courses.add("乱七八糟的类型");
		System.out.println("已经成功添加课程");
	}
	//创建for-each遍历方法
	public void testForEach() {
		System.out.println("使用for-each方法输出课程表");
		for(Course c1 : courses) {
			System.out.println(c1.id+"."+c1.name);
		}
	}
	//泛型的子类型添加课程
	public void testChild() {
		CourseChild cc1 = new CourseChild();
		cc1.id = "10";
		cc1.name = "泛型子类的专用课程";
		courses.add(cc1);
	}
	/*
	 * 泛型不能用基本类型
	 */
	public void testBasic() {
		//泛型需要使用基本类的包装类
		List<Integer> list = new ArrayList();
		list.add(43423);
		System.out.println("这是基本类的包装类输出的内容："+list.get(0));
	}
	
	public static void main(String[] args) {
		TestGeneric tg1 = new TestGeneric();
		tg1.testAdd();
		tg1.testForEach();
		//使用泛型子类添加课程，并输出
		tg1.testChild();
		tg1.testForEach();
		//使用基本类的包装类
		tg1.testBasic();
		
	}

}
