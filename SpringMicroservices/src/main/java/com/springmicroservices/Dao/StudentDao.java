package com.springmicroservices.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springmicroservices.Entity.Student;

@Repository
public interface StudentDao extends JpaRepository<Student, Integer> {

}
