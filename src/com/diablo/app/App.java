package com.diablo.app;

import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.diablo.Model.Student;
import com.diablo.dao.StudentDaoImpl;

public class App {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		StudentDaoImpl st = (StudentDaoImpl)ctx.getBean("dao");
		ArrayList<Student> stu = new ArrayList<Student>();
		stu.add(new Student(2,"ramit"));
		stu.add(new Student(3,"samit"));
		stu.add(new Student(4,"namit"));
		st.insertStudent(stu);

	}

}
