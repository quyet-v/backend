package com.example.demo.students;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping(path = "/api/students", method = RequestMethod.GET)
public class StudentController {

    private final StudentService studentService = new StudentService();



    @GetMapping
    public Student getStudents()
    {
       return studentService.getStudents();
    }

}
