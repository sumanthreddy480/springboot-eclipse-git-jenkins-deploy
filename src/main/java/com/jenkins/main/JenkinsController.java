package com.jenkins.main;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JenkinsController {

	@GetMapping(value = "/add")
	public int addTwoNumbers() {

		int a = 10;
		int b = 20;
		return a + b;
	}

	@GetMapping(value = "/getstudents")
	public List<Student> getAllStudents() {

		List<Student> list = Arrays.asList(new Student(1, "sumanth"), new Student(2, "sumanth1"),
				new Student(3, "sumanth2"));

		return list;
	}

}
