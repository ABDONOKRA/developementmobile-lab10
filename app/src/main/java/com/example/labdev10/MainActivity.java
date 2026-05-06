package com.example.labdev10;

import android.os.Bundle;
import android.view.MenuItem;
import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import com.google.android.material.navigation.NavigationView;

/**
 * Activité principale gérant la navigation par menu latéral.
 */
public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private DrawerLayout drawerContainer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Configuration de la barre d'outils (Toolbar)
        Toolbar customToolbar = findViewById(R.id.main_toolbar);
        setSupportActionBar(customToolbar);

        // Initialisation du menu latéral
        drawerContainer = findViewById(R.id.drawer_root);
        NavigationView navView = findViewById(R.id.side_nav_view);
        navView.setNavigationItemSelectedListener(this);

        // Ajout du bouton "hamburger" pour ouvrir le menu
        ActionBarDrawerToggle toggleBtn = new ActionBarDrawerToggle(
                this, drawerContainer, customToolbar,
                R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawerContainer.addDrawerListener(toggleBtn);
        toggleBtn.syncState();

        // Affichage d'un fragment par défaut au démarrage
        if (savedInstanceState == null) {
            loadFragment(new PrimaryFragment());
            navView.setCheckedItem(R.id.go_to_primary);
        }
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        int selectedId = menuItem.getItemId();
        Fragment nextFragment = null;

        // Sélection du fragment selon le choix dans le menu
        if (selectedId == R.id.go_to_primary) {
            nextFragment = new PrimaryFragment();
        } else if (selectedId == R.id.go_to_secondary) {
            nextFragment = new SecondaryFragment();
        } else if (selectedId == R.id.go_to_list) {
            nextFragment = new DataListFragment();
        }

        // Remplacement du contenu si un fragment est sélectionné
        if (nextFragment != null) {
            loadFragment(nextFragment);
        }

        // Fermeture automatique du volet de navigation
        drawerContainer.closeDrawer(GravityCompat.START);
        return true;
    }

    /**
     * Méthode utilitaire pour effectuer la transaction de fragment.
     */
    private void loadFragment(Fragment fragment) {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragment_container, fragment)
                .commit();
    }

    @Override
    public void onBackPressed() {
        // Si le menu est ouvert, on le ferme au lieu de quitter
        if (drawerContainer.isDrawerOpen(GravityCompat.START)) {
            drawerContainer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }
}
