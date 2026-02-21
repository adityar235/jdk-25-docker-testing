package com.example.Docker_web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
class StudentController {

    @Autowired
    StudentRepo repo;

    @RequestMapping("/getStudents")
    public List<Student> getStudents(){

//        return List.of(
//                new Student(1, "aditya", 23),
//                new Student(2, "Roushan", 22),
//                new Student(3, "Babu", 18)
//        );

        return repo.findAll();
    }
}
