package com.example.jeromeli.nbacalculaterfinal;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button WhoBtn = (Button) findViewById(R.id.WhoBtn);
        WhoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText PointBtn = (EditText) findViewById(R.id.PointBtn);
                EditText GameBtn = (EditText) findViewById(R.id.GameBtn);
                EditText NameText = (EditText) findViewById(R.id.NameText);
                TextView resultTextView = (TextView) findViewById(R.id.resultTextView);

                double num1 = Double.parseDouble(PointBtn.getText().toString());
                Integer num2 = Integer.parseInt(GameBtn.getText().toString());
                double result = num1 * num2;
                String first = NameText.getText().toString();
                resultTextView.setText(first + "  " + result);
            }
        });
    }
}
