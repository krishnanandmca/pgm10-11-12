package com.example.pgm10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

//12. Create an application to list the course names by using ListView. Display the
//        options selected from the list view.
public class ListViewActivity extends AppCompatActivity  {
    ListView listView;
    String[] courses={"MCA","MBA","M-Tech"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,courses);
        listView = findViewById(R.id.lv);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String item = adapter.getItem(i);

                Toast.makeText(getApplicationContext(),item,Toast.LENGTH_LONG).show();
                }
        });
    }
}