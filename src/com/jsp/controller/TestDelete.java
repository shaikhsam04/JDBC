package com.jsp.controller;

import com.jsp.dao.TeacherDao;
import com.jsp.dto.Teacher;

public class TestDelete {
	public static void main(String[] args) {
		Teacher teacher = new Teacher();
		teacher.setId(123);
		TeacherDao teacherDao = new TeacherDao();
		Teacher t1 = teacherDao.deleteTeacher(teacher);
		System.out.println(t1.getId() + " has been deleted");
	}
}
