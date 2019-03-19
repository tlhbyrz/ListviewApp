package com.talhababa.listviewapp;

import android.content.Intent;
import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView textView = (TextView) findViewById(R.id.textView);
        ImageView imageView = (ImageView) findViewById(R.id.imageView);

        Intent intent = getIntent();
        String city = intent.getStringExtra("name");

        textView.setText(city);
       // imageView.setImageBitmap(MainActivity.selectedImage);
        globals glb = globals.getInstance();
        Bitmap bitmap = glb.getData();
        imageView.setImageBitmap(bitmap);

    }
}
