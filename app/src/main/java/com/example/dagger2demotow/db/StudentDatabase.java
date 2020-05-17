package com.example.dagger2demotow.db;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.dagger2demotow.db.dao.StudentDAO;
import com.example.dagger2demotow.di.entity.Student;

@Database(entities = {Student.class}, version = 1)
public abstract class StudentDatabase extends RoomDatabase {

    public abstract StudentDAO studentDAO();
}
