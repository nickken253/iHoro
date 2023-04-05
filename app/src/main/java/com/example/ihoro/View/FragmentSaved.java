package com.example.ihoro.View;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;

import com.example.ihoro.Model.AppDatabase;
import com.example.ihoro.Model.Person;
import com.example.ihoro.Model.Adapter.PersonAdapter;
import com.example.ihoro.R;

import java.util.List;

public class FragmentSaved extends Fragment {
    private RecyclerView recyclerView;
    private PersonAdapter personAdapter;
    private List<Person> personList;
    private AppDatabase database;

    public FragmentSaved() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_saved, container, false);

        recyclerView = view.findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        AppDatabase database = Room.databaseBuilder(getActivity(), AppDatabase.class, "mydb")
                .allowMainThreadQueries()
                .build();
        personList = database.getPersonDAO().getAllPersons();
        personAdapter = new PersonAdapter(personList);
        recyclerView.setAdapter(personAdapter);
        return view;
    }
    @Override
    public void onResume() {
        super.onResume();
        database = Room.databaseBuilder(getActivity(), AppDatabase.class, "mydb")
                .allowMainThreadQueries()
                .build();
        PersonAdapter adapter = new PersonAdapter(database.getPersonDAO().getAllPersons());
        List<Person> newList = database.getPersonDAO().getAllPersons();
        adapter.updateList(newList);
        adapter.notifyDataSetChanged();
    }
}
