package com.springrest.courseSpring.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.courseSpring.entity.Course;
import com.springrest.service.CourseServiceUtil;

@RestController
public class MyController {

	CourseServiceUtil courseServ = new CourseServiceUtil();

	@GetMapping("/home")
	public String home() {
		return "This is my home page";
	}

	@GetMapping("/courses")
	public List<Course> getCourses() {
		return this.courseServ.getCourses();
	}

	@GetMapping("/course/{courseID}")
	public Course getCourse(@PathVariable String courseID) {
		return this.courseServ.getCourse(Long.parseLong(courseID));
	}

	@PostMapping("/course")
	public Course addCourse(@RequestBody Course course) {
		return this.courseServ.addCourse(course);
	}

	@PutMapping("/course")
	public Course updateCourse(@RequestBody Course course) {
		return this.courseServ.updateCourse(course);
	}
}
