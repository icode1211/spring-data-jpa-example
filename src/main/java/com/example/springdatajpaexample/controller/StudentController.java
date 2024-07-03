package com.example.springdatajpaexample.controller;

import com.example.springdatajpaexample.domain.Students;
import com.example.springdatajpaexample.service.StudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/students")
    public List<Students> getAllStudents() {
        return studentService.selectAllStudents();
    }

    @GetMapping("/students/{name}")     // GET http://localhost:8080/students/이름
    public List<Students> getAllStudentsByName(@PathVariable String name) {
        return studentService.selectAllByName(name);
    }
}
