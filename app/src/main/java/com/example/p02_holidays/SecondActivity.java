package com.example.p02_holidays;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {
    ListView lv;
    ArrayAdapter aa;
    ArrayList<Holiday> holiday;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        lv = this.findViewById(R.id.listViewOutput);
        holiday = new ArrayList<Holiday>();
        holiday.add(new Holiday("New Year's Day" , "1 Jan 2017"));
        holiday.add(new Holiday("Labour Day" , "1 May 2017"));
        aa = new HolidayAdapter(this, R.layout.row, holiday);
        lv.setAdapter(aa);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Holiday selectedHoliday = holiday.get(position);

                Toast.makeText(SecondActivity.this, selectedHoliday.getEventName()
                                + " Date: " + selectedHoliday.getDate(),
                        Toast.LENGTH_LONG).show();
            }
        });
    }
}
