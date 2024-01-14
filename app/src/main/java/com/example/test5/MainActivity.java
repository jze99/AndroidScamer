package com.example.test5;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView _group_iteractable;
    private ImageView _group_iteractable2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        _group_iteractable = findViewById(R.id.group_iteractable);
        _group_iteractable2 = findViewById(R.id.group_iteractable2);
    }
    public void group_button(View v)
    {
        _group_iteractable.setVisibility(View.VISIBLE);
    }
    public void group_button2(View v)
    {
        _group_iteractable2.setVisibility(View.VISIBLE);
    }
}