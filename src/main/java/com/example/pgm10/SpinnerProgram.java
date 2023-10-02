package com.example.pgm10;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

//
//11. Create an application to enter student id, name, address, date of birth, course name
//        (use spinner) and display the details using a message box. Display the fees of the
//        course also.


public class SpinnerProgram extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    String courses[] = {"MBA","MCA","M-Tech"};
    Spinner s;
    String item="";

    EditText id,name,addr,date;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner_program);
        s = findViewById(R.id.spinner);
        s.setOnItemSelectedListener(this);

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item,courses);

        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        s.setAdapter(arrayAdapter);

        id = findViewById(R.id.id);
        name = findViewById(R.id.name);
        addr = findViewById(R.id.addr);
        date = findViewById(R.id.date);
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
            item = adapterView.getItemAtPosition(i).toString();

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }

    public void submit(View v) {
        int fee=0;
        if(item == "MCA"){
            fee=120000;
        }else if(item == "MBA"){
            fee=500000;
        }else if(item == "M-Tech"){
            fee=600000;
        }

        String message="Id: "+id.getText()+"\nName: "+name.getText()+"\nAddress: "+addr.getText()+"\nDate: "+date.getText()+"\nSelected Course: "+item+"\nFees: "+String.valueOf(fee);
        new AlertDialog.Builder(this)
                .setTitle("Student details")
                .setMessage(message)
                .setPositiveButton("OK",(dialog,which)->dialog.dismiss()).show();

    }
}