package com.example.CrudApplication.repository;

import com.example.CrudApplication.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<Student, Integer> {

}
