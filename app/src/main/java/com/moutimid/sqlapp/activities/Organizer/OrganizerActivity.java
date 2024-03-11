package com.moutimid.sqlapp.activities.Organizer;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.moutimid.sqlapp.R;

public class OrganizerActivity extends AppCompatActivity {
    LinearLayout my_docs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_organizer);
        my_docs = findViewById(R.id.my_docs);
        my_docs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(OrganizerActivity.this, MyDocsActivity.class));
            }
        });

    }

    public void BackPress(View view) {
        onBackPressed();
    }
}