package com.example.ihoro.Model.Adapter;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ihoro.Model.Person;
import com.example.ihoro.View.ShowResultPerson;
import com.example.ihoro.R;

import java.util.List;

public class PersonAdapter extends RecyclerView.Adapter<PersonAdapter.PersonViewHolder> {
    private List<Person> personList;
    private Context context;

    public PersonAdapter(List<Person> personList) {
        this.personList = personList;
    }

    public static class PersonViewHolder extends RecyclerView.ViewHolder {
        public TextView nameTextView, dobTextView, genderTextView, timeTextView;
        public CardView cardView;

        public PersonViewHolder(View itemView) {
            super(itemView);
            nameTextView = itemView.findViewById(R.id.tv_card_name);
            dobTextView = itemView.findViewById(R.id.tv_card_dob);
            genderTextView = itemView.findViewById(R.id.tv_card_gender);
            timeTextView = itemView.findViewById(R.id.tv_card_time);
            cardView = itemView.findViewById(R.id.card_view);
        }
    }

    @NonNull
    @Override
    public PersonViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_person, parent, false);
        return new PersonViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(PersonViewHolder holder, int position) {
        Person person = personList.get(position);

        holder.nameTextView.setText(person.getName());
        holder.dobTextView.setText("Ngày sinh: " + person.getBirthDate());
        holder.genderTextView.setText( "Giới tính: " + person.getGender());
        holder.timeTextView.setText("Giờ sinh: " + person.getBirthTime());

        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Lấy vị trí của item hiện tại trong danh sách
                int position = holder.getAdapterPosition();
                // Lấy thông tin Person tại vị trí đó
                Person person = personList.get(position);

                // Tạo Intent để mở activity mới và truyền dữ liệu vào
                Intent intent = new Intent(holder.itemView.getContext(), ShowResultPerson.class);
                intent.putExtra("ID", person.getId());
                intent.putExtra("Saved", person.isSaved());
                intent.putExtra("Name", person.getName());
                intent.putExtra("Birthday", person.getBirthDate());
                Log.e("Giới tính check", person.getGender());
                intent.putExtra("Gender", person.getGender());
                intent.putExtra("Time", person.getBirthTime());
                holder.itemView.getContext().startActivity(intent);

            }
        });
    }

    @Override
    public int getItemCount() {
        return personList.size();
    }
    public void updateList(List<Person> newList) {
        this.personList = newList;
        notifyDataSetChanged();
    }
}

