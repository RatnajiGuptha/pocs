package com.spring.CrudOperations.Controller;

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

import com.spring.CrudOperations.Dao.EmployeeDao;
import com.spring.CrudOperations.Entity.Employee;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeDao dao;

	@GetMapping("/getAllEmployes")
	public List<Employee> getAllEMployes() {
		return dao.findAll();
	}

	@GetMapping("/getEmployes/{id}")
	public Optional<Employee> getEMployee(@PathVariable long id) {
		return dao.findById(id);
	}

	@PostMapping("/addEmployes")
	public Employee addEmployee(@RequestBody Employee emp) {
		return dao.save(emp);
	}

	@PutMapping("/updateEmployes")
	public Employee saveOrupdateEmployee(Employee emp) {
		return dao.save(emp);
	}

	@DeleteMapping("/removeEmployes/{id}")
	public Optional<Employee> removeEmployee(@PathVariable long id) {
		dao.deleteById(id);
		return Optional.empty();
	}
}
