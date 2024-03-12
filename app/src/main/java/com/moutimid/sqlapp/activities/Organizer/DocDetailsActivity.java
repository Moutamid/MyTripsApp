package com.moutimid.sqlapp.activities.Organizer;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.TextView;

import com.moutimid.sqlapp.R;

import java.util.ArrayList;
import java.util.List;

public class DocDetailsActivity extends AppCompatActivity {
DatabaseHelper databaseHelper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doc_details);
        databaseHelper= new DatabaseHelper(DocDetailsActivity.this);
        int position= getIntent().getIntExtra("position", 0);
        List<EditedText> editedTexts = readAllEditedText();
        String documentTitle = editedTexts.get(position).getDocumentTitle();
        String countryDocument = editedTexts.get(position).getCountryDocument();
        String documentNumber = editedTexts.get(position).getDocumentNumber();
        String expireDate = editedTexts.get(position).getExpireDate();
        editedTexts.get(position).getIssuedBy();
         editedTexts.get(position).getNote();
         editedTexts.get(position).getIssuedBy();
         editedTexts.get(position).getDocumentType();
         editedTexts.get(position).getExpireDate();

    }

    private void showPopupMenu(View v) {
        PopupMenu popup = new PopupMenu(this, v);
        popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                // Handle menu item clicks
                int itemId = item.getItemId();
                if (itemId == R.id.menu_item1) {// Handle item 1 click
                    return true;
                } else if (itemId == R.id.menu_item2) {// Handle item 2 click
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
            imageView.setImageDrawable(item.getIcon());

            item.setActionView(view);
        }

        popup.show();
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
}