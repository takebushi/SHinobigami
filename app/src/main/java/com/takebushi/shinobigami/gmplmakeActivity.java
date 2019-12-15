package com.takebushi.shinobigami;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class gmplmakeActivity extends AppCompatActivity implements View.OnClickListener {
    Button listbutton;
    ListView hlistview;
    Plstatusadapter plstatusadapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gmplmake);
        listbutton = (Button)findViewById(R.id.homebutton);
        listbutton.setOnClickListener(this);
        hlistview = (ListView)findViewById(R.id.plmakelist);
    }
    @Override
    public void onClick(View v){
        if (v==listbutton){
            Intent intent = new Intent(this,MainActivity.class);
            startActivity(intent);
        }
    }
}
