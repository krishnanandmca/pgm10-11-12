package com.example.pgm10;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class OptionActivity extends AppCompatActivity {
        EditText e1, e2;
        TextView t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option);

        e1 = findViewById(R.id.editTextNumber);
        e2 = findViewById(R.id.editTextNumber2);
        t1 = findViewById(R.id.textView3);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int i = item.getItemId();
        int n = Integer.parseInt(e1.getText().toString());
        int m = Integer.parseInt(e2.getText().toString());
        int res=0;
        if(i== R.id.item1) {
            res = n+m;
            t1.setText(String.valueOf(res));

            return true;
        }else if(i== R.id.item2) {
            res = n-m;
            t1.setText(String.valueOf(res));

              return true;

        }else if(i == R.id.item3){
            res = n*m;
            t1.setText(String.valueOf(res));

            return true;

        }


        return super.onOptionsItemSelected(item);
    }
}