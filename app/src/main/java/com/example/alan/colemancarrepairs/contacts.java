package com.example.alan.colemancarrepairs;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Menu;
import android.widget.Button;


/**
 * Created by Alan on 16/12/16.
 */

public class contacts extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contact);

        //ring number in phone
        findViewById(R.id.callbutton1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialContactPhone("0861234567");
            }
        });

        //open messages with this number
        findViewById(R.id.messagebutton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number = "0861234567";
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.fromParts("sms", number, null)));
            }
        });
    }

    private void dialContactPhone(final String phoneNumber) {
        startActivity(new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phoneNumber, null)));
    }
}