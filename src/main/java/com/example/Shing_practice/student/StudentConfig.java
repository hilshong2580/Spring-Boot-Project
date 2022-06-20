package com.example.Shing_practice.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args ->{
            Student McQ = new Student(
                    "McQ",
                    LocalDate.of(2000, Month.DECEMBER, 5),
                    "mcqueenlau2580@gmail.com"
            );

            Student Shing = new Student(
                    "Shing",
                    LocalDate.of(2010, Month.DECEMBER, 25),
                    "shinghonglau@gmail.com"
            );

            repository.saveAll(List.of(McQ, Shing));
        };
    }
}
