package com.student_app.service;

import java.util.List;

import com.student_app.entity.Student;

public interface StudentService {

	List<Student> getAllStudents();

	Student getStudentById(long id);

	Student createStudent(Student student);
	
	Student updateStudent(Long id, Student studentdetails);
	
	public void deleteStudent(Long id);

}
