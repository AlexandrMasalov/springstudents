package ru.my_project.springstudents.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.my_project.springstudents.model.Student;
import ru.my_project.springstudents.service.StudentService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {
    private StudentService service = new StudentService();

    @GetMapping
    public List<Student> findAllStudent() {
        return service.findAllStudent();
    }
}
