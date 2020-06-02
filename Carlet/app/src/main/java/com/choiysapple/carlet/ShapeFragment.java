package com.choiysapple.carlet;

import android.os.Bundle;
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


    Button btn_red;
    Button btn_yellow;
    Button btn_green;

    Button btn_shape;
    Button btn_text;
    Button btn_shapeText;


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_shape, container, false);

        // color category button
        btn_red = view.findViewById(R.id.btn_red);
        btn_yellow = view.findViewById(R.id.btn_yellow);
        btn_green = view.findViewById(R.id.btn_green);

        // shape category button
        btn_shape = view.findViewById(R.id.btn_shape);
        btn_text = view.findViewById(R.id.btn_text);
        btn_shapeText = view.findViewById(R.id.btn_shapeText);

        btn_red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String msg = "";
                msg+="red";

                btn_red.setVisibility(View.VISIBLE);
                btn_yellow.setVisibility(View.INVISIBLE);
                btn_green.setVisibility(View.INVISIBLE);

                Toast.makeText(getActivity(), msg, Toast.LENGTH_LONG).show();
            }
        });

        btn_yellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String msg = "";
                msg+="yellow";

                btn_red.setVisibility(View.INVISIBLE);
                btn_yellow.setVisibility(View.VISIBLE);
                btn_green.setVisibility(View.INVISIBLE);

                Toast.makeText(getActivity(), msg, Toast.LENGTH_LONG).show();


            }
        });

        btn_green.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String msg = "";
                msg+="green";

                btn_red.setVisibility(View.INVISIBLE);
                btn_yellow.setVisibility(View.INVISIBLE);
                btn_green.setVisibility(View.VISIBLE);

                Toast.makeText(getActivity(),msg, Toast.LENGTH_LONG).show();


            }
        });

        btn_shape.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String msg = "";
                msg+="shape";

                btn_shape.setVisibility(View.VISIBLE);
                btn_text.setVisibility(View.INVISIBLE);
                btn_shapeText.setVisibility(View.INVISIBLE);

                Toast.makeText(getActivity(),msg, Toast.LENGTH_LONG).show();


            }
        });

        btn_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String msg = "";
                msg+="text";

                btn_shape.setVisibility(View.VISIBLE);
                btn_text.setVisibility(View.INVISIBLE);
                btn_shapeText.setVisibility(View.INVISIBLE);

                Toast.makeText(getActivity(),msg, Toast.LENGTH_LONG).show();


            }
        });

        btn_shapeText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String msg = "";
                msg+="shape+text";

                btn_shape.setVisibility(View.VISIBLE);
                btn_text.setVisibility(View.INVISIBLE);
                btn_shapeText.setVisibility(View.INVISIBLE);

                Toast.makeText(getActivity(),msg, Toast.LENGTH_LONG).show();


            }
        });
        return view;
    }

}

