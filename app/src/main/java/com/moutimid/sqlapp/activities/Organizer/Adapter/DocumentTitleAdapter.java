package com.moutimid.sqlapp.activities.Organizer.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.moutimid.sqlapp.R;

import java.util.List;

public class DocumentTitleAdapter extends RecyclerView.Adapter<DocumentTitleAdapter.DocumentTitleViewHolder> {
    private List<String> documentTitles;

    public DocumentTitleAdapter(List<String> documentTitles) {
        this.documentTitles = documentTitles;
    }

    @NonNull
    @Override
    public DocumentTitleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_document_title, parent, false);
        return new DocumentTitleViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull DocumentTitleViewHolder holder, int position) {
        String documentTitle = documentTitles.get(position);
        int i = position + 1;
        holder.bind(documentTitle, i);
    }

    @Override
    public int getItemCount() {
        return documentTitles.size();
    }

    static class DocumentTitleViewHolder extends RecyclerView.ViewHolder {
        private TextView textViewTitle, number;

        DocumentTitleViewHolder(@NonNull View itemView) {
            super(itemView);
            number = itemView.findViewById(R.id.number);
            textViewTitle = itemView.findViewById(R.id.textViewTitle);
        }

        void bind(String documentTitle, int i) {
            textViewTitle.setText(documentTitle);
            number.setText(i+"");
        }
    }
}
