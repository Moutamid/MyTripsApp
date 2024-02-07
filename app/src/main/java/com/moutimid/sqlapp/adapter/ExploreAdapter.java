package com.moutimid.sqlapp.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.moutimid.sqlapp.R;
import com.moutimid.sqlapp.activities.Beaches.East.East1Activity;
import com.moutimid.sqlapp.activities.Beaches.East.East3Activity;
import com.moutimid.sqlapp.activities.Beaches.East.East4Activity;
import com.moutimid.sqlapp.activities.Beaches.East.Eest2Activity;
import com.moutimid.sqlapp.helper.DatabaseHelper;

public class ExploreAdapter extends RecyclerView.Adapter<ExploreAdapter.ViewHolder> {

    private Context context;
    private String[] itemName;
    private int[] itemImages;

    public ExploreAdapter(Context context, String[] itemName, int[] itemImages) {
        this.context = context;
        this.itemImages = itemImages;
        this.itemName = itemName;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.explore_layout, parent, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.imageView.setImageResource(itemImages[position]);
        holder.textView.setText(itemName[position]);
    }

    @Override
    public int getItemCount() {
        return itemName.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        ImageView imageView;
        TextView textView;

        public ViewHolder(View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.image);
            textView = itemView.findViewById(R.id.title);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            Intent intent = null;
            int position = getAdapterPosition();
            switch (position) {
                case 0:
                    intent = new Intent(context, East1Activity.class);
                    break;
                case 1:
                    intent = new Intent(context, Eest2Activity.class);
                    break;
                case 2:
                    intent = new Intent(context, East3Activity.class);
                    break;
                case 3:
                    intent = new Intent(context, East4Activity.class);
                    break;
            }
            if (intent != null) {
                context.startActivity(intent);
            }
        }
    }
}
