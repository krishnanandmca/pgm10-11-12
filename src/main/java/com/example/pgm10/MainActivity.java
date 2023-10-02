package com.example.pgm10;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText e1,e2;
    RadioGroup r;
    RadioButton rb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1 = findViewById(R.id.e1);
        e2 = findViewById(R.id.e2);
        r=findViewById(R.id.rg);
    }


    public void button(View v){
        int bid = r.getCheckedRadioButtonId();
        rb = findViewById(bid);


        String title = "Mr";
        if(rb.getText()=="Male"){
            title = "Mr";
        }else if(rb.getText()=="Female"){
            title = "Ms";
        }
        int age = Integer.parseInt(e2.getText().toString());
        if(age>=18){
            String message = title+"."+e1.getText()+" of age "+String.valueOf(age)+" is eligible for voting";

            AlertDialog.Builder builder = new AlertDialog.Builder(this);


            builder.setTitle("Voting Eligibility")
                    .setMessage(message)
                    .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                            dialog.dismiss(); 
                        }
                    })
                    .show();



//          Toast.makeText(getApplicationContext(),"hello"+String.valueOf(age)+rb.getText(),Toast.LENGTH_LONG).show();


        }


    }




}