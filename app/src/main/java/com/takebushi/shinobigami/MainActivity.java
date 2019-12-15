package com.takebushi.shinobigami;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity
implements View.OnClickListener {
    Button heyaButton;
    Button himiseButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        heyaButton = (Button) findViewById(R.id.kaributton);
        heyaButton.setOnClickListener(this);
        himiseButton = (Button)findViewById(R.id.himitubutton);
        himiseButton.setOnClickListener(this);



    }
    @Override
    public void onClick(View v) {
        if (v==heyaButton){
            Intent intent = new Intent(this,RoomCreateActivity.class);
            startActivity(intent);

        }

        if (v==himiseButton){
            Intent intent = new Intent(this,PostActivity.class);
            startActivity(intent);
        }

    }

}
