package com.example.demo.web;

import java.awt.image.RescaleOp;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;

@Controller

public class StudentController {
	
	 	
	
	@RequestMapping(value="/getStudent", produces = { "application/xml", "text/xml" })
	ResponseEntity<?>  getStudent(){
		Student s  = new Student(101,"reshma");
		Student s1  = new Student(102,"mahesh");
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(s);
		al.add(s1);
	
		return new ResponseEntity<List<Student>>(al,HttpStatus.OK);
	}

}
