package com.example.dagger2demotow.db;

import com.example.dagger2demotow.di.entity.Student;

import java.util.List;

import io.reactivex.Flowable;

public interface IStudentRepository {

    void insert(Student student);

    Flowable<List<Student>> getAll();
}
