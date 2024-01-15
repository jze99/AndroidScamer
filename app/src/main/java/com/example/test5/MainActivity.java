package com.example.test5;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView speedTestImageView;
    private ImageView hintsImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        speedTestImageView = findViewById(R.id.speedTestImageView);
        hintsImageView = findViewById(R.id.HintsImageView);
    }
    public void SpeedTestButton_Clic(View v)
    {
        speedTestImageView.setVisibility(View.VISIBLE);
    }
    public void HintsButton_Clic(View v)
    {
        hintsImageView.setVisibility(View.VISIBLE);
    }
}