package com.example.studentlms.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.studentlms.entity.StudentEntity;
import com.example.studentlms.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository studentrepo;
	
	public StudentEntity addStudent(StudentEntity student) {

		return studentrepo.save(student);
	}

	public Optional<StudentEntity> getStudentById(int id) {
		
		return studentrepo.findById(id);
	}

	public List<StudentEntity> allStudent() {

		return studentrepo.findAll();
	}

	public void deleteStudent(int id) {
		
		studentrepo.deleteById(id);
	}

	public StudentEntity updateStudent(int id, StudentEntity updatedstudent) {

		return studentrepo.findById(id).map(student ->{
			
			student.setStdregno(updatedstudent.getStdregno());
			student.setStname(updatedstudent.getStname());
			student.setStage(updatedstudent.getStage());
			
			return studentrepo.save(student);

		}).orElse(null);
	}

}
