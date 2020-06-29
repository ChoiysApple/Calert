package com.choiysapple.carlet;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import androidx.appcompat.widget.SearchView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.choiysapple.carlet.Model.SymbolDataManager;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.choiysapple.carlet.ThemeUtil;


public class MainActivity extends AppCompatActivity {

    private FragmentManager fragmentManager = getSupportFragmentManager();
    FragmentTransaction transaction;

    SymbolDataManager dataManager = new SymbolDataManager();

    // Fragments for each bottom navigation
    private BrowseFragment browseFragment = new BrowseFragment();
    private ShapeFragment shapeFragment = new ShapeFragment();
    private SettingsFragment settingsFragment = new SettingsFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNavigationView = findViewById(R.id.main_bottomNav);


        // Set initial fragment of bottom navigation
        transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.mainFrame, shapeFragment).commitAllowingStateLoss();

        // bottom navigation click action
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                transaction = fragmentManager.beginTransaction();
                switch (menuItem.getItemId()) {
                    case R.id.navigation_browse: {
                        transaction.replace(R.id.mainFrame, browseFragment).commitAllowingStateLoss();
                        return true;
                    }
                    case R.id.navigation_shape: {
                        transaction.replace(R.id.mainFrame, shapeFragment).commitAllowingStateLoss();
                        return true;
                    }
                    case R.id.navigation_settings: {
                        transaction.replace(R.id.mainFrame, settingsFragment).commitAllowingStateLoss();
                        return true;
                    }
                }
                return false;
            }
        });     //[END] of OnNavigationItemSelectedListener


        // set dark mode option
        SharedPreferences sharedPref = this.getPreferences(Context.MODE_PRIVATE);
        ThemeUtil.applyTheme(sharedPref.getString(String.valueOf(R.string.darkmode_options), ThemeUtil.LIGHT_MODE));

    }       //[END] of OnCreate


    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.main, menu);
        SearchView searchView = (SearchView)menu.findItem(R.id.action_search).getActionView();
        searchView.setMaxWidth(Integer.MAX_VALUE);

        searchView.setQueryHint("이름으로 검색합니다");
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                // send symbol ArrayList to ResultActivity
                Intent intent = new Intent(getApplicationContext(), ResultActivity.class);
                intent.putExtra("symbolData", dataManager.getTextSearchResult(query));
                startActivity(intent);
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                return false;
            }
        });

        return true;
    }

}
