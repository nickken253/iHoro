package com.example.ihoro.Model;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "persons")
public class Person {
    @PrimaryKey
    private int id;
    private String name;
    private int day;
    private int lunerDay;
    private int month;
    private int lunerMonth;
    private int year;
    private int lunerYear;
    private int hour;
    private int minute;
    private String lunerHour;
    private int gender;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getLunerDay() {
        return lunerDay;
    }

    public void setLunerDay(int lunerDay) {
        this.lunerDay = lunerDay;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getLunerMonth() {
        return lunerMonth;
    }

    public void setLunerMonth(int lunerMonth) {
        this.lunerMonth = lunerMonth;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getLunerYear() {
        return lunerYear;
    }

    public void setLunerYear(int lunerYear) {
        this.lunerYear = lunerYear;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public String getLunerHour() {
        return lunerHour;
    }

    public void setLunerHour(String lunerHour) {
        this.lunerHour = lunerHour;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }
}
