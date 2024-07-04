package com.example.springdatajpaexample.domain;

import jakarta.persistence.*;
import lombok.Getter;

import java.util.Date;

/**
 * spring.jpa.hibernate.ddl-auto=create 옵션 켜서 자동생성된 DDL 확인해보기
 */
@Getter
@Entity
public class Member {

    @Id
    private String id;

    @Column(name = "name")
    private String userName;

    @Column(name = "age")
    private Integer age;

    // Enumerated 어노테이션 추가
    @Enumerated(EnumType.STRING)
    private RoleType roleType;

    @Temporal(TemporalType.TIMESTAMP)
    private Date createAt;
}
