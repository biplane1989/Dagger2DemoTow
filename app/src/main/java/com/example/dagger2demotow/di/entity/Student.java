package com.example.dagger2demotow.di.entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import javax.inject.Inject;

@Entity(tableName = "Student")
public class Student {


    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    private int ID;
    @ColumnInfo(name = "name")
    private String name;

    public Student() {
    }

    @Inject
    public Student(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
