package com.moutimid.sqlapp.activities.Organizer.Model;

import android.net.Uri;

public class FileData {
    private Uri fileUri;
    private String fileName;
    private long fileSize;
    private long file;
    private String filepath;

    public FileData(Uri fileUri, String fileName, long fileSize, String filepath) {
        this.fileUri = fileUri;
        this.fileName = fileName;
        this.fileSize = fileSize;
        this.filepath = filepath;
    }

    public FileData(Uri fileUri, String fileName, long fileSize) {
        this.fileUri = fileUri;
        this.fileName = fileName;
        this.fileSize = fileSize;
    }

    public FileData(long file, String fileName, long fileSize,String filepath ) {
        this.file = file;
        this.fileName = fileName;
        this.fileSize = fileSize;
        this.filepath = filepath;
    }

    public Uri getFileUri() {
        return fileUri;
    }

    public String getFileName() {
        return fileName;
    }

    public long getFileSize() {
        return fileSize;
    }

    public String getFilepath() {
        return filepath;
    }
}
