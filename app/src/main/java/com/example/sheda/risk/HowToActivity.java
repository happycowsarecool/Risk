package com.example.sheda.risk;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class HowToActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_how_to);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        Button mBtn1 = (Button) findViewById(R.id.preparation);
        mBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(HowToActivity.this, PreparationActivity.class);
                startActivity(i);


            }

        });


        Button mBtn2 = (Button) findViewById(R.id.cards);
        mBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(HowToActivity.this, CardActivity.class);
                startActivity(i);


            }

        });

        Button mBtn3 = (Button) findViewById(R.id.armies);
        mBtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(HowToActivity.this, ArmiesUnitsActivity.class);
                startActivity(i);


            }

        });
        Button mBtn4 = (Button) findViewById(R.id.attacking);
        mBtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(HowToActivity.this, AttackingDefendingActivity.class);
                startActivity(i);


            }

        });
        Button mBtn5 = (Button) findViewById(R.id.fortifying);
        mBtn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(HowToActivity.this, FortifyingActivity.class);
                startActivity(i);


            }

        });
        Button mBtn6 = (Button) findViewById(R.id.back);
        mBtn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(HowToActivity.this, RiskActivity.class);
                startActivity(i);


            }

        });
    }

}
