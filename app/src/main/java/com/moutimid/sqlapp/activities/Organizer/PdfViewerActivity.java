package com.moutimid.sqlapp.activities.Organizer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.moutimid.sqlapp.R;

import android.graphics.Bitmap;
import android.graphics.pdf.PdfRenderer;
import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class PdfViewerActivity extends AppCompatActivity {

    private ImageView pdfImageView;
    private ParcelFileDescriptor fileDescriptor;
    private PdfRenderer pdfRenderer;
    private PdfRenderer.Page currentPage;
    private int currentPageIndex = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf_viewer);
        String uri = getIntent().getStringExtra("uri");
        pdfImageView = findViewById(R.id.pdfImageView);
        Log.d("usri", uri+" uri");
    }
        // Get the URI of the PDF file
//        Uri pdfUri = getIntent().getData();

        // Load the PDF file
//        try {
//            openPdfRenderer(Uri.parse(getIntent().getStringExtra("uri")));
//            displayPage(currentPageIndex);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//    private void openPdfRenderer(Uri uri) throws IOException {
//        // Create a ParcelFileDescriptor from the URI
//        fileDescriptor = getContentResolver().openFileDescriptor(uri, "r");
//
//        // Create a PdfRenderer from the ParcelFileDescriptor
//        pdfRenderer = new PdfRenderer(fileDescriptor);
//    }
//
//    private void displayPage(int index) {
//        if (currentPage != null) {
//            currentPage.close();
//        }
//
//        // Get the page at the specified index from the PdfRenderer
//        currentPage = pdfRenderer.openPage(index);
//
//        // Create a Bitmap to render the PDF page
//        Bitmap bitmap = Bitmap.createBitmap(currentPage.getWidth(), currentPage.getHeight(), Bitmap.Config.ARGB_8888);
//
//        // Render the PDF page onto the Bitmap
//        currentPage.render(bitmap, null, null, PdfRenderer.Page.RENDER_MODE_FOR_DISPLAY);
//
//        // Display the Bitmap in an ImageView
//        pdfImageView.setImageBitmap(bitmap);
//    }
//
//    @Override
//    protected void onDestroy() {
//        super.onDestroy();
//        closePdfRenderer();
//    }
//
//    private void closePdfRenderer() {
//        if (currentPage != null) {
//            currentPage.close();
//        }
//        pdfRenderer.close();
//        try {
//            fileDescriptor.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
}
