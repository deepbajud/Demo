package com.example.demobajud;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class Action_Floating_Button extends AppCompatActivity {

    private Button btnNext;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_action_floating_button);

        FloatingActionButton fab = findViewById(R.id.fab_btn);
        btnNext =(Button) findViewById(R.id.btnnext);


        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Action_Floating_Button.this, "You clicked on FAB button", Toast.LENGTH_SHORT).show();
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Intent = new Intent(Action_Floating_Button.this,Sneckbar.class);
                startActivity(Intent);
            }
        });


    }
}