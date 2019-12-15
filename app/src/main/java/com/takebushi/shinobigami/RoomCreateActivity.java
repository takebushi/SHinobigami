package com.takebushi.shinobigami;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class RoomCreateActivity extends AppCompatActivity implements View.OnClickListener {
    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference rsfmsg = database.getReference("rooms");
    Button makebutton;
    EditText roomname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_room_create);
        makebutton = (Button)findViewById(R.id.karimakebutton);
        makebutton.setOnClickListener(this);
        roomname = (EditText)findViewById(R.id.kariname);

    }
    @Override
    public void onClick(View v){
        int id = v.getId();
        switch (id){
            case R.id.karimakebutton:
                String kariname = roomname.getText().toString();
                Room room = new Room(kariname);
                rsfmsg.push().setValue(room);
                finish();
                break;

        }
    }
}
