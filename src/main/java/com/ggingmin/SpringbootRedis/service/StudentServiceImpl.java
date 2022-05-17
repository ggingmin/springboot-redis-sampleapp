package com.ggingmin.SpringbootRedis.service;

import com.ggingmin.SpringbootRedis.model.Student;
import com.ggingmin.SpringbootRedis.repository.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao studentDao;

    @Override
    public boolean saveStudent(Student student) {
        return studentDao.saveStudent(student);
    }

    @Override
    public List<Student> fetchAllStudent() {
        return studentDao.fetchAllStudent();
    }
}
