package com.example.ihoro.Model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "persons")
public class Person {
    @PrimaryKey(autoGenerate = true)
    private int id;
    private boolean saved;

    private String name;

    @ColumnInfo(name = "birth_date")
    private String birthDate;

    private String gender;

    @ColumnInfo(name = "birth_time")
    private String birthTime;



    public Person(String name, String birthDate, String gender, String birthTime) {
        this.saved = true;
        this.name = name;
        this.birthDate = birthDate;
        this.gender = gender;
        this.birthTime = birthTime;
    }

    public boolean isSaved() {
        return saved;
    }

    public void setSaved(boolean saved) {
        this.saved = saved;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirthTime() {
        return birthTime;
    }

    public void setBirthTime(String birthTime) {
        this.birthTime = birthTime;
    }
}