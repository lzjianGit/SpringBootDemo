package org.springboot.sample.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springboot.sample.entity.Student;
import org.springboot.sample.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/stu")
public class StudentController {
	
	private static final Logger logger = LoggerFactory.getLogger(StudentController.class);
	
	@Autowired
	private StudentService studentService;
	
	@RequestMapping("/list")
	public List<Student> getStus(){
		logger.info("啦啦啦啦啦啦");
		System.out.println(studentService.getList().size());
		List<Student> stu = studentService.getList();
		for(Student s:stu){
			System.out.println(s.getId()+"\t"+s.getName());
		}
		return studentService.getList();
	}
}
