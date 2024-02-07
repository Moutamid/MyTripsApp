package com.moutimid.sqlapp.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.fxn.stash.Stash;
import com.moutimid.sqlapp.R;
import com.moutimid.sqlapp.activities.Beaches.BeachDetails;
import com.moutimid.sqlapp.helper.DatabaseHelper;
import com.moutimid.sqlapp.model.BeacModel;

public class BeachesAdapter extends BaseAdapter {

    private Context context;
    private String[] itemTexts;
    private String[] itemName;
    private String[] itemDetails;
    private int[] itemImages;

    public BeachesAdapter(Context context, String[] itemName, String[] itemDetails, String[] itemTexts, int[] itemImages) {
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
                if (Stash.getString("type").equals("West")) {
                    if (position == 0) {
                        BeacModel model = new BeacModel();
                        model.main_image = R.drawable.flic_en_flac_3; // Set the value for main_image

                        model.text1 = "Located on the west coast of Mauritius, Flic enFlac has emerged as the second most popular tourist area in the country, following Grand Baie.\n" +
                                "Unlike the faster-paced development in the north, the west coast, including beautiful villages like Flic enFlac, has transformed from small fishing communities into charming towns, earning a reputation as a premier holiday destination.\n" +
                                "Over the past two centuries, Flic enFlac has evolved from a humble fishing village into a prominent tourist hub. Today, it stands as a sought-after destination, attracting both international tourists and local Mauritians";
                        model.title1 = " ";

                        model.image1 = R.drawable.flic_en_flac_1; // Set the value for image1

                        model.text2 = "Flic enFlac offers an ideal holiday experience with its excellent beaches, a variety of watersports, and a tranquil ambiance for complete relaxation. The location boasts a delightful setting with pristine white sand beaches and picturesque blue lagoons. Along the extensive 8 km beach, numerous restaurants, hotels, shops, and facilities cater to visitors.\n" +
                                "The beach provides a perfect backdrop for activities such as afternoon strolls, watersports, sunbathing, or simply unwinding. It's an excellent spot for picnics, shaded by trees scattered along the coastline.\n" +
                                "Flic enFlac's beach, adorned with Casuarina Trees, features a fine lagoon protected by a reef, ensuring safe swimming and opportunities for various watersports.\n" +
                                "Flic-en-Flac buzzes with activity throughout the day and night, offering a dynamic atmosphere for visitors. In the daytime, guests can indulge in delectable street food options such as the \"DhalPuri,\" a thin, multi-layered flatbread crafted from flour, yellow split peas, salt, and water, filled with flavorful curry and sauces. Another popular local dish is fried noodles paired with Mauritian meatballs, enjoyed by both locals and visitors. However, it's crucial for those unfamiliar with the local water and cuisine to exercise extreme caution to prevent any potential food-related illnesses or stomach discomfort.\n During the weekends, the beach becomes a vibrant hub for locals spending quality time with family and friends. Entertainment unfolds as some locals engage in singing and dancing to the rhythmic beats of Sega music, typically played with guitars and \"ravannes\" — a percussion instrument resembling the \"Bodhrán\" but played with distinctive techniques using hands.\n" +
                                "The nightlife in Flic-en-Flac is lively, attracting both locals and tourists to nightclubs and restaurants, fostering a lively atmosphere for socializing. Despite its diverse offerings, it's important to note that the otherwise beautiful white sandy beach does contain a considerable amount of corals and sea urchins.";
                        model.title2 = "Flic enFlac - Location";
                        model.text3 = "Situated in the Black River district on the island's western coast, approximately 15 km south of the capital, Port Louis, Flic enFlac lies between the villages of Albion to the north and Tamarin and Black River to the south. The west coastline, lined with hotels and villas providing direct beach access, characterizes Flic enFlac. The drive to Port Louis takes around 30 minutes, while reaching the airport takes approximately 1 hour.\n" +
                                "Flic enFlac benefits from a well-established bus route, facilitating easy transportation to key locations across Mauritius. Buses connect to Port Louis and other cities like Quatre Bornes and Curepipe, offering convenient access to various parts of the island.";

                        model.image2 = R.drawable.map_location; // Set the value for image2

                        model.text4 = " ";
                        model.title3 = " ";
                        model.text5 = " ";
                        model.title4 = " ";
                        model.text6 = " ";
                        model.title5 = " ";
                        model.text7 = " ";
                        model.title6 = " ";
                        model.text8 = " ";
                        model.title7 = " ";

                        model.image3 = R.drawable.map_location;

                        model.text9 = " ";
                        model.title8 = " ";
                        model.text10 = " ";

                        model.image4 = R.drawable.map_location;

                        model.text11 = " ";

                        model.image5 = R.drawable.map_location;

                        model.text12 = " ";
                        Stash.put("model", model);
                        intent = new Intent(context, BeachDetails.class);
                        context.startActivity(intent);
                    } else
                        if (position == 1) {
                        BeacModel model = new BeacModel();
                        model.main_image = R.drawable.la_preneuse_4; // Set the value for main_image

                        model.text1 = "The shoreline is adorned with pristine, snow-white sand, featuring a gentle slope and shallow waters. The ocean remains tranquil, displaying a captivating turquoise hue, although intermittent strong currents can be experienced. La Preneuse Beach boasts a spacious and expansive setting, providing ample room for all vacationers. The panoramic view from the coast reveals the towering Mount Le Morne against the backdrop of the turquoise lagoon.\n" +
                                "Situated on the west coast of Mauritius, the beach offers a range of hotels catering to different comfort levels for tourists. Cafes, stores, and souvenir shops offering diverse goods are conveniently located near the shoreline. A notable attraction is the Martello Tower, erected by the British in the 1830s as a defense against the French fleet. It now serves as a museum housing information about the region's history and the initial planters. The renowned Black River, a freshwater river, flows along the beach. Yachts and boats gracefully navigate the open sea, providing opportunities for sea excursions.";
                        model.title1 = " ";

                        model.image1 = R.drawable.map_location; // Set the value for image1

                        model.text2 = " ";
                        model.title2 = " ";
                        model.text3 = " ";

                        model.image2 = R.drawable.map_location; // Set the value for image2

                        model.text4 = " ";
                        model.title3 = " ";
                        model.text5 = " ";
                        model.title4 = " ";
                        model.text6 = " ";
                        model.title5 = " ";
                        model.text7 = " ";
                        model.title6 = " ";
                        model.text8 = " ";
                        model.title7 = " ";

                        model.image3 = R.drawable.map_location;

                        model.text9 = " ";
                        model.title8 = " ";
                        model.text10 = " ";

                        model.image4 = R.drawable.map_location;

                        model.text11 = " ";

                        model.image5 = R.drawable.map_location;

                        model.text12 = " ";
                        Stash.put("model", model);
                        intent = new Intent(context, BeachDetails.class);
                        context.startActivity(intent);
                    }else
                        if (position == 2) {
                        BeacModel model = new BeacModel();
                        model.main_image = R.drawable.le_morne_beach_2; // Set the value for main_image

                        model.text1 = "Nestled on a peninsula along the western coast of Mauritius, at the base of the UNESCO-listed Morne Brabant mountain, lies Le Morne Beach. Easily accessible from the coastal road, this public beach boasts miles of pristine white sand and is adorned with majestic casuarina trees, all against the backdrop of the crystal-clear waters providing excellent visibility for scuba diving.";
                        model.title1 = " ";

                        model.image1 = R.drawable.kite_surfing; // Set the value for image1

                        model.text2 = "Renowned as one of the premier kite-surfing spots in Mauritius, and often regarded as one of the best in the world, Le Morne Beach offers a breathtaking setting with its iconic mountain in the background. The beach is a favorite among windsurfers and kite surfers, as the conditions for these water sports are ideal throughout much of the year. The annual Kiteival, attracting international participants, is among the many competitions hosted at this spectacular location.\n" +
                                "While Le Morne Beach remains a delightful spot for swimming, it can get quite busy on weekends and holidays. Nudism is prohibited, although topless sunbathing is accepted. For a more tranquil experience, the best times to visit the beach are early in the morning from 8:00 to 11:00 or in the afternoon from 13:00 to 17:00.\n ";
                        model.title2 = " ";
                        model.text3 = " ";

                        model.image2 = R.drawable.paddle_boarding; // Set the value for image2

                        model.text4 = "An array of activities awaits beachgoers, including pedalo rides, windsurfing, kite surfing, scuba diving, stand-up paddleboarding, and kayaking, ensuring there's something for everyone to enjoy at Le Morne Beach. ";
                        model.title3 = " ";
                        model.text5 = " ";
                        model.title4 = " ";
                        model.text6 = " ";
                        model.title5 = " ";
                        model.text7 = " ";
                        model.title6 = " ";
                        model.text8 = " ";
                        model.title7 = " ";

                        model.image3 = R.drawable.map_location;

                        model.text9 = " ";
                        model.title8 = " ";
                        model.text10 = " ";

                        model.image4 = R.drawable.map_location;

                        model.text11 = " ";

                        model.image5 = R.drawable.map_location;

                        model.text12 = " ";
                        Stash.put("model", model);
                        intent = new Intent(context, BeachDetails.class);
                        context.startActivity(intent);
                    }else
                        if (position == 3) {

                        BeacModel model = new BeacModel();
                        model.main_image = R.drawable.la_preneuse_4; // Set the value for main_image
                        model.text1 = "The shoreline is adorned with pristine, snow-white sand, featuring a gentle slope and shallow waters. The ocean remains tranquil, displaying a captivating turquoise hue, although intermittent strong currents can be experienced. La Preneuse Beach boasts a spacious and expansive setting, providing ample room for all vacationers. The panoramic view from the coast reveals the towering Mount Le Morne against the backdrop of the turquoise lagoon.\n" +
                                "Situated on the west coast of Mauritius, the beach offers a range of hotels catering to different comfort levels for tourists. Cafes, stores, and souvenir shops offering diverse goods are conveniently located near the shoreline. A notable attraction is the Martello Tower, erected by the British in the 1830s as a defense against the French fleet. It now serves as a museum housing information about the region's history and the initial planters. The renowned Black River, a freshwater river, flows along the beach. Yachts and boats gracefully navigate the open sea, providing opportunities for sea excursions.";
                        model.title1 = " ";
                        model.image1 = R.drawable.map_location; // Set the value for image1
                        model.text2 = " ";
                        model.title2 = " ";
                        model.text3 = " ";

                        model.image2 = R.drawable.map_location; // Set the value for image2

                        model.text4 = " ";
                        model.title3 = " ";
                        model.text5 = " ";
                        model.title4 = " ";
                        model.text6 = " ";
                        model.title5 = " ";
                        model.text7 = " ";
                        model.title6 = " ";
                        model.text8 = " ";
                        model.title7 = " ";

                        model.image3 = R.drawable.map_location;

                        model.text9 = " ";
                        model.title8 = " ";
                        model.text10 = " ";

                        model.image4 = R.drawable.map_location;

                        model.text11 = " ";

                        model.image5 = R.drawable.map_location;

                        model.text12 = " ";
                        Stash.put("model", model);
                        intent = new Intent(context, BeachDetails.class);
                        context.startActivity(intent);
                    }


                }
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

//    else
//            if (position == 1) {
//        BeacModel model = new BeacModel();
//        model.main_image = R.drawable.la_preneuse_4; // Set the value for main_image
//
//        model.text1 = "The shoreline is adorned with pristine, snow-white sand, featuring a gentle slope and shallow waters. The ocean remains tranquil, displaying a captivating turquoise hue, although intermittent strong currents can be experienced. La Preneuse Beach boasts a spacious and expansive setting, providing ample room for all vacationers. The panoramic view from the coast reveals the towering Mount Le Morne against the backdrop of the turquoise lagoon.\n" +
//                "Situated on the west coast of Mauritius, the beach offers a range of hotels catering to different comfort levels for tourists. Cafes, stores, and souvenir shops offering diverse goods are conveniently located near the shoreline. A notable attraction is the Martello Tower, erected by the British in the 1830s as a defense against the French fleet. It now serves as a museum housing information about the region's history and the initial planters. The renowned Black River, a freshwater river, flows along the beach. Yachts and boats gracefully navigate the open sea, providing opportunities for sea excursions.";
//        model.title1 = " ";
//
//        model.image1 = R.drawable.map_location; // Set the value for image1
//
//        model.text2 = " ";
//        model.title2 = " ";
//        model.text3 = " ";
//
//        model.image2 = R.drawable.map_location; // Set the value for image2
//
//        model.text4 = " ";
//        model.title3 = " ";
//        model.text5 = " ";
//        model.title4 = " ";
//        model.text6 = " ";
//        model.title5 = " ";
//        model.text7 = " ";
//        model.title6 = " ";
//        model.text8 = " ";
//        model.title7 = " ";
//
//        model.image3 = R.drawable.map_location;
//
//        model.text9 = " ";
//        model.title8 = " ";
//        model.text10 = " ";
//
//        model.image4 = R.drawable.map_location;
//
//        model.text11 = " ";
//
//        model.image5 = R.drawable.map_location;
//
//        model.text12 = " ";
//        Stash.put("model", model);
//        intent = new Intent(context, BeachDetails.class);
//        context.startActivity(intent);
//    }
}
