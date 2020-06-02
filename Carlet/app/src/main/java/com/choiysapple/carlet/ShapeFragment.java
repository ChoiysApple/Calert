package com.choiysapple.carlet;

import com.choiysapple.carlet.Model.*;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;
import android.widget.Toast;

public class ShapeFragment extends Fragment{

    // color buttons
    Button btn_red;
    Button btn_yellow;
    Button btn_green;
    Button btn_other;

    // shape buttons
    Button btn_shape;
    Button btn_text;
    Button btn_shapeText;

    // Confirm buttons
    Button btn_search;
    Button btn_reset;


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_shape, container, false);
        final SymbolDataManager dataManager = new SymbolDataManager();

        // Buttons
        btn_red = view.findViewById(R.id.btn_red);
        btn_yellow = view.findViewById(R.id.btn_yellow);
        btn_green = view.findViewById(R.id.btn_green);
        btn_other = view.findViewById(R.id.btn_other);
        btn_shape = view.findViewById(R.id.btn_shape);
        btn_text = view.findViewById(R.id.btn_text);
        btn_shapeText = view.findViewById(R.id.btn_shapeText);
        btn_search = view.findViewById(R.id.btn_search);
        btn_reset = view.findViewById(R.id.btn_reset);



        // [START] Confirm Buttons
        btn_search.setOnClickListener(new View.OnClickListener() {
            String msg="";
            @Override
            public void onClick(View view) {

                btn_red.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        msg+="red";
                    }
                });

                btn_yellow.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        msg+="yellow";
                    }
                });

                btn_green.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        msg+="green";

                    }
                });

                btn_other.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        msg+="other";

                    }
                });
                // [END] Color Buttons


                // [START] Shape Buttons
                btn_shape.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        msg+=" shape";

                    }
                });

                btn_text.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        msg+=" text";
                    }
                });

                btn_shapeText.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        msg+=" shape+text";

                    }
                });
                // [END] Shape Buttons

                Toast.makeText(getActivity(), msg, Toast.LENGTH_LONG).show();
                Log.d("Shape", dataManager.getShapeSearchResult("red", "shape").toString());
//                Log.d("Keyword", dataManager.getTextSearchResult("경고").toString());
//                Log.d("Browse", dataManager.getSymbols().get(34).name.toString());


                btn_reset.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        msg = "";

                    }
                });


            }
        });


        // [END] Confirm Buttons





        return view;
    }

}

