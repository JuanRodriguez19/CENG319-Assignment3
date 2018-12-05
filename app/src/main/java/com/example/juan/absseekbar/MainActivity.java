package com.example.juan.absseekbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Creating variables for all views
    //First SeekBar
    private TextView percentage;
    private ProgressBar progressBar;
    private SeekBar seekBar;

    //Second SeekBar
    private TextView percentage2;
    private ProgressBar progressBar2;
    private SeekBar seekBar2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Assigning views previously declared
        percentage = (TextView) findViewById(R.id.percentage);
        progressBar = (ProgressBar) findViewById(R.id.progressBar);
        seekBar = (SeekBar) findViewById(R.id.seekBar);

        percentage2 = (TextView) findViewById(R.id.percentage2);
        progressBar2 = (ProgressBar) findViewById(R.id.progressBar2);
        seekBar2 = (SeekBar) findViewById(R.id.seekBar2);

        //Create 3 methods that add functionality depending on the state of the SeekBar
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            //Tracks the progress of the SeekBar
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                progressBar.setProgress(progress);
                percentage.setText("Current Progress is at " + progress + "%");

            }

            //Tracks when the SeekBar first starts changing
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                //Displays message when user first starts moving the bar
                Toast.makeText(MainActivity.this,"SeekBar Begins Tracking",Toast.LENGTH_SHORT).show();

            }

            //Tracks when the SeekBar stops changing values
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                //Displays message when user stops moving the bar
                Toast.makeText(MainActivity.this,"SeekBar Stops Tracking",Toast.LENGTH_SHORT).show();

            }
        });

        //Another example of how a different style SeekBar can be displayed
        seekBar2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                progressBar2.setProgress(progress);
                percentage2.setText("" + progress + "%");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                Toast.makeText(MainActivity.this,"SeekBar Begins Tracking",Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                Toast.makeText(MainActivity.this,"SeekBar Stops Tracking",Toast.LENGTH_SHORT).show();

            }
        });
    }
}
