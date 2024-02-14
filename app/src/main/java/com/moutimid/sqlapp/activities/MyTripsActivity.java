package com.moutimid.sqlapp.activities;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.moutimid.sqlapp.R;
import com.moutimid.sqlapp.adapter.MyAdapter;
import com.moutimid.sqlapp.model.BeacModel;

import java.util.List;

public class MyTripsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_trips);
        com.moutimid.sqlapp.model.DatabaseHelper databaseHelper = new com.moutimid.sqlapp.model.DatabaseHelper(MyTripsActivity.this);

        List<BeacModel> beacModels = databaseHelper.getAllBeacModels();

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        MyAdapter adapter = new MyAdapter(beacModels);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);


    }
}