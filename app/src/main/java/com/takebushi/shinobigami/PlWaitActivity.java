package com.takebushi.shinobigami;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;


public class PlWaitActivity extends AppCompatActivity {
    ListView mListView;
    Button backbutton;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.plwaitroom);
    }
}
