package ru.my_project.springstudents.model;

import lombok.*;

import java.time.LocalDate;

@Data
@Builder
public class Student {
    private String firstName;
    private String lastName;
    private String email;
    private int age;
}
