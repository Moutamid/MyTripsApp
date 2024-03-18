package com.moutimid.sqlapp.activities.Organizer.Model;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;

public class FileData {
    private Uri fileUri;
    private String fileName;
    private long fileSize;
    private long file;
    Bitmap bitmap;


    public FileData(String fileName, long fileSize, Uri fileUri, Bitmap bitmap) {
        this.fileName = fileName;
        this.fileSize = fileSize;
        this.fileUri = fileUri;
        this.bitmap = bitmap;

    }

    public FileData(long file, String  fileName, long fileSize, Uri fileUri, Bitmap bitmap) {
        this.file = file;
        this.fileName = fileName;
        this.fileSize = fileSize;
        this.fileUri = fileUri;
        this.bitmap = bitmap;

    }




    public Uri getFileUri() {
        return fileUri;
    }

    public void setFileUri(Uri fileUri) {
        this.fileUri = fileUri;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public long getFileSize() {
        return fileSize;
    }

    public void setFileSize(long fileSize) {
        this.fileSize = fileSize;
    }

    public long getFile() {
        return file;
    }

    public void setFile(long file) {
        this.file = file;
    }

    public Bitmap getBitmap() {
        return bitmap;
    }

    public void setBitmap(Bitmap bitmap) {
        this.bitmap = bitmap;
    }
}
