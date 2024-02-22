package com.moutimid.sqlapp.activities.Beaches;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.moutimid.sqlapp.R;

public class ItinerariesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_itineraries);
        String title_header = "Beaches in the West";
        String title = "West";
        String[] itemTextsDay1 = {"Le Caudan Waterfront", "Aapravasi Ghat", "Port Louis Central Market", "Marie Reine de la Paix Chapel", "Fort Adelaide", "Le Morne Beach", "Le Morne Brabant", "Maconde Viewpoint", "ChamarelSeven Coloured Earth", "Chamarel Waterfalls", "", "", "", "", "", "", "", "", "", "", "", ""};
        String[] itemDetailsDay1 = {"Flic enFlac Public Beach", "La Preneuse Public Beach", "Le Morne Public Beach", "Tamarin Bay Beach"};
        String[] itemTypeDay1 = {"District of Black River", "District of Black River", "District of Black River", "District of Black River"};

    }
}