package com.example.demo.Student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/students")
public class StudentController {
    @GetMapping
//	public String hello(){
//		return "Hello World";
//	}
    public List<Student> getStudents(){
        return  List.of(new Student(
                1L,"Swapnil",24, LocalDate.of(1996, Month.SEPTEMBER,7),"swapnil@gmail.com"
        ), new Student());
    }
}