package com.springmicroservices.Controller;

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

import com.springmicroservices.Dao.StudentDao;
import com.springmicroservices.Entity.Student;

@RestController
@RequestMapping("/Student")
public class StudentController {

	@Autowired
	StudentDao dao;

	@GetMapping("/getAllStudents")
	public List<Student> fetchStudents() {
		return dao.findAll();
	}

	@GetMapping("/getStudent")
	public Optional<Student> getStudent(@PathVariable int id) {
		return dao.findById(id);
	}

	@PostMapping("/addStudent")
	public Student addStudent(@RequestBody Student s) {
		return dao.save(s);
	}

	@PutMapping("/updateStudent")
	public Student updateOrSave(@RequestBody Student s) {
		return dao.save(s);
	}

//	@DeleteMapping("/deleteStudent/{Id}")
//	public String deleteStudent(@PathVariable int student_id) {
//		dao.deleteById(student_id);
//		return "Student Deleted";
//	}

}
