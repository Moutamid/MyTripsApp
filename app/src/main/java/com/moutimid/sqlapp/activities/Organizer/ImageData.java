package com.moutimid.sqlapp.activities.Organizer;
import android.net.Uri;

public class ImageData {
    private Uri imageUri;
    private long image;
    private String imageName;
    private long imageSize;

    public ImageData(Uri imageUri, String imageName, long imageSize) {
        this.imageUri = imageUri;
        this.imageName = imageName;
        this.imageSize = imageSize;
    }

    public ImageData(long image, String imageName, long imageSize) {
        this.image = image;
        this.imageName = imageName;
        this.imageSize = imageSize;
    }

    public Uri getImageUri() {
        return imageUri;
    }

    public long getImageSize() {
        return imageSize;
    }

    public String getImageName() {
        return imageName;
    }
}
