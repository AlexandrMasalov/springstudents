package ru.my_project.springstudents.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.my_project.springstudents.model.Student;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {
    @GetMapping
    public List<Student> findAllStudent() {
        return List.of(
                Student.builder().firstName("Олег").email("oleg12@email.com").age(41).build(),
                Student.builder().firstName("Василий").email("vasil12@email.com").age(41).build(),
                Student.builder().firstName("Анна").email("anna412@email.com").age(41).build()
        );
    }
}
