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
            int[] itemImages = {R.drawable.pamplemousse_garden, R.drawable.sugar_museum_pamplemousses, R.drawable.port_louis_3, R.drawable.aapravasi_ghat_1, R.drawable.blue_penny_museum_2, R.drawable.black_river_georges_2, R.drawable.chamarel_2};
            ListView listView = view.findViewById(R.id.listView);
            ItenerariesAdapter adapter = new ItenerariesAdapter(getContext(), itemTexts, itemName, itemName1, itemImages);
            listView.setAdapter(adapter);
        }
        else if (position == 12) {
            String[] itemTexts = {"Trou aux Cerfs", "Grand Bassin", "Bois Cheri Tea Museum", "La Vanille Nature Park", "Gris Gris Beach"};
            String[] itemName = {"Admission Fee", "Admission Fee", "Admission Entrance Free", "Admission Entrance Fee", "Admission Fee"};
            String[] itemName1 = {"Center • 40 minutes", "Center • 1 hour", "South • 3 hours", "South • 4 hours", "South • 1 hour"};
            //            TODO (4)  la_vanille_1

            int[] itemImages = {R.drawable.trou_aux_cerfs_4, R.drawable.grand_bassin_1, R.drawable.bois_cheri_1, R.drawable.la_roche_qui_pleure, R.drawable.gris_gris_1};
            ListView listView = view.findViewById(R.id.listView);
            ItenerariesAdapter adapter = new ItenerariesAdapter(getContext(), itemTexts, itemName, itemName1, itemImages);
            listView.setAdapter(adapter);
        } else if (position == 21) {
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
        } else if (position == 31) {
            String[] itemTexts = {"SSR Botanical Garden", "L’Aventure du Sucre", "Chateau de Labourdonnais", "Le Caudan Waterfront", "Aapravasi Ghat", "Blue Penny Museum"};
            String[] itemName = {"Admission Entrance Fee", "Admission Entrance Fee", "Admission Entrance Free", "Admission Fee", "Admission Entrance Fee", "Admission Entrance Fee"};
            String[] itemName1 = {"North • 2 hours", "North • 2 hours", "North • 2 hours", "North • 2 hours", "North • 1 hours", "North • 1 hours"};
            int[] itemImages = {R.drawable.pamplemousse_garden, R.drawable.sugar_museum_pamplemousses, R.drawable.chateau_de_labourdonnais, R.drawable.port_louis_3, R.drawable.aapravasi_ghat_1, R.drawable.blue_penny_museum_2};
            ListView listView = view.findViewById(R.id.listView);
            ItenerariesAdapter adapter = new ItenerariesAdapter(getContext(), itemTexts, itemName, itemName1, itemImages);
            listView.setAdapter(adapter);
        } else if (position == 32) {
            String[] itemTexts = {"Ile aux Cerfs Beach"};
            String[] itemName = {"Admission Catamaran Fee"};
            String[] itemName1 = {"East • Full Day"};
            int[] itemImages = {R.drawable.ile_aux_cerfs_mauritius_1};
            ListView listView = view.findViewById(R.id.listView);
            ItenerariesAdapter adapter = new ItenerariesAdapter(getContext(), itemTexts, itemName, itemName1, itemImages);
            listView.setAdapter(adapter);
        } else if (position == 33) {
            String[] itemTexts = {"Casela Adventure Park", "Trou aux Cerfs", "Black River Gorges", "Chamarel Waterfalls", "Chamarel Seven Coloured Earth", "Tamarin Bay Beach"};
            String[] itemName = {"Admission Entrance Fee", "Admission Fee", "Admission Free", "Admission Fee", "Admission Entrance Fee", "Admission Fee"};
            String[] itemName1 = {"West • 2 hours 30 minutes", "Center • 40 minutes", "Southwest • 30 minutes", "Southwest • 35 minutes", "Southwest • 1 hour 30 minutes", "West • 1 hour"};
            int[] itemImages = {R.drawable.casela, R.drawable.la_preneuse_4, R.drawable.black_river_georges_2, R.drawable.chamarel_1, R.drawable.chamarel_2, R.drawable.tamarin_3};
            ListView listView = view.findViewById(R.id.listView);
            ItenerariesAdapter adapter = new ItenerariesAdapter(getContext(), itemTexts, itemName, itemName1, itemImages);
            listView.setAdapter(adapter);
        } else if (position == 34) {
            String[] itemTexts = {"Eau Bleu Waterfall", "Pont Naturel Bridge", "Le Souffleur", "Gris Gris Beach", "La Roche Qui Pleure", "Rochester Falls", "Maconde Viewpoint", "La Prairie Beach"};
            String[] itemName = {"Admission Fee", "Admission Fee", "Admission Free", "Admission Fee", "Admission  Fee", "Admission Fee", "Admission Fee", "Admission Fee"};
            String[] itemName1 = {"Southeast • 35 minutes", "South • 30 minutes", "South • 30 minutes", "South • 35 minutes", "South • 35 minutes", "South • 45 minutes", "Southwest • 30 minutes", "Southwest • 1 hour 30 minutes"};
//            int[] itemImages = {R.drawable.eau_bleu_1, R.drawable.pont_naturel_2, R.drawable.le_souffleur_1, R.drawable.gris_gris_coastal_4, R.drawable.la_roche_qui_pleure, R.drawable.rochester_falls_1, R.drawable.maconde_1, R.drawable.la_prairie_2};
            int[] itemImages = {R.drawable.gris_gris_coastal_4, R.drawable.gris_gris_coastal_4, R.drawable.gris_gris_coastal_4, R.drawable.gris_gris_coastal_4, R.drawable.la_roche_qui_pleure, R.drawable.rochester_falls_1, R.drawable.maconde_1, R.drawable.gris_gris_coastal_4};
            ListView listView = view.findViewById(R.id.listView);
            ItenerariesAdapter adapter = new ItenerariesAdapter(getContext(), itemTexts, itemName, itemName1, itemImages);
            listView.setAdapter(adapter);
        } else if (position == 41) {
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