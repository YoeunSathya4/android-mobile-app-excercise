package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button converterMainPage = findViewById(R.id.converterMainPage);
//        Button khmerToEuroButton = findViewById(R.id.khmerToEuroButton);
//        Button euroToKhmerButton = findViewById(R.id.euroToKhmerButton);

        converterMainPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openConverterActivity("KHR", "USD");
            }
        });
    }

    private void openConverterActivity(String fromCurrency, String toCurrency) {
        Intent intent = new Intent(this, ConverterActivity.class);
        intent.putExtra("FROM_CURRENCY", fromCurrency);
        intent.putExtra("TO_CURRENCY", toCurrency);
        startActivity(intent);
    }
}
