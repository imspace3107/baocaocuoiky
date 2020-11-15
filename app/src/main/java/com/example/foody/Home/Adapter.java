package com.example.foody.Home;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.foody.R;

import java.util.ArrayList;

public class Adapter extends ArrayAdapter<Product> {



    private Context context;
    private int resource;
    public Adapter(Context context, int resource, ArrayList<Product> objects){
        super(context,resource,objects);
        this.context=context;
        this.resource=resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater=LayoutInflater.from(context);
        convertView =layoutInflater.inflate(resource,parent,false);
        TextView textView=convertView.findViewById(R.id.tenQuan);
        ImageView imageView=convertView.findViewById(R.id.hinhQuan);
        TextView textV=convertView.findViewById(R.id.nhanXet);
        textView.setText(getItem(position).getTenQuan());
        imageView.setImageResource(getItem(position).getHinhQuan());
        textV.setText(getItem(position).getNhanXet());
        return convertView;
    }
}
