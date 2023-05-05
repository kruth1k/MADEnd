package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

   // Button btn;
    ListView lv;
    String s[]={"hello","motherfucker","pokemon"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv=findViewById(R.id.lv);
        ArrayAdapter<String> ad = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,s);
        lv.setAdapter(ad);
        //btn=findViewById(R.id.button);
       /* btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "hi it worked", Toast.LENGTH_SHORT).show();
            }
        });*/

        kruthik k= new kruthik(this,R.layout.kruthiklayout,s);
        lv.setAdapter(k);

    }
    public void dis(View view)
    {
        Toast.makeText(MainActivity.this, "hi it worked", Toast.LENGTH_SHORT).show();
    }
}