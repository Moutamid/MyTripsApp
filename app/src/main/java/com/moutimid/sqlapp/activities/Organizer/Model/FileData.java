package com.moutimid.sqlapp.activities.Organizer.Model;

import android.net.Uri;

public class FileData {
    private Uri fileUri;
    private long file;
    private String fileName;
    private long fileSize;

    public FileData(Uri fileUri, String fileName, long fileSize) {
        this.fileUri = fileUri;
        this.fileName = fileName;
        this.fileSize = fileSize;
    }

    public FileData(long file, String fileName, long fileSize) {
        this.file = file;
        this.fileName = fileName;
        this.fileSize = fileSize;
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
}
