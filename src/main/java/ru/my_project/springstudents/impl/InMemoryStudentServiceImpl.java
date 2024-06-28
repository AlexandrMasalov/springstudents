package ru.my_project.springstudents.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.my_project.springstudents.model.Student;
import ru.my_project.springstudents.repository.InMemoryDAO;
import ru.my_project.springstudents.service.StudentService;

import java.util.List;

@Service
@AllArgsConstructor
public class InMemoryStudentServiceImpl implements StudentService {

    private final InMemoryDAO repository;

    @Override
    public List<Student> findAllStudent() {
        return repository.findAllStudent();
    }

    @Override
    public void saveStudent(Student student) {
        repository.saveStudent(student);
    }

    @Override
    public Student findByEmail(String email) {
        return repository.findByEmail(email);
    }

    @Override
    public Student updateStudent(Student student) {
        return repository.updateStudent(student);
    }

    @Override
    public void deleteStudent(String email) {
        repository.deleteStudent(email);
    }
}

