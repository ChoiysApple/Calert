package com.choiysapple.carlet;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.choiysapple.carlet.Model.Symbol;
import com.choiysapple.carlet.Model.SymbolDataManager;

import java.util.ArrayList;

public class BrowseFragment extends Fragment {

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_browse, container, false);


        SymbolDataManager dataManager = new SymbolDataManager();
        ArrayList<Symbol> symbolArrayList = dataManager.getSymbols();



        return view;
    }
}
