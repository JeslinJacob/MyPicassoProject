package com.example.jeslin.mypicassoproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView img=(ImageView)findViewById(R.id.imageView);
        Picasso.with(this).load("https://c1.staticflickr.com/8/7495/15662047908_9d35cbe2f0_n.jpg")
                .placeholder(R.drawable.picback).error(R.drawable.err)
                .into(img);

    }
}
