package com.choiysapple.carlet;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.choiysapple.carlet.Model.Symbol;

import java.util.ArrayList;

public class ResultActivity extends AppCompatActivity {

    ArrayList<Symbol> result;
    View popupView;
    PopupWindow popUp;
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
        gv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                popupView = getLayoutInflater().inflate(R.layout.popup_window, null);
                popUp = new PopupWindow(popupView, 1000, LinearLayout.LayoutParams.WRAP_CONTENT, true);

                Button btn = popupView.findViewById(R.id.btn_Map);
                ImageView logo = popupView.findViewById(R.id.logo);
                TextView name = popupView.findViewById(R.id.name);
                TextView desc = popupView.findViewById(R.id.desc);

                popUp.setAnimationStyle(-1); // apply animation
                popUp.setElevation(20); // apply shadow
                popUp.showAtLocation(popupView, Gravity.CENTER, 0, -300);

                // load symbol data
                logo.setImageResource(result.get(position).img);
                name.setText(result.get(position).name);
                desc.setText(result.get(position).description);

                btn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(),MapActivity.class);
                        startActivity(intent);
                    }
                });
            }
        });
    }
}
