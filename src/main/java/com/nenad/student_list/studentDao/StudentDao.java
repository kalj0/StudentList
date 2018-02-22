package com.nenad.student_list.studentDao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nenad.student_list.entity.Student;

@Repository
public class StudentDao {

	private static Map<Integer, Student> students;
	
	static {
		
		students = new HashMap<Integer, Student>(){
			
			{
				put(1, new Student("Nenad Kaljevic", 20130820, 7.3));
				put(2, new Student("Nikola Kaljevic", 20120009, 9.3));
				put(3, new Student("Djordje Maricic", 20120056, 8));
			}
		};
		
	}
	
	
	public Collection<Student> getStudents(){
		return this.students.values();
	}
	
	
	public Student getStudentById(int id) {
		return this.students.get(id);
	}
	
}
