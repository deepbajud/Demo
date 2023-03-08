package com.example.demobajud;

import androidx.appcompat.app.AppCompatActivity;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.snackbar.Snackbar;

public class Sneckbar extends AppCompatActivity {

    private Button btnsneckbar;
    private CoordinatorLayout coordinator;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sneckbar);

        coordinator =(CoordinatorLayout) findViewById(R.id.sneckbar);
        btnsneckbar =(Button) findViewById(R.id.btnsneckbar);

        btnsneckbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar snackbar = Snackbar.make(coordinator,"This is Snackbar",Snackbar.LENGTH_LONG)
                        .setAction("Undo", new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Snackbar snackbar1 = Snackbar.make(coordinator,"Done",Snackbar.LENGTH_SHORT);
                                snackbar1.show();
                            }
                        });
                snackbar.show();


            }
        });


    }
}