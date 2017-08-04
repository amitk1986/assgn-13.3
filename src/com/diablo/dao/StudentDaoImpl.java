package com.diablo.dao;

import java.util.ArrayList;





import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.diablo.Model.Student;

public class StudentDaoImpl extends JdbcDaoSupport{
	
	public int insertStudent(ArrayList<Student> stu){
		int i=0;
		for (Student student : stu)
		{
			getJdbcTemplate().update("insert into students values(?,?)",student.getId(),student.getName());
			i++;
		}
		System.out.print("inserted "+i+" rows");
		return i;
		
	}
}
