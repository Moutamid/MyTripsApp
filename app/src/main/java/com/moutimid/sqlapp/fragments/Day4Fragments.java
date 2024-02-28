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
import com.moutimid.sqlapp.activities.Iteneraries.ItinerariesActivity;
import com.moutimid.sqlapp.adapter.ItenerariesAdapter;

public class Day4Fragments extends Fragment {
    private int position;

    String[] itemTexts;
    String[] itemName1;
    String[] itemName;
    int[] itemImages;
    public Day4Fragments(int i) {
        position = i;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_day_fragments, container, false);
        Log.d("position", "tab4   "+position);

        // Load data based on the fragment position
        switch (position) {
            case 31:
                itemTexts = new String[]{"SSR Botanical Garden", "L’Aventure du Sucre", "Chateau de Labourdonnais", "Le Caudan Waterfront", "Aapravasi Ghat", "Blue Penny Museum"};
                itemName = new String[]{"Admission Entrance Fee", "Admission Entrance Fee", "Admission Entrance Free", "Admission Fee", "Admission Entrance Fee", "Admission Entrance Fee"};
                itemName1 = new String[]{"North • 2 hours", "North • 2 hours", "North • 2 hours", "North • 2 hours", "North • 1 hours", "North • 1 hours"};
                itemImages = new int[]{R.drawable.pamplemousse_garden, R.drawable.sugar_museum_pamplemousses, R.drawable.chateau_de_labourdonnais, R.drawable.port_louis_3, R.drawable.aapravasi_ghat_1, R.drawable.blue_penny_museum_2};
                break;
            case 32:
                itemTexts = new String[]{"Ile aux Cerfs Beach"};
                itemName = new String[]{"Admission Catamaran Fee"};
                itemName1 = new String[]{"East • Full Day"};
                itemImages = new int[]{R.drawable.ile_aux_cerfs_mauritius_1};
                break;
            case 33:
                itemTexts = new String[]{"Casela Adventure Park", "Trou aux Cerfs", "Black River Gorges", "Chamarel Waterfalls", "Chamarel Seven Coloured Earth", "Tamarin Bay Beach"};
                itemName = new String[]{"Admission Entrance Fee", "Admission Fee", "Admission Free", "Admission Fee", "Admission Entrance Fee", "Admission Fee"};
                itemName1 = new String[]{"West • 2 hours 30 minutes", "Center • 40 minutes", "Southwest • 30 minutes", "Southwest • 35 minutes", "Southwest • 1 hour 30 minutes", "West • 1 hour"};
                itemImages = new int[]{R.drawable.casela, R.drawable.la_preneuse_4, R.drawable.black_river_georges_2, R.drawable.chamarel_1, R.drawable.chamarel_2, R.drawable.tamarin_3};
                break;
            case 34:
                itemTexts = new String[]{"Eau Bleu Waterfall", "Pont Naturel Bridge", "Le Souffleur", "Gris Gris Beach", "La Roche Qui Pleure", "Rochester Falls", "Maconde Viewpoint", "La Prairie Beach"};
                itemName = new String[]{"Admission Fee", "Admission Fee", "Admission Free", "Admission Fee", "Admission Fee", "Admission Fee", "Admission Fee", "Admission Fee"};
                itemName1 = new String[]{"Southeast • 35 minutes", "South • 30 minutes", "South • 30 minutes", "South • 35 minutes", "South • 35 minutes", "South • 45 minutes", "Southwest • 30 minutes", "Southwest • 1 hour 30 minutes"};
                itemImages = new int[]{R.drawable.gris_gris_coastal_4, R.drawable.gris_gris_coastal_4, R.drawable.gris_gris_coastal_4, R.drawable.gris_gris_coastal_4, R.drawable.la_roche_qui_pleure, R.drawable.rochester_falls_1, R.drawable.maconde_1, R.drawable.gris_gris_coastal_4};
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
