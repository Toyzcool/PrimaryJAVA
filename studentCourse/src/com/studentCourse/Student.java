package com.studentCourse;

import java.util.HashSet;
import java.util.Set;
//课程类
public class Student {
	public String id;
	public String name;
	@SuppressWarnings("rawtypes")
	public Set courses;
	@SuppressWarnings("rawtypes")
	public Student(String id, String name) {
		super();
		this.id = id;
		this.name = name;
		this.courses = new HashSet();
	}
	
}
