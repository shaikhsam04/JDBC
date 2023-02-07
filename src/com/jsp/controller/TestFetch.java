package com.jsp.controller;

import com.jsp.dao.TeacherDao;
import com.jsp.dto.Teacher;

public class TestFetch {
	public static void main(String[] args) {
		Teacher teacher=new Teacher();
		teacher.setId(12355);
		TeacherDao teacherDao=new TeacherDao();
		Teacher t1=teacherDao.fetchTeacher(teacher);
		System.out.println(t1.getId()+" data has been fetched");
	}
}
