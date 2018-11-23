package com.example.yulindraadjie.suitmedia12;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class Event extends AppCompatActivity {
    String event;

    String[] title = new String[]{"Let Success Make The Noise", "Semangat Tahun Baru", "Work Hard in Smile",
            "Another Message"};
    String[] date = {"Nov 09 2014","Oct 21 2014","Jun 14 2014", "Feb 14 2018"};
    String[] tag = {"#nutricia","#nutricia","#highlight","#event"};
    String[] desc = {"Lorem ipsum dolor sit amet"};
    int[] imgs = {R.drawable.imagelist,R.drawable.imagelist2,R.drawable.imagelist3,R.drawable.imagelist};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("MESSAGE FROM CODI");

        ListView listEvent = findViewById(R.id.listEvent);
        EventAdapter adapter = new EventAdapter(this, title, date, tag, desc ,imgs);
        listEvent.setAdapter(adapter);

    }

    class EventAdapter extends ArrayAdapter<String> {
        Context context;
        String currNameEvent[];
        String currDateEvent[];
        String currTagEvent[];
        String currDescEvent[];
        int[] imgs;

        EventAdapter(Context c, String[] nameEvent, String[] dateEvent, String[] tagEvent, String[] descEvent,int[] images){
            super(c,R.layout.row, R.id.mainTitle, nameEvent);
            this.context = c;
            this.imgs = images;
            this.currNameEvent = nameEvent;
            this.currDateEvent = dateEvent;
            this.currTagEvent = tagEvent;
            this.currDescEvent = descEvent;
        }


        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater = (LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row = layoutInflater.inflate(R.layout.row, parent, false);
            //View row = layoutInflater.inflate(R.layout.row, parent, false);
            ImageView images = row.findViewById(R.id.mainImg);
            TextView nameEvent = row.findViewById(R.id.mainTitle);
            TextView dateEvent = row.findViewById(R.id.mainDate);
            TextView tagEvent = row.findViewById(R.id.mainTag);
            TextView descEvent = row.findViewById(R.id.mainDesc);
            images.setImageResource(imgs[position]);

            nameEvent.setText(currNameEvent[position]);
            dateEvent.setText(currDateEvent[position]);
            tagEvent.setText((currTagEvent[position]));
            descEvent.setText(currDescEvent[0]);
            return row;
        }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the main_menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }
}
