package com.demo.helloSpring.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.helloSpring.Entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{

}