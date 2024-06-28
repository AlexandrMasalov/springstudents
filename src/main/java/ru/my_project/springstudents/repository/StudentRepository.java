package ru.my_project.springstudents.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.my_project.springstudents.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

    void deleteByEmail(String email);
    Student findStudentByEmail(String email);
}
