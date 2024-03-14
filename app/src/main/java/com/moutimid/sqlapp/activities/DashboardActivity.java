package com.moutimid.sqlapp.activities;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import com.moutimid.sqlapp.R;
import com.moutimid.sqlapp.activities.Iteneraries.ItinerariesActivity;
import com.moutimid.sqlapp.activities.Explore.ExploreActivity;
import com.moutimid.sqlapp.activities.Organizer.OrganizerActivity;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class DashboardActivity extends AppCompatActivity {
    private static final int READ_EXTERNAL_STORAGE_REQUEST_CODE = 1;
    public static String pathFromUri;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
    }

    public void explore(View view) {
        startActivity(new Intent(DashboardActivity.this, ExploreActivity.class));
    }

    public void my_trips(View view) {
        startActivity(new Intent(DashboardActivity.this, MyTripsActivity.class));
    }

    public void iternties(View view) {
        startActivity(new Intent(DashboardActivity.this, ItinerariesActivity.class));

    }
    public void organier(View view) {
//        Uri imageUri = Uri.parse("content://media/external/images/media/12345"); // Replace with the actual URI of your image
//        pathFromUri = getPathFromUri(imageUri);
//        Log.d("data", pathFromUri);
        // Check if the permission is not granted
//        if (ContextCompat.checkSelfPermission(this, android.Manifest.permission.READ_EXTERNAL_STORAGE)
//                != PackageManager.PERMISSION_GRANTED) {
//            ActivityCompat.requestPermissions(this,
//                    new String[]{android.Manifest.permission.READ_EXTERNAL_STORAGE},
//                    READ_EXTERNAL_STORAGE_REQUEST_CODE);
//        } else {
//            new NetworkTask().execute();
//            Toast.makeText(this, "Done", Toast.LENGTH_SHORT).show();
//            // Permission is already granted, proceed with your operation
//        }

        startActivity(new Intent(DashboardActivity.this, OrganizerActivity.class));
//

    }
    public String getPathFromUri(Uri uri) {
        String[] projection = {MediaStore.Images.Media.DATA};
        Cursor cursor = getContentResolver().query(uri, projection, null, null, null);
        if (cursor != null) {
            int columnIndex = cursor.getColumnIndexOrThrow(MediaStore.Images.Media.DATA);
            cursor.moveToFirst();
            String imagePath = cursor.getString(columnIndex);
            cursor.close();
            return imagePath;
        }
        return null;
    }
}