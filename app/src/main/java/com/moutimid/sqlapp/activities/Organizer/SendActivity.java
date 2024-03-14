package com.moutimid.sqlapp.activities.Organizer;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.PopupMenu;

import androidx.appcompat.app.AppCompatActivity;

import com.fxn.stash.Stash;
import com.moutimid.sqlapp.R;
import com.moutimid.sqlapp.activities.DashboardActivity;
import com.moutimid.sqlapp.activities.NetworkTask;
import com.moutimid.sqlapp.activities.Organizer.Model.EditedText;
import com.moutimid.sqlapp.activities.Organizer.Model.ImageData;
import com.moutimid.sqlapp.activities.Organizer.helper.DatabaseContract;
import com.moutimid.sqlapp.activities.Organizer.helper.DatabaseHelper;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class SendActivity extends AppCompatActivity {
    EditText name, email, message;
    DatabaseHelper databaseHelper;
    int position;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send);
        name = findViewById(R.id.name);
        email = findViewById(R.id.email);
        message = findViewById(R.id.message);


    }

    public void BackPress(View view) {
        onBackPressed();
    }

    private String getPathFromUri(Uri uri) {
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

    public List<EditedText> readAllEditedText() {
        List<EditedText> editedTextList = new ArrayList<>();
        SQLiteDatabase db = databaseHelper.getReadableDatabase();
        String[] projection = {
                DatabaseContract.EditedTextEntry._ID,
                DatabaseContract.EditedTextEntry.COLUMN_NAME_DOCUMENT_TYPE,
                DatabaseContract.EditedTextEntry.COLUMN_NAME_DOCUMENT_TITLE,
                DatabaseContract.EditedTextEntry.COLUMN_NAME_DOCUMENT_NUMBER,
                DatabaseContract.EditedTextEntry.COLUMN_NAME_COUNTRY_DOCUMENT,
                DatabaseContract.EditedTextEntry.COLUMN_NAME_ISSUED_BY,
                DatabaseContract.EditedTextEntry.COLUMN_NAME_ISSUED_DATE,
                DatabaseContract.EditedTextEntry.COLUMN_NAME_EXPIRE_DATE,
                DatabaseContract.EditedTextEntry.COLUMN_NAME_NOTE
        };

        Cursor cursor = db.query(
                DatabaseContract.EditedTextEntry.TABLE_NAME,
                projection,
                null,
                null,
                null,
                null,
                null
        );

        try {
            while (cursor.moveToNext()) {
                EditedText editedText = new EditedText();
                editedText.setId(cursor.getLong(cursor.getColumnIndexOrThrow(DatabaseContract.EditedTextEntry._ID)));
                editedText.setDocumentType(cursor.getString(cursor.getColumnIndexOrThrow(DatabaseContract.EditedTextEntry.COLUMN_NAME_DOCUMENT_TYPE)));
                editedText.setDocumentTitle(cursor.getString(cursor.getColumnIndexOrThrow(DatabaseContract.EditedTextEntry.COLUMN_NAME_DOCUMENT_TITLE)));
                editedText.setDocumentNumber(cursor.getString(cursor.getColumnIndexOrThrow(DatabaseContract.EditedTextEntry.COLUMN_NAME_DOCUMENT_NUMBER)));
                editedText.setCountryDocument(cursor.getString(cursor.getColumnIndexOrThrow(DatabaseContract.EditedTextEntry.COLUMN_NAME_COUNTRY_DOCUMENT)));
                editedText.setIssuedBy(cursor.getString(cursor.getColumnIndexOrThrow(DatabaseContract.EditedTextEntry.COLUMN_NAME_ISSUED_BY)));
                editedText.setIssuedDate(cursor.getString(cursor.getColumnIndexOrThrow(DatabaseContract.EditedTextEntry.COLUMN_NAME_ISSUED_DATE)));
                editedText.setExpireDate(cursor.getString(cursor.getColumnIndexOrThrow(DatabaseContract.EditedTextEntry.COLUMN_NAME_EXPIRE_DATE)));
                editedText.setNote(cursor.getString(cursor.getColumnIndexOrThrow(DatabaseContract.EditedTextEntry.COLUMN_NAME_NOTE)));

                // Add the edited text to the list
                editedTextList.add(editedText);
            }
        } finally {
            cursor.close();
        }

        return editedTextList;
    }

    public void send(View view) {
        if (name.getText().toString().isEmpty()) {
            name.setError("required");
            return;
        }
        if (email.getText().toString().isEmpty()) {
            email.setError("required");
            return;
        }
        if (message.getText().toString().isEmpty()) {
            message.setError("required");
            return;
        }
        databaseHelper = new DatabaseHelper(SendActivity.this);
        List<EditedText> editedTexts = readAllEditedText();

        position = getIntent().getIntExtra("position", 0);
        List<String> imagePaths = new ArrayList<>();

        List<ImageData> imageData = databaseHelper.getImagesForEditedText(editedTexts.get(position).getId());
        for (int i = 0; i < imageData.size(); i++) {
            String pathFromUri = getPathFromUri(imageData.get(position).getImageUri());
            File file = new File(pathFromUri);
            String absolutePath = file.getAbsolutePath();
            imagePaths.add(absolutePath);

        }
        Log.e("SendEmailTask", "sending image" + imagePaths.size() + "  ");

        for (int i = 0; i < imagePaths.size(); i++) {
            Log.e("SendEmailTask", "sending image" + imagePaths.get(i).toString() + "  ");

        }
        Stash.put("name", name.getText().toString());
        Stash.put("email", email.getText().toString());
        Stash.put("message", message.getText().toString());
        NetworkTask networkTask = new NetworkTask(SendActivity.this);
        networkTask.execute(imagePaths);

    }

    public void menu(View view) {
        PopupMenu popupMenu = new PopupMenu(this, view);
        popupMenu.getMenuInflater().inflate(R.menu.menu, popupMenu.getMenu());

        // Optional: Set a listener to respond to menu item clicks
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                if ((item.getItemId() == R.id.menu_item_1)) {
                    startActivity(new Intent(SendActivity.this, DashboardActivity.class));
                    finishAffinity();
                }
                return true;
            }
        });
        popupMenu.show();
    }
}