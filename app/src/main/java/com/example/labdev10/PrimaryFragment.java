package com.example.labdev10;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

/**
 * Fragment initial pour l'affichage de base.
 */
public class PrimaryFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // Chargement de l'interface utilisateur pour ce fragment
        return inflater.inflate(R.layout.fragment_primary, container, false);
    }
}
