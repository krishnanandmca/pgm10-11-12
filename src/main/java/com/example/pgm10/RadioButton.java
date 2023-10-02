package com.example.pgm10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.Toast;

public class RadioButton extends AppCompatActivity {

    RadioGroup rg;
    RadioButton rb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_button);
        rg = findViewById(R.id.rg);
    }

    public void click(View v){
        int id = rg.getCheckedRadioButtonId();

    }

}