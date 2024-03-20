package com.example.remindergame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void knock(View view) {
        int id = view.getId();
        if (id == R.id.beagle1)
        {
            ImageView card = (ImageView) view;
            card.setImageResource(R.drawable.beagle);
        }

    }
}