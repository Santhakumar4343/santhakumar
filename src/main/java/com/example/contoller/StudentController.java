package com.example.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Student;
import com.example.service.ServiceStudent;
@RestController
@RequestMapping("/home")
public class StudentController {
	@Autowired
	private ServiceStudent ser;
@PostMapping("/save")
	public void saveStd(@RequestBody Student std) {
		ser.saveObj(std);
	}
}
