package com.example.demo.student;

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
        return args -> {
            Student john =  new Student( "John", "john@gmail.com", LocalDate.of(1997, 5,25));
            Student jane =  new Student( "Jane", "jane@gmail.com", LocalDate.of(1991, 2,8));
            repository.saveAll(
                    List.of(john, jane)
            );
        };


    }
}
