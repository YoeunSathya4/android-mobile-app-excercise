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

        Button khmerToUSDButton = findViewById(R.id.khmerToUSDButton);
        Button usdToKhmerButton = findViewById(R.id.usdToKhmerButton);
//        Button khmerToEuroButton = findViewById(R.id.khmerToEuroButton);
//        Button euroToKhmerButton = findViewById(R.id.euroToKhmerButton);

        khmerToUSDButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openConverterActivity("KHR", "USD");
            }
        });

        usdToKhmerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openConverterActivity("USD", "KHR");
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
