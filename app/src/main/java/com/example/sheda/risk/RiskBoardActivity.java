package com.example.sheda.risk;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class RiskBoardActivity extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_risk_board);
       // Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);



        //users



        //countries

        Button Asia1= (Button) findViewById(R.id.Asia_1);
        Asia1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                startActivity(new Intent(RiskBoardActivity.this,PopUpWindow.class));
            }
                                 }

        );



        Button Asia2= (Button) findViewById(R.id.Asia_2);
        Asia2.setOnClickListener(new View.OnClickListener(){
                                     @Override
                                     public void onClick(View v){
                                         startActivity(new Intent(RiskBoardActivity.this,PopUpWindow.class));
                                     }
                                 }

        );

        Button Asia3= (Button) findViewById(R.id.Asia_3);
        Asia3.setOnClickListener(new View.OnClickListener(){
                                     @Override
                                     public void onClick(View v){
                                         startActivity(new Intent(RiskBoardActivity.this,PopUpWindow.class));
                                     }
                                 }

        );

        Button Asia4= (Button) findViewById(R.id.Asia_4);
        Asia4.setOnClickListener(new View.OnClickListener(){
                                     @Override
                                     public void onClick(View v){
                                         startActivity(new Intent(RiskBoardActivity.this,PopUpWindow.class));
                                     }
                                 }

        );

        Button Asia5= (Button) findViewById(R.id.Asia_5);
        Asia5.setOnClickListener(new View.OnClickListener(){
                                     @Override
                                     public void onClick(View v){
                                         startActivity(new Intent(RiskBoardActivity.this,PopUpWindow.class));
                                     }
                                 }

        );

        Button Asia6= (Button) findViewById(R.id.Asia_6);
        Asia6.setOnClickListener(new View.OnClickListener(){
                                     @Override
                                     public void onClick(View v){
                                         startActivity(new Intent(RiskBoardActivity.this,PopUpWindow.class));
                                     }
                                 }

        );

        Button Asia7= (Button) findViewById(R.id.Asia_7);
        Asia7.setOnClickListener(new View.OnClickListener(){
                                     @Override
                                     public void onClick(View v){
                                         startActivity(new Intent(RiskBoardActivity.this,PopUpWindow.class));
                                     }
                                 }

        );

        Button Asia8= (Button) findViewById(R.id.Asia_8);
        Asia8.setOnClickListener(new View.OnClickListener(){
                                     @Override
                                     public void onClick(View v){
                                         startActivity(new Intent(RiskBoardActivity.this,PopUpWindow.class));
                                     }
                                 }

        );

        Button Asia9= (Button) findViewById(R.id.Asia_9);
        Asia9.setOnClickListener(new View.OnClickListener(){
                                     @Override
                                     public void onClick(View v){
                                         startActivity(new Intent(RiskBoardActivity.this,PopUpWindow.class));
                                     }
                                 }

        );

        Button Asia10= (Button) findViewById(R.id.Asia_10);
        Asia10.setOnClickListener(new View.OnClickListener(){
                                     @Override
                                     public void onClick(View v){
                                         startActivity(new Intent(RiskBoardActivity.this,PopUpWindow.class));
                                     }
                                 }

        );

        Button Asia11= (Button) findViewById(R.id.Asia_11);
        Asia11.setOnClickListener(new View.OnClickListener(){
                                     @Override
                                     public void onClick(View v){
                                         startActivity(new Intent(RiskBoardActivity.this,PopUpWindow.class));
                                     }
                                 }

        );

        Button NA1= (Button) findViewById(R.id.North_America_1);
        NA1.setOnClickListener(new View.OnClickListener(){
                                     @Override
                                     public void onClick(View v){
                                         startActivity(new Intent(RiskBoardActivity.this,PopUpWindow.class));
                                     }
                                 }

        );

        Button NA2= (Button) findViewById(R.id.North_America_2);
        NA2.setOnClickListener(new View.OnClickListener(){
                                   @Override
                                   public void onClick(View v){
                                       startActivity(new Intent(RiskBoardActivity.this,PopUpWindow.class));
                                   }
                               }

        );

        Button NA3= (Button) findViewById(R.id.North_America_3);
        NA3.setOnClickListener(new View.OnClickListener(){
                                   @Override
                                   public void onClick(View v){
                                       startActivity(new Intent(RiskBoardActivity.this,PopUpWindow.class));
                                   }
                               }

        );

        Button NA4= (Button) findViewById(R.id.North_America_4);
        NA4.setOnClickListener(new View.OnClickListener(){
                                   @Override
                                   public void onClick(View v){
                                       startActivity(new Intent(RiskBoardActivity.this,PopUpWindow.class));
                                   }
                               }

        );

        Button NA5= (Button) findViewById(R.id.North_America_5);
        NA5.setOnClickListener(new View.OnClickListener(){
                                   @Override
                                   public void onClick(View v){
                                       startActivity(new Intent(RiskBoardActivity.this,PopUpWindow.class));
                                   }
                               }

        );

        Button NA6= (Button) findViewById(R.id.North_America_6);
        NA6.setOnClickListener(new View.OnClickListener(){
                                   @Override
                                   public void onClick(View v){
                                       startActivity(new Intent(RiskBoardActivity.this,PopUpWindow.class));
                                   }
                               }

        );

        Button NA7= (Button) findViewById(R.id.North_America_7);
        NA7.setOnClickListener(new View.OnClickListener(){
                                   @Override
                                   public void onClick(View v){
                                       startActivity(new Intent(RiskBoardActivity.this,PopUpWindow.class));
                                   }
                               }

        );

        Button NA8= (Button) findViewById(R.id.North_America_8);
        NA8.setOnClickListener(new View.OnClickListener(){
                                   @Override
                                   public void onClick(View v){
                                       startActivity(new Intent(RiskBoardActivity.this,PopUpWindow.class));
                                   }
                               }

        );

        Button NA9= (Button) findViewById(R.id.North_America_9);
        NA9.setOnClickListener(new View.OnClickListener(){
                                   @Override
                                   public void onClick(View v){
                                       startActivity(new Intent(RiskBoardActivity.this,PopUpWindow.class));
                                   }
                               }

        );

        Button EU1= (Button) findViewById(R.id.Europe_1);
        EU1.setOnClickListener(new View.OnClickListener(){
                                   @Override
                                   public void onClick(View v){
                                       startActivity(new Intent(RiskBoardActivity.this,PopUpWindow.class));
                                   }
                               }

        );

        Button EU2= (Button) findViewById(R.id.Europe_2);
        EU2.setOnClickListener(new View.OnClickListener(){
                                   @Override
                                   public void onClick(View v){
                                       startActivity(new Intent(RiskBoardActivity.this,PopUpWindow.class));
                                   }
                               }

        );

        Button EU3= (Button) findViewById(R.id.Europe_3);
        EU3.setOnClickListener(new View.OnClickListener(){
                                   @Override
                                   public void onClick(View v){
                                       startActivity(new Intent(RiskBoardActivity.this,PopUpWindow.class));
                                   }
                               }

        );

        Button EU4= (Button) findViewById(R.id.Europe_4);
        EU4.setOnClickListener(new View.OnClickListener(){
                                   @Override
                                   public void onClick(View v){
                                       startActivity(new Intent(RiskBoardActivity.this,PopUpWindow.class));
                                   }
                               }

        );

        Button EU5= (Button) findViewById(R.id.Europe_5);
        EU5.setOnClickListener(new View.OnClickListener(){
                                   @Override
                                   public void onClick(View v){
                                       startActivity(new Intent(RiskBoardActivity.this,PopUpWindow.class));
                                   }
                               }

        );

        Button EU6= (Button) findViewById(R.id.Europe_6);
        EU6.setOnClickListener(new View.OnClickListener(){
                                   @Override
                                   public void onClick(View v){
                                       startActivity(new Intent(RiskBoardActivity.this,PopUpWindow.class));
                                   }
                               }

        );

        Button EU7= (Button) findViewById(R.id.Europe_7);
        EU7.setOnClickListener(new View.OnClickListener(){
                                   @Override
                                   public void onClick(View v){
                                       startActivity(new Intent(RiskBoardActivity.this,PopUpWindow.class));
                                   }
                               }

        );

        Button AF1= (Button) findViewById(R.id.Africa_1);
        AF1.setOnClickListener(new View.OnClickListener(){
                                   @Override
                                   public void onClick(View v){
                                       startActivity(new Intent(RiskBoardActivity.this,PopUpWindow.class));
                                   }
                               }

        );

        Button AF2= (Button) findViewById(R.id.Africa_2);
        AF2.setOnClickListener(new View.OnClickListener(){
                                   @Override
                                   public void onClick(View v){
                                       startActivity(new Intent(RiskBoardActivity.this,PopUpWindow.class));
                                   }
                               }

        );

        Button AF3= (Button) findViewById(R.id.Africa_3);
        AF3.setOnClickListener(new View.OnClickListener(){
                                   @Override
                                   public void onClick(View v){
                                       startActivity(new Intent(RiskBoardActivity.this,PopUpWindow.class));
                                   }
                               }

        );

        Button AF4= (Button) findViewById(R.id.Africa_4);
        AF4.setOnClickListener(new View.OnClickListener(){
                                   @Override
                                   public void onClick(View v){
                                       startActivity(new Intent(RiskBoardActivity.this,PopUpWindow.class));
                                   }
                               }

        );

        Button AF5= (Button) findViewById(R.id.Africa_5);
        AF5.setOnClickListener(new View.OnClickListener(){
                                   @Override
                                   public void onClick(View v){
                                       startActivity(new Intent(RiskBoardActivity.this,PopUpWindow.class));
                                   }
                               }

        );

        Button AF6= (Button) findViewById(R.id.Africa_6);
        AF6.setOnClickListener(new View.OnClickListener(){
                                   @Override
                                   public void onClick(View v){
                                       startActivity(new Intent(RiskBoardActivity.this,PopUpWindow.class));
                                   }
                               }

        );

        Button SA1 = (Button) findViewById(R.id.South_America_1);
        SA1.setOnClickListener(new View.OnClickListener(){
                                   @Override
                                   public void onClick(View v){
                                       startActivity(new Intent(RiskBoardActivity.this,PopUpWindow.class));
                                   }
                               }

        );

        Button SA2 = (Button) findViewById(R.id.South_America_2);
        SA2.setOnClickListener(new View.OnClickListener(){
                                   @Override
                                   public void onClick(View v){
                                       startActivity(new Intent(RiskBoardActivity.this,PopUpWindow.class));
                                   }
                               }

        );

        Button SA3 = (Button) findViewById(R.id.South_America_3);
        SA3.setOnClickListener(new View.OnClickListener(){
                                   @Override
                                   public void onClick(View v){
                                       startActivity(new Intent(RiskBoardActivity.this,PopUpWindow.class));
                                   }
                               }

        );

        Button SA4 = (Button) findViewById(R.id.South_America_4);
        SA4.setOnClickListener(new View.OnClickListener(){
                                   @Override
                                   public void onClick(View v){
                                       startActivity(new Intent(RiskBoardActivity.this,PopUpWindow.class));
                                   }
                               }

        );

        Button AU1 = (Button) findViewById(R.id.Australia_1);
        AU1.setOnClickListener(new View.OnClickListener(){
                                   @Override
                                   public void onClick(View v){
                                       startActivity(new Intent(RiskBoardActivity.this,PopUpWindow.class));
                                   }
                               }

        );

        Button AU2 = (Button) findViewById(R.id.Australia_2);
        AU2.setOnClickListener(new View.OnClickListener(){
                                   @Override
                                   public void onClick(View v){
                                       startActivity(new Intent(RiskBoardActivity.this,PopUpWindow.class));
                                   }
                               }

        );

        Button AU3 = (Button) findViewById(R.id.Australia_3);
        AU3.setOnClickListener(new View.OnClickListener(){
                                   @Override
                                   public void onClick(View v){
                                       startActivity(new Intent(RiskBoardActivity.this,PopUpWindow.class));
                                   }
                               }

        );

        Button AU4 = (Button) findViewById(R.id.Australia_4);
        AU4.setOnClickListener(new View.OnClickListener(){
                                   @Override
                                   public void onClick(View v){
                                       startActivity(new Intent(RiskBoardActivity.this,PopUpWindow.class));
                                   }
                               }

        );


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });



    }

}
