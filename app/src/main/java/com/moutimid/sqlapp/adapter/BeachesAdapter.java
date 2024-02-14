package com.moutimid.sqlapp.adapter;

import static com.moutimid.sqlapp.model.DatabaseHelper.TABLE_NAME;

import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.fxn.stash.Stash;
import com.moutimid.sqlapp.R;
import com.moutimid.sqlapp.activities.Beaches.BeachDetails;
import com.moutimid.sqlapp.model.BeacModel;
import com.moutimid.sqlapp.model.DatabaseHelper;

import java.util.List;

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
        ImageView remove = itemView.findViewById(R.id.remove);
        ImageView map = itemView.findViewById(R.id.map);
        imageView.setImageResource(itemImages[position]);
        textView.setText(itemName[position]);
        textView1.setText(itemTexts[position]);
        textView2.setText(itemDetails[position]);
        com.moutimid.sqlapp.model.DatabaseHelper databaseHelper;
        databaseHelper = new DatabaseHelper(context);
        List<BeacModel> beacModels = databaseHelper.getAllBeacModels();
        boolean isDataAvailable = false;
        for (BeacModel model : beacModels)
        {
            if (model.title.equals(textView.getText().toString())) {
                isDataAvailable = true;
                break;
            }
        }
        if (isDataAvailable) {
            add.setVisibility(View.GONE);
            remove.setVisibility(View.VISIBLE);
        } else {
            add.setVisibility(View.VISIBLE);
            remove.setVisibility(View.GONE);
        }
        remove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String deleteName = textView.getText().toString();
                SQLiteDatabase db = databaseHelper.getWritableDatabase();
                db.delete(TABLE_NAME, DatabaseHelper.COLUMN_TITLE + "=?", new String[]{deleteName});
                db.close();
                remove.setVisibility(View.GONE);
                add.setVisibility(View.VISIBLE);
                notifyDataSetChanged();
            }
        });
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = null;
                if (Stash.getString("type").equals("West")) {
                    if (position == 0) {
                        BeacModel model = new BeacModel();
                        model.title = textView.getText().toString();
                        model.main_image = R.drawable.flic_en_flac_3;
                        model.text1 = "Located on the west coast of Mauritius, Flic enFlac has emerged as the second most popular tourist area in the country, following Grand Baie.<br>" +
                                "Unlike the faster-paced development in the north, the west coast, including beautiful villages like Flic enFlac, has transformed from small fishing communities into charming towns, earning a reputation as a premier holiday destination.<br>" +
                                "Over the past two centuries, Flic enFlac has evolved from a humble fishing village into a prominent tourist hub. Today, it stands as a sought-after destination, attracting both international tourists and local Mauritians";
                        model.title1 = "";

                        model.image1 = R.drawable.flic_en_flac_1;
                        model.text2 = "Flic enFlac offers an ideal holiday experience with its excellent beaches, a variety of watersports, and a tranquil ambiance for complete relaxation. The location boasts a delightful setting with pristine white sand beaches and picturesque blue lagoons. Along the extensive 8 km beach, numerous restaurants, hotels, shops, and facilities cater to visitors.<br>" +
                                "The beach provides a perfect backdrop for activities such as afternoon strolls, watersports, sunbathing, or simply unwinding. It's an excellent spot for picnics, shaded by trees scattered along the coastline.<br>" +
                                "Flic enFlac's beach, adorned with Casuarina Trees, features a fine lagoon protected by a reef, ensuring safe swimming and opportunities for various watersports.<br>" +
                                "Flic-en-Flac buzzes with activity throughout the day and night, offering a dynamic atmosphere for visitors. In the daytime, guests can indulge in delectable street food options such as the \"DhalPuri,\" a thin, multi-layered flatbread crafted from flour, yellow split peas, salt, and water, filled with flavorful curry and sauces. Another popular local dish is fried noodles paired with Mauritian meatballs, enjoyed by both locals and visitors. However, it's crucial for those unfamiliar with the local water and cuisine to exercise extreme caution to prevent any potential food-related illnesses or stomach discomfort.<br> During the weekends, the beach becomes a vibrant hub for locals spending quality time with family and friends. Entertainment unfolds as some locals engage in singing and dancing to the rhythmic beats of Sega music, typically played with guitars and \"ravannes\" — a percussion instrument resembling the \"Bodhrán\" but played with distinctive techniques using hands.<br>" +
                                "The nightlife in Flic-en-Flac is lively, attracting both locals and tourists to nightclubs and restaurants, fostering a lively atmosphere for socializing. Despite its diverse offerings, it's important to note that the otherwise beautiful white sandy beach does contain a considerable amount of corals and sea urchins.";
                        model.title2 = "Flic enFlac - Location";
                        model.text3 = "Situated in the Black River district on the island's western coast, approximately 15 km south of the capital, Port Louis, Flic enFlac lies between the villages of Albion to the north and Tamarin and Black River to the south. The west coastline, lined with hotels and villas providing direct beach access, characterizes Flic enFlac. The drive to Port Louis takes around 30 minutes, while reaching the airport takes approximately 1 hour.<br>" +
                                "Flic enFlac benefits from a well-established bus route, facilitating easy transportation to key locations across Mauritius. Buses connect to Port Louis and other cities like Quatre Bornes and Curepipe, offering convenient access to various parts of the island.";

                        model.image2 = R.drawable.map_location;
                        model.text4 = "";
                        model.title3 = "";
                        model.text5 = "";
                        model.title4 = "";
                        model.text6 = "";
                        model.title5 = "";
                        model.text7 = "";
                        model.title6 = "";
                        model.text8 = "";
                        model.title7 = "";

                        model.image3 = R.drawable.map_location;

                        model.text9 = "";
                        model.title8 = "";
                        model.text10 = "";

                        model.image4 = R.drawable.map_location;

                        model.text11 = "";

                        model.image5 = R.drawable.map_location;

                        model.text12 = "";
                        Stash.put("model", model);
                        intent = new Intent(context, BeachDetails.class);
                        context.startActivity(intent);
                    } else if (position == 1) {
                        BeacModel model = new BeacModel();
                        model.title = textView.getText().toString();

                        model.main_image = R.drawable.la_preneuse_4; // Set the value for main_image

                        model.text1 = "The shoreline is adorned with pristine, snow-white sand, featuring a gentle slope and shallow waters. The ocean remains tranquil, displaying a captivating turquoise hue, although intermittent strong currents can be experienced. La Preneuse Beach boasts a spacious and expansive setting, providing ample room for all vacationers. The panoramic view from the coast reveals the towering Mount Le Morne against the backdrop of the turquoise lagoon.<br>" +
                                "Situated on the west coast of Mauritius, the beach offers a range of hotels catering to different comfort levels for tourists. Cafes, stores, and souvenir shops offering diverse goods are conveniently located near the shoreline. A notable attraction is the Martello Tower, erected by the British in the 1830s as a defense against the French fleet. It now serves as a museum housing information about the region's history and the initial planters. The renowned Black River, a freshwater river, flows along the beach. Yachts and boats gracefully navigate the open sea, providing opportunities for sea excursions.";
                        model.title1 = "";

                        model.image1 = R.drawable.map_location; // Set the value for image1

                        model.text2 = "";
                        model.title2 = "";
                        model.text3 = "";

                        model.image2 = R.drawable.map_location; // Set the value for image2

                        model.text4 = "";
                        model.title3 = "";
                        model.text5 = "";
                        model.title4 = "";
                        model.text6 = "";
                        model.title5 = "";
                        model.text7 = "";
                        model.title6 = "";
                        model.text8 = "";
                        model.title7 = "";

                        model.image3 = R.drawable.map_location;

                        model.text9 = "";
                        model.title8 = "";
                        model.text10 = "";

                        model.image4 = R.drawable.map_location;

                        model.text11 = "";

                        model.image5 = R.drawable.map_location;

                        model.text12 = "";
                        Stash.put("model", model);
                        intent = new Intent(context, BeachDetails.class);
                        context.startActivity(intent);
                    } else if (position == 2) {
                        BeacModel model = new BeacModel();
                        model.title = textView.getText().toString();

                        model.main_image = R.drawable.le_morne_beach_2; // Set the value for main_image

                        model.text1 = "Nestled on a peninsula along the western coast of Mauritius, at the base of the UNESCO-listed Morne Brabant mountain, lies Le Morne Beach. Easily accessible from the coastal road, this public beach boasts miles of pristine white sand and is adorned with majestic casuarina trees, all against the backdrop of the crystal-clear waters providing excellent visibility for scuba diving.";
                        model.title1 = "";

                        model.image1 = R.drawable.kite_surfing; // Set the value for image1

                        model.text2 = "Renowned as one of the premier kite-surfing spots in Mauritius, and often regarded as one of the best in the world, Le Morne Beach offers a breathtaking setting with its iconic mountain in the background. The beach is a favorite among windsurfers and kite surfers, as the conditions for these water sports are ideal throughout much of the year. The annual Kiteival, attracting international participants, is among the many competitions hosted at this spectacular location.<br>" +
                                "While Le Morne Beach remains a delightful spot for swimming, it can get quite busy on weekends and holidays. Nudism is prohibited, although topless sunbathing is accepted. For a more tranquil experience, the best times to visit the beach are early in the morning from 8:00 to 11:00 or in the afternoon from 13:00 to 17:00.<br> ";
                        model.title2 = "";
                        model.text3 = "";

                        model.image2 = R.drawable.paddle_boarding; // Set the value for image2

                        model.text4 = "An array of activities awaits beachgoers, including pedalo rides, windsurfing, kite surfing, scuba diving, stand-up paddleboarding, and kayaking, ensuring there's something for everyone to enjoy at Le Morne Beach. ";
                        model.title3 = "";
                        model.text5 = "";
                        model.title4 = "";
                        model.text6 = "";
                        model.title5 = "";
                        model.text7 = "";
                        model.title6 = "";
                        model.text8 = "";
                        model.title7 = "";

                        model.image3 = R.drawable.map_location;

                        model.text9 = "";
                        model.title8 = "";
                        model.text10 = "";

                        model.image4 = R.drawable.map_location;

                        model.text11 = "";

                        model.image5 = R.drawable.map_location;

                        model.text12 = "";
                        Stash.put("model", model);
                        intent = new Intent(context, BeachDetails.class);
                        context.startActivity(intent);
                    } else if (position == 3) {

                        BeacModel model = new BeacModel();
                        model.title = textView.getText().toString();

                        model.main_image = R.drawable.la_preneuse_4; // Set the value for main_image
                        model.text1 = "The shoreline is adorned with pristine, snow-white sand, featuring a gentle slope and shallow waters. The ocean remains tranquil, displaying a captivating turquoise hue, although intermittent strong currents can be experienced. La Preneuse Beach boasts a spacious and expansive setting, providing ample room for all vacationers. The panoramic view from the coast reveals the towering Mount Le Morne against the backdrop of the turquoise lagoon.<br>" +
                                "Situated on the west coast of Mauritius, the beach offers a range of hotels catering to different comfort levels for tourists. Cafes, stores, and souvenir shops offering diverse goods are conveniently located near the shoreline. A notable attraction is the Martello Tower, erected by the British in the 1830s as a defense against the French fleet. It now serves as a museum housing information about the region's history and the initial planters. The renowned Black River, a freshwater river, flows along the beach. Yachts and boats gracefully navigate the open sea, providing opportunities for sea excursions.";
                        model.title1 = "";
                        model.image1 = R.drawable.map_location; // Set the value for image1
                        model.text2 = "";
                        model.title2 = "";
                        model.text3 = "";

                        model.image2 = R.drawable.map_location; // Set the value for image2

                        model.text4 = "";
                        model.title3 = "";
                        model.text5 = "";
                        model.title4 = "";
                        model.text6 = "";
                        model.title5 = "";
                        model.text7 = "";
                        model.title6 = "";
                        model.text8 = "";
                        model.title7 = "";

                        model.image3 = R.drawable.map_location;

                        model.text9 = "";
                        model.title8 = "";
                        model.text10 = "";

                        model.image4 = R.drawable.map_location;

                        model.text11 = "";

                        model.image5 = R.drawable.map_location;

                        model.text12 = "";
                        Stash.put("model", model);
                        intent = new Intent(context, BeachDetails.class);
                        context.startActivity(intent);
                    }

                } else if (Stash.getString("type").equals("East")) {
                    if (position == 0) {
                        BeacModel model = new BeacModel();
                        model.title = textView.getText().toString();
                        model.main_image = R.drawable.belle_mare_1; // Set the value for main_image

                        model.text1 = "The Belle Mare Beach is located near the town of Mahebourg on the Southeast coast of Mauritius, spanning between the villages Belle Mare and Pointe de Flacq. Sheltered from the big waves by the coral reef, this crescent-shaped beach has a parking area and a shaded rest area under the filaos trees. It is quite wide with parts of fine, dazzling white sand. The water is transparent and calm, and the lagoon has a most magnificent turquoise blue color. In this realm, unspoiled nature prevails, with minimal development except for a few scattering hotels and exclusive villas.";
                        model.title1 = "";

                        model.image1 = R.drawable.belle_mare_3; // Set the value for image1

                        model.text2 = "Renowned among holidaymakers as the epitome of beauty, the Belle Mare Beach is cherished not only by visitors but also by the island's residents who frequent the beach, particularly on weekends and holidays. This enclave retains an authentic charm, preserving the island's essence amidst the rapid development witnessed by other coastal cities, notably Grand Bay, Flic enFlac, and Black River.\n" +
                                "\n";
                        model.title2 = "";
                        model.text3 = "The Belle Mare Beach is an idyllic destination for swimming and diving, particularly on weekdays when the serene ambiance prevails. It offers an ideal retreat for nature enthusiasts, allowing them to relish miles of sandy expanse for sunbathing.\n" +
                                "The optimal times to visit the Belle Mare Beach are during the early morning hours from 7:00 to 11:00 or in the afternoon from 13:00 to 17:00.\n" +
                                "Engage in an array of activities at Belle Mare Beach, including pedalo rides, windsurfing, catamaran journeys, horseback riding, parasailing, scuba diving, speed boat excursions, and kayaking.\n";
                        model.image2 = R.drawable.map_location; // Set the value for image2

                        model.text4 = "";
                        model.title3 = "";
                        model.text5 = "";
                        model.title4 = "";
                        model.text6 = "";
                        model.title5 = "";
                        model.text7 = "";
                        model.title6 = "";
                        model.text8 = "";
                        model.title7 = "";

                        model.image3 = R.drawable.map_location;

                        model.text9 = "";
                        model.title8 = "";
                        model.text10 = "";

                        model.image4 = R.drawable.map_location;

                        model.text11 = "";

                        model.image5 = R.drawable.map_location;

                        model.text12 = "";
                        Stash.put("model", model);
                        intent = new Intent(context, BeachDetails.class);
                        context.startActivity(intent);
                    } else if (position == 1) {
                        BeacModel model = new BeacModel();
                        model.title = textView.getText().toString();

                        model.main_image = R.drawable.ile_aux_cerfs_mauritius_1; // Set the value for main_image

                        model.text1 = "On the eastern coast of Mauritius, just south of Trou d’Eau Douce, lies a pair of islands known collectively as Ile aux Cerfs. Ile aux Cerfs is a genuine paradise spanning 87 hectares. It is particularly appealing to water sports enthusiasts andis one of the most stunning beaches in Mauritius.";
                        model.title1 = "What to Explore and Experience on Ile aux Cerfs";

                        model.image1 = R.drawable.ile_aux_cerfs_7; // Set the value for image1

                        model.text2 = "The island is celebrated for its picturesque turquoise lagoon, perfectly suited for an extensive array of water sports. Among the activities available, whether undertaken solo or with a companion, is parasailing—an endeavor worth adding to your bucket list, particularly for the breathtaking vistas of the lagoon.\n" +
                                "Other activities include speedboat rides, water skiing, and paddleboarding. Snorkeling is also an option, although, you'll need to take a boat to a location where there is coral as the water near the beach is shallow and consists predominantly of sand\n";
                        model.title2 = "";
                        model.text3 = "";
                        model.image2 = R.drawable.ile_aux_cerfs_5_1; // Set the value for image2
                        model.text4 = "While many visitors come to the Ile aux Cerfs for leisurely water activities, true sun worshippers find their sanctuary here, especially given the limited shelter on the beach. The overarching advice is to liberally apply sunscreen, preferably opting for products that are environmentally friendly. ";
                        model.title3 = "";
                        model.text5 = " close proximity to the pier, where the shuttle from Pointe Maurice drops them off. If you wish to evade the crowds, particularly on weekends, consider strolling a bit farther along the coast. Numerous other nearby beaches offer equally tranquil surroundings.";
                        model.title4 = "How to Reach Ile aux Cerfs";
                        model.text6 = "";
                        model.title5 = "";
                        model.text7 = "";
                        model.title6 = "";
                        model.text8 = "";
                        model.title7 = "";

                        model.image3 = R.drawable.ile_aux_cerfs_7;

                        model.text9 = "Access to the island is granted to the public from 9:00 a.m. to 6:00 p.m. Starting from the village of Trou-d’Eau Douce, a shuttle embarks every half hour from the pier at Pointe Maurice to the Masala pier on Ile aux Cerfs, at 9:30 a.m.\n" +
                                "An alternative approach is by catamaran, with numerous providers offering scenic journeys to the island, sometimes incorporating detours to or from the waterfalls in the nature reserve of Grande Rivière Sud Est.\n";
                        model.title8 = "Optimal Time to Explore the Island ";
                        model.text10 = "";

                        model.image4 = R.drawable.ile_aux_cerfs_6;

                        model.text11 = "The island tends to attract a considerable influx of day trippers during weekends. If your stay in Mauritius extends to at least a week, it is advisable to plan your visit on a weekday. While October and November are considered the prime months to experience Ile aux Cerfs, the period from June to November also offers a delightful visit.\n" +
                                "<b>Accommodation</b> \n" +
                                "Noteworthy among the accommodations on Ile aux Cerfs is the opulent 5-star Shangri-La’s Le Touessrok Resort & Spa. While not budget-friendly, it provides an exceptional setting for grand celebrations. \n" +
                                "<b>Culinary Offerings</b>\n";
                        model.image5 = R.drawable.ile_aux_cerfs_3;
                        model.text12 = "Ile aux Cerfshas several dining establishments, including a charming beachside restaurant. Additionally, two bars are available for visitors seeking refreshing beverages or cocktails at reasonable prices. An alternative is to bring ample food and drinks to suit your preferences.";
                        Stash.put("model", model);
                        intent = new Intent(context, BeachDetails.class);
                        context.startActivity(intent);
                    } else if (position == 2) {
                        BeacModel model = new BeacModel();
                        model.title = textView.getText().toString();

                        model.main_image = R.drawable.poste_lafayette_1; // Set the value for main_image

                        model.text1 = "This unspoiled beach, often overlooked due to its turbulent sea, offers a rare opportunity to embrace tranquility and serenity. With its authentically rustic and untouched nature, this charming locale continually captivates nature enthusiasts. The preserved green habitat is a sanctuary for massive coral reefs, fostering rich marine biodiversity and mangroves.";
                        model.title1 = "";

                        model.image1 = R.drawable.poste_lafayette_2; // Set the value for image1

                        model.text2 = "Those seeking a peaceful picnic will be pleased that the southern part of the beach provides a serene retreat. Additionally, the southern beach serves as an ideal starting point for a trek leading north of Poste Lafayette, offering picturesque green landscapes along the rocky trail.";
                        model.title2 = "";
                        model.text3 = "Picnicking in the shelter of the trees is a delightful option in certain areas where the sea displays stormy waves due to the proximity of the reefs to the lagoons. Enthusiasts of kite surfing and windsurfing will find this place ideal since Poste Lafayette is consistently exposed to the trade winds throughout ";

                        model.image2 = R.drawable.paddle_boarding; // Set the value for image2

                        model.text4 = "An array of activities awaits beachgoers, including pedalo rides, windsurfing, kite surfing, scuba diving, stand-up paddleboarding, and kayaking, ensuring there's something for everyone to enjoy at Le Morne Beach. ";
                        model.title3 = "";
                        model.text5 = "";
                        model.title4 = "";
                        model.text6 = "";
                        model.title5 = "";
                        model.text7 = "";
                        model.title6 = "";
                        model.text8 = "";
                        model.title7 = "";

                        model.image3 = R.drawable.poste_lafayette_4;

                        model.text9 = "While the sea may be too challenging for a Sunday swim, the shore or shallow waters provide opportunities for sunbathing while children can revel in building sandcastles";
                        model.title8 = "";
                        model.text10 = "The eastern coast boasts prominent hotels and restaurants, including establishments like Jalsa Beach Hotel & Spa, Radisson Blu Poste Lafayette Resort & Spa, and the esteemed Hôtel Constance Le Prince Maurice. \n" +
                                "To cater to the discerning tourist, gourmet restaurants have thrived alongside small traditional eateries. La Maison D’Été, specializing in Italian cuisine with seafood and fish menus, is a must-visit in Poste Lafayette. Another favored dining spot, Seabell, offers a menu featuring typical Mauritian dishes, complemented by a nearby mini market owned by the Seabell owners.\n" +
                                "\n";

                        model.image4 = R.drawable.map_location;

                        model.text11 = "";

                        model.image5 = R.drawable.map_location;

                        model.text12 = "";
                        Stash.put("model", model);
                        intent = new Intent(context, BeachDetails.class);
                        context.startActivity(intent);
                    } else if (position == 3) {

                        BeacModel model = new BeacModel();
                        model.title = textView.getText().toString();

                        model.main_image = R.drawable.roche_noire_2; // Set the value for main_image
                        model.text1 = "Ranked among the top 10 beaches in Mauritius, the Roche Noire Beach is located just a few kilometers from Poste Lafayette on the southeast coast of the island. The beach has a stunning landscape characterized by black lava rocks and a dark sea, where gentle waves crash onto the nearby coral reef. The pristine sand and the spectacular views of sunrise and sunset contribute to making Roche Noire Beach an unparalleled destination. The winds throughout the year provide a refreshing breeze, especially during the hot summer months. It is one of the most photographed beaches according to tourist reviews.";
                        model.title1 = "";
                        model.image1 = R.drawable.roche_noire_3; // Set the value for image1
                        model.text2 = "The Roche Noire Beach is a true paradise for those who love water activities and appreciate nature. Guests can partake in a range of aquatic adventures, including swimming, snorkeling, and kayaking, allowing them to discover the diverse marine life and colorful coral reefs. Furthermore, the tranquil ambiance of the beach creates an ideal setting for a leisurely walk or a peaceful sunbathing experience. \n" +
                                "Parking facilities are commonly accessible in the vicinity of the Roche Noire Beach, offering travelers a choice between free and paid parking options for easy access to the beach. Interesting fact about the Roche Noire Beach – the beach is famed for its breathtaking volcanic rock formations along the coastline, enhancing the natural beauty of the surroundings with a unique touch.\n";
                        model.title2 = "";
                        model.text3 = "";
                        model.image2 = R.drawable.map_location; // Set the value for image2
                        model.text4 = "";
                        model.title3 = "";
                        model.text5 = "";
                        model.title4 = "";
                        model.text6 = "";
                        model.title5 = "";
                        model.text7 = "";
                        model.title6 = "";
                        model.text8 = "";
                        model.title7 = "";

                        model.image3 = R.drawable.map_location;

                        model.text9 = "";
                        model.title8 = "";
                        model.text10 = "";

                        model.image4 = R.drawable.map_location;

                        model.text11 = "";

                        model.image5 = R.drawable.map_location;

                        model.text12 = "";
                        Stash.put("model", model);
                        intent = new Intent(context, BeachDetails.class);
                        context.startActivity(intent);
                    }
                } else if (Stash.getString("type").equals("North")) {
                    if (position == 0) {
                        BeacModel model = new BeacModel();
                        model.main_image = R.drawable.la_preneuse_4; // Set the value for main_image
                        model.text1 = "";
                        model.title1 = "";
                        model.image1 = R.drawable.map_location; // Set the value for image1
                        model.text2 = "";
                        model.title2 = "";
                        model.text3 = "";
                        model.image2 = R.drawable.map_location; // Set the value for image2
                        model.text4 = "";
                        model.title3 = "";
                        model.text5 = "";
                        model.title4 = "";
                        model.text6 = "";
                        model.title5 = "";
                        model.text7 = "";
                        model.title6 = "";
                        model.text8 = "";
                        model.title7 = "";

                        model.image3 = R.drawable.map_location;

                        model.text9 = "";
                        model.title8 = "";
                        model.text10 = "";

                        model.image4 = R.drawable.map_location;

                        model.text11 = "";

                        model.image5 = R.drawable.map_location;

                        model.text12 = "";
                        Stash.put("model", model);
                        intent = new Intent(context, BeachDetails.class);
                        context.startActivity(intent);
                    } else if (position == 1) {
                        BeacModel model = new BeacModel();
                        model.main_image = R.drawable.la_preneuse_4; // Set the value for main_image

                        model.text1 = "";

                        model.title1 = "";

                        model.image1 = R.drawable.map_location; // Set the value for image1

                        model.text2 = "";
                        model.title2 = "";
                        model.text3 = "";

                        model.image2 = R.drawable.map_location; // Set the value for image2

                        model.text4 = "";
                        model.title3 = "";
                        model.text5 = "";
                        model.title4 = "";
                        model.text6 = "";
                        model.title5 = "";
                        model.text7 = "";
                        model.title6 = "";
                        model.text8 = "";
                        model.title7 = "";

                        model.image3 = R.drawable.map_location;

                        model.text9 = "";
                        model.title8 = "";
                        model.text10 = "";

                        model.image4 = R.drawable.map_location;

                        model.text11 = "";

                        model.image5 = R.drawable.map_location;

                        model.text12 = "";
                        Stash.put("model", model);
                        intent = new Intent(context, BeachDetails.class);
                        context.startActivity(intent);
                    } else if (position == 1) {
                        BeacModel model = new BeacModel();
                        model.main_image = R.drawable.la_preneuse_4; // Set the value for main_image

                        model.text1 = "";

                        model.title1 = "";

                        model.image1 = R.drawable.map_location; // Set the value for image1

                        model.text2 = "";
                        model.title2 = "";
                        model.text3 = "";

                        model.image2 = R.drawable.map_location; // Set the value for image2

                        model.text4 = "";
                        model.title3 = "";
                        model.text5 = "";
                        model.title4 = "";
                        model.text6 = "";
                        model.title5 = "";
                        model.text7 = "";
                        model.title6 = "";
                        model.text8 = "";
                        model.title7 = "";

                        model.image3 = R.drawable.map_location;

                        model.text9 = "";
                        model.title8 = "";
                        model.text10 = "";

                        model.image4 = R.drawable.map_location;

                        model.text11 = "";

                        model.image5 = R.drawable.map_location;

                        model.text12 = "";
                        Stash.put("model", model);
                        intent = new Intent(context, BeachDetails.class);
                        context.startActivity(intent);
                    } else if (position == 1) {
                        BeacModel model = new BeacModel();
                        model.main_image = R.drawable.la_preneuse_4; // Set the value for main_image

                        model.text1 = "";

                        model.title1 = "";

                        model.image1 = R.drawable.map_location; // Set the value for image1

                        model.text2 = "";
                        model.title2 = "";
                        model.text3 = "";

                        model.image2 = R.drawable.map_location; // Set the value for image2

                        model.text4 = "";
                        model.title3 = "";
                        model.text5 = "";
                        model.title4 = "";
                        model.text6 = "";
                        model.title5 = "";
                        model.text7 = "";
                        model.title6 = "";
                        model.text8 = "";
                        model.title7 = "";

                        model.image3 = R.drawable.map_location;

                        model.text9 = "";
                        model.title8 = "";
                        model.text10 = "";

                        model.image4 = R.drawable.map_location;

                        model.text11 = "";

                        model.image5 = R.drawable.map_location;

                        model.text12 = "";
                        Stash.put("model", model);
                        intent = new Intent(context, BeachDetails.class);
                        context.startActivity(intent);
                    } else if (position == 1) {
                        BeacModel model = new BeacModel();
                        model.main_image = R.drawable.la_preneuse_4; // Set the value for main_image

                        model.text1 = "";

                        model.title1 = "";

                        model.image1 = R.drawable.map_location; // Set the value for image1

                        model.text2 = "";
                        model.title2 = "";
                        model.text3 = "";

                        model.image2 = R.drawable.map_location; // Set the value for image2

                        model.text4 = "";
                        model.title3 = "";
                        model.text5 = "";
                        model.title4 = "";
                        model.text6 = "";
                        model.title5 = "";
                        model.text7 = "";
                        model.title6 = "";
                        model.text8 = "";
                        model.title7 = "";

                        model.image3 = R.drawable.map_location;

                        model.text9 = "";
                        model.title8 = "";
                        model.text10 = "";

                        model.image4 = R.drawable.map_location;

                        model.text11 = "";

                        model.image5 = R.drawable.map_location;

                        model.text12 = "";
                        Stash.put("model", model);
                        intent = new Intent(context, BeachDetails.class);
                        context.startActivity(intent);
                    } else if (position == 1) {
                        BeacModel model = new BeacModel();
                        model.main_image = R.drawable.la_preneuse_4; // Set the value for main_image

                        model.text1 = "";

                        model.title1 = "";

                        model.image1 = R.drawable.map_location; // Set the value for image1

                        model.text2 = "";
                        model.title2 = "";
                        model.text3 = "";

                        model.image2 = R.drawable.map_location; // Set the value for image2

                        model.text4 = "";
                        model.title3 = "";
                        model.text5 = "";
                        model.title4 = "";
                        model.text6 = "";
                        model.title5 = "";
                        model.text7 = "";
                        model.title6 = "";
                        model.text8 = "";
                        model.title7 = "";

                        model.image3 = R.drawable.map_location;

                        model.text9 = "";
                        model.title8 = "";
                        model.text10 = "";

                        model.image4 = R.drawable.map_location;

                        model.text11 = "";

                        model.image5 = R.drawable.map_location;

                        model.text12 = "";
                        Stash.put("model", model);
                        intent = new Intent(context, BeachDetails.class);
                        context.startActivity(intent);
                    } else if (position == 1) {
                        BeacModel model = new BeacModel();
                        model.main_image = R.drawable.la_preneuse_4; // Set the value for main_image

                        model.text1 = "";

                        model.title1 = "";

                        model.image1 = R.drawable.map_location; // Set the value for image1

                        model.text2 = "";
                        model.title2 = "";
                        model.text3 = "";

                        model.image2 = R.drawable.map_location; // Set the value for image2

                        model.text4 = "";
                        model.title3 = "";
                        model.text5 = "";
                        model.title4 = "";
                        model.text6 = "";
                        model.title5 = "";
                        model.text7 = "";
                        model.title6 = "";
                        model.text8 = "";
                        model.title7 = "";

                        model.image3 = R.drawable.map_location;

                        model.text9 = "";
                        model.title8 = "";
                        model.text10 = "";

                        model.image4 = R.drawable.map_location;

                        model.text11 = "";
                        model.image5 = R.drawable.map_location;
                        model.text12 = "";
                        Stash.put("model", model);
                        intent = new Intent(context, BeachDetails.class);
                        context.startActivity(intent);
                    } else if (position == 1) {
                        BeacModel model = new BeacModel();
                        model.main_image = R.drawable.la_preneuse_4; // Set the value for main_image

                        model.text1 = "";

                        model.title1 = "";

                        model.image1 = R.drawable.map_location; // Set the value for image1

                        model.text2 = "";
                        model.title2 = "";
                        model.text3 = "";

                        model.image2 = R.drawable.map_location; // Set the value for image2

                        model.text4 = "";
                        model.title3 = "";
                        model.text5 = "";
                        model.title4 = "";
                        model.text6 = "";
                        model.title5 = "";
                        model.text7 = "";
                        model.title6 = "";
                        model.text8 = "";
                        model.title7 = "";

                        model.image3 = R.drawable.map_location;

                        model.text9 = "";
                        model.title8 = "";
                        model.text10 = "";

                        model.image4 = R.drawable.map_location;

                        model.text11 = "";

                        model.image5 = R.drawable.map_location;

                        model.text12 = "";
                        Stash.put("model", model);
                        intent = new Intent(context, BeachDetails.class);
                        context.startActivity(intent);
                    }
                }

            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = null;
                if (Stash.getString("type").equals("West")) {
                    if (position == 0) {
                        BeacModel model = new BeacModel();
                        model.title = textView.getText().toString();
                        model.main_image = R.drawable.flic_en_flac_3; // Set the value for main_image

                        model.text1 = "Located on the west coast of Mauritius, Flic enFlac has emerged as the second most popular tourist area in the country, following Grand Baie.<br>" +
                                "Unlike the faster-paced development in the north, the west coast, including beautiful villages like Flic enFlac, has transformed from small fishing communities into charming towns, earning a reputation as a premier holiday destination.<br>" +
                                "Over the past two centuries, Flic enFlac has evolved from a humble fishing village into a prominent tourist hub. Today, it stands as a sought-after destination, attracting both international tourists and local Mauritians";
                        model.title1 = "";

                        model.image1 = R.drawable.flic_en_flac_1; // Set the value for image1

                        model.text2 = "Flic enFlac offers an ideal holiday experience with its excellent beaches, a variety of watersports, and a tranquil ambiance for complete relaxation. The location boasts a delightful setting with pristine white sand beaches and picturesque blue lagoons. Along the extensive 8 km beach, numerous restaurants, hotels, shops, and facilities cater to visitors.<br>" +
                                "The beach provides a perfect backdrop for activities such as afternoon strolls, watersports, sunbathing, or simply unwinding. It's an excellent spot for picnics, shaded by trees scattered along the coastline.<br>" +
                                "Flic enFlac's beach, adorned with Casuarina Trees, features a fine lagoon protected by a reef, ensuring safe swimming and opportunities for various watersports.<br>" +
                                "Flic-en-Flac buzzes with activity throughout the day and night, offering a dynamic atmosphere for visitors. In the daytime, guests can indulge in delectable street food options such as the \"DhalPuri,\" a thin, multi-layered flatbread crafted from flour, yellow split peas, salt, and water, filled with flavorful curry and sauces. Another popular local dish is fried noodles paired with Mauritian meatballs, enjoyed by both locals and visitors. However, it's crucial for those unfamiliar with the local water and cuisine to exercise extreme caution to prevent any potential food-related illnesses or stomach discomfort.<br> During the weekends, the beach becomes a vibrant hub for locals spending quality time with family and friends. Entertainment unfolds as some locals engage in singing and dancing to the rhythmic beats of Sega music, typically played with guitars and \"ravannes\" — a percussion instrument resembling the \"Bodhrán\" but played with distinctive techniques using hands.<br>" +
                                "The nightlife in Flic-en-Flac is lively, attracting both locals and tourists to nightclubs and restaurants, fostering a lively atmosphere for socializing. Despite its diverse offerings, it's important to note that the otherwise beautiful white sandy beach does contain a considerable amount of corals and sea urchins.";
                        model.title2 = "Flic enFlac - Location";
                        model.text3 = "Situated in the Black River district on the island's western coast, approximately 15 km south of the capital, Port Louis, Flic enFlac lies between the villages of Albion to the north and Tamarin and Black River to the south. The west coastline, lined with hotels and villas providing direct beach access, characterizes Flic enFlac. The drive to Port Louis takes around 30 minutes, while reaching the airport takes approximately 1 hour.<br>" +
                                "Flic enFlac benefits from a well-established bus route, facilitating easy transportation to key locations across Mauritius. Buses connect to Port Louis and other cities like Quatre Bornes and Curepipe, offering convenient access to various parts of the island.";

                        model.image2 = R.drawable.map_location; // Set the value for image2

                        model.text4 = "";
                        model.title3 = "";
                        model.text5 = "";
                        model.title4 = "";
                        model.text6 = "";
                        model.title5 = "";
                        model.text7 = "";
                        model.title6 = "";
                        model.text8 = "";
                        model.title7 = "";

                        model.image3 = R.drawable.map_location;

                        model.text9 = "";
                        model.title8 = "";
                        model.text10 = "";

                        model.image4 = R.drawable.map_location;

                        model.text11 = "";

                        model.image5 = R.drawable.map_location;

                        model.text12 = "";
                        com.moutimid.sqlapp.model.DatabaseHelper databaseHelper = new com.moutimid.sqlapp.model.DatabaseHelper(context);
                        databaseHelper.insertBeacModel(model);
                        add.setImageResource(R.drawable.outline_do_not_disturb_on_24);
                    } else if (position == 1) {
                        BeacModel model = new BeacModel();
                        model.title = textView.getText().toString();

                        model.main_image = R.drawable.la_preneuse_4; // Set the value for main_image

                        model.text1 = "The shoreline is adorned with pristine, snow-white sand, featuring a gentle slope and shallow waters. The ocean remains tranquil, displaying a captivating turquoise hue, although intermittent strong currents can be experienced. La Preneuse Beach boasts a spacious and expansive setting, providing ample room for all vacationers. The panoramic view from the coast reveals the towering Mount Le Morne against the backdrop of the turquoise lagoon.<br>" +
                                "Situated on the west coast of Mauritius, the beach offers a range of hotels catering to different comfort levels for tourists. Cafes, stores, and souvenir shops offering diverse goods are conveniently located near the shoreline. A notable attraction is the Martello Tower, erected by the British in the 1830s as a defense against the French fleet. It now serves as a museum housing information about the region's history and the initial planters. The renowned Black River, a freshwater river, flows along the beach. Yachts and boats gracefully navigate the open sea, providing opportunities for sea excursions.";
                        model.title1 = "";

                        model.image1 = R.drawable.map_location; // Set the value for image1

                        model.text2 = "";
                        model.title2 = "";
                        model.text3 = "";

                        model.image2 = R.drawable.map_location; // Set the value for image2

                        model.text4 = "";
                        model.title3 = "";
                        model.text5 = "";
                        model.title4 = "";
                        model.text6 = "";
                        model.title5 = "";
                        model.text7 = "";
                        model.title6 = "";
                        model.text8 = "";
                        model.title7 = "";

                        model.image3 = R.drawable.map_location;

                        model.text9 = "";
                        model.title8 = "";
                        model.text10 = "";

                        model.image4 = R.drawable.map_location;

                        model.text11 = "";

                        model.image5 = R.drawable.map_location;

                        model.text12 = "";
                        Stash.put("model", model);
                        intent = new Intent(context, BeachDetails.class);
                        context.startActivity(intent);
                    } else if (position == 2) {
                        BeacModel model = new BeacModel();
                        model.title = textView.getText().toString();

                        model.main_image = R.drawable.le_morne_beach_2; // Set the value for main_image

                        model.text1 = "Nestled on a peninsula along the western coast of Mauritius, at the base of the UNESCO-listed Morne Brabant mountain, lies Le Morne Beach. Easily accessible from the coastal road, this public beach boasts miles of pristine white sand and is adorned with majestic casuarina trees, all against the backdrop of the crystal-clear waters providing excellent visibility for scuba diving.";
                        model.title1 = "";

                        model.image1 = R.drawable.kite_surfing; // Set the value for image1

                        model.text2 = "Renowned as one of the premier kite-surfing spots in Mauritius, and often regarded as one of the best in the world, Le Morne Beach offers a breathtaking setting with its iconic mountain in the background. The beach is a favorite among windsurfers and kite surfers, as the conditions for these water sports are ideal throughout much of the year. The annual Kiteival, attracting international participants, is among the many competitions hosted at this spectacular location.<br>" +
                                "While Le Morne Beach remains a delightful spot for swimming, it can get quite busy on weekends and holidays. Nudism is prohibited, although topless sunbathing is accepted. For a more tranquil experience, the best times to visit the beach are early in the morning from 8:00 to 11:00 or in the afternoon from 13:00 to 17:00.<br> ";
                        model.title2 = "";
                        model.text3 = "";

                        model.image2 = R.drawable.paddle_boarding; // Set the value for image2

                        model.text4 = "An array of activities awaits beachgoers, including pedalo rides, windsurfing, kite surfing, scuba diving, stand-up paddleboarding, and kayaking, ensuring there's something for everyone to enjoy at Le Morne Beach. ";
                        model.title3 = "";
                        model.text5 = "";
                        model.title4 = "";
                        model.text6 = "";
                        model.title5 = "";
                        model.text7 = "";
                        model.title6 = "";
                        model.text8 = "";
                        model.title7 = "";

                        model.image3 = R.drawable.map_location;

                        model.text9 = "";
                        model.title8 = "";
                        model.text10 = "";

                        model.image4 = R.drawable.map_location;

                        model.text11 = "";

                        model.image5 = R.drawable.map_location;

                        model.text12 = "";
                        Stash.put("model", model);
                        intent = new Intent(context, BeachDetails.class);
                        context.startActivity(intent);
                    } else if (position == 3) {

                        BeacModel model = new BeacModel();
                        model.title = textView.getText().toString();

                        model.main_image = R.drawable.la_preneuse_4; // Set the value for main_image
                        model.text1 = "The shoreline is adorned with pristine, snow-white sand, featuring a gentle slope and shallow waters. The ocean remains tranquil, displaying a captivating turquoise hue, although intermittent strong currents can be experienced. La Preneuse Beach boasts a spacious and expansive setting, providing ample room for all vacationers. The panoramic view from the coast reveals the towering Mount Le Morne against the backdrop of the turquoise lagoon.<br>" +
                                "Situated on the west coast of Mauritius, the beach offers a range of hotels catering to different comfort levels for tourists. Cafes, stores, and souvenir shops offering diverse goods are conveniently located near the shoreline. A notable attraction is the Martello Tower, erected by the British in the 1830s as a defense against the French fleet. It now serves as a museum housing information about the region's history and the initial planters. The renowned Black River, a freshwater river, flows along the beach. Yachts and boats gracefully navigate the open sea, providing opportunities for sea excursions.";
                        model.title1 = "";
                        model.image1 = R.drawable.map_location; // Set the value for image1
                        model.text2 = "";
                        model.title2 = "";
                        model.text3 = "";

                        model.image2 = R.drawable.map_location; // Set the value for image2

                        model.text4 = "";
                        model.title3 = "";
                        model.text5 = "";
                        model.title4 = "";
                        model.text6 = "";
                        model.title5 = "";
                        model.text7 = "";
                        model.title6 = "";
                        model.text8 = "";
                        model.title7 = "";

                        model.image3 = R.drawable.map_location;

                        model.text9 = "";
                        model.title8 = "";
                        model.text10 = "";

                        model.image4 = R.drawable.map_location;

                        model.text11 = "";

                        model.image5 = R.drawable.map_location;

                        model.text12 = "";
                        Stash.put("model", model);
                        intent = new Intent(context, BeachDetails.class);
                        context.startActivity(intent);
                    }

                } else if (Stash.getString("type").equals("East")) {
                    if (position == 0) {
                        BeacModel model = new BeacModel();
                        model.title = textView.getText().toString();
                        model.main_image = R.drawable.belle_mare_1; // Set the value for main_image

                        model.text1 = "The Belle Mare Beach is located near the town of Mahebourg on the Southeast coast of Mauritius, spanning between the villages Belle Mare and Pointe de Flacq. Sheltered from the big waves by the coral reef, this crescent-shaped beach has a parking area and a shaded rest area under the filaos trees. It is quite wide with parts of fine, dazzling white sand. The water is transparent and calm, and the lagoon has a most magnificent turquoise blue color. In this realm, unspoiled nature prevails, with minimal development except for a few scattering hotels and exclusive villas.";
                        model.title1 = "";

                        model.image1 = R.drawable.belle_mare_3; // Set the value for image1

                        model.text2 = "Renowned among holidaymakers as the epitome of beauty, the Belle Mare Beach is cherished not only by visitors but also by the island's residents who frequent the beach, particularly on weekends and holidays. This enclave retains an authentic charm, preserving the island's essence amidst the rapid development witnessed by other coastal cities, notably Grand Bay, Flic enFlac, and Black River.\n" +
                                "\n";
                        model.title2 = "";
                        model.text3 = "The Belle Mare Beach is an idyllic destination for swimming and diving, particularly on weekdays when the serene ambiance prevails. It offers an ideal retreat for nature enthusiasts, allowing them to relish miles of sandy expanse for sunbathing.\n" +
                                "The optimal times to visit the Belle Mare Beach are during the early morning hours from 7:00 to 11:00 or in the afternoon from 13:00 to 17:00.\n" +
                                "Engage in an array of activities at Belle Mare Beach, including pedalo rides, windsurfing, catamaran journeys, horseback riding, parasailing, scuba diving, speed boat excursions, and kayaking.\n";
                        model.image2 = R.drawable.map_location; // Set the value for image2

                        model.text4 = "";
                        model.title3 = "";
                        model.text5 = "";
                        model.title4 = "";
                        model.text6 = "";
                        model.title5 = "";
                        model.text7 = "";
                        model.title6 = "";
                        model.text8 = "";
                        model.title7 = "";

                        model.image3 = R.drawable.map_location;

                        model.text9 = "";
                        model.title8 = "";
                        model.text10 = "";

                        model.image4 = R.drawable.map_location;

                        model.text11 = "";

                        model.image5 = R.drawable.map_location;

                        model.text12 = "";
                        Stash.put("model", model);
                        intent = new Intent(context, BeachDetails.class);
                        context.startActivity(intent);
                    } else if (position == 1) {
                        BeacModel model = new BeacModel();
                        model.title = textView.getText().toString();

                        model.main_image = R.drawable.ile_aux_cerfs_mauritius_1; // Set the value for main_image

                        model.text1 = "On the eastern coast of Mauritius, just south of Trou d’Eau Douce, lies a pair of islands known collectively as Ile aux Cerfs. Ile aux Cerfs is a genuine paradise spanning 87 hectares. It is particularly appealing to water sports enthusiasts andis one of the most stunning beaches in Mauritius.";
                        model.title1 = "What to Explore and Experience on Ile aux Cerfs";

                        model.image1 = R.drawable.ile_aux_cerfs_7; // Set the value for image1

                        model.text2 = "The island is celebrated for its picturesque turquoise lagoon, perfectly suited for an extensive array of water sports. Among the activities available, whether undertaken solo or with a companion, is parasailing—an endeavor worth adding to your bucket list, particularly for the breathtaking vistas of the lagoon.\n" +
                                "Other activities include speedboat rides, water skiing, and paddleboarding. Snorkeling is also an option, although, you'll need to take a boat to a location where there is coral as the water near the beach is shallow and consists predominantly of sand\n";
                        model.title2 = "";
                        model.text3 = "";

                        model.image2 = R.drawable.ile_aux_cerfs_5_1; // Set the value for image2

                        model.text4 = "While many visitors come to the Ile aux Cerfs for leisurely water activities, true sun worshippers find their sanctuary here, especially given the limited shelter on the beach. The overarching advice is to liberally apply sunscreen, preferably opting for products that are environmentally friendly. ";
                        model.title3 = "";
                        model.text5 = " close proximity to the pier, where the shuttle from Pointe Maurice drops them off. If you wish to evade the crowds, particularly on weekends, consider strolling a bit farther along the coast. Numerous other nearby beaches offer equally tranquil surroundings.";
                        model.title4 = "How to Reach Ile aux Cerfs";
                        model.text6 = "";
                        model.title5 = "";
                        model.text7 = "";
                        model.title6 = "";
                        model.text8 = "";
                        model.title7 = "";

                        model.image3 = R.drawable.ile_aux_cerfs_7;

                        model.text9 = "Access to the island is granted to the public from 9:00 a.m. to 6:00 p.m. Starting from the village of Trou-d’Eau Douce, a shuttle embarks every half hour from the pier at Pointe Maurice to the Masala pier on Ile aux Cerfs, at 9:30 a.m.\n" +
                                "An alternative approach is by catamaran, with numerous providers offering scenic journeys to the island, sometimes incorporating detours to or from the waterfalls in the nature reserve of Grande Rivière Sud Est.\n";
                        model.title8 = "Optimal Time to Explore the Island ";
                        model.text10 = "";

                        model.image4 = R.drawable.ile_aux_cerfs_6;

                        model.text11 = "The island tends to attract a considerable influx of day trippers during weekends. If your stay in Mauritius extends to at least a week, it is advisable to plan your visit on a weekday. While October and November are considered the prime months to experience Ile aux Cerfs, the period from June to November also offers a delightful visit.\n" +
                                "<b>Accommodation</b> \n" +
                                "Noteworthy among the accommodations on Ile aux Cerfs is the opulent 5-star Shangri-La’s Le Touessrok Resort & Spa. While not budget-friendly, it provides an exceptional setting for grand celebrations. \n" +
                                "<b>Culinary Offerings</b>\n";
                        model.image5 = R.drawable.ile_aux_cerfs_3;
                        model.text12 = "Ile aux Cerfshas several dining establishments, including a charming beachside restaurant. Additionally, two bars are available for visitors seeking refreshing beverages or cocktails at reasonable prices. An alternative is to bring ample food and drinks to suit your preferences.";
                        Stash.put("model", model);
                        intent = new Intent(context, BeachDetails.class);
                        context.startActivity(intent);
                    } else if (position == 2) {
                        BeacModel model = new BeacModel();
                        model.title = textView.getText().toString();

                        model.main_image = R.drawable.poste_lafayette_1; // Set the value for main_image

                        model.text1 = "This unspoiled beach, often overlooked due to its turbulent sea, offers a rare opportunity to embrace tranquility and serenity. With its authentically rustic and untouched nature, this charming locale continually captivates nature enthusiasts. The preserved green habitat is a sanctuary for massive coral reefs, fostering rich marine biodiversity and mangroves.";
                        model.title1 = "";

                        model.image1 = R.drawable.poste_lafayette_2; // Set the value for image1

                        model.text2 = "Those seeking a peaceful picnic will be pleased that the southern part of the beach provides a serene retreat. Additionally, the southern beach serves as an ideal starting point for a trek leading north of Poste Lafayette, offering picturesque green landscapes along the rocky trail.";
                        model.title2 = "";
                        model.text3 = "Picnicking in the shelter of the trees is a delightful option in certain areas where the sea displays stormy waves due to the proximity of the reefs to the lagoons. Enthusiasts of kite surfing and windsurfing will find this place ideal since Poste Lafayette is consistently exposed to the trade winds throughout ";

                        model.image2 = R.drawable.paddle_boarding; // Set the value for image2

                        model.text4 = "An array of activities awaits beachgoers, including pedalo rides, windsurfing, kite surfing, scuba diving, stand-up paddleboarding, and kayaking, ensuring there's something for everyone to enjoy at Le Morne Beach. ";
                        model.title3 = "";
                        model.text5 = "";
                        model.title4 = "";
                        model.text6 = "";
                        model.title5 = "";
                        model.text7 = "";
                        model.title6 = "";
                        model.text8 = "";
                        model.title7 = "";

                        model.image3 = R.drawable.poste_lafayette_4;

                        model.text9 = "While the sea may be too challenging for a Sunday swim, the shore or shallow waters provide opportunities for sunbathing while children can revel in building sandcastles";
                        model.title8 = "";
                        model.text10 = "The eastern coast boasts prominent hotels and restaurants, including establishments like Jalsa Beach Hotel & Spa, Radisson Blu Poste Lafayette Resort & Spa, and the esteemed Hôtel Constance Le Prince Maurice. \n" +
                                "To cater to the discerning tourist, gourmet restaurants have thrived alongside small traditional eateries. La Maison D’Été, specializing in Italian cuisine with seafood and fish menus, is a must-visit in Poste Lafayette. Another favored dining spot, Seabell, offers a menu featuring typical Mauritian dishes, complemented by a nearby mini market owned by the Seabell owners.\n" +
                                "\n";

                        model.image4 = R.drawable.map_location;

                        model.text11 = "";

                        model.image5 = R.drawable.map_location;

                        model.text12 = "";
                        Stash.put("model", model);
                        intent = new Intent(context, BeachDetails.class);
                        context.startActivity(intent);
                    } else if (position == 3) {

                        BeacModel model = new BeacModel();
                        model.title = textView.getText().toString();

                        model.main_image = R.drawable.roche_noire_2; // Set the value for main_image
                        model.text1 = "Ranked among the top 10 beaches in Mauritius, the Roche Noire Beach is located just a few kilometers from Poste Lafayette on the southeast coast of the island. The beach has a stunning landscape characterized by black lava rocks and a dark sea, where gentle waves crash onto the nearby coral reef. The pristine sand and the spectacular views of sunrise and sunset contribute to making Roche Noire Beach an unparalleled destination. The winds throughout the year provide a refreshing breeze, especially during the hot summer months. It is one of the most photographed beaches according to tourist reviews.";
                        model.title1 = "";
                        model.image1 = R.drawable.roche_noire_3; // Set the value for image1
                        model.text2 = "The Roche Noire Beach is a true paradise for those who love water activities and appreciate nature. Guests can partake in a range of aquatic adventures, including swimming, snorkeling, and kayaking, allowing them to discover the diverse marine life and colorful coral reefs. Furthermore, the tranquil ambiance of the beach creates an ideal setting for a leisurely walk or a peaceful sunbathing experience. \n" +
                                "Parking facilities are commonly accessible in the vicinity of the Roche Noire Beach, offering travelers a choice between free and paid parking options for easy access to the beach. Interesting fact about the Roche Noire Beach – the beach is famed for its breathtaking volcanic rock formations along the coastline, enhancing the natural beauty of the surroundings with a unique touch.\n";
                        model.title2 = "";
                        model.text3 = "";
                        model.image2 = R.drawable.map_location; // Set the value for image2
                        model.text4 = "";
                        model.title3 = "";
                        model.text5 = "";
                        model.title4 = "";
                        model.text6 = "";
                        model.title5 = "";
                        model.text7 = "";
                        model.title6 = "";
                        model.text8 = "";
                        model.title7 = "";

                        model.image3 = R.drawable.map_location;

                        model.text9 = "";
                        model.title8 = "";
                        model.text10 = "";

                        model.image4 = R.drawable.map_location;

                        model.text11 = "";

                        model.image5 = R.drawable.map_location;

                        model.text12 = "";
                        Stash.put("model", model);
                        intent = new Intent(context, BeachDetails.class);
                        context.startActivity(intent);
                    }
                } else if (Stash.getString("type").equals("North")) {
                    if (position == 0) {
                        BeacModel model = new BeacModel();
                        model.main_image = R.drawable.la_preneuse_4; // Set the value for main_image
                        model.text1 = "";
                        model.title1 = "";
                        model.image1 = R.drawable.map_location; // Set the value for image1
                        model.text2 = "";
                        model.title2 = "";
                        model.text3 = "";
                        model.image2 = R.drawable.map_location; // Set the value for image2
                        model.text4 = "";
                        model.title3 = "";
                        model.text5 = "";
                        model.title4 = "";
                        model.text6 = "";
                        model.title5 = "";
                        model.text7 = "";
                        model.title6 = "";
                        model.text8 = "";
                        model.title7 = "";

                        model.image3 = R.drawable.map_location;

                        model.text9 = "";
                        model.title8 = "";
                        model.text10 = "";

                        model.image4 = R.drawable.map_location;

                        model.text11 = "";

                        model.image5 = R.drawable.map_location;

                        model.text12 = "";
                        Stash.put("model", model);
                        intent = new Intent(context, BeachDetails.class);
                        context.startActivity(intent);
                    } else if (position == 1) {
                        BeacModel model = new BeacModel();
                        model.main_image = R.drawable.la_preneuse_4; // Set the value for main_image

                        model.text1 = "";

                        model.title1 = "";

                        model.image1 = R.drawable.map_location; // Set the value for image1

                        model.text2 = "";
                        model.title2 = "";
                        model.text3 = "";

                        model.image2 = R.drawable.map_location; // Set the value for image2

                        model.text4 = "";
                        model.title3 = "";
                        model.text5 = "";
                        model.title4 = "";
                        model.text6 = "";
                        model.title5 = "";
                        model.text7 = "";
                        model.title6 = "";
                        model.text8 = "";
                        model.title7 = "";

                        model.image3 = R.drawable.map_location;

                        model.text9 = "";
                        model.title8 = "";
                        model.text10 = "";

                        model.image4 = R.drawable.map_location;

                        model.text11 = "";

                        model.image5 = R.drawable.map_location;

                        model.text12 = "";
                        Stash.put("model", model);
                        intent = new Intent(context, BeachDetails.class);
                        context.startActivity(intent);
                    } else if (position == 1) {
                        BeacModel model = new BeacModel();
                        model.main_image = R.drawable.la_preneuse_4; // Set the value for main_image

                        model.text1 = "";

                        model.title1 = "";

                        model.image1 = R.drawable.map_location; // Set the value for image1

                        model.text2 = "";
                        model.title2 = "";
                        model.text3 = "";

                        model.image2 = R.drawable.map_location; // Set the value for image2

                        model.text4 = "";
                        model.title3 = "";
                        model.text5 = "";
                        model.title4 = "";
                        model.text6 = "";
                        model.title5 = "";
                        model.text7 = "";
                        model.title6 = "";
                        model.text8 = "";
                        model.title7 = "";

                        model.image3 = R.drawable.map_location;

                        model.text9 = "";
                        model.title8 = "";
                        model.text10 = "";

                        model.image4 = R.drawable.map_location;

                        model.text11 = "";

                        model.image5 = R.drawable.map_location;

                        model.text12 = "";
                        Stash.put("model", model);
                        intent = new Intent(context, BeachDetails.class);
                        context.startActivity(intent);
                    } else if (position == 1) {
                        BeacModel model = new BeacModel();
                        model.main_image = R.drawable.la_preneuse_4; // Set the value for main_image

                        model.text1 = "";

                        model.title1 = "";

                        model.image1 = R.drawable.map_location; // Set the value for image1

                        model.text2 = "";
                        model.title2 = "";
                        model.text3 = "";

                        model.image2 = R.drawable.map_location; // Set the value for image2

                        model.text4 = "";
                        model.title3 = "";
                        model.text5 = "";
                        model.title4 = "";
                        model.text6 = "";
                        model.title5 = "";
                        model.text7 = "";
                        model.title6 = "";
                        model.text8 = "";
                        model.title7 = "";

                        model.image3 = R.drawable.map_location;

                        model.text9 = "";
                        model.title8 = "";
                        model.text10 = "";

                        model.image4 = R.drawable.map_location;

                        model.text11 = "";

                        model.image5 = R.drawable.map_location;

                        model.text12 = "";
                        Stash.put("model", model);
                        intent = new Intent(context, BeachDetails.class);
                        context.startActivity(intent);
                    } else if (position == 1) {
                        BeacModel model = new BeacModel();
                        model.main_image = R.drawable.la_preneuse_4; // Set the value for main_image

                        model.text1 = "";

                        model.title1 = "";

                        model.image1 = R.drawable.map_location; // Set the value for image1

                        model.text2 = "";
                        model.title2 = "";
                        model.text3 = "";

                        model.image2 = R.drawable.map_location; // Set the value for image2

                        model.text4 = "";
                        model.title3 = "";
                        model.text5 = "";
                        model.title4 = "";
                        model.text6 = "";
                        model.title5 = "";
                        model.text7 = "";
                        model.title6 = "";
                        model.text8 = "";
                        model.title7 = "";

                        model.image3 = R.drawable.map_location;

                        model.text9 = "";
                        model.title8 = "";
                        model.text10 = "";

                        model.image4 = R.drawable.map_location;

                        model.text11 = "";

                        model.image5 = R.drawable.map_location;

                        model.text12 = "";
                        Stash.put("model", model);
                        intent = new Intent(context, BeachDetails.class);
                        context.startActivity(intent);
                    } else if (position == 1) {
                        BeacModel model = new BeacModel();
                        model.main_image = R.drawable.la_preneuse_4; // Set the value for main_image

                        model.text1 = "";

                        model.title1 = "";

                        model.image1 = R.drawable.map_location; // Set the value for image1

                        model.text2 = "";
                        model.title2 = "";
                        model.text3 = "";

                        model.image2 = R.drawable.map_location; // Set the value for image2

                        model.text4 = "";
                        model.title3 = "";
                        model.text5 = "";
                        model.title4 = "";
                        model.text6 = "";
                        model.title5 = "";
                        model.text7 = "";
                        model.title6 = "";
                        model.text8 = "";
                        model.title7 = "";

                        model.image3 = R.drawable.map_location;

                        model.text9 = "";
                        model.title8 = "";
                        model.text10 = "";

                        model.image4 = R.drawable.map_location;

                        model.text11 = "";

                        model.image5 = R.drawable.map_location;

                        model.text12 = "";
                        Stash.put("model", model);
                        intent = new Intent(context, BeachDetails.class);
                        context.startActivity(intent);
                    } else if (position == 1) {
                        BeacModel model = new BeacModel();
                        model.main_image = R.drawable.la_preneuse_4; // Set the value for main_image

                        model.text1 = "";

                        model.title1 = "";

                        model.image1 = R.drawable.map_location; // Set the value for image1

                        model.text2 = "";
                        model.title2 = "";
                        model.text3 = "";

                        model.image2 = R.drawable.map_location; // Set the value for image2

                        model.text4 = "";
                        model.title3 = "";
                        model.text5 = "";
                        model.title4 = "";
                        model.text6 = "";
                        model.title5 = "";
                        model.text7 = "";
                        model.title6 = "";
                        model.text8 = "";
                        model.title7 = "";

                        model.image3 = R.drawable.map_location;

                        model.text9 = "";
                        model.title8 = "";
                        model.text10 = "";

                        model.image4 = R.drawable.map_location;

                        model.text11 = "";
                        model.image5 = R.drawable.map_location;
                        model.text12 = "";
                        Stash.put("model", model);
                        intent = new Intent(context, BeachDetails.class);
                        context.startActivity(intent);
                    } else if (position == 1) {
                        BeacModel model = new BeacModel();
                        model.main_image = R.drawable.la_preneuse_4; // Set the value for main_image

                        model.text1 = "";

                        model.title1 = "";

                        model.image1 = R.drawable.map_location; // Set the value for image1

                        model.text2 = "";
                        model.title2 = "";
                        model.text3 = "";

                        model.image2 = R.drawable.map_location; // Set the value for image2

                        model.text4 = "";
                        model.title3 = "";
                        model.text5 = "";
                        model.title4 = "";
                        model.text6 = "";
                        model.title5 = "";
                        model.text7 = "";
                        model.title6 = "";
                        model.text8 = "";
                        model.title7 = "";

                        model.image3 = R.drawable.map_location;

                        model.text9 = "";
                        model.title8 = "";
                        model.text10 = "";

                        model.image4 = R.drawable.map_location;

                        model.text11 = "";

                        model.image5 = R.drawable.map_location;

                        model.text12 = "";
                        Stash.put("model", model);
                        intent = new Intent(context, BeachDetails.class);
                        context.startActivity(intent);
                    }
                }

            }
        });

        return itemView;
    }


}
