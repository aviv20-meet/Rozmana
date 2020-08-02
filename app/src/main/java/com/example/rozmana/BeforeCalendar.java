package com.example.rozmana;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class BeforeCalendar extends AppCompatActivity {
    public static final String TAG = "BeforeCalendar";

    private TextView theDate;
    public Button btnGoCalendar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.before_calendar);

        theDate = (TextView) findViewById(R.id.Date);
        btnGoCalendar = (Button) findViewById(R.id.btnGoCalendar);

        //when coming over back from calendar this intent will receive the previous intent and get the date from it
        Intent incoming = getIntent();
        String date = incoming.getStringExtra("date");
        //set theDate text to date
        theDate.setText(date);

        btnGoCalendar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BeforeCalendar.this, CalendarActivity.class );
                startActivity(intent);
            }
        });


    }
}