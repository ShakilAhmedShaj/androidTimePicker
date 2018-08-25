package com.t3ch.shaj.androidtimepicker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    private TimePicker timePicker;
    private TextView textView;
    private Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        timePicker = findViewById(R.id.TP_ID);
        textView = findViewById(R.id.TV_ID);
        button = findViewById(R.id.BT_ID);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                int hour = timePicker.getCurrentHour();
                int min = timePicker.getCurrentMinute();

                String format;

                if (hour == 0) {
                    hour += 12;
                    format = "AM";
                } else if (hour == 12) {
                    format = "PM";
                } else if (hour > 12) {
                    hour -= 12;
                    format = "PM";
                } else {
                    format = "AM";
                }




                String time = hour + ":" + min + " " + format;
                textView.setText(time);

            }
        });

    }


}

