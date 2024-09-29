package com.student_app.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student_app.entity.Student;
import com.student_app.repository.StudentRepository;
import com.student_app.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepository;

	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}

	public Student createStudent(Student student) {
		return studentRepository.save(student);
	}

	public Student updateStudent(Long id, Student studentDetails) {
		Student student = getStudentById(id);
		student.setName(studentDetails.getName());
		student.setEmail(studentDetails.getEmail());
		student.setCourse(studentDetails.getCourse());
		return studentRepository.save(student);
	}

	public void deleteStudent(Long id) {
		Student student = getStudentById(id);
		studentRepository.delete(student);
	}

	@Override
	public Student getStudentById(long id) {
		return studentRepository.findById(id).orElseThrow(() -> new RuntimeException("Student not found"));

	}

}
