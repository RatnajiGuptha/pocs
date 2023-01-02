package com.Spring.Demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Spring.Demo.Dao.StudentDao;
import com.Spring.Demo.Entity.Student;

@RestController
public class StudentController {

	@Autowired
	StudentDao dao;

	@GetMapping("/getAllStudents")
	public List<Student> getAllStudents() {
		return dao.findAll();
	}

	@GetMapping("/getStudents/{id}")
	public Optional<Student> getStudent(@PathVariable int id) {
		return dao.findById(id);
	}

	@PostMapping("/AddStudent")
	public Student addStudent(@RequestBody Student s) {
		return dao.save(s);
	}

	@DeleteMapping("/removeStudnet/{id}")
	public String removeStudent(@PathVariable int id) {
		dao.deleteById(id);
		return "Student Deleted";
	}
	
	@PutMapping("/updateStudent")
	public Student updateStudnet(@RequestBody Student s) {
		return dao.save(s);
	}
}
