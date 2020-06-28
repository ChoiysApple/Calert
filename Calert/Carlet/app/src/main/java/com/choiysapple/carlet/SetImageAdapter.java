package com.choiysapple.carlet;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class SetImageAdapter extends BaseAdapter {

    public Integer[] thumbImages = {
            R.drawable.symbol1,R.drawable.symbol2,R.drawable.symbol3,
            R.drawable.symbol4,R.drawable.symbol5,R.drawable.symbol6,
            R.drawable.symbol7,R.drawable.symbol8,R.drawable.symbol9,
            R.drawable.symbol10,R.drawable.symbol11,R.drawable.symbol12,
            R.drawable.symbol13,R.drawable.symbol14,R.drawable.symbol15,
            R.drawable.symbol16,R.drawable.symbol17,R.drawable.symbol18,
            R.drawable.symbol19,R.drawable.symbol20,R.drawable.symbol21,
            R.drawable.symbol22,R.drawable.symbol23,R.drawable.symbol24,
            R.drawable.symbol25,R.drawable.symbol26,R.drawable.symbol27,
            R.drawable.symbol28,R.drawable.symbol29,R.drawable.symbol30,
            R.drawable.symbol31,R.drawable.symbol32,R.drawable.symbol33,
            R.drawable.symbol34,R.drawable.symbol35,R.drawable.symbol36,
            R.drawable.symbol37,R.drawable.symbol38,R.drawable.symbol39,
            R.drawable.symbol40,R.drawable.symbol41,R.drawable.symbol42,
            R.drawable.symbol43,R.drawable.symbol44,R.drawable.symbol45,
            R.drawable.symbol46,R.drawable.symbol47,R.drawable.symbol48,
            R.drawable.symbol49,R.drawable.symbol50,R.drawable.symbol51,
            R.drawable.symbol52,R.drawable.symbol53,R.drawable.symbol54,
            R.drawable.symbol55,R.drawable.symbol56,R.drawable.symbol57,
            R.drawable.symbol58,R.drawable.symbol59,R.drawable.symbol60,
            R.drawable.symbol61,R.drawable.symbol62,R.drawable.symbol63,
            R.drawable.symbol64
    };

    private Context Cont;

    public SetImageAdapter(Context c) {
        Cont = c;
    }

    public int getCount() {
        return thumbImages.length;
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
        imgview.setImageResource(thumbImages[position]);
        return imgview;
    }

}