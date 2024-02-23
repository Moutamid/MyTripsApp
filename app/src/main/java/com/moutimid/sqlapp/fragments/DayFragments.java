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
        if (position == 11) {
            String[] itemTexts = {"SSR Botanical Garden", "L’Aventure du Sucre", "LeCaudan Waterfront", "Aapravasi Ghat", "Blue Penny Museum", "Black River Gorges", "Chamarel Seven Coloured Earth"};
            String[] itemName = {"Admission Entrance Fee", "Admission Entrance Fee", "Admission Free", "Admission Entrance Fee", "Admission Entrance Fee", "Admission Free", "Admission Entrance Fee"};
            String[] itemName1 = {"North • 2 hours", "North • 2 hours", "North • 2 hours", "North • 1 hours", "North • 1 hour", "Southwest • 30 minutes", "Southwest • 1 hour 30 minutes"};
            int[] itemImages = {R.drawable.pamplemousse_garden, R.drawable.sugar_museum_pamplemousses, R.drawable.chateau_de_labourdonnais, R.drawable.port_louis_3, R.drawable.aapravasi_ghat_1, R.drawable.blue_penny_museum_2, R.drawable.black_river_georges_2, R.drawable.chamarel_2};
            ListView listView = view.findViewById(R.id.listView);
            ItenerariesAdapter adapter = new ItenerariesAdapter(getContext(), itemTexts, itemName, itemName1, itemImages);
            listView.setAdapter(adapter);
        }
        else if (position == 12) {
            String[] itemTexts = {"Trou aux Cerfs", "Grand Bassin", "Bois Cheri Tea Museum", "La Vanille Nature Park", "Gris Gris Beach"};
            String[] itemName = {"Admission Fee", "Admission Fee", "Admission Entrance Free", "Admission Entrance Fee", "Admission Fee"};
            String[] itemName1 = {"Center • 40 minutes", "Center • 1 hour", "South • 3 hours", "South • 4 hours", "South • 1 hour"};
//            TODO la_roche_qui_pleure changes
            int[] itemImages = {R.drawable.trou_aux_cerfs_4, R.drawable.grand_bassin_1, R.drawable.bois_cheri_1, R.drawable.la_roche_qui_pleure, R.drawable.gris_gris_1};
            ListView listView = view.findViewById(R.id.listView);
            ItenerariesAdapter adapter = new ItenerariesAdapter(getContext(), itemTexts, itemName, itemName1, itemImages);
            listView.setAdapter(adapter);
        } else if (position==21) {
            String[] itemTexts = {"SSR Botanical Garden", "L’Aventure du Sucre", "Chateau de Labourdonnais", "LeCaudan Waterfront", "Aapravasi Ghat", "Blue Penny Museum"};
            String[] itemName = {"Admission Entrance Fee", "Admission Entrance Fee", "Admission Entrance Free", "Admission Fee", "Admission Entrance Fee", "Admission Entrance Free"};
                     String[] itemName1 = {"North • 2 hours", "North • 2 hours", "North • 2 hours", "North • 1 hours", "North • 1 hour", "Southwest • 30 minutes", "Southwest • 1 hour 30 minutes"};
            int[] itemImages = {R.drawable.pamplemousse_garden, R.drawable.sugar_museum_pamplemousses, R.drawable.chateau_de_labourdonnais, R.drawable.port_louis_3, R.drawable.aapravasi_ghat_1, R.drawable.blue_penny_museum_2, R.drawable.black_river_georges_2, R.drawable.chamarel_2};
            ListView listView = view.findViewById(R.id.listView);
            ItenerariesAdapter adapter = new ItenerariesAdapter(getContext(), itemTexts, itemName, itemName1, itemImages);
            listView.setAdapter(adapter);

        } else if (position==22) {
            String[] itemTexts = {"Trou aux Cerfs", "Grand Bassin", "Bois Cheri Tea Museum", "La Vanille Nature Park", "Gris Gris Beach"};
            String[] itemName = {"Admission Fee", "Admission Fee", "Admission Entrance Free", "Admission Entrance Fee", "Admission Fee"};
            String[] itemName1 = {"Center • 40 minutes", "Center • 1 hour", "South • 3 hours", "South • 4 hours", "South • 1 hour"};
//            TODO la_roche_qui_pleure changes
            int[] itemImages = {R.drawable.trou_aux_cerfs_4, R.drawable.grand_bassin_1, R.drawable.bois_cheri_1, R.drawable.la_roche_qui_pleure, R.drawable.gris_gris_1};
            ListView listView = view.findViewById(R.id.listView);
            ItenerariesAdapter adapter = new ItenerariesAdapter(getContext(), itemTexts, itemName, itemName1, itemImages);
            listView.setAdapter(adapter);


        }

        return view;

    }
}