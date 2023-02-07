package com.jsp.controller;

import com.jsp.dao.TeacherDao;
import com.jsp.dto.Teacher;

public class TestSave {
	public static void main(String[] args) {
		Teacher teacher = new Teacher();
		teacher.setId(12355);
		teacher.setName("Ram");
		teacher.setEmail("Ram@Ymail.com");
		teacher.setCno(9769596633l);

		TeacherDao teacherDao = new TeacherDao();
		Teacher t1 = teacherDao.saveTeacher(teacher);
		System.out.println(t1.getId() + " has been saved");
	}
}
