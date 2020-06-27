package com.choiysapple.carlet;

import com.choiysapple.carlet.Model.*;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class ResultActivity extends AppCompatActivity {

    TextView textView;
    ArrayList<Symbol> result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        textView = findViewById(R.id.textview);

        Intent passedIntent = getIntent();
        if (passedIntent != null){
            result = (ArrayList<Symbol>) getIntent().getSerializableExtra("symbolData");
        }


        String msg_result = "<Result>\n";
        int index = 0;
        for (Symbol element : result){
            msg_result += (Integer.toString(index+1)+") "+element.name +"\n");
            index++;
        }

        textView.setText(msg_result);
    }
}
