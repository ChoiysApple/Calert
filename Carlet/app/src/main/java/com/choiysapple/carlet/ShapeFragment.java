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


    Button btn1;
    Button btn2;
    Button btn3;

    Button btn_shape;
    Button btn_text;
    Button btn_shapeText;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_shape, container, false);

        // color category button
        btn1 = view.findViewById(R.id.btn1);
        btn2 = view.findViewById(R.id.btn2);
        btn3 = view.findViewById(R.id.btn3);

        // shape category button
        btn_shape = view.findViewById(R.id.btn_shape);
        btn_text = view.findViewById(R.id.btn_text);
        btn_shapeText = view.findViewById(R.id.btn_shapeText);

//        GridView gv = findViewById(R.id.mygrid);
//        gv.setAdapter(new SetImageAdapter(this));

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String msg = "";
                msg+="red";

                btn1.setVisibility(View.VISIBLE);
                btn2.setVisibility(View.INVISIBLE);
                btn3.setVisibility(View.INVISIBLE);

                Toast.makeText(getActivity(), msg, Toast.LENGTH_LONG).show();

//                Intent intent = new Intent(getActivity(),SetImageAdapter.class);
//                intent.putExtra("msg",msg);
//                startActivity(intent);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String msg = "";
                msg+="yellow";

                btn1.setVisibility(View.INVISIBLE);
                btn2.setVisibility(View.VISIBLE);
                btn3.setVisibility(View.INVISIBLE);

                Toast.makeText(getActivity(), msg, Toast.LENGTH_LONG).show();

//                Intent intent = new Intent(getActivity(),SetImageAdapter.class);
//                intent.putExtra("msg",msg);
//                startActivity(intent);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String msg = "";
                msg+="green";

                btn1.setVisibility(View.INVISIBLE);
                btn2.setVisibility(View.INVISIBLE);
                btn3.setVisibility(View.VISIBLE);

                Toast.makeText(getActivity(),msg, Toast.LENGTH_LONG).show();

//                Intent intent = new Intent(getActivity(),SetImageAdapter.class);
//                intent.putExtra("msg",msg);
//                startActivity(intent);
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

//                Intent intent = new Intent(getActivity(),SetImageAdapter.class);
//                intent.putExtra("msg",msg);
//                startActivity(intent);
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

//                Intent intent = new Intent(getActivity(),SetImageAdapter.class);
//                intent.putExtra("msg",msg);
//                startActivity(intent);
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

//                Intent intent = new Intent(getActivity(),SetImageAdapter.class);
//                intent.putExtra("msg",msg);
//                startActivity(intent);
            }
        });
        return view;
    }

}

