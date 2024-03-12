package com.moutimid.sqlapp.activities.Organizer.Fragment;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.moutimid.sqlapp.R;
import com.moutimid.sqlapp.activities.Organizer.Adapter.DocumentTitleAdapter;
import com.moutimid.sqlapp.activities.Organizer.CreateActivity;
import com.moutimid.sqlapp.activities.Organizer.DatabaseContract;
import com.moutimid.sqlapp.activities.Organizer.DatabaseHelper;
import com.moutimid.sqlapp.activities.Organizer.EditedText;

import java.util.ArrayList;
import java.util.List;

public class DocumentFragment extends Fragment {
    ImageView add_icon;
    private DatabaseHelper dbHelper;
    RecyclerView recyclerView;
    RelativeLayout no_text;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_document, container, false);
        add_icon = view.findViewById(R.id.add_icon);
        no_text = view.findViewById(R.id.no_text);
        dbHelper = new DatabaseHelper(getContext());

        add_icon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getContext(), CreateActivity.class));
            }
        });
        List<EditedText> editedTexts = readAllEditedText();
        if(editedTexts.size()>0)
        {
            no_text.setVisibility(View.GONE);
            List<String> documentTitles = new ArrayList<>();
            for (EditedText editedText : editedTexts) {
                documentTitles.add(editedText.getDocumentType());
            }
            recyclerView = view.findViewById(R.id.recyclerView);
            recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

            DocumentTitleAdapter adapter = new DocumentTitleAdapter(documentTitles);
            recyclerView.setAdapter(adapter);
            Log.d("dataaa", editedTexts.get(0).getDocumentTitle() + " data"+ editedTexts.get(0).getImages().get(0).getImageName());
        }

        return view;
    }

    public List<EditedText> readAllEditedText() {
        List<EditedText> editedTextList = new ArrayList<>();
        SQLiteDatabase db = dbHelper.getReadableDatabase();
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