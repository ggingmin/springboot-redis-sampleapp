package com.ggingmin.SpringbootRedis.repository;

import com.ggingmin.SpringbootRedis.model.Student;

import java.util.List;

public interface StudentDao {

    boolean saveStudent(Student student);
    List<Student> fetchAllStudent();
}
