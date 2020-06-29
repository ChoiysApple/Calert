package com.choiysapple.carlet;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.choiysapple.carlet.ThemeUtil;

public class SettingsFragment extends Fragment {

    Button btn_gps, btn_credit;
    Switch switch_darkMode;
    SharedPreferences sharedPref;

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_settings, container, false);

        btn_gps = view.findViewById(R.id.btn_GPS);
        btn_credit = view.findViewById(R.id.btn_Credit);
        switch_darkMode = view.findViewById(R.id.switch_darkMode);

        sharedPref = getActivity().getPreferences(Context.MODE_PRIVATE);

        btn_gps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // todo: set GPS authority
            }
        });

        if (sharedPref.getString(String.valueOf(R.string.darkmode_options), ThemeUtil.LIGHT_MODE) == ThemeUtil.LIGHT_MODE){
            switch_darkMode.setChecked(false);
        }else{
            switch_darkMode.setChecked(true);
        }

        switch_darkMode.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                String themeColor;

                if (isChecked){
                    // change to dark mode
                    ThemeUtil.applyTheme(ThemeUtil.DARK_MODE);
                    themeColor = ThemeUtil.DARK_MODE;
                }else{
                    // change to dark mode
                    ThemeUtil.applyTheme(ThemeUtil.LIGHT_MODE);
                    themeColor = ThemeUtil.LIGHT_MODE;
                }
                // save dark mode setting into SharedPreference
                SharedPreferences.Editor editor = sharedPref.edit();
                editor.putString(getString(R.string.darkmode_options), themeColor);
                editor.commit();
            }
        });


        btn_credit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("https://github.com/ChoiysApple/Calert"));
                startActivity(i);
            }
        });



        return view;
    }



}
