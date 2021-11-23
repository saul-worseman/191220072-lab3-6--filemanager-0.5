package com.michaldabski.filemanager;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SampleActivity extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample);
        findViewById(R.id.button3).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.button3){
            try
            {
                Intent intent = new Intent(this, com.michaldabski.filemanager.about.AboutActivity.class);
                startActivity(intent);
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}