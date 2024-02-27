package com.moutimid.sqlapp.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import com.moutimid.sqlapp.R;
import com.moutimid.sqlapp.adapter.ItenerariesAdapter;

public class Day2Fragments extends Fragment {
    private int position;

    public Day2Fragments(int position) {
        this.position = position;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_day_fragments, container, false);

        String[] itemTexts;
        String[] itemName1;
        String[] itemName;
        int[] itemImages;
        switch (position) {
            case 11:
                itemTexts = new String[]{"SSR Botanical Garden", "L’Aventure du Sucre", "LeCaudan Waterfront", "Aapravasi Ghat", "Blue Penny Museum", "Black River Gorges", "Chamarel Seven Coloured Earth"};
                itemName = new String[]{"Admission Entrance Fee", "Admission Entrance Fee", "Admission Free", "Admission Entrance Fee", "Admission Entrance Fee", "Admission Free", "Admission Entrance Fee"};
                itemName1 = new String[]{"North • 2 hours", "North • 2 hours", "North • 2 hours", "North • 1 hours", "North • 1 hour", "Southwest • 30 minutes", "Southwest • 1 hour 30 minutes"};
                itemImages = new int[]{R.drawable.pamplemousse_garden, R.drawable.sugar_museum_pamplemousses, R.drawable.port_louis_3, R.drawable.aapravasi_ghat_1, R.drawable.blue_penny_museum_2, R.drawable.black_river_georges_2, R.drawable.chamarel_2};
                break;
            case 12:
                itemTexts = new String[]{"Trou aux Cerfs", "Grand Bassin", "Bois Cheri Tea Museum", "La Vanille Nature Park", "Gris Gris Beach"};
                itemName = new String[]{"Admission Fee", "Admission Fee", "Admission Entrance Free", "Admission Entrance Fee", "Admission Fee"};
                itemName1 = new String[]{"Center • 40 minutes", "Center • 1 hour", "South • 3 hours", "South • 4 hours", "South • 1 hour"};
                itemImages = new int[]{R.drawable.trou_aux_cerfs_4, R.drawable.grand_bassin_1, R.drawable.bois_cheri_1, R.drawable.la_vanilla_1, R.drawable.gris_gris_1};
                break;
            default:
                itemTexts = new String[0];
                itemName1 = new String[0];
                itemName = new String[0];
                itemImages = new int[0];
                break;
        }

        // Set up the ListView with the loaded data
        ListView listView = view.findViewById(R.id.listView);
        ItenerariesAdapter adapter = new ItenerariesAdapter(getContext(), itemTexts, itemName, itemName1, itemImages);
        listView.setAdapter(adapter);

        return view;
    }
}
