package com.example.Shing_practice.student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping
    public void registerNewStudent(@RequestBody Student student){
        studentService.addNewStudent(student);
    }
    @DeleteMapping( path = "{studentId}")
    public void deleteStudent(@PathVariable("studentId") Long studentId){
        studentService.deleteStudent(studentId);
    }


    @PutMapping(path = "{studentId}")
    public void updateStudent(
            @PathVariable("studentId") Long studentId,
            @RequestParam(required = false) String name,
            @RequestParam(required = false) String email){
        studentService.updateStudent(studentId, name, email);
    }
}
