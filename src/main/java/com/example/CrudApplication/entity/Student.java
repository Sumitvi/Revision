package com.example.CrudApplication.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    int id ;

    String studentName;

    String degree;

    String fees;

    String fatherName;

    String motherName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getFees() {
        return fees;
    }

    public void setFees(String fees) {
        this.fees = fees;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }




    public Student(int id, String studentName, String degree, String fees, String fatherName, String motherName) {
        this.id = id;
        this.studentName = studentName;
        this.degree = degree;
        this.fees = fees;
        this.fatherName = fatherName;
        this.motherName = motherName;
    }

}
