package com.nenad.student_list.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Collection;

import com.nenad.student_list.entity.Student;
import com.nenad.student_list.studentDao.StudentDao;

@Service
public class StudentService {

	@Autowired
	private StudentDao studentDao;
	
	@RequestMapping(method = RequestMethod.GET)
	public Collection<Student> getStudents(){
		return this.studentDao.getStudents();
	}
	
	public Student getStudentById(int id) {
		return this.studentDao.getStudentById(id);
	}
}
