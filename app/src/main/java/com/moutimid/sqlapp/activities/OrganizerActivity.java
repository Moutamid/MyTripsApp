package com.moutimid.sqlapp.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.moutimid.sqlapp.R;

public class OrganizerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_organizer);
        TextView textView = findViewById(R.id.text);
        TextView title = findViewById(R.id.title);
        ImageView imageView = findViewById(R.id.img);

        textView.setText(details);
        title.setText(name);
        imageView.setImageResource(imageResource);
    }
        if (!dbHelper.checkDataExists(name, address, details, imageResource)) {
        add.setVisibility(View.VISIBLE);
        delete.setVisibility(View.GONE);
    } else {
        add.setVisibility(View.GONE);
        delete.setVisibility(View.VISIBLE);
    }
        add.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            // Add data to the database
            dbHelper.insertData(name, address, details, imageResource);
            add.setVisibility(View.GONE);
            delete.setVisibility(View.VISIBLE);
        }
    });
        delete.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            // Delete data from the database
            dbHelper.deleteData(name, address, details, imageResource);
            add.setVisibility(View.VISIBLE);
            delete.setVisibility(View.GONE);
//                finish();
        }
    });
    }
}