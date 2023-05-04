package com.example.arrayadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
//TextView tv;
TextView [] tv=new TextView[3];
static String [] str=new String[3];
static int turn=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
//        String str = getIntent().getStringExtra("EXTRA_MESSAGE");
        str[turn] = getIntent().getStringExtra("EXTRA_MESSAGE");
        tv[0] = findViewById(R.id.textView);
        tv[1] = findViewById(R.id.textView2);
        tv[2] = findViewById(R.id.textView3);
        for (int i = 0; i < 3; i++) tv[i].setText(str[i]);
        turn++;
    }
    public void onC(View v){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}