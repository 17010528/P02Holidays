package com.example.p02_holidays;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class categoryAdapter extends ArrayAdapter<Category> {
    private ArrayList<Category> category;
     private Context context;
     private TextView tvCategory;


             public categoryAdapter(Context context, int resource, ArrayList<Category> objects){
               super(context, resource, objects);
                category = objects;
               this.context = context;
           }
     @Override
     public View getView(int position, View convertView, ViewGroup parent){
                 LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                 View rowView = inflater.inflate(R.layout.category_row,parent,false);


                 tvCategory= rowView.findViewById(R.id.textViewSelectedCategory);



                 Category currentCategory = category.get(position);
                 tvCategory.setText(currentCategory.getCategory());
                 return rowView;




            }

}
