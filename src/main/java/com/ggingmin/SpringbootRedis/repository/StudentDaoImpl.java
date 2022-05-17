package com.ggingmin.SpringbootRedis.repository;

import com.ggingmin.SpringbootRedis.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentDaoImpl implements StudentDao {

    @Autowired
    private RedisTemplate redisTemplate;

    private static final String KEY = "STUDENT";

    @Override
    public boolean saveStudent(Student student) {
        try {
            redisTemplate.opsForHash().put(KEY, student.getId().toString(), student);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public List<Student> fetchAllStudent() {
        List<Student> students;
        students = redisTemplate.opsForHash().values(KEY);
        return students;
    }
}
