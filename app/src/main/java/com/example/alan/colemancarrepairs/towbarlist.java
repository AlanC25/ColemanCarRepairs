package com.example.alan.colemancarrepairs;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import android.view.View;

/**
 * Created by Alan on 15/12/16.
 */

public class towbarlist extends AppCompatActivity
{

    private String[] towbars;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.towbarlist);

        this.towbars = new String[]
                {"Audi", "BMW", "Citroen", "Ford", "Honda", "Jaguar", "Lexus", "Mercedes", "Nissan", "Opel", "Peugeot", "Renault", "Saab", "Toyota", "Volkswagen"};
        ListView list = (ListView) findViewById(R.id.list);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, towbars);
        list.setAdapter(adapter);
        }
    }

