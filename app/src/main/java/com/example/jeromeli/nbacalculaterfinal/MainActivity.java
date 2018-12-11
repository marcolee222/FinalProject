package com.example.jeromeli.nbacalculaterfinal;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button ESPNBtn = (Button) findViewById(R.id.ESPNBtn);
        ESPNBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ESPN = "http://www.espn.com";
                Uri webaddress = Uri.parse(ESPN);

                Intent gotoESPN = new Intent(Intent.ACTION_VIEW, webaddress);
                if (gotoESPN.resolveActivity(getPackageManager()) != null) {
                    startActivity(gotoESPN);
                }
            }
        });

        final Button ScorerBtn = (Button) findViewById(R.id.ScorerBtn);
        ScorerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), Main2Activity.class);
                startActivity(startIntent);
            }
        });
        final Button rua = (Button) findViewById(R.id.rua);
        rua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), Main3Activity.class);
                startActivity(startIntent);
            }
        });
    }
}

