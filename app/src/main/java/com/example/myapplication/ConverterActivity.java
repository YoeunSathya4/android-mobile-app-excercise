package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ConverterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_converter);

        EditText amountEditText = findViewById(R.id.amountEditText);
        Button convertButton = findViewById(R.id.convertButton);
        TextView resultTextView = findViewById(R.id.resultTextView);

        String fromCurrency = getIntent().getStringExtra("FROM_CURRENCY");
        String toCurrency = getIntent().getStringExtra("TO_CURRENCY");

        convertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Replace the conversion logic with actual rates
                double conversionRate = 0.0; // Replace with actual rate
                double amount = Double.parseDouble(amountEditText.getText().toString());
                double result = amount * conversionRate;
                resultTextView.setText(String.format("%.2f %s = %.2f %s", amount, fromCurrency, result, toCurrency));
            }
        });
    }
}
