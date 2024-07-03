package com.example.springdatajpaexample.service;

import com.example.springdatajpaexample.domain.Students;
import com.example.springdatajpaexample.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Students> selectAllStudents() {
        return studentRepository.findAll();
    }

    public List<Students> selectAllByName(String name) {
        return studentRepository.findByName(name);
    }
}
