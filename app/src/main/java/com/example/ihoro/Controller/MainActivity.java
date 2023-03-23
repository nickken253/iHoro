package com.example.ihoro.Controller;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

import com.example.ihoro.Model.AppDatabase;
import com.example.ihoro.Model.DataHoroscope;
import com.example.ihoro.Model.Person;
import com.example.ihoro.Model.PersonDAO;
import com.example.ihoro.R;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        AppDatabase database = Room.databaseBuilder(this, AppDatabase.class, "mydb")
                .allowMainThreadQueries()
                .build();

        PersonDAO personDAO = database.getPersonDAO();
        DataHoroscope dataHoroscope = new DataHoroscope();
        Person person = new Person();
        List<Person> persons = personDAO.getAllPersons();
//        person.setName(dataHoroscope.month.get((persons.size()) % 4));
        person.setId(persons.size() + 1);
        person.setLunerHour("Item 001");
//         personDAO.delete(person);
        personDAO.insert(person);
//        Person personn = personDAO.getPersonById(1);
//        Log.e("COUNT", dataHoroscope.month.get((persons.size()) % 4));

//        Log.e("CHECK: ", "Xin chào các bạn");
        database.close();
    }

}