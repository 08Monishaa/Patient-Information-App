package com.example.patientinformationapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Patient App - REG NO: 23ITXXX");
        setContentView(R.layout.activity_main);

        Spinner spIllness = findViewById(R.id.spIllness);

        String[] illness = {"Fever","Cold","Diabetes","BP"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_spinner_dropdown_item, illness);
        spIllness.setAdapter(adapter);

        findViewById(R.id.btnSubmit).setOnClickListener(v -> {
            Intent i = new Intent(this, SecondActivity.class);
            startActivity(i);
        });
    }
}
