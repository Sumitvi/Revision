package com.example.CrudApplication.service;


import com.example.CrudApplication.entity.Student;
import com.example.CrudApplication.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    UserRepo userRepo;

    @Autowired
    Student student;


//    create
    public Student createStudent( Student student){
        return userRepo.save(student);

    }


//    read
    public List<Student> getAllStudents(){
        return userRepo.findAll();
    }


//    Find by Id

    public Optional<Student> findById(int id){
         userRepo.findById(id);
         return null;
    }

//    update

    public Student updateStudent ( int id , Student studentinfo){
       Student existing =  userRepo.findById(id).orElseThrow(() -> new RuntimeException("Student not found with id " + id));;
       existing.setStudentName(studentinfo.getStudentName());
       existing.setDegree(studentinfo.getDegree());
       existing.setFees(studentinfo.getFees());
       existing.setFatherName(studentinfo.getFatherName());
       existing.setMotherName(studentinfo.getMotherName());
       return userRepo.save(existing);


    }



//    Delete

    public void deleteStudent(int id){
        userRepo.deleteById(id);
    }




}
