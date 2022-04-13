package com.example.Shing_practice.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;


/*
 * The @RestController can default a rest end point
 * */

@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {

    private final StudentService studentService;

    /*
        The "@Autowired" can set the above StudentService studentService inject to the below variable
        @Autowired annotation is used for dependency injection.In spring boot application,
        all loaded beans are eligible for auto wiring to another bean.
     */
    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    // @GetMapping can provide a rest get function that return words or sentence, like below example "Hello World"
    // The public function can return any variables such as Sting, Integer, List<E> etc.
    @GetMapping
    public List<Student> getStudents(){
        return studentService.getStudents();
    }
}
