package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ConverterMainPageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button khmerToUSDButton = findViewById(R.id.khmerToUSDButton);
//        Button khmerToEuroButton = findViewById(R.id.khmerToEuroButton);
//        Button euroToKhmerButton = findViewById(R.id.euroToKhmerButton);

        khmerToUSDButton.setOnClickListener(new View.OnClickListener() {
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
