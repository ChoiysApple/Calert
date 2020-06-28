package com.choiysapple.carlet;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import com.choiysapple.carlet.Model.Symbol;

import java.util.ArrayList;
import java.util.Arrays;

public class SearchImageAdapter extends BaseAdapter {
    public ArrayList<Integer> thumbImages = new ArrayList<Integer>();

    private Context Cont;

    public SearchImageAdapter(Context c, ArrayList<Symbol> symbols) {
        Cont = c;

//        Log.d("SearchImageAdapter", Integer.toString(thumbImages.size()));

        int i = 0;
        // initialize thumbImages
        for (Symbol element : symbols){
            thumbImages.add(element.img);
            Log.d("SearchImageAdapter", element.img.toString());
            i++;
        }
    }

    public int getCount() {
        return thumbImages.size();
    }

    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position) {
        return 0;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imgview = new ImageView(Cont);
        imgview.setLayoutParams(new GridView.LayoutParams(370, 250));
        imgview.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imgview.setPadding(5, 5, 5, 5);
        imgview.setImageResource(thumbImages.get(position));
        return imgview;
    }
}
