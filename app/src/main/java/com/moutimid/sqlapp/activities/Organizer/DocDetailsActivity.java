package com.moutimid.sqlapp.activities.Organizer;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.fxn.stash.Stash;
import com.moutimid.sqlapp.R;
import com.moutimid.sqlapp.activities.DashboardActivity;
import com.moutimid.sqlapp.activities.Organizer.Adapter.ViewFileAdapter;
import com.moutimid.sqlapp.activities.Organizer.Adapter.ViewImageAdapter;
import com.moutimid.sqlapp.activities.Organizer.Model.EditedText;
import com.moutimid.sqlapp.activities.Organizer.Model.FileData;
import com.moutimid.sqlapp.activities.Organizer.Model.ImageData;
import com.moutimid.sqlapp.activities.Organizer.helper.DatabaseContract;
import com.moutimid.sqlapp.activities.Organizer.helper.DatabaseHelper;

import java.util.ArrayList;
import java.util.List;

public class DocDetailsActivity extends AppCompatActivity {
    DatabaseHelper databaseHelper;
    private RelativeLayout titleBar;
    private ImageView icon;
    private TextView title;
    private ImageView menu;
    private ImageView more;
    private TextView type;
    private TextView number;
    private TextView issuesDate;
    private TextView expireDate;
    private TextView issuedBy;
    private TextView country;
    private TextView note;
    int position;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doc_details);
        titleBar = findViewById(R.id.title_bar);
        icon = findViewById(R.id.icon);
        title = findViewById(R.id.title);
        menu = findViewById(R.id.menu);
        more = findViewById(R.id.more);
        type = findViewById(R.id.type);
        number = findViewById(R.id.number);
        issuesDate = findViewById(R.id.issues_date);
        expireDate = findViewById(R.id.expire_date);
        issuedBy = findViewById(R.id.issued_by);
        country = findViewById(R.id.country);
        note = findViewById(R.id.note);
        databaseHelper = new DatabaseHelper(DocDetailsActivity.this);

        position = getIntent().getIntExtra("position", 0);
        List<EditedText> editedTexts = readAllEditedText();
        String documentTitle_str = editedTexts.get(position).getDocumentTitle();
        String countryDocument_str = editedTexts.get(position).getCountryDocument();
        String documentNumber_str = editedTexts.get(position).getDocumentNumber();
        String expireDate_str = editedTexts.get(position).getExpireDate();
        String issuedBy_str = editedTexts.get(position).getIssuedBy();
        String issuedDate_str = editedTexts.get(position).getIssuedDate();
        String note_str = editedTexts.get(position).getNote();
        String documentType_str = editedTexts.get(position).getDocumentType();
        if (editedTexts.get(position).getNote().length() < 1) {
            note.setVisibility(View.GONE);
        }
        if (editedTexts.get(position).getNote().length() < 1) {
            note.setVisibility(View.GONE);
        }

//        Log.d("data", editedTexts.get(position).getImages().get(0).getImageName()+ "files");
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false));
        List<FileData> filesForEditedText = databaseHelper.getFilesForEditedText(editedTexts.get(position).getId());
        ViewFileAdapter adapter = new ViewFileAdapter(this, filesForEditedText);
        recyclerView.setAdapter(adapter);

        RecyclerView recyclerViewimages = findViewById(R.id.recyclerViewimages);
        recyclerViewimages.setLayoutManager(new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false));
        List<ImageData> imageData = databaseHelper.getImagesForEditedText(editedTexts.get(position).getId());
        ViewImageAdapter imageAdapter = new ViewImageAdapter(DocDetailsActivity.this, imageData);
        recyclerViewimages.setAdapter(imageAdapter);
//
        type.setText(documentType_str);
        title.setText(documentTitle_str);
        country.setText(countryDocument_str);
        number.setText(documentNumber_str);
        expireDate.setText(expireDate_str);
        issuesDate.setText(issuedDate_str);
        issuedBy.setText(issuedBy_str);
        note.setText(note_str);

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

    public void showPopupMenu(View v) {
        PopupMenu popup = new PopupMenu(this, v);
        popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                // Handle menu item clicks
                int itemId = item.getItemId();
                if (itemId == R.id.menu_item1) {
                    Intent intent = new Intent(DocDetailsActivity.this, SendActivity.class);
                    startActivity(intent);// Handle item 1 click
                    return true;
                } else if (itemId == R.id.menu_item2) {
                    Intent intent = new Intent(DocDetailsActivity.this, EditOrganizerDetailsActivity.class);
                    intent.putExtra("position", position);

                    startActivity(intent);
                    return true;
                } else if (itemId == R.id.menu_item3) {// Handle item 2 click
                    List<EditedText> editedTexts = readAllEditedText();
                    databaseHelper.deleteEditedText(editedTexts.get(position).getId());
                    finish();
                    return true;
                }
                return false;
            }
        });

        // Inflate the custom layout for menu items
        MenuInflater inflater = popup.getMenuInflater();
        inflater.inflate(R.menu.more, popup.getMenu());

        // Loop through each item and set custom view
        for (int i = 0; i < popup.getMenu().size(); i++) {
            MenuItem item = popup.getMenu().getItem(i);
            View view = LayoutInflater.from(this).inflate(R.layout.custom_menu_item, null);
            TextView textView = view.findViewById(R.id.item_text);
            ImageView imageView = view.findViewById(R.id.item_icon);

            textView.setText(item.getTitle());
            if (i == 0) {
                imageView.setImageResource(R.drawable.trash);
            }
            if (i == 1) {
                imageView.setImageResource(R.drawable.trash);
            }
            if (i == 2) {
                imageView.setImageResource(R.drawable.trash);
            }
            item.setActionView(view);
        }

        popup.show();
    }

    public void menu(View view) {
        PopupMenu popupMenu = new PopupMenu(this, view);
        popupMenu.getMenuInflater().inflate(R.menu.menu, popupMenu.getMenu());

        // Optional: Set a listener to respond to menu item clicks
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                if ((item.getItemId() == R.id.menu_item_1)) {
                    startActivity(new Intent(DocDetailsActivity.this, DashboardActivity.class));
                    finishAffinity();
                }
                return true;
            }
        });
        popupMenu.show();
    }

    public void BackPress(View view) {
        onBackPressed();
    }
}