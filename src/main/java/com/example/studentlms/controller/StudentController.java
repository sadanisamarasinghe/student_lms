package com.example.studentlms.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.studentlms.entity.StudentEntity;
import com.example.studentlms.service.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	//add students
	@PostMapping("/add")
	public StudentEntity addStudent(@RequestBody StudentEntity student) {
		
		return studentService.addStudent(student);
	}
	
	//get students detail using id
		@GetMapping("/{id}")
		public Optional<StudentEntity> getStudentById(@PathVariable int id) {
			
			return studentService.getStudentById(id);
		}
		
		//get all students 
				@GetMapping("/all")
				public List<StudentEntity> allStudent() {
					
					return studentService.allStudent();
				}
				
				//delete students by id
				@DeleteMapping("/delete/{id}")
				public void deleteStudent(@PathVariable int id) {
					
					studentService.deleteStudent(id);
				}
				
				//update students
				@PutMapping("/update/{id}")
				public StudentEntity updateStudent(@PathVariable int id, @RequestBody StudentEntity updatedstudent) {
					
					return studentService.updateStudent(id,updatedstudent);
				}
}
