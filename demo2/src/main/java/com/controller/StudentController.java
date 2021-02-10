package com.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.model.Student;

@RestController
@RequestMapping(value = "root") // optional//
public class StudentController {

	@RequestMapping(value = "/one", method = RequestMethod.GET, headers = "Accept=application/json")
	/*public Student readStudent() {*/
	public ResponseEntity<Student> readStudent() {
		Student student = new Student(22, "alkyy", 22.3f);
		ResponseEntity<Student> responseEntity=new ResponseEntity<Student>(student, Https.)
				return responseEntity;
		/*return student;*/
	}
	
	//consume = post = create//
	
	@RequestMapping(value = "/two", method = RequestMethod.POST, headers = "Accept=application/json")
	public Student saveStudent(@RequestBody Student student)
	{
		//received it//
		System.out.println("Student number : " + student.getStudentName());
		System.out.println("Student number : " + student.getStudNo());
		System.out.println("Student number : " + student.getAge());
		return student;
	}
	
	@RequestMapping(value = "/three/{alias}", method = RequestMethod.PUT, headers = "Accept=application/json")
	public Student updateStudent(@PathVariable("alias") int sNo)
	{
		System.out.println("Logic Updated: " + sNo);
		Student student = new Student(sNo, "Happy", 43.4f);
		return student;
		
	}

}
