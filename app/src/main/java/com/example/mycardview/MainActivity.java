package com.example.mycardview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
private CardView schoolCard1,hospitalCard2,restaurentCard2,airportCard2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        schoolCard1=findViewById(R.id.schoolCard);
        hospitalCard2=findViewById(R.id.hopitalCard);
        restaurentCard2=findViewById(R.id.restaurentCard);
        airportCard2=findViewById(R.id.airportCard);
schoolCard1.setOnClickListener(this);
hospitalCard2.setOnClickListener(this);
restaurentCard2.setOnClickListener(this);
airportCard2.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.schoolCard){
            Intent intent=new Intent(MainActivity.this,SchoolActivity.class);
            startActivity(intent);
        }
        else if(view.getId()==R.id.hopitalCard){
            Intent intent=new Intent(MainActivity.this,HospitalActivity.class);
            startActivity(intent);
        }
        else if(view.getId()==R.id.restaurentCard){
            Intent intent=new Intent(MainActivity.this,ReastaurentActivity.class);
            startActivity(intent);
        }
        else if(view.getId()==R.id.airportCard){
            Intent intent=new Intent(MainActivity.this,AirportActivity.class);
            startActivity(intent);
        }
    }
}
