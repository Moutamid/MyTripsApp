package com.moutimid.sqlapp.activities.Organizer;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.fxn.stash.Stash;
import com.moutimid.sqlapp.R;
public class ImageViewrActivity extends AppCompatActivity {
    ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_viewr);
        image=findViewById(R.id.image);
        Uri uri = getIntent().getParcelableExtra("uri");
        Log.d("dataaaa", uri +"  ");
        String uriString = "content://media/external/images/media/1000028333";

        // Load image from URI and set to ImageView
        loadImageFromUri(Uri.parse(uriString));
    }

    private void loadImageFromUri(Uri uri) {
        // Use Glide library to load image from URI into ImageView
        Glide.with(this)
                .load(uri)
                .into(image);
    }
}