package com.springrest.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springrest.courseSpring.entity.Course;

@Service
public class CourseServiceUtil implements CourseService {

	List<Course> ls;

	public CourseServiceUtil() {
		ls = new ArrayList<Course>();
		ls.add(new Course(100, "Core Java", "CJ"));
		ls.add(new Course(120, "Python", "PY"));
		ls.add(new Course(130, "Computer Networks", "CN"));
	}

	public List<Course> getCourses() {
		return ls;
	}

	public Course getCourse(long courseID) {
		Course c = null;
		for (Course course : ls) {
			if (course.getId() == courseID) {
				c = course;
				break;
			}
		}
		return c;
	}

	public Course addCourse(Course course) {
		ls.add(course);
		return course;
	}

	public Course updateCourse(Course courseInput) {
		long idInput = courseInput.getId();
		String codeInput = courseInput.getCourseCode();
		String nameInput = courseInput.getCourseName();

		ls.forEach(currentCourse -> {
			if (currentCourse.getId() == idInput) {
				currentCourse.setCourseName(nameInput);
				currentCourse.setCourseCode(codeInput);
			}
		});

		return courseInput;
	}
}
