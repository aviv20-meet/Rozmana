package com.example.rozmana;

import android.content.Intent;
import android.os.Bundle;
import android.widget.CalendarView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class CalendarActivity extends AppCompatActivity {

    private static final String TAG = "CalendarActivity";
    private CalendarView calendarView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calendar_view);
        calendarView = (CalendarView) findViewById(R.id.calendar);

        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView calendarView, int i, int i1, int i2) {
                String date = i2+ "/"+(i1+1) + "/" + i;
                Intent intent = new Intent(CalendarActivity.this,BeforeCalendar.class);
                intent.putExtra("date", date);
                startActivity(intent);

            }
        });

    }
}