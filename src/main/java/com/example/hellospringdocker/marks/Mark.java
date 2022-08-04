package com.example.hellospringdocker.marks;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Mark {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    public int id;
    public String name;
    public int marks;

    public Mark(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public Mark() {

    }
}
