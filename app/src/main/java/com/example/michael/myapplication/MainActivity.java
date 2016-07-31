package com.example.michael.myapplication;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
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
        View background = findViewById(R.id.edit_message);
        Drawable backgnd = background.getBackground();
        backgnd.setAlpha(80);
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

    /**
     * Displays local bus stops with shelter.
     *
     * @param v
     */
    public void button3Click(View v){
        // <div><iframe width="500px" title="BulcockStBusShelters" height="425px" src="https://data.sunshinecoast.qld.gov.au/w/uhd2-5ms8/a3df-rhuu?cur=HttVAMFGDdx&from=root" frameborder="0"scrolling="no"><a href="https://data.sunshinecoast.qld.gov.au/Transportation/BulcockStBusShelters/uhd2-5ms8" title="BulcockStBusShelters" target="_blank">BulcockStBusShelters</a></iframe><p><a href="http://www.socrata.com/" target="_blank">Powered by Socrata</a></p></div>
        String url = "https://data.sunshinecoast.qld.gov.au/w/uhd2-5ms8/a3df-rhuu?cur=HttVAMFGDdx&from=root";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }
}
