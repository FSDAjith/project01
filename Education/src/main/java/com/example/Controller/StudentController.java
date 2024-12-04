package com.example.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Entity.Student;
import com.example.Service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	StudentService studentServ;
	
	@PostMapping("/student")
	public Student gatStudentDetails(@RequestBody Student student) {
		return studentServ.addStudent(student);
	}
}
