package ru.my_project.springstudents.service;

import ru.my_project.springstudents.model.Student;

import java.util.List;


public interface StudentService {
    List<Student> findAllStudent();
    void saveStudent(Student student);
    Student findByEmail(String email);
    Student updateStudent(Student student);
    void deleteStudent(String email);
}
