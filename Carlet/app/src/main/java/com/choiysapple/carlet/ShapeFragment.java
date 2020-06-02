package com.choiysapple.carlet;

import com.choiysapple.carlet.Model.*;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.widget.Button;
import android.widget.Toast;

public class ShapeFragment extends Fragment{

    // color buttons
    Button btn_red;
    Button btn_yellow;
    Button btn_green;

    // shape buttons
    Button btn_shape;
    Button btn_text;
    Button btn_shapeText;

    // Confirm buttons
    Button btn_search;
    Button btn_reset;

    // options
    String msg_color;
    String msg_shape;


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_shape, container, false);
        final SymbolDataManager dataManager = new SymbolDataManager();

        // Buttons
        btn_red = view.findViewById(R.id.btn_red);
        btn_yellow = view.findViewById(R.id.btn_yellow);
        btn_green = view.findViewById(R.id.btn_green);
        btn_shape = view.findViewById(R.id.btn_shape);
        btn_text = view.findViewById(R.id.btn_text);
        btn_shapeText = view.findViewById(R.id.btn_shapeText);
        btn_search = view.findViewById(R.id.btn_search);
        btn_reset = view.findViewById(R.id.btn_reset);


        // [START] Color Buttons
        btn_red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                msg_color = "red";
            }
        });

        btn_yellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                msg_color = "yellow";
            }
        });

        btn_green.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                msg_color = "green";

            }
        });
        // [END] Color Buttons


        // [START] Shape Buttons
        btn_shape.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                msg_shape = "shape";

            }
        });

        btn_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                msg_shape = "text";
            }
        });

        btn_shapeText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                msg_shape = "all";

            }
        });
        // [END] Shape Buttons


        // [START] Search & Reset Buttons
        btn_search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), msg_color+msg_shape, Toast.LENGTH_LONG).show();

                // send symbol ArrayList to ResultActivity
                Intent intent = new Intent(getActivity(), ResultActivity.class);
                intent.putExtra("symbolData", dataManager.getShapeSearchResult(msg_color, msg_shape));
                startActivityForResult(intent, 101);
            }
        });

        btn_reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        }); // [END] Confirm Buttons





        return view;
    }

}

