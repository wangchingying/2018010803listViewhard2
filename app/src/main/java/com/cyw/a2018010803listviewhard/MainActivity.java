package com.cyw.a2018010803listviewhard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

        ListView lv1;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            lv1=(ListView)findViewById(R.id.listView);
            Myadaptor adapter=new Myadaptor();
            lv1.setAdapter(adapter);
        }
        //BaseAdapter是一個抽象類別
        class Myadaptor extends BaseAdapter
        {

            @Override
            public int getCount() {
                return 6;
            }

            @Override
            public Object getItem(int i) {
                return null;
            }

            @Override
            public long getItemId(int i) {
                return 0;
            }

            @Override

            public View getView(int i, View view, ViewGroup viewGroup) {
                //TextView tv=new TextView(MainActivity.this);
                //tv.setText("hello"+i);
                //return tv;
                LayoutInflater inflater=LayoutInflater.from(com.cyw.a2018010803listviewhard.MainActivity.this);
                View v=inflater.inflate(R.layout.myitem,null);
                TextView tv=v.findViewById(R.id.textView);
                tv.setText("hello"+i);
                return v;
            }
        }
    }