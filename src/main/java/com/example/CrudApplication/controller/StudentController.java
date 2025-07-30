package com.example.CrudApplication.controller;


import com.example.CrudApplication.entity.Student;
import com.example.CrudApplication.repository.UserRepo;
import com.example.CrudApplication.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/students")
public class StudentController {


    @Autowired
    StudentService studentService;


//    Create Student

    @PostMapping("/create")
    public Student createStudent (@RequestBody Student student){
        studentService.createStudent(student);
        return student;
    }

//    get all Student

    @GetMapping("/get")
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }


//    getStudent by id

    @GetMapping("/get/{id}")
    public Optional<Student> getStudentById(@PathVariable int id){
        return studentService.findById(id);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteStudent(@PathVariable int id){
        studentService.deleteStudent(id);
    }




    @PutMapping("/update/{id}")
    public Student updateStudent(@PathVariable  int id , @RequestBody Student studentDetails) {
        return studentService.updateStudent(id , studentDetails);

    }


}
