package com.example.car;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         TextView ticketView = findViewById(R.id.ticketView);


        Ticket Ticket = new Ticket( 120, "Санкт-Петербург", "4:00", "17:30", "Москва", 1000);

        ticketView.setText(ticketView.toString());
    }
}
