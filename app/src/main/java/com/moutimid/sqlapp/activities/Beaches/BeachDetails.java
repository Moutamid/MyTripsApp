package com.moutimid.sqlapp.activities.Beaches;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.fxn.stash.Stash;
import com.moutimid.sqlapp.R;
import com.moutimid.sqlapp.activities.DashboardActivity;
import com.moutimid.sqlapp.model.BeacModel;

public class BeachDetails extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.beach_details);

        ImageView mainImg = findViewById(R.id.main_img);
        ImageView menu = findViewById(R.id.menu);
        ImageView mainImage = findViewById(R.id.main_image);
        ImageView add = findViewById(R.id.add);
        ImageView map = findViewById(R.id.map);
        TextView text1 = findViewById(R.id.text1);
        TextView beach_type = findViewById(R.id.beach_type);
        TextView beach_header = findViewById(R.id.beach_header);
        TextView title1 = findViewById(R.id.title1);
        ImageView image1 = findViewById(R.id.image1);
        TextView text2 = findViewById(R.id.text2);
        TextView title2 = findViewById(R.id.title2);
        ImageView image2 = findViewById(R.id.image2);
        TextView text3 = findViewById(R.id.text3);
        TextView title3 = findViewById(R.id.title3);
        ImageView image3 = findViewById(R.id.image3);
        TextView text4 = findViewById(R.id.text4);
        TextView title4 = findViewById(R.id.title4);
        ImageView image4 = findViewById(R.id.image4);
        TextView text5 = findViewById(R.id.text5);
        TextView title5 = findViewById(R.id.title5);
        ImageView image5 = findViewById(R.id.image5);
        TextView text6 = findViewById(R.id.text6);
        TextView title6 = findViewById(R.id.title6);
        TextView text7 = findViewById(R.id.text7);
        TextView title7 = findViewById(R.id.title7);
        TextView text8 = findViewById(R.id.text8);
        TextView title8 = findViewById(R.id.title8);
        TextView text9 = findViewById(R.id.text9);
        TextView text10 = findViewById(R.id.text10);
        TextView text11 = findViewById(R.id.text11);
        TextView text12 = findViewById(R.id.text12);
        BeacModel model = (BeacModel) Stash.getObject("model", BeacModel.class);
        beach_header.setText(Html.fromHtml(model.title));
// Set text or image and adjust visibility for the views
        if (!model.text1.isEmpty()) {
            text1.setText(Html.fromHtml(model.text1));
            text1.setVisibility(View.VISIBLE); // Set visibility to VISIBLE explicitly
        } else {
            text1.setVisibility(View.GONE);
        }

        if (!model.title1.isEmpty()) {
            title1.setText(Html.fromHtml(model.title1));
            title1.setVisibility(View.VISIBLE); // Set visibility to VISIBLE explicitly
        } else {

            title1.setVisibility(View.GONE);

        }

        if (model.image1 != R.drawable.map_location) {
            image1.setImageResource(model.image1);
            image1.setVisibility(View.VISIBLE); // Set visibility to VISIBLE explicitly
        } else {
            image1.setVisibility(View.GONE);
        }

        if (!model.text2.isEmpty()) {
            text2.setText(Html.fromHtml(model.text2));
            text2.setVisibility(View.VISIBLE); // Set visibility to VISIBLE explicitly
        } else {
            text2.setVisibility(View.GONE);
        }

        if (!model.title2.isEmpty()) {
            title2.setText(Html.fromHtml(model.title2));
            title2.setVisibility(View.VISIBLE); // Set visibility to VISIBLE explicitly
        } else {
            title2.setVisibility(View.GONE);
        }

        if (model.image2 != R.drawable.map_location) {
            image2.setImageResource(model.image2);
            image2.setVisibility(View.VISIBLE); // Set visibility to VISIBLE explicitly
        } else {
            image2.setVisibility(View.GONE);
        }

        if (!model.text3.isEmpty()) {
            text3.setText(Html.fromHtml(model.text3));
            text3.setVisibility(View.VISIBLE); // Set visibility to VISIBLE explicitly
        } else {
            text3.setVisibility(View.GONE);
        }

        if (!model.title3.isEmpty()) {
            title3.setText(Html.fromHtml(model.title3));
            title3.setVisibility(View.VISIBLE); // Set visibility to VISIBLE explicitly
        } else {
            title3.setVisibility(View.GONE);
        }

        if (model.image3 != R.drawable.map_location) {
            image3.setImageResource(model.image3);
            image3.setVisibility(View.VISIBLE); // Set visibility to VISIBLE explicitly
        } else {
            image3.setVisibility(View.GONE);
        }
        // Set text or image and adjust visibility for the views
        if (!model.text4.isEmpty()) {
            text4.setText(Html.fromHtml(model.text4));
            text4.setVisibility(View.VISIBLE); // Set visibility to VISIBLE explicitly
        } else {
            text4.setVisibility(View.GONE);
        }

        if (!model.title4.isEmpty()) {
            title4.setText(Html.fromHtml(model.title4));
            title4.setVisibility(View.VISIBLE); // Set visibility to VISIBLE explicitly
        } else {
            title4.setVisibility(View.GONE);
        }

        if (model.image4 != R.drawable.map_location) {
            image4.setImageResource(model.image4);
            image4.setVisibility(View.VISIBLE); // Set visibility to VISIBLE explicitly
        } else {
            image4.setVisibility(View.GONE);
        }

        if (!model.text5.isEmpty()) {
            text5.setText(Html.fromHtml(model.text5));
            text5.setVisibility(View.VISIBLE); // Set visibility to VISIBLE explicitly
        } else {
            text5.setVisibility(View.GONE);
        }

        if (!model.title5.isEmpty()) {
            title5.setText(Html.fromHtml(model.title5));
            title5.setVisibility(View.VISIBLE); // Set visibility to VISIBLE explicitly
        } else {
            title5.setVisibility(View.GONE);
        }

        if (model.image5 != R.drawable.map_location) {
            image5.setImageResource(model.image5);
            image5.setVisibility(View.VISIBLE); // Set visibility to VISIBLE explicitly
        } else {
            image5.setVisibility(View.GONE);
        }

        if (!model.text6.isEmpty()) {
            text6.setText(Html.fromHtml(model.text6));
            text6.setVisibility(View.VISIBLE); // Set visibility to VISIBLE explicitly
        } else {
            text6.setVisibility(View.GONE);
        }

        if (!model.title6.isEmpty()) {
            title6.setText(Html.fromHtml(model.title6));
            title6.setVisibility(View.VISIBLE); // Set visibility to VISIBLE explicitly
        } else {
            title6.setVisibility(View.GONE);
        }
// Set text or image and adjust visibility for the views
        if (!model.text7.isEmpty()) {
            text7.setText(Html.fromHtml(model.text7));
            text7.setVisibility(View.VISIBLE); // Set visibility to VISIBLE explicitly
        } else {
            text7.setVisibility(View.GONE);
        }

        if (!model.title7.isEmpty()) {
            title7.setText(Html.fromHtml(model.title7));
            title7.setVisibility(View.VISIBLE); // Set visibility to VISIBLE explicitly
        } else {
            title7.setVisibility(View.GONE);
        }

        if (!model.text8.isEmpty()) {
            text8.setText(Html.fromHtml(model.text8));
            text8.setVisibility(View.VISIBLE); // Set visibility to VISIBLE explicitly
        } else {
            text8.setVisibility(View.GONE);
        }

        if (!model.title8.isEmpty()) {
            title8.setText(Html.fromHtml(model.title8));
            title8.setVisibility(View.VISIBLE); // Set visibility to VISIBLE explicitly
        } else {
            title8.setVisibility(View.GONE);
        }

        if (!model.text9.isEmpty()) {
            text9.setText(Html.fromHtml(model.text9));
            text9.setVisibility(View.VISIBLE); // Set visibility to VISIBLE explicitly
        } else {
            text9.setVisibility(View.GONE);
        }

        if (!model.text10.isEmpty()) {
            text10.setText(Html.fromHtml(model.text10));
            text10.setVisibility(View.VISIBLE); // Set visibility to VISIBLE explicitly
        } else {
            text10.setVisibility(View.GONE);
        }

        if (!model.text11.isEmpty()) {
            text11.setText(Html.fromHtml(model.text11));
            text11.setVisibility(View.VISIBLE); // Set visibility to VISIBLE explicitly
        } else {
            text11.setVisibility(View.GONE);
        }

        if (!model.text12.isEmpty()) {
            text12.setText(Html.fromHtml(model.text12));
            text12.setVisibility(View.VISIBLE); // Set visibility to VISIBLE explicitly
        } else {
            text12.setVisibility(View.GONE);
        }

    }

    public void BackPress(View view) {
        onBackPressed();
    }

    public void menu(View view) {
        PopupMenu popupMenu = new PopupMenu(this, view);
        popupMenu.getMenuInflater().inflate(R.menu.menu, popupMenu.getMenu());
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                if ((item.getItemId() == R.id.menu_item_1)) {
                    startActivity(new Intent(BeachDetails.this, DashboardActivity.class));
                    finishAffinity();
                }
                return true;
            }
        });
        popupMenu.show();
    }

}
