package com.moutimid.sqlapp.helper;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;

public class DocumentHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "mydatabase";
    private static final int DATABASE_VERSION = 1;
    private static final String TABLE_NAME = "document_table";
    private static final String COLUMN_TYPE = "type";
    private static final String COLUMN_TITLE = "title";
    private static final String COLUMN_NUMBER = "number";
    private static final String COLUMN_EXPIRATION_DATE = "expiration_date";
    private static final String COLUMN_COUNT = "count";

    public DocumentHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String createTableQuery = "CREATE TABLE " + TABLE_NAME + " (" +
                COLUMN_TYPE + " TEXT, " +
                COLUMN_TITLE + " TEXT, " +
                COLUMN_NUMBER + " TEXT, " +
                COLUMN_EXPIRATION_DATE + " TEXT, " +
                COLUMN_COUNT + " INTEGER)";
        db.execSQL(createTableQuery);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // Upgrade logic here
    }

    public void insertData(String type, String title, String number, String expirationDate, int count) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(COLUMN_TYPE, type);
        values.put(COLUMN_TITLE, title);
        values.put(COLUMN_NUMBER, number);
        values.put(COLUMN_EXPIRATION_DATE, expirationDate);
        values.put(COLUMN_COUNT, count);
        db.insert(TABLE_NAME, null, values);
        db.close();
    }

    public boolean checkDataExists(String type, String title, String number, String expirationDate, int count) {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery("SELECT * FROM " + TABLE_NAME, null);

        while (cursor.moveToNext()) {
            String existingType = cursor.getString(cursor.getColumnIndex(COLUMN_TYPE));
            String existingTitle = cursor.getString(cursor.getColumnIndex(COLUMN_TITLE));
            String existingNumber = cursor.getString(cursor.getColumnIndex(COLUMN_NUMBER));
            String existingExpirationDate = cursor.getString(cursor.getColumnIndex(COLUMN_EXPIRATION_DATE));
            int existingCount = cursor.getInt(cursor.getColumnIndex(COLUMN_COUNT));

            if (type.equals(existingType) &&
                    title.equals(existingTitle) &&
                    number.equals(existingNumber) &&
                    expirationDate.equals(existingExpirationDate) &&
                    count == existingCount) {
                cursor.close();
                db.close();
                return true; // Data already exists
            }
        }

        cursor.close();
        db.close();
        return false; // Data does not exist
    }

    public void deleteData(String type, String title, String number, String expirationDate, int count) {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(TABLE_NAME,
                COLUMN_TYPE + " = ? AND " +
                        COLUMN_TITLE + " = ? AND " +
                        COLUMN_NUMBER + " = ? AND " +
                        COLUMN_EXPIRATION_DATE + " = ? AND " +
                        COLUMN_COUNT + " = ?",
                new String[]{type, title, number, expirationDate, String.valueOf(count)});
        db.close();
    }

    public ArrayList<DocumentModel> getAllData() {
        ArrayList<DocumentModel> dataList = new ArrayList<>();
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery("SELECT * FROM " + TABLE_NAME, null);

        while (cursor.moveToNext()) {
            String type = cursor.getString(cursor.getColumnIndex(COLUMN_TYPE));
            String title = cursor.getString(cursor.getColumnIndex(COLUMN_TITLE));
            String number = cursor.getString(cursor.getColumnIndex(COLUMN_NUMBER));
            String expirationDate = cursor.getString(cursor.getColumnIndex(COLUMN_EXPIRATION_DATE));
            int count = cursor.getInt(cursor.getColumnIndex(COLUMN_COUNT));

            DocumentModel document = new DocumentModel(type, title, number, expirationDate, count);
            dataList.add(document);
        }

        cursor.close();
        db.close();
        return dataList;
    }
}
