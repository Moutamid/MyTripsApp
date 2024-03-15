package com.moutimid.sqlapp.activities.Organizer;


import android.content.ContentResolver;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.provider.OpenableColumns;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextWatcher;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupMenu;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.textfield.TextInputLayout;
import com.moutimid.sqlapp.R;
import com.moutimid.sqlapp.activities.DashboardActivity;
import com.moutimid.sqlapp.activities.Organizer.Adapter.FileAdapter;
import com.moutimid.sqlapp.activities.Organizer.Adapter.ImageAdapter;
import com.moutimid.sqlapp.activities.Organizer.Model.FileData;
import com.moutimid.sqlapp.activities.Organizer.Model.ImageData;
import com.moutimid.sqlapp.activities.Organizer.helper.DatabaseHelper;

import java.util.ArrayList;
import java.util.List;

public class CreateActivity extends AppCompatActivity {
    EditText documentTypeEditText, document_title, document_number, country_document,
            issued_by, issued_date, expire_date, note, format, format_expiry;
    TextView upload;
    ImageView close;
    TextView save_btn, document_title_ok, number_on_document_ok, country_document_ok, issued_by_ok, date_ok;
    RelativeLayout upload_layout;
    LinearLayout documentTypeLayout, document_title_lyt, number_on_document_lyt, country_document_lyt, date_lyt, issued_by_lyt;
    private static final int PICK_IMAGES_REQUEST = 1;

    private List<ImageData> selectedImages;
    private RecyclerView recyclerView;
    private ImageAdapter adapter;
    private static final int PICK_FILES_REQUEST = 2;

    private List<FileData> selectedFiles;
    private RecyclerView file_recyclerView;
    private FileAdapter fileAdapter;
    private DatabaseHelper dbHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create);
        dbHelper = new DatabaseHelper(this);

        format = findViewById(R.id.format);
        format_expiry = findViewById(R.id.format_expiry);
        close = findViewById(R.id.close);
        save_btn = findViewById(R.id.save_btn);
        upload = findViewById(R.id.upload);
        upload_layout = findViewById(R.id.upload_layout);
        country_document_ok = findViewById(R.id.country_document_ok);
        issued_by_ok = findViewById(R.id.issued_by_ok);
        date_ok = findViewById(R.id.date_ok);

        issued_by_lyt = findViewById(R.id.issued_by_lyt);
        date_lyt = findViewById(R.id.date_lyt);
        country_document_lyt = findViewById(R.id.country_document_lyt);
        number_on_document_ok = findViewById(R.id.number_on_document_ok);

        number_on_document_lyt = findViewById(R.id.number_on_document_lyt);
        documentTypeEditText = findViewById(R.id.document_type);
        document_title = findViewById(R.id.document_title);
        document_number = findViewById(R.id.document_number);
        country_document = findViewById(R.id.country_document);
        issued_by = findViewById(R.id.issued_by);
        issued_date = findViewById(R.id.issued_date);
        expire_date = findViewById(R.id.expire_date);
        document_title_ok = findViewById(R.id.document_title_ok);
        note = findViewById(R.id.note);
        documentTypeLayout = findViewById(R.id.document_type_lyt);
        document_title_lyt = findViewById(R.id.document_title_lyt);
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 1));
        file_recyclerView = findViewById(R.id.recyclerViewfiles);
        file_recyclerView.setLayoutManager(new GridLayoutManager(this, 1));

        selectedFiles = new ArrayList<>();
        fileAdapter = new FileAdapter(selectedFiles);
        file_recyclerView.setAdapter(fileAdapter);
        selectedImages = new ArrayList<>();
        adapter = new ImageAdapter(selectedImages);
        recyclerView.setAdapter(adapter);
        for (int i = 0; i < documentTypeLayout.getChildCount(); i++) {
            View view = documentTypeLayout.getChildAt(i);
            if (view instanceof TextView) {
                TextView textView = (TextView) view;
                textView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        documentTypeEditText.setText(textView.getText());
                        documentTypeLayout.setVisibility(View.GONE);

                    }
                });
            }
        }
        date_format(issued_date, format);
        date_format(expire_date, format_expiry);
        document_title_ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                document_title_lyt.setVisibility(View.GONE);
            }
        });
        number_on_document_ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number_on_document_lyt.setVisibility(View.GONE);
            }
        });
        country_document_ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                country_document_lyt.setVisibility(View.GONE);
            }
        });
        issued_by_ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                issued_by_lyt.setVisibility(View.GONE);
            }
        });
        date_ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                date_lyt.setVisibility(View.GONE);
            }
        });
        save_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (document_title.getText().toString().isEmpty()) {
                    document_title_lyt.setVisibility(View.VISIBLE);
                }
               else if (document_number.getText().toString().isEmpty()) {
                    number_on_document_lyt.setVisibility(View.VISIBLE);
                }
                else if (country_document.getText().toString().isEmpty()) {
                    country_document_lyt.setVisibility(View.VISIBLE);
                }
              else  if (issued_by.getText().toString().isEmpty()) {
                    issued_by_lyt.setVisibility(View.VISIBLE);
                }
                else  if (expire_date.getText().toString().isEmpty() || issued_date.getText().toString().isEmpty()) {
                    date_lyt.setVisibility(View.VISIBLE);
                }
                else  if (expire_date.getText().toString().length()<10 || issued_date.getText().toString().length()<10) {
                    Toast.makeText(CreateActivity.this, "Please write proper dates with format", Toast.LENGTH_SHORT).show();                }
                else
                {
                    saveData();
                }
            }
        });
        upload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                upload_layout.setVisibility(View.VISIBLE);
            }
        });
        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                upload_layout.setVisibility(View.GONE);
            }
        });

        documentTypeEditText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                documentTypeLayout.setVisibility(View.VISIBLE);
            }
        });
        applyStylesToTextInputLayoutHint(documentTypeEditText, "Document type");
        applyStylesToTextInputLayoutHint(document_title, "Document title (required)");
        applyStylesToTextInputLayoutHint(document_number, "Number on document");
        applyStylesToTextInputLayoutHint(country_document, "Country the document was issued");
        applyStylesToTextInputLayoutHint(issued_by, "Issued by");
        applyStylesToTextInputLayoutHint(issued_date, "Issued date");
        applyStylesToTextInputLayoutHint(expire_date, "Expired Date");
        applyStylesToTextInputLayoutHint(note, "Note");
        upload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                upload_layout.setVisibility(View.VISIBLE);

            }
        });
    }

    private void applyStylesToTextInputLayoutHint(EditText editText, String hint) {
        TextInputLayout textInputLayout = (TextInputLayout) editText.getParent().getParent();
        SpannableString spannableString = new SpannableString(hint);
        spannableString.setSpan(new StyleSpan(android.graphics.Typeface.ITALIC), 0, hint.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        textInputLayout.setHint(spannableString);

    }
    public void saveData() {
        String docType = documentTypeEditText.getText().toString();
        String docTitle = document_title.getText().toString();
        String docNumber = document_number.getText().toString();
        String countryDoc = country_document.getText().toString();
        String issuedBy = issued_by.getText().toString();
        String issuedDate = issued_date.getText().toString();
        String expireDate = expire_date.getText().toString();
        String noteText = note.getText().toString();

        // Check if required fields are empty
        if (docTitle.isEmpty() || docNumber.isEmpty() || countryDoc.isEmpty() || issuedBy.isEmpty() || issuedDate.isEmpty() || expireDate.isEmpty()) {
            return;
        }

        // Save edited text data to the database
        long editedTextId = dbHelper.insertOrUpdateEditedText(docType, docTitle, docNumber, countryDoc, issuedBy, issuedDate, expireDate, noteText);

        if (editedTextId != -1) {
            // Insert images associated with edited text
            for (ImageData imageData : selectedImages) {
                dbHelper.insertImageForEditedText(editedTextId, imageData.getImageName(), imageData.getImageSize(), String.valueOf(imageData.getImageUri()));
            }

            for (FileData fileData : selectedFiles) {
                dbHelper.insertFileForEditedText(editedTextId, fileData.getFileName(), fileData.getFileSize(), fileData.getFilepath()); // Pass file path here
            }
            Toast.makeText(this, "Save Successfully", Toast.LENGTH_SHORT).show();
            finish();
        } else {
            Toast.makeText(this, "Something went wrong", Toast.LENGTH_SHORT).show();
        }
    }


    public void upload(View view) {
        upload_layout.setVisibility(View.VISIBLE);
    }

    public void BackPress(View view) {
        onBackPressed();
    }
    public void openGallery(View view) {
        Intent intent = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        intent.setType("image/*");
        intent.putExtra(Intent.EXTRA_ALLOW_MULTIPLE, true);
        startActivityForResult(Intent.createChooser(intent, "Select Images"), PICK_IMAGES_REQUEST);
    }

    public void openFileManager(View view) {
        Intent chooseFile = new Intent(Intent.ACTION_GET_CONTENT);
        chooseFile.setType("*/*");
        chooseFile = Intent.createChooser(chooseFile, "Choose a file");
        startActivityForResult(chooseFile, PICK_FILES_REQUEST);  }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == PICK_IMAGES_REQUEST && resultCode == RESULT_OK) {
            upload_layout.setVisibility(View.GONE);
            if (data != null) {
                Uri selectedImageUri = data.getData();
                if (data.getClipData() != null) {
                    // Multiple images selected
                    int count = data.getClipData().getItemCount();
                    for (int i = 0; i < count; i++) {
                        Uri imageUri = data.getClipData().getItemAt(i).getUri();
                        String imageName = getImageName(imageUri);
                        long imageSize = getImageSize(imageUri);
                        selectedImages.add(new ImageData(imageUri, imageName, imageSize));

                    }
                } else if (data.getData() != null) {
                    // Single image selected

                    Uri imageUri = data.getData();

                    String imageName = getImageName(imageUri);
                    long imageSize = getImageSize(imageUri);
                    selectedImages.add(new ImageData(imageUri, imageName, imageSize));

                }
                adapter.notifyDataSetChanged();
            }
        }
        else if (requestCode == PICK_FILES_REQUEST && resultCode == RESULT_OK) {
            upload_layout.setVisibility(View.GONE);
            if (data != null) {
                if (data.getClipData() != null) {
                    int count = data.getClipData().getItemCount();
                    for (int i = 0; i < count; i++) {
                        Uri fileUri = data.getClipData().getItemAt(i).getUri();
                        String fileName = getFileName(fileUri);
                        long fileSize = getFileSize(fileUri);
                        selectedFiles.add(new FileData(fileUri, fileName, fileSize));
                    }
                } else if (data.getData() != null) {
                    Uri fileUri = data.getData();
                    String fileName = getFileName(fileUri);
                    long fileSize = getFileSize(fileUri);
                    String src = fileUri.getPath();
                    try {
                        Log.d("path", src);

                    } catch (Exception e) {
                        Log.d("path", e.toString());

                    }

                    selectedFiles.add(new FileData(fileUri, fileName, fileSize, "filePath"));
                }
                fileAdapter.notifyDataSetChanged();
            }
        }
    }
    private String getImageName(Uri imageUri) {
        String[] projection = {MediaStore.Images.Media.DISPLAY_NAME};
        ContentResolver contentResolver = getContentResolver();
        Cursor cursor = contentResolver.query(imageUri, projection, null, null, null);
        if (cursor != null && cursor.moveToFirst()) {
            int index = cursor.getColumnIndexOrThrow(MediaStore.Images.Media.DISPLAY_NAME);
            String name = cursor.getString(index);
            cursor.close();
            return name;
        }
        return "";
    }

    private long getImageSize(Uri imageUri) {
        String[] projection = {MediaStore.Images.Media.SIZE};
        ContentResolver contentResolver = getContentResolver();
        Cursor cursor = contentResolver.query(imageUri, projection, null, null, null);
        if (cursor != null && cursor.moveToFirst()) {
            int index = cursor.getColumnIndexOrThrow(MediaStore.Images.Media.SIZE);
            long size = cursor.getLong(index);
            cursor.close();
            return size;
        }
        return 0;
    }
    private String getFileName(Uri fileUri) {
        String fileName = "";
        Cursor cursor = getContentResolver().query(fileUri, null, null, null, null);
        if (cursor != null) {
            int nameIndex = cursor.getColumnIndex(OpenableColumns.DISPLAY_NAME);
            cursor.moveToFirst();
            fileName = cursor.getString(nameIndex);
            cursor.close();
        }
        return fileName;
    }

    private long getFileSize(Uri fileUri) {
        ContentResolver contentResolver = getContentResolver();
        Cursor cursor = contentResolver.query(fileUri, null, null, null, null);
        if (cursor != null && cursor.moveToFirst()) {
            int sizeIndex = cursor.getColumnIndex(OpenableColumns.SIZE);
            long size = cursor.getLong(sizeIndex);
            cursor.close();
            return size;
        }
        return 0;
    }

    public void menu(View view) {
        PopupMenu popupMenu = new PopupMenu(this, view);
        popupMenu.getMenuInflater().inflate(R.menu.menu, popupMenu.getMenu());

        // Optional: Set a listener to respond to menu item clicks
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                if ((item.getItemId() == R.id.menu_item_1)) {
                    startActivity(new Intent(CreateActivity.this, DashboardActivity.class));
                    finishAffinity();
                }
                return true;
            }
        });
        popupMenu.show();
    }

    public String getRealPathFromURI(Uri contentUri) {
        Cursor cursor = null;
        try {
            String[] proj = {MediaStore.Images.Media.DATA};
            cursor = getContentResolver().query(contentUri, proj, null, null, null);
            int column_index = cursor.getColumnIndexOrThrow(MediaStore.Images.Media.DATA);
            cursor.moveToFirst();
            return cursor.getString(column_index);
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
    }
public void date_format(EditText issued_date, EditText format)
{
    issued_date.setFilters(new InputFilter[]{new InputFilter.LengthFilter(10)});
    issued_date.setOnFocusChangeListener(new View.OnFocusChangeListener() {
        @Override
        public void onFocusChange(View view, boolean b) {
            if(b)
            {
                format.setVisibility(View.VISIBLE);
            }
            else
            {
                format.setVisibility(View.GONE);

            }
        }
    });
    issued_date.addTextChangedListener(new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            if (s.length() == 0) {
                String firstPart = s.toString();
                String secondPart = "MM-DD-YYYY";
                SpannableString spannableString = new SpannableString(firstPart + secondPart);
                spannableString.setSpan(new ForegroundColorSpan(Color.WHITE), 0, firstPart.length(), 0);
                spannableString.setSpan(new ForegroundColorSpan(Color.parseColor("#808080")), firstPart.length(), firstPart.length() + secondPart.length(), 0);
                format.setText(spannableString);
            }
            if (s.length() == 1) {
                String firstPart = s.toString();
                String secondPart = "M-DD-YYYY";
                SpannableString spannableString = new SpannableString(firstPart + secondPart);
                spannableString.setSpan(new ForegroundColorSpan(Color.WHITE), 0, firstPart.length(), 0);
                spannableString.setSpan(new ForegroundColorSpan(Color.parseColor("#808080")), firstPart.length(), firstPart.length() + secondPart.length(), 0);
                format.setText(spannableString);
            }
            if (s.length() == 2) {
                String firstPart = s.toString();
                String secondPart = "-DD-YYYY";
                SpannableString spannableString = new SpannableString(firstPart + secondPart);
                spannableString.setSpan(new ForegroundColorSpan(Color.WHITE), 0, firstPart.length(), 0);
                spannableString.setSpan(new ForegroundColorSpan(Color.parseColor("#808080")), firstPart.length(), firstPart.length() + secondPart.length(), 0);
                format.setText(spannableString);
            }
            if (s.length() == 3 && s.charAt(2) != '-') {
                issued_date.setText(new StringBuilder(s).insert(2, "-").toString());
                String firstPart =issued_date.getText().toString();
                String secondPart = "D-YYYY";
                SpannableString spannableString = new SpannableString(firstPart + secondPart);
                spannableString.setSpan(new ForegroundColorSpan(Color.WHITE), 0, firstPart.length(), 0);
                spannableString.setSpan(new ForegroundColorSpan(Color.parseColor("#808080")), firstPart.length(), firstPart.length() + secondPart.length(), 0);
                format.setText(spannableString);
                issued_date.setSelection(4);
            } if (s.length() == 3) {
                String firstPart =issued_date.getText().toString();
                String secondPart = "D-YYYY";
                SpannableString spannableString = new SpannableString(firstPart + secondPart);
                spannableString.setSpan(new ForegroundColorSpan(Color.WHITE), 0, firstPart.length(), 0);
                spannableString.setSpan(new ForegroundColorSpan(Color.parseColor("#808080")), firstPart.length(), firstPart.length() + secondPart.length(), 0);
                format.setText(spannableString);
            }
            if (s.length() == 4) {
                String firstPart = s.toString();
                String secondPart = "D-YYYY";
                SpannableString spannableString = new SpannableString(firstPart + secondPart);
                spannableString.setSpan(new ForegroundColorSpan(Color.WHITE), 0, firstPart.length(), 0);
                spannableString.setSpan(new ForegroundColorSpan(Color.parseColor("#808080")), firstPart.length(), firstPart.length() + secondPart.length(), 0);
                format.setText(spannableString);
            }

            if (s.length() == 5) {
                String firstPart = s.toString();
                String secondPart = "-YYYY";
                SpannableString spannableString = new SpannableString(firstPart + secondPart);
                spannableString.setSpan(new ForegroundColorSpan(Color.WHITE), 0, firstPart.length(), 0);
                spannableString.setSpan(new ForegroundColorSpan(Color.parseColor("#808080")), firstPart.length(), firstPart.length() + secondPart.length(), 0);
                format.setText(spannableString);
            }
            if (s.length() == 6 && s.charAt(5) != '-') {

                issued_date.setText(new StringBuilder(s).insert(5, "-").toString());
                String firstPart =issued_date.getText().toString();
                String secondPart = "YYY";
                SpannableString spannableString = new SpannableString(firstPart + secondPart);
                spannableString.setSpan(new ForegroundColorSpan(Color.WHITE), 0, firstPart.length(), 0);
                spannableString.setSpan(new ForegroundColorSpan(Color.parseColor("#808080")), firstPart.length(), firstPart.length() + secondPart.length(), 0);
                format.setText(spannableString);
                issued_date.setSelection(7);
            }
            if (s.length() == 6) {
                String firstPart = issued_date.getText().toString();
                String secondPart = "YYY";
                SpannableString spannableString = new SpannableString(firstPart + secondPart);
                spannableString.setSpan(new ForegroundColorSpan(Color.WHITE), 0, firstPart.length(), 0);
                spannableString.setSpan(new ForegroundColorSpan(Color.parseColor("#808080")), firstPart.length(), firstPart.length() + secondPart.length(), 0);
                format.setText(spannableString);
            }
            if (s.length() == 7) {
                String firstPart = s.toString();
                String secondPart = "YYY";
                SpannableString spannableString = new SpannableString(firstPart + secondPart);
                spannableString.setSpan(new ForegroundColorSpan(Color.WHITE), 0, firstPart.length(), 0);
                spannableString.setSpan(new ForegroundColorSpan(Color.parseColor("#808080")), firstPart.length(), firstPart.length() + secondPart.length(), 0);
                format.setText(spannableString);
            }
            if (s.length() == 8) {
                String firstPart = s.toString();
                String secondPart = "YY";
                SpannableString spannableString = new SpannableString(firstPart + secondPart);
                spannableString.setSpan(new ForegroundColorSpan(Color.WHITE), 0, firstPart.length(), 0);
                spannableString.setSpan(new ForegroundColorSpan(Color.parseColor("#808080")), firstPart.length(), firstPart.length() + secondPart.length(), 0);
                format.setText(spannableString);
            }
            if (s.length() == 9) {
                String firstPart = s.toString();
                String secondPart = "Y";
                SpannableString spannableString = new SpannableString(firstPart + secondPart);
                spannableString.setSpan(new ForegroundColorSpan(Color.WHITE), 0, firstPart.length(), 0);
                spannableString.setSpan(new ForegroundColorSpan(Color.parseColor("#808080")), firstPart.length(), firstPart.length() + secondPart.length(), 0);
                format.setText(spannableString);
            }
            if (s.length() == 10) {
                String firstPart = s.toString();
                String secondPart = "Y";
                SpannableString spannableString = new SpannableString(firstPart + secondPart);
                spannableString.setSpan(new ForegroundColorSpan(Color.WHITE), 0, firstPart.length(), 0);
                spannableString.setSpan(new ForegroundColorSpan(Color.WHITE), firstPart.length(), firstPart.length() + secondPart.length(), 0);
                format.setText(spannableString);
            }

        }




        @Override
        public void afterTextChanged(Editable s) {

        }
    });
}

}