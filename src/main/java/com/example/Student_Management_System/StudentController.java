package com.example.Student_Management_System;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController //in this class we will be writing
//API end points
public class StudentController {

    //Database - we will use hashmap for simplicity
    HashMap<Integer,Student> hm = new HashMap<>();

    @PostMapping("/registerStudent")
    public void addStudent(@RequestBody Student student){
        hm.put(student.getRollNum(),student);
    }

    @GetMapping("/getStudent")//i want to get detail of a student whose rollnum is this
    public Student getStudent(@RequestParam ("rolNum")/*this name must be same as req param in postman*/ Integer rollNum){
        return hm.get(rollNum);
    }


}

