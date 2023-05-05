package com.example.workingwithintents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {
    ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        lv=findViewById(R.id.lv2);
        ArrayList<String> ar=new ArrayList<>();
        ar=getIntent().getStringArrayListExtra("data");
        ArrayAdapter<String> adapt=new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, ar);
        lv.setAdapter(adapt);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String st=((TextView)view).getText().toString();
                Toast.makeText(MainActivity2.this, st, Toast.LENGTH_SHORT).show();
            }
        });

    }
}