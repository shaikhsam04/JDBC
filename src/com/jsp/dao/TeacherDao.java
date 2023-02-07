package com.jsp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.jsp.dto.Teacher;
import com.jsp.helper.HelperClass;

public class TeacherDao {
	HelperClass helperClass = new HelperClass();

	public Teacher updateTeacher(Teacher teacher) {
		Connection connection = helperClass.getConnection();
		String sql = "Update teacher set name='sam' where id=?";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, teacher.getId());
			preparedStatement.execute();
			preparedStatement.close();
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return teacher;

	}

	public Teacher saveTeacher(Teacher teacher) {
		Connection connection = helperClass.getConnection();
		String sql = "Insert into teacher values(?,?,?,?)";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, teacher.getId());
			preparedStatement.setString(2, teacher.getName());
			preparedStatement.setString(3, teacher.getEmail());
			preparedStatement.setLong(4, teacher.getCno());
			preparedStatement.execute();
			preparedStatement.close();
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return teacher;

	}

	public Teacher deleteTeacher(Teacher teacher) {
		Connection connection = helperClass.getConnection();

		String sql = "Delete from teacher where id=?";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, teacher.getId());
			preparedStatement.execute();
			preparedStatement.close();
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return teacher;

	}

	public Teacher fetchTeacher(Teacher teacher) {
		Connection connection = helperClass.getConnection();

		String sql = "Select * from teacher";

		try {

			Statement statment = connection.createStatement();
			ResultSet resultSet = statment.executeQuery(sql);
			while (resultSet.next()) {
				System.out.println(resultSet.getInt(1));
				System.out.println(resultSet.getString(2));
				System.out.println(resultSet.getString(3));
				System.out.println(resultSet.getLong(4));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return teacher;

	}

}
