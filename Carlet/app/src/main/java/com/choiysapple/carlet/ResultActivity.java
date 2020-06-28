package com.choiysapple.carlet;

import com.choiysapple.carlet.Model.*;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.GridView;
import android.widget.TextView;

import java.util.ArrayList;

public class ResultActivity extends AppCompatActivity {

    ArrayList<Symbol> result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);


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

        GridView gv = findViewById(R.id.mygrid);
        gv.setAdapter(new SearchImageAdapter(this, result));

    }
}
