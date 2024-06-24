package ru.my_project.springstudents.service;

import org.springframework.stereotype.Service;
import ru.my_project.springstudents.model.Student;

import java.util.List;

@Service
public class StudentService {

    public List<Student> findAllStudent() {
        return List.of(
                Student.builder().firstName("Олег").email("oleg12@email.com").age(41).build(),
                Student.builder().firstName("Василий").email("vasil12@email.com").age(41).build(),
                Student.builder().firstName("Анна").email("anna412@email.com").age(41).build()
        );
    }
}
