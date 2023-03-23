package com.example.ihoro.Model;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface PersonDAO {
    @Query("SELECT * FROM persons")
    List<Person> getAllPersons();

    @Query("SELECT * FROM persons WHERE id = :id")
    public Person getPersonById(int id);

    @Insert
    void insert(Person person);

    @Update
    void update(Person person);

    @Delete
    void delete(Person person);
}
