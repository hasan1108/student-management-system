package com.example.demo;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();
    Student getStudentById(Long id);
    void saveStudent(Student student);
    void deleteStudent(Long id);
}
