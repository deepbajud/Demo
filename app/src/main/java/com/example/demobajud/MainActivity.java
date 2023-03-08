package com.example.demobajud;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    private ToggleButton toggleBtn;
    private TextView statusTV;
    private Button btnNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        toggleBtn =(ToggleButton) findViewById(R.id.idBtnToggle);
        statusTV =(TextView) findViewById(R.id.idTVStatus);
        btnNext =(Button) findViewById(R.id.btnNext);

        toggleBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (toggleBtn.isChecked()) {

                    statusTV.setText("Toggle Button is On");
                } else {

                    statusTV.setText("Toggle Button is Off");
                }

            }
        });


        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent Intent = new Intent(MainActivity.this,Action_Floating_Button.class);
                startActivity(Intent);



            }
        });





    }
}