package com.moutimid.sqlapp.model;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

public class DatabaseHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "beac_model.db";
    private static final int DATABASE_VERSION = 1;
    public static final String TABLE_NAME = "beac_models";
    private static final String COLUMN_ID = "id";
    public static final String COLUMN_TITLE = "title";
    private static final String COLUMN_MAIN_IMAGE = "main_image";
    // Add more columns as needed

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String createTableQuery = "CREATE TABLE " + TABLE_NAME + " (" +
                COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                COLUMN_TITLE + " TEXT, " +
                COLUMN_MAIN_IMAGE + " INTEGER" +
                // Add more columns as needed
                ")";
        db.execSQL(createTableQuery);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String dropTableQuery = "DROP TABLE IF EXISTS " + TABLE_NAME;
        db.execSQL(dropTableQuery);
        onCreate(db);
    }

    public long insertBeacModel(BeacModel model) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(COLUMN_TITLE, model.title);
        values.put(COLUMN_MAIN_IMAGE, model.main_image);
        // Add more values for other columns as needed

        long id = db.insert(TABLE_NAME, null, values);
        db.close();
        return id;
    }

    public List<BeacModel> getAllBeacModels() {
        List<BeacModel> beacModels = new ArrayList<>();
        String selectQuery = "SELECT * FROM " + TABLE_NAME;
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);

        if (cursor.moveToFirst()) {
            do {
                BeacModel model = new BeacModel();
                model.title = cursor.getString(cursor.getColumnIndex(COLUMN_TITLE));
                model.main_image = cursor.getInt(cursor.getColumnIndex(COLUMN_MAIN_IMAGE));
                // Retrieve values for other columns as needed

                beacModels.add(model);
            } while (cursor.moveToNext());
        }

        cursor.close();
        db.close();
        return beacModels;
    }
}

