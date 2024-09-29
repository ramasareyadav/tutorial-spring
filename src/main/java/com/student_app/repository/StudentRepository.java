package com.student_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.student_app.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{

}
