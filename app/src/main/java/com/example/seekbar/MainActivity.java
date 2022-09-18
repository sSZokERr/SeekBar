package com.example.seekbar;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private SeekBar redseekbar;
    private RelativeLayout relativeLayout;
    private TextView red;
    private TextView blue;
    private TextView green;
    private SeekBar blueseekbar;
    private SeekBar greenseekbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_main);
        init();

        redseekbar.setMax(255);
        greenseekbar.setMax(255);
        blueseekbar.setMax(255);
        redseekbar.setProgress(0);
        greenseekbar.setProgress(0);
        blueseekbar.setProgress(0);

        final int[] RED = {0};
        final int[] GREEN = {0};
        final int[] BLUE = {0};

        redseekbar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                red.setText("Red: " + i);
                relativeLayout.setBackgroundColor(Color.rgb(redseekbar.getProgress(), greenseekbar.getProgress(), blueseekbar.getProgress()));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        greenseekbar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                green.setText("Green: " + i);

                relativeLayout.setBackgroundColor(Color.rgb(redseekbar.getProgress(), greenseekbar.getProgress(), blueseekbar.getProgress()));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        blueseekbar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                blue.setText("Blue: " + i);

                relativeLayout.setBackgroundColor(Color.rgb(redseekbar.getProgress(), greenseekbar.getProgress(), blueseekbar.getProgress()));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

    }

    private void init(){
        relativeLayout = findViewById(R.id.RelativeLayout);
        red = findViewById(R.id.Red);
        green = findViewById(R.id.Green);
        blue = findViewById(R.id.Blue);
        redseekbar = findViewById(R.id.RedSeekBar);
        greenseekbar = findViewById(R.id.GreenSeekBar);
        blueseekbar = findViewById(R.id.BlueSeekBar);
    }

}