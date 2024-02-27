package com.moutimid.sqlapp.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import com.moutimid.sqlapp.R;
import com.moutimid.sqlapp.adapter.ItenerariesAdapter;

public class DayFragments extends Fragment {
    int position;

    public DayFragments(int i) {
        position = i;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_day_fragments, container, false);

        if (position == 1) {
            String[] itemTexts = {"Le Caudan Waterfront", "Aapravasi Ghat", "Port Louis Central Market", "Marie Reine de la Paix Chapel", "Fort Adelaide", "Le Morne Beach", "Le Morne Brabant", "Maconde Viewpoint", "ChamarelSeven Coloured Earth", "Chamarel Waterfalls", "Black River Gorges", "Grand Bassin", "Gris Gris Beach"};
            String[] itemName = {"Admission Free", "Admission Entrance Fee", "Admission Free", "Admission Free", "Admission Free", "Admission Free", "Admission Free", "Admission Free", "Admission Free", "Admission Entrance Fee", "Chamarel", "Admission Free", "Admission Free", "Admission Free"};
            String[] itemName1 = {"South • 30 minutes - 1 hour", "North • 1 hour", "North • 1 hour", "North • 45 minutes", "North • 1 hour", "Southwest • 1 hour", "Southwest • 3 - 4 hours", "Southwest • 30 minutes", "Southwest • 1 hour 30 minutes", "Southwest • 1 hour 30 minutes", "Southwest • 1 hour 30 minutes", "South • 1 hour 30 minutes", "South • 30 minutes - 1 hour"};
            int[] itemImages = {R.drawable.port_louis_3, R.drawable.aapravasi_ghat_1, R.drawable.port_louis_4, R.drawable.marie_reine_de_la_paix_3, R.drawable.citadelle, R.drawable.le_morne_beach_2, R.drawable.le_morne_1, R.drawable.maconde_1, R.drawable.chamarel_2, R.drawable.chamarel_1, R.drawable.black_river_georges_2, R.drawable.grand_bassin_1, R.drawable.gris_gris_coastal_4};
            ListView listView = view.findViewById(R.id.listView);
            ItenerariesAdapter adapter = new ItenerariesAdapter(getContext(), itemTexts, itemName, itemName1, itemImages);
            listView.setAdapter(adapter);
        }


        return view;

    }
}