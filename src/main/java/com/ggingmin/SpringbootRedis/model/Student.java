package com.ggingmin.SpringbootRedis.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class Student implements Serializable {

    private Long id;
    private String name;
    private String email;
    private Long studentNumber;
    private StudentType type;

}
