package com.moutimid.sqlapp.activities.Beaches;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;
import android.widget.PopupMenu;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.fxn.stash.Stash;
import com.moutimid.sqlapp.R;
import com.moutimid.sqlapp.activities.DashboardActivity;
import com.moutimid.sqlapp.adapter.BeachesAdapter;

public class BeachesTypeActivity extends AppCompatActivity {
    private String[] itemTexts;
    private String[] itemName;
    private String[] itemName1;
    private int[] itemImages;
    TextView title, heading;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beaches_in_east);
        title = findViewById(R.id.title);
        heading = findViewById(R.id.heading);

        Intent intent = getIntent();
        String itemHeader = intent.getStringExtra("itemHeader");
        String itemTitle = intent.getStringExtra("itemTitle");
        title.setText(itemHeader);
        heading.setText(itemTitle);
        Stash.put("type", itemTitle);
        itemTexts = intent.getStringArrayExtra("itemTexts");
        itemName = intent.getStringArrayExtra("itemName");
        itemName1 = intent.getStringArrayExtra("itemName1");
        itemImages = intent.getIntArrayExtra("itemImages");

        ListView listView = findViewById(R.id.listView);
        BeachesAdapter adapter = new BeachesAdapter(this, itemName, itemName1, itemTexts, itemImages);
        listView.setAdapter(adapter);
    }

    public void menu(View view) {
        PopupMenu popupMenu = new PopupMenu(this, view);
        popupMenu.getMenuInflater().inflate(R.menu.menu, popupMenu.getMenu());

        // Optional: Set a listener to respond to menu item clicks
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                if ((item.getItemId() == R.id.menu_item_1)) {
                    startActivity(new Intent(BeachesTypeActivity.this, DashboardActivity.class));
                    finishAffinity();
                }
                return true;
            }
        });
        popupMenu.show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        ListView listView = findViewById(R.id.listView);
        BeachesAdapter adapter = new BeachesAdapter(this, itemName, itemName1, itemTexts, itemImages);
        listView.setAdapter(adapter);
    }

    public void BackPress(View view) {
        onBackPressed();
    }


}