package com.niqikai.basic.annotation;

import lombok.Data;
import lombok.ToString;

/**
 * Student
 */
@Data
@ToString
@Table("t_student")
public class Student {
    @MyFiled(column="id", type="int", length=10)
    private int id;
    @MyFiled(column="name", type="varchar", length=10)
    private String name;
    @MyFiled(column="age", type="int", length=10)
    private int age;
    
}