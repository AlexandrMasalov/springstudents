package ru.my_project.springstudents.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue
    private Long id;
    private LocalDate dateOfBirth;
    private String firstName;
    private String lastName;
    @Column(unique = true)
    private String email;
    @Transient
    private int age;
}
