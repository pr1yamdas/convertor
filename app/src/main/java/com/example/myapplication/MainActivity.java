package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    EditText editText;
    TextView textView3, textView6, valueofkg, valueofgram;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView3 = findViewById(R.id.textView3);
        textView6 = findViewById(R.id.textView6);
        valueofkg = findViewById(R.id.valueofkg);
        valueofgram = findViewById(R.id.valueofgram);

        editText = findViewById(R.id.editTextNumber);

        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ConvertFromKiloTogram();
            }
        });

    }

    private void ConvertFromKiloTogram() {
        String valueEnteredInKilo = editText.getText().toString();
        double kilo = Double.parseDouble(valueEnteredInKilo);

        double gram = kilo * 2.205;

        valueofgram.setText("" + gram + " POUNDS");
    }
}