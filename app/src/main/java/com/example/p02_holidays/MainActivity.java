package com.example.p02_holidays;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lv;
    ArrayAdapter aa;
    ArrayList<Category> al;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = this.findViewById(R.id.category);
        al = new ArrayList<Category>();
        al.add(new Category("Secular"));


        aa = new categoryAdapter(this, R.layout.activity_main, al);
        lv.setAdapter(aa);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Category selectedCategory = al.get(position);
                String Category = selectedCategory.toString();

                Intent i = new Intent(MainActivity.this , SecondActivity.class);
                i.putExtra("category" , Category);
                startActivity(i);


            }
        });

    }
}
