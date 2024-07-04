package com.example.springdatajpaexample.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Classes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column
    private String className;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Students student;

    public Classes(String name, Students student) {
        this.className = name;
        this.student = student;
    }
}
