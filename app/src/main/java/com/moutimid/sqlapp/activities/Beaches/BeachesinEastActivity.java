package com.moutimid.sqlapp.activities.Beaches;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;
import android.widget.PopupMenu;

import androidx.appcompat.app.AppCompatActivity;

import com.moutimid.sqlapp.R;
import com.moutimid.sqlapp.activities.DashboardActivity;
import com.moutimid.sqlapp.adapter.BeachessAdapter;

public class BeachesinEastActivity extends AppCompatActivity {
    private String[] itemTexts = {"District of Flacq ", "District of Flacq", "District of Flacq", "District of Riviere du Rempart"};
    private String[] itemDetails = {"Beavers Bend State Park is located in the mountainous region of southeast Oklahoma along the shores of Broken Bow Lake and the Mountain Fork River. Guests traveling down the winding roads through the forests of pine and hardwood trees will find adventure, beautiful scenery and plenty of activities inside this state park. The scenic beauty of Beavers Bend State Park makes it one of Oklahoma's most popular areas.\n" +
            "Towering timbers, crystal clear waters and rugged terrain make this state park an outdoor lover's paradise. Visitors to Beavers Bend State Park will enjoy hiking, biking, boating, fishing, water skiing, nature center activities, river float trips, canoeing, horseback riding and much more. Trout streams are stocked year-round and the park features two catch-and-release trophy areas. Escape into the serenity of nature and follow the Mountain Fork River as it flows from the base of Broken Bow Lake through the park below. This area provides visitors with spectacular views, as well as excellent canoeing and fishing opportunities.\n" +
            "Nestled among the trees and alongside the Mountain Fork River are rustic and modern cabins, RV sites and tent campsites, as well as two group camps. Two yurts named \"Happy Hearth\" and \"Bear Tracks\" are also available for overnight lodging. These round, tent-like structures are located right near the Mountain Fork River. This 3,482-acre park offers 47 cabins with kitchenettes, plus 393 campsites and over 50 tent sites spread over eight camping areas. All RV and tent sites are available for online reservations. Waste dump stations are available. Leashed pets are welcome in the park and there are cabins with one and two bedrooms that allow pets for a small nightly fee.\n" +
            "Beavers Bend State Park also offers the Beavers Bend Lodge, situated along the shores of Broken Bow Lake. Every room within the lodge features amazing views of the water. The lodge offers four suites, a great room with a stone fireplace and a conference room. Guests at the lodge are served free continental breakfast in the great room each morning. The lodge can be contacted at the phone number above, by calling toll-free at 800-435-5514, via fax at 580-494-6177 or through email at lview@travelok.com.\n" +
            "Play a round of golf at the 18-hole Cedar Creek Golf Course, explore nature from the 26-mile David Boren hiking trail or enjoy water recreation along 180 miles of pine-studded shoreline and 14,220 surface acres of lake. Broken Bow Lake offers plenty of coves and clear water perfect for fishing, boating and scuba diving. The golf course can be contacted at the number above.\n" +
            "Other activities available include tennis, volleyball and mini-golf. Picnic areas are also scattered throughout the area. An amphitheater, gift shop, grocery, restaurant and the Forest Heritage Center can also be found within Beavers Bend State Park.\n", "With formal paths and walkways, the Will Rogers Gardens transport visitors to a gentler time without leaving Oklahoma City limits. Originally built in the 1920s, the Ed Lycan Conservatory holds one of the state's largest collections of cacti and succulents. It also serves as a scenic rental venue for weddings and special events.\n" +
            "\n" +
            "Within the Charles E. Sparks Color Garden walls, visitors are surrounded by thousands of annuals and perennial plantings, which often serve as a demonstration to homeowners. The Margaret Annis Boys Arboretum features both native trees and special varieties rarely found in Oklahoma. Visitors can even sign up for a gardening, exploration or tree planting classes offered for a fee at the Will Rogers Garden Exhibition Center.\n" +
            "\n" +
            "Adjacent to the Gardens, the OKC Tennis Center features 24 lighted outdoor courts and a full service pro shop. For outdoor family fun, a Family Aquatic Center, playground and 18-hole disc golf course will fit the bill. The park also features picnic tables and grills, group picnic shelters, a duck pond, an outdoor amphitheater and a Senior Citizens Center. Admission is free to horticultural gardens and disc golf. Moderate fees may apply for tennis and swimming.\n", "Test 1.\n", "Test 2.\n"};
    private String[] itemName = {"Belle Mare Beach", "Ile aux Cerfs Beach", "Poste Lafayette Beach", "Roche Noire Beach"};
    private String[] itemName1 = {"Belle Mare", "Ile aux Cerfs", "Poste Lafayette", "Roche Noire"};
    private int[] itemImages = {R.drawable.belle_mare_1, R.drawable.ile_aux_cerfs_mauritius_1, R.drawable.poste_lafayette_1, R.drawable.roche_noire_2};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beaches_in_east);
        ListView listView = findViewById(R.id.listView);
        BeachessAdapter adapter = new BeachessAdapter(this, itemName, itemName1, itemTexts, itemImages);
        listView.setAdapter(adapter);
    }

    public void menu(View view) {
        PopupMenu popupMenu = new PopupMenu(this, view);
        popupMenu.getMenuInflater().inflate(R.menu.menu, popupMenu.getMenu());

        // Optional: Set a listener to respond to menu item clicks
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                if ((item.getItemId() == R.id.menu_item_1)) {
                    startActivity(new Intent(BeachesinEastActivity.this, DashboardActivity.class));
                    finishAffinity();
                }
                return true;
            }
        });
        popupMenu.show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        ListView listView = findViewById(R.id.listView);
        BeachessAdapter adapter = new BeachessAdapter(this, itemName, itemName1, itemTexts, itemImages);
        listView.setAdapter(adapter);

    }
    public void BackPress(View view) {
        onBackPressed();
    }


}