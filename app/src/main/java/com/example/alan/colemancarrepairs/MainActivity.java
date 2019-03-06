package com.example.alan.colemancarrepairs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Menu;
import android.widget.Button;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button towbarbutton = (Button)findViewById(R.id.towbarbutton);
        Button contactbutton = (Button)findViewById(R.id.contactbutton);
        Button emailbutton = (Button)findViewById(R.id.emailbutton);

        //opens email
        emailbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("plain/text");
                intent.putExtra(Intent.EXTRA_EMAIL, new String[] { "repairs@gmail.com" });
                intent.putExtra(Intent.EXTRA_SUBJECT, "Estimate");
                intent.putExtra(Intent.EXTRA_TEXT, "Please include a detailed description of all damage & pictures to receive an initial estimate. Estimates are as accurate as possible but will not neccessarily be the same price as quoted when a car is seen in person, as it is often difficult to jusge accurately through pictures.");
                startActivity(Intent.createChooser(intent, ""));
            }
        });

        //brings us to the towbar page
        towbarbutton.setOnClickListener(new View.OnClickListener() {
            @Override
                    public void onClick(View v) {

                        Intent towbarPage = new Intent(MainActivity.this, towbarlist.class);
                        startActivity(towbarPage);
                    }
                });
        //brings us to the contacts page
        contactbutton.setOnClickListener(new View.OnClickListener() {
            @Override
                     public void onClick(View v) {

                         Intent contactPage = new Intent(MainActivity.this, contacts.class);
                         startActivity(contactPage);
                     }
        });
    }
}
