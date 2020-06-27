package com.choiysapple.carlet;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.google.android.material.bottomnavigation.BottomNavigationView;


public class MainActivity extends AppCompatActivity {

    private FragmentManager fragmentManager = getSupportFragmentManager();
    FragmentTransaction transaction;

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
        transaction.replace(R.id.mainFrame, browseFragment).commitAllowingStateLoss();


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

    }       //[END] of OnCreate


//    @Override
//    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
//        switch (menuItem.getItemId()) {
//            case R.id.nav_help:
//                intent = new Intent(MainActivity.this, Help.class);
//                startActivity(intent);
//                break;
//            case R.id.nav_logout:
//                intent = new Intent(MainActivity.this, LoginActivity.class);
//                startActivity(intent);
//                break;
//            case R.id.nav_account:
//                intent = new Intent(MainActivity.this, MyAccount.class);
//                startActivity(intent);
//                break;
//            case R.id.my_bookings:
//                intent = new Intent(this, MyBookings.class);
//                startActivity(intent);
//                break;
//        }
//        return false;
//    }


}
