package com.example.demo.studentcontroller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class StudentContoller {

	//ArrayList for storing student data
	ArrayList<String>students=new ArrayList<>();
	
	//Method for adding student to ArrayList
	//Implement POST
	@PostMapping(value="/addstudent")
	public void addStudent(@RequestBody String name) {
		students.add(name);
	}
	
	//Method to get student list
	//Implement GET
	@GetMapping(value="/getstudentinfo")
	public ArrayList<String> getStudentInfo() {
		return students;
	}
	
}
