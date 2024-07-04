package com.example.springdatajpaexample.service;

import com.example.springdatajpaexample.domain.Classes;
import com.example.springdatajpaexample.domain.Students;
import com.example.springdatajpaexample.repository.ClassesRepository;
import com.example.springdatajpaexample.repository.StudentRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class StudentService {
    private final StudentRepository studentRepository;
    private final ClassesRepository classesRepository;

    public StudentService(StudentRepository studentRepository, ClassesRepository classesRepository) {
        this.studentRepository = studentRepository;
        this.classesRepository = classesRepository;
    }

    public List<Students> selectAllStudents() {
        return studentRepository.findAll();
    }

    public List<Students> selectAllByName(String name) {
        return studentRepository.findByName(name);
    }

    @Transactional
    public Students insertStudent(Students student) {
        return studentRepository.save(student);
    }

    public List<Classes> selectAllClasses() {
        return classesRepository.findAll();
    }
}
