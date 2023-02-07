package com.jsp.controller;

import com.jsp.dao.TeacherDao;
import com.jsp.dto.Teacher;

public class TestUpdate {
	  public static void main(String[] args) {
			Teacher teacher=new Teacher();
			teacher.setId(12355);
			TeacherDao teacherDao=new TeacherDao();
			Teacher t1=teacherDao.updateTeacher(teacher);
			System.out.println(t1.getId()+" has been updated");
		}
}
