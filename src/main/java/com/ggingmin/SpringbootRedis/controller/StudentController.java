package com.ggingmin.SpringbootRedis.controller;

import com.ggingmin.SpringbootRedis.model.Student;
import com.ggingmin.SpringbootRedis.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/student")
    public ResponseEntity<String> saveStudent(@RequestBody Student student) {
        boolean result = studentService.saveStudent(student);
        if(result) {
            return ResponseEntity.ok("");
        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @GetMapping("/student")
    public ResponseEntity<List<Student>> fetchAllStudent() {
        List<Student> students;
        students = studentService.fetchAllStudent();
        return ResponseEntity.ok(students);
    }
}
