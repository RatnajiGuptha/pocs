package com.spring.CrudOperations.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.CrudOperations.Entity.Employee;

@Repository
public interface EmployeeDao extends JpaRepository<Employee, Long> {

}
