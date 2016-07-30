package com.example.michael.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public final static String EXTRA_MESSAGE ="com.example.myfirstapp.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void button1Click(View v){
//        Button but = (Button) v;
//        but.setText("Done!");
          Intent intent = new Intent(this, FamilyActivity.class);
//        EditText editText =(EditText) findViewById(R.id.edit_message);
//        String message = editText.getText().toString();
//        intent.putExtra(EXTRA_MESSAGE,message);
        startActivity(intent);
    }

    public void button2Click(View v){
        Intent intent = new Intent(this, ShoppingActivity.class);
        startActivity(intent);
    }
}
