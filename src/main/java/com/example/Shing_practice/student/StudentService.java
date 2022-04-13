package com.example.Shing_practice.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;


/*
 * Using the @Component or @Service to set the method is beans
 * */
@Service
public class StudentService {
    public List<Student> getStudents() {
        return List.of(new Student(
                1L,
                "Shing",
                LocalDate.of(1992, Month.DECEMBER, 25),
                29,
                "jasperlau.work@gmail.com"
        ));
    }
}
