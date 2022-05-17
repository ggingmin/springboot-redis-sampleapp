package com.ggingmin.SpringbootRedis.service;

import com.ggingmin.SpringbootRedis.model.Student;

import java.util.List;

public interface StudentService {

    boolean saveStudent(Student student);
    List<Student> fetchAllStudent();
//    Student fetchUserById(Long id);
//    boolean deleteStudent(Long id);
//    boolean updateStudent(Long id, Student student);
}
