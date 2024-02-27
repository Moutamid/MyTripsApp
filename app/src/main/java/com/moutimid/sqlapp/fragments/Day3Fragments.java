package com.moutimid.sqlapp.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import com.moutimid.sqlapp.R;
import com.moutimid.sqlapp.adapter.ItenerariesAdapter;

public class Day3Fragments extends Fragment {
    int position;

    public Day3Fragments(int i) {
        position = i;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_day_fragments, container, false);

      if (position == 21) {
            String[] itemTexts = {"SSR Botanical Garden", "L’Aventure du Sucre", "Chateau de Labourdonnais", "Le Caudan Waterfront", "Aapravasi Ghat", "Blue Penny Museum"};
            String[] itemName = {"Admission Entrance Fee", "Admission Entrance Fee", "Admission Entrance Free", "Admission Fee", "Admission Entrance Fee", "Admission Entrance Free"};
            String[] itemName1 = {"North • 2 hours", "North • 2 hours", "North • 2 hours", "North • 2 hours", "North • 1 hour", "North • 1 hour"};
            int[] itemImages = {R.drawable.pamplemousse_garden, R.drawable.sugar_museum_pamplemousses, R.drawable.chateau_de_labourdonnais, R.drawable.port_louis_3, R.drawable.aapravasi_ghat_1, R.drawable.blue_penny_museum_2};
            ListView listView = view.findViewById(R.id.listView);
            ItenerariesAdapter adapter = new ItenerariesAdapter(getContext(), itemTexts, itemName, itemName1, itemImages);
            listView.setAdapter(adapter);

        } else if (position == 22) {
            String[] itemTexts = {"Bois Cheri Tea Museum", "La Vanille Nature Park ", "Gris Gris Beach"};
            String[] itemName = {"Admission Entrance Fee", "Admission Entrance Fee", "Admission Free"};
            String[] itemName1 = {"South • 3 hours", "South • 4 hour", "South • 1 hour"};
//            TODO (2)  la_vanille_1 change
            int[] itemImages = {R.drawable.bois_cheri_1, R.drawable.bois_cheri_1, R.drawable.gris_gris_1};
            ListView listView = view.findViewById(R.id.listView);
            ItenerariesAdapter adapter = new ItenerariesAdapter(getContext(), itemTexts, itemName, itemName1, itemImages);
            listView.setAdapter(adapter);

        } else if (position == 23) {
            String[] itemTexts = {"Tamarin Bay", "Trou aux Cerfs", "Grand Bassin", "Black River Gorges", "Chamarel Seven Coloured Earth"};
            String[] itemName = {"Admission Fee", "Admission Fee", "Admission Free", "Admission Fee", "Admission Entrance Fee"};
            String[] itemName1 = {"West • 1 hour", "Center •1 hour 30 minutes", "South • 1 hour 30 minutes", "Southwest • 1 hour", "Southwest • 1 hour"};
            int[] itemImages = {R.drawable.tamarin_3, R.drawable.trou_aux_cerfs_4, R.drawable.grand_bassin_1, R.drawable.black_river_georges_2, R.drawable.chamarel_2};
            ListView listView = view.findViewById(R.id.listView);
            ItenerariesAdapter adapter = new ItenerariesAdapter(getContext(), itemTexts, itemName, itemName1, itemImages);
            listView.setAdapter(adapter);
        } 

        return view;

    }
}