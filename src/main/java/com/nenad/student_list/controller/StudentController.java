package com.nenad.student_list.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nenad.student_list.entity.Student;
import com.nenad.student_list.service.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@RequestMapping
	public Collection<Student> getStudents(){
		return this.studentService.getStudents();
	}

}
