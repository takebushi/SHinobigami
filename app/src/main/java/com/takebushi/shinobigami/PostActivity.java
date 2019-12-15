package com.takebushi.shinobigami;

import android.app.AppComponentFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class PostActivity extends AppCompatActivity
implements View.OnClickListener{
    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference refmsg = database.getReference("message");
    EditText mPlname;
    EditText mSecret;
    EditText mMission;
    Button mPostbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gmpladdroom);
        mPlname = (EditText)findViewById(R.id.plname);
        mMission =(EditText)findViewById(R.id.mission);
        mSecret =(EditText)findViewById(R.id.secret);
        mPostbutton = (Button)findViewById(R.id.postbutton);
        mPostbutton.setOnClickListener(this);
    }
    @Override
    public void onClick(View v){
        int id = v.getId();
        switch (id){
            case R.id.postbutton:
                String name = mPlname.getText().toString();
                String miss = mMission.getText().toString();
                String secre = mSecret.getText().toString();
                Post post = new Post(name,miss,secre);
                refmsg.push().setValue(post);
                finish();
                break;
        }
    }

}
