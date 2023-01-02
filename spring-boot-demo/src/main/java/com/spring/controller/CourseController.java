package com.spring.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.bean.Course;

@RestController
public class CourseController {

	
	@GetMapping("/Courses")
	public List<Course> getAllCourses(){
		return Arrays.asList(new Course(1,"springBoot","udemy"));
	}
}
