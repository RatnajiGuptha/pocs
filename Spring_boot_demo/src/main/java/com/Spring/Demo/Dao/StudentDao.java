package com.Spring.Demo.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Spring.Demo.Entity.Student;

@Repository
public interface StudentDao extends JpaRepository<Student,Integer>{

}
