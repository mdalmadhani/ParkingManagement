package com.example.parkingmanagment;
// com.example.parkingmanagment.BookingActivity

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class BookingActivity extends AppCompatActivity {
    private EditText editTextCustomerName, editTextCustomerNumber, editTextHours;
    private Button buttonCalculate, buttonSave, buttonRead, buttonClear, buttonClose;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking);

        editTextCustomerName = findViewById(R.id.editTextCustomerName);
        editTextCustomerNumber = findViewById(R.id.editTextCustomerNumber);
        editTextHours = findViewById(R.id.editTextHours);

        buttonCalculate = findViewById(R.id.buttonCalculate);
        buttonSave = findViewById(R.id.buttonSave);
        buttonRead = findViewById(R.id.buttonRead);
        buttonClear = findViewById(R.id.buttonClear);
        buttonClose = findViewById(R.id.buttonClose);

        buttonCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Implement your calculation logic here
                Toast.makeText(BookingActivity.this, "Calculating...", Toast.LENGTH_SHORT).show();
            }
        });

        buttonSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Implement your save logic here
                Toast.makeText(BookingActivity.this, "Saving...", Toast.LENGTH_SHORT).show();
            }
        });

        buttonRead.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Implement your read logic here
                Toast.makeText(BookingActivity.this, "Reading...", Toast.LENGTH_SHORT).show();
            }
        });

        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Implement your clear logic here
                editTextCustomerName.setText("");
                editTextCustomerNumber.setText("");
                editTextHours.setText("");
                Toast.makeText(BookingActivity.this, "Cleared", Toast.LENGTH_SHORT).show();
            }
        });

        buttonClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Implement your close logic here
                finish(); // Close the activity
            }
        });
    }
}