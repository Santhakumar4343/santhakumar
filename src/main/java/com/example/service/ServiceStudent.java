package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Repo.StudentRepo;
import com.example.entity.Address;
import com.example.entity.Student;

@Service
public class ServiceStudent {
	@Autowired
private StudentRepo repo;
	public void saveObj(Student s) {
	    Address addr=new Address();
	    addr.setArea(addr.getArea());
	    addr.setCity(addr.getCity());
	    addr.setAddr_type(addr.getAddr_type());
	   repo.save(s);	   
	}
}
