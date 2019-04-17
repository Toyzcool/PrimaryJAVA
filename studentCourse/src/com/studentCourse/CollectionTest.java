package com.studentCourse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/*
 * 使用collection中的sort方法进行排序
 */
public class CollectionTest {
	/*
	 * 新建int类型的排序方法
	 */
	public void testSort() {
		List<Integer> integerList = new ArrayList<Integer>();
		//形成100以内不重复的10个整数
		Random random = new Random();
		Integer k ;
		for(int i = 0 ; i < 10 ; i ++ ) {
			do {
				//k等于100以内的任意整数
				k = random.nextInt(100);
			//判断是否重复
			}while(integerList.contains(k)) ;
				//添加至list中
				integerList.add(k);
				System.out.println("成功添加数字："+k);
			}
		//输出排序前的list
		System.out.println("--------排序前--------");
		for (Integer integer2 : integerList) {
			System.out.println(integer2);
		}
		//对list进行排序
		Collections.sort(integerList);
		//输出排序后的list
		System.out.println("--------排序前--------");
		for (Integer integer2 : integerList) {
			System.out.println(integer2);
		}
	}
	/*
	 * 新建Student类的排序，用到comparable——Student.java
	 */
	public void testSortStu() {
		List<Student> studentList = new ArrayList<Student>();
		Random random = new Random();
		studentList.add(new Student(random.nextInt(1000)+"","uncle"));
		studentList.add(new Student(random.nextInt(1000)+"","euphrie"));
		studentList.add(new Student(random.nextInt(1000)+"","pedant"));
		studentList.add(new Student(10000+"","mixnum"));

		//输出排序前顺序
		System.out.println("------排序前------");
		for (Student student : studentList) {
			System.out.println(student.id+"."+student.name);
		}
		//进行排序
		Collections.sort(studentList);
		//输出排序后顺序
		System.out.println("------排序后------");
		for (Student student : studentList) {
			System.out.println(student.id+"."+student.name);
		}
		/*
		 * 根据姓名排序，使用comparator方法——StudentComparator.java
		 */
		System.out.println("------根据姓名排序后------");
		Collections.sort(studentList,new StudentComparator());
		for (Student student : studentList) {
			System.out.println(student.id+"."+student.name);
		}
	}

	public static void main(String[] args) {
		CollectionTest ct = new CollectionTest();
		ct.testSortStu();
		ct.testSort();
	}

}
