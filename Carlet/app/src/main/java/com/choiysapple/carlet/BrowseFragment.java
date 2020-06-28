package com.choiysapple.carlet;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.choiysapple.carlet.Model.Symbol;
import com.choiysapple.carlet.Model.SymbolDataManager;

import java.util.ArrayList;

public class BrowseFragment extends Fragment {
    GridView gv;
    SymbolDataManager dataManager;
    ArrayList<Symbol> symbolArrayList;
    View popupView;
    PopupWindow popUp;

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_browse, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();

        gv = getActivity().findViewById(R.id.mygrid);
        gv.setAdapter(new SetImageAdapter(getContext()));

        dataManager = new SymbolDataManager();
        symbolArrayList = dataManager.getSymbols();

        gv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                popupView = getLayoutInflater().inflate(R.layout.popup_window, null);
                PopupWindow popUp = new PopupWindow(popupView, 1000, LinearLayout.LayoutParams.WRAP_CONTENT, true);

                Button btn = popupView.findViewById(R.id.btn_Map);
                ImageView logo = popupView.findViewById(R.id.logo);
                TextView name = popupView.findViewById(R.id.name);
                TextView desc = popupView.findViewById(R.id.desc);

                popUp.setAnimationStyle(-1); // apply animation
                popUp.setElevation(20); // apply shadow
                popUp.showAtLocation(popupView, Gravity.CENTER, 0, -300);

                // load symbol data
                logo.setImageResource(getResources().getIdentifier("symbol" + (position+1), "drawable", getActivity().getPackageName()));
                name.setText(symbolArrayList.get(position).name);
                desc.setText(symbolArrayList.get(position).description);

                btn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getActivity(),MapActivity.class);
                        startActivity(intent);
                    }
                });
            }
        });
    }
}
