package com.moutimid.sqlapp.activities.Organizer;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.pdf.PdfRenderer;
import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import com.moutimid.sqlapp.R;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class PdfViewerActivity extends AppCompatActivity {
    private ImageView pdfImageView;
    private PdfRenderer pdfRenderer;
    private PdfRenderer.Page currentPage;
    private ParcelFileDescriptor parcelFileDescriptor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf_viewer);

        pdfImageView = findViewById(R.id.pdfImageView);

        // Replace contentUri with the actual content URI of the PDF file
        Uri contentUri = Uri.parse("content://com.android.providers.media.documents/document/document%3A1000029289");

        // Get a file descriptor for the PDF
        try {
            parcelFileDescriptor = getContentResolver().openFileDescriptor(contentUri, "r");
        } catch (IOException e) {
            e.printStackTrace();
            Toast.makeText(this, "Failed to open PDF", Toast.LENGTH_SHORT).show();
            return;
        }

        if (parcelFileDescriptor != null) {
            try {
                // Create a PdfRenderer from the PDF file descriptor
                pdfRenderer = new PdfRenderer(parcelFileDescriptor);
                // Open the first page
                currentPage = pdfRenderer.openPage(0);
                // Create a Bitmap to render the page
                Bitmap bitmap = Bitmap.createBitmap(currentPage.getWidth(), currentPage.getHeight(), Bitmap.Config.ARGB_8888);
                // Render the page onto the Bitmap
                currentPage.render(bitmap, null, null, PdfRenderer.Page.RENDER_MODE_FOR_DISPLAY);
                // Display the Bitmap in the ImageView
                pdfImageView.setImageBitmap(bitmap);
            } catch (IOException e) {
                e.printStackTrace();
                Toast.makeText(this, "Failed to render PDF", Toast.LENGTH_SHORT).show();
            }
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        // Close the PdfRenderer and ParcelFileDescriptor when the activity is destroyed
        if (currentPage != null) {
            currentPage.close();
        }
        if (pdfRenderer != null) {
            pdfRenderer.close();
        }
        try {
            if (parcelFileDescriptor != null) {
                parcelFileDescriptor.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
