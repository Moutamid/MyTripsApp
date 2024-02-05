package com.moutimid.sqlapp.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.moutimid.sqlapp.R;
import com.moutimid.sqlapp.activities.Beaches.East.East1Activity;
import com.moutimid.sqlapp.activities.Beaches.East.East3Activity;
import com.moutimid.sqlapp.activities.Beaches.East.East4Activity;
import com.moutimid.sqlapp.activities.Beaches.East.Eest2Activity;
import com.moutimid.sqlapp.activities.DetailsActivity;
import com.moutimid.sqlapp.helper.DatabaseHelper;

public class BeachessAdapter extends BaseAdapter {

    private Context context;
    private String[] itemTexts;
    private String[] itemName;
    private String[] itemDetails;
    private int[] itemImages;

    public BeachessAdapter(Context context, String[] itemName, String[] itemDetails, String[] itemTexts, int[] itemImages) {
        this.context = context;
        this.itemTexts = itemTexts;
        this.itemImages = itemImages;
        this.itemDetails = itemDetails;
        this.itemName = itemName;
    }

    @Override
    public int getCount() {
        return itemTexts.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View itemView = inflater.inflate(R.layout.beaches_east_layout, parent, false);

        ImageView imageView = itemView.findViewById(R.id.imageView);
        TextView textView = itemView.findViewById(R.id.textView);
        TextView textView1 = itemView.findViewById(R.id.textView1);
        TextView textView2 = itemView.findViewById(R.id.textView2);
        ImageView add = itemView.findViewById(R.id.add);
        ImageView map = itemView.findViewById(R.id.map);

        imageView.setImageResource(itemImages[position]);
        textView.setText(itemName[position]);
        textView1.setText(itemTexts[position]);
        textView2.setText(itemDetails[position]);
        DatabaseHelper dbHelper;
        dbHelper = new DatabaseHelper(context);
//        if (!dbHelper.checkDataExists(itemName[position], itemTexts[position], itemDetails[position], itemImages[position])) {
//            add.setVisibility(View.GONE);
//        } else {
//            add.setVisibility(View.VISIBLE);
//        }
//        add.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                dbHelper.insertData(itemName[position], itemTexts[position], itemDetails[position], itemImages[position]);
//                //                removeFromArrays(position);
//                add.setVisibility(View.GONE);
//                notifyDataSetChanged();
//            }
//        });
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = null;
                if (position == 0) {
                    intent = new Intent(context, East1Activity.class);
                } else  if (position == 1) {
                    intent = new Intent(context, Eest2Activity.class);
                }else  if (position == 2) {
                    intent = new Intent(context, East3Activity.class);
                } else if (position == 3) {
                    intent = new Intent(context, East4Activity.class);
                }
                context.startActivity(intent);
//                Intent intent = new Intent(context, DetailsActivity.class);
//                intent.putExtra("name", itemName[position]);
//                intent.putExtra("address", itemTexts[position]);
//                intent.putExtra("details", itemDetails[position]);
//                intent.putExtra("image", itemImages[position]);
//                context.startActivity(intent);
            }
        });

        return itemView;
    }

    // Helper method to remove the item from the arrays
    private void removeFromArrays(int position) {
        // Create new arrays with size - 1
        String[] newItemTexts = new String[itemTexts.length - 1];
        String[] newItemName = new String[itemName.length - 1];
        String[] newItemDetails = new String[itemDetails.length - 1];
        int[] newItemImages = new int[itemImages.length - 1];

        // Copy elements before the removed item
        System.arraycopy(itemTexts, 0, newItemTexts, 0, position);
        System.arraycopy(itemName, 0, newItemName, 0, position);
        System.arraycopy(itemDetails, 0, newItemDetails, 0, position);
        System.arraycopy(itemImages, 0, newItemImages, 0, position);

        // Copy elements after the removed item
        System.arraycopy(itemTexts, position + 1, newItemTexts, position, newItemTexts.length - position);
        System.arraycopy(itemName, position + 1, newItemName, position, newItemName.length - position);
        System.arraycopy(itemDetails, position + 1, newItemDetails, position, newItemDetails.length - position);
        System.arraycopy(itemImages, position + 1, newItemImages, position, newItemImages.length - position);

        // Update the original arrays
        itemTexts = newItemTexts;
        itemName = newItemName;
        itemDetails = newItemDetails;
        itemImages = newItemImages;
    }
}
