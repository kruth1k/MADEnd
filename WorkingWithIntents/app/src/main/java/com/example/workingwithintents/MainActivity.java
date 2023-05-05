package com.example.workingwithintents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Button btn;
    RadioGroup rg;
    RadioButton rb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=findViewById(R.id.btn1);
        ArrayList<String> arr=new ArrayList<>();
        arr.add("pokemon");
        arr.add("heyy jaanemann");
        rg=findViewById(R.id.radioGroup);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // fill it later
                Intent i = new Intent(MainActivity.this, MainActivity2.class);
                i.putExtra("data", arr);
                startActivity(i);
            }
        });
    }
    public void clicky(View v)
    {
        int rid=rg.getCheckedRadioButtonId();
        rb=findViewById(rid);
        Toast.makeText(this, "hello"+rb.getText().toString(), Toast.LENGTH_SHORT).show();

    }
}