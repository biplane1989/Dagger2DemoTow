package com.example.dagger2demotow.db;

import com.example.dagger2demotow.di.entity.Student;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Singleton;

import io.reactivex.Flowable;

@Singleton
public class StudentRepository implements IStudentRepository {

    @Inject
    StudentDatabase database;

    @Inject
    public StudentRepository() {

    }

    @Override
    public void insert(Student student) {
        database.studentDAO().insertStudent(student);
    }

    @Override
    public Flowable<List<Student>> getAll() {
        return database.studentDAO().getAll();
    }
}
