package com.example.dagger2demotow.db.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.dagger2demotow.di.entity.Student;

import java.util.List;

import io.reactivex.Flowable;

@Dao
public interface StudentDAO {

    @Insert
    void insertStudent(Student... student);

    // sử dụng rxjava room cần inporost thư viện
    @Query("SELECT * FROM Student")
    Flowable<List<Student>> getAll();
}
