package com.example.labdev10;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import androidx.annotation.Nullable;
import androidx.fragment.app.ListFragment;

/**
 * Fragment affichant une liste simple de données.
 */
public class DataListFragment extends ListFragment {

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        // Données à afficher dans la liste
        String[] dataItems = {
                "Premier Élément", "Deuxième Élément", "Troisième Élément", 
                "Quatrième Élément", "Cinquième Élément", "Sixième Élément",
                "Septième Élément", "Huitième Élément"
        };

        // Configuration de l'adaptateur pour l'affichage
        ArrayAdapter<String> listAdapter = new ArrayAdapter<>(
                requireActivity(),
                android.R.layout.simple_list_item_1,
                dataItems
        );
        
        setListAdapter(listAdapter);
    }
}
