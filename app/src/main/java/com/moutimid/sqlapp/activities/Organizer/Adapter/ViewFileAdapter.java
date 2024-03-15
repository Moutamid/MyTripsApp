package com.moutimid.sqlapp.activities.Organizer.Adapter;
import android.content.Context;
import android.content.Intent;
import android.text.format.Formatter;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.moutimid.sqlapp.R;
import com.moutimid.sqlapp.activities.Organizer.Model.FileData;
import com.moutimid.sqlapp.activities.Organizer.PdfViewerActivity;

import java.util.List;

public class ViewFileAdapter extends RecyclerView.Adapter<ViewFileAdapter.FileViewHolder> {
Context context;
    private List<FileData> fileList;

    public ViewFileAdapter(Context context, List<FileData> fileList) {
        this.context = context;
        this.fileList = fileList;
    }

    @NonNull
    @Override
    public FileViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_image_view, parent, false);
        return new FileViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FileViewHolder holder, int position) {
        FileData fileData = fileList.get(position);
        holder.imageView.setImageResource(R.drawable.file);
        if(fileData.getFileName().contains("pdf"))
        {
            holder.imageView.setImageResource(R.drawable.pdf);
        }
        if(fileData.getFileName().contains("doc"))
        {
            holder.imageView.setImageResource(R.drawable.doc);
        }
        Log.d("path", fileData.getFilepath()+" //// "+ fileData.getFileUri());
        holder.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Intent intent=new Intent(context, PdfViewerActivity.class);
//                intent.putExtra("uri", fileData.getFileUri());
//            context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return fileList.size();
    }

    public static class FileViewHolder extends RecyclerView.ViewHolder {
//        TextView fileNameTextView, fileSizeTextView;
//        ImageView delete;
        ImageView imageView;
        public FileViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
//            fileNameTextView = itemView.findViewById(R.id.fileNameTextView);
//            fileSizeTextView = itemView.findViewById(R.id.fileSizeTextView);
//            delete = itemView.findViewById(R.id.delete);
        }
    }
}
