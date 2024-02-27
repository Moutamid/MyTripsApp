package com.moutimid.sqlapp.fragments;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import com.moutimid.sqlapp.MainActivity;
import com.moutimid.sqlapp.R;
import com.moutimid.sqlapp.adapter.ItenerariesAdapter;

public class Day5Fragments extends Fragment {
    int position;

    public static Day5Fragments newInstance(int position) {
        Day5Fragments fragment = new Day5Fragments();
        Bundle args = new Bundle();
        args.putInt("position", position);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null)
        {
            position = getArguments().getInt("position");
            Log.d("position", "fragment5     "+ position);
        }
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_day_fragments, container, false);
        if (position == 41) {
            String[] itemTexts = {"Le Caudan Waterfront", "Aapravasi Ghat", "Port Louis Central Market", "SSR Botanical Garden", "Grand Bay"};
            String[] itemName = {"Admission Fee", "Admission Entrance Fee", "Admission Free", "Admission Entrance Fee", "Admission Entrance  Fee"};
            String[] itemName1 = {"North • 2 hours", "North • 1 hours", "North • 1 hours", "North • 2 hours", "North • 1 hours"};
            int[] itemImages = {R.drawable.port_louis_3, R.drawable.aapravasi_ghat_1, R.drawable.port_louis_4, R.drawable.pamplemousse_garden, R.drawable.grand_baie_1};
            ListView listView = view.findViewById(R.id.listView);
            ItenerariesAdapter adapter = new ItenerariesAdapter(getContext(), itemTexts, itemName, itemName1, itemImages);
            listView.setAdapter(adapter);
        } else if (position == 42) {
            String[] itemTexts = {"Chamarel Seven Coloured Earth", "Chamarel Waterfalls", "Black River Gorges", "Rhumerie de Chamarel", "Tamarin Bay Beach"};
            String[] itemName = {"Admission Entrance Fee", "Admission Fee", "Admission Free", "Admission Entrance Fee", "Admission  Fee"};
            String[] itemName1 = {"Southwest • 1 hour 30 minutes", "Southwest • 1 hour 30 minutes", "Southwest • 1 hour 30 minutes", "Southwest • 1 hour", "West • 1 hour"};
            int[] itemImages = {R.drawable.chamarel_2, R.drawable.chamarel_1, R.drawable.black_river_georges_2, R.drawable.rhumerie_de_chamarel_1, R.drawable.tamarin_3};
            ListView listView = view.findViewById(R.id.listView);
            ItenerariesAdapter adapter = new ItenerariesAdapter(getContext(), itemTexts, itemName, itemName1, itemImages);
            listView.setAdapter(adapter);
        } else if (position == 43) {
            String[] itemTexts = {"Casela Adventure Park", "La PreneuseBeach", "Martello Tower", "Le Morne Brabant", "Flic enFlac Beach"};
            String[] itemName = {"Admission Entrance Fee", "Admission Fee", "Admission Entrance Free", "Admission Fee", "Admission  Fee"};
            String[] itemName1 = {"West • 2 hours 30 minutes", "West • 1 hour", "West • 50 minutes", "West • 1 – 3 hours", "West • 1 hour"};
            int[] itemImages = {R.drawable.casela, R.drawable.la_preneuse_4, R.drawable.martello_tower_4, R.drawable.le_morne_1, R.drawable.flic_en_flac_3};
            ListView listView = view.findViewById(R.id.listView);
            ItenerariesAdapter adapter = new ItenerariesAdapter(getContext(), itemTexts, itemName, itemName1, itemImages);
            listView.setAdapter(adapter);
        } else if (position == 44) {
            String[] itemTexts = {"Mahebourg Waterfront", "Mahebourg Museum", "Blue Bay Beach", "Gris Gris Beach", "La Roche Qui Pleure", "Maconde Viewpoint", "La Prairie Beach"};
            String[] itemName = {"Admission Fee", "Admission Fee", "Admission Free", "Admission Fee", "Admission  Fee", "Admission  Fee", "Admission  Fee"};
            String[] itemName1 = {"Southeast • 1 – 2 hours", "Southeast • 1 – 2 hours", "Southeast • 1 – 1.5 hours", "South • 35 minutes", "South • 35 minutes", "Southwest • 30 minutes", "Southwest • 1 hour 30 minutes"};
//            TODO last image la_prairie_2
            int[] itemImages = {R.drawable.mahebourg, R.drawable.mahebourg_museum_2, R.drawable.blue_bay, R.drawable.gris_gris_coastal_4, R.drawable.la_roche_qui_pleure, R.drawable.maconde_1, R.drawable.maconde_1};
            ListView listView = view.findViewById(R.id.listView);
            ItenerariesAdapter adapter = new ItenerariesAdapter(getContext(), itemTexts, itemName, itemName1, itemImages);
            listView.setAdapter(adapter);
        } else if (position == 45) {
            String[] itemTexts = {"Ile aux Cerfs Beach"};
            String[] itemName = {"Admission Catamaran Fee"};
            String[] itemName1 = {"East • Full Day"};
            int[] itemImages = {R.drawable.ile_aux_cerfs_mauritius_1};
            ListView listView = view.findViewById(R.id.listView);
            ItenerariesAdapter adapter = new ItenerariesAdapter(getContext(), itemTexts, itemName, itemName1, itemImages);
            listView.setAdapter(adapter);
        }

        return view;

    }
}