package com.talhababa.listviewapp;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    static Bitmap selectedImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = (ListView) findViewById(R.id.listview);
        final ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Paris");
        arrayList.add("Milano");
        arrayList.add("Istanbul");
        arrayList.add("Madrid");

        Bitmap paris = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.paris);
        Bitmap milano = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.milano);
        Bitmap istanbul = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.istanbul);
        Bitmap madrid = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.madrid);


        final ArrayList<Bitmap> arrayList1=new ArrayList<>();
        arrayList1.add(paris);
        arrayList1.add(milano);
        arrayList1.add(istanbul);
        arrayList1.add(madrid);

        ArrayAdapter arrayAdapter = new ArrayAdapter(this,android.R.layout.simple_dropdown_item_1line,arrayList);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getApplicationContext(),Main2Activity.class);
                intent.putExtra("name",arrayList.get(position));
                //selectedImage = arrayList1.get(position);
                Bitmap bitmap = arrayList1.get(position);
                globals glb = globals.getInstance();
                glb.setData(bitmap);
                startActivity(intent);
            }
        });

    }
}
