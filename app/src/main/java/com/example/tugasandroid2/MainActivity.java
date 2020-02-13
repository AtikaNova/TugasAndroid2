package com.example.tugasandroid2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button1, button2, button3, button4, button5, button6;
    private TextView Hasil;
    private EditText Input;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        Hasil = findViewById(R.id.Hasil);
        Input = findViewById(R.id.input);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    String sInput = Input.getText().toString();
                    double Input = Double.parseDouble(sInput);
                    double dHasil = Math.sin(Input);

                    String sHasil = String.valueOf(dHasil);
                    Hasil.setText(sHasil);
                }catch (NumberFormatException nfe){
                    Toast.makeText(getApplicationContext(), "Field Tidak Boleh Kosong", Toast.LENGTH_SHORT).show();
                }
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    String sInput = Input.getText().toString();
                    double Input = Double.parseDouble(sInput);
                    double dHasil = Math.sin(Input);

                    String sHasil = String.valueOf(dHasil);
                    Hasil.setText(sHasil);
                }catch (NumberFormatException nfe){
                    Toast.makeText(getApplicationContext(), "Field Tidak Boleh Kosong", Toast.LENGTH_SHORT).show();
                }
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    String sInput = Input.getText().toString();
                    double Input = Double.parseDouble(sInput);
                    double dHasil = Math.sin(Input);

                    String sHasil = String.valueOf(dHasil);
                    Hasil.setText(sHasil);
                }catch (NumberFormatException nfe){
                    Toast.makeText(getApplicationContext(), "Field Tidak Boleh Kosong", Toast.LENGTH_SHORT).show();
                }
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    String sInput = Input.getText().toString();
                    double Input = Double.parseDouble(sInput);
                    double dHasil = Math.sin(Input);

                    String sHasil = String.valueOf(dHasil);
                    Hasil.setText(sHasil);
                }catch (NumberFormatException nfe){
                    Toast.makeText(getApplicationContext(), "Field Tidak Boleh Kosong", Toast.LENGTH_SHORT).show();
                }
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    String sInput = Input.getText().toString();
                    double Input = Double.parseDouble(sInput);
                    double dHasil = Math.sin(Input);

                    String sHasil = String.valueOf(dHasil);
                    Hasil.setText(sHasil);
                }catch (NumberFormatException nfe){
                    Toast.makeText(getApplicationContext(), "Field Tidak Boleh Kosong", Toast.LENGTH_SHORT).show();
                }
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    String sInput = Input.getText().toString();
                    double Input = Double.parseDouble(sInput);
                    double dHasil = Math.sin(Input);

                    String sHasil = String.valueOf(dHasil);
                    Hasil.setText(sHasil);
                }catch (NumberFormatException nfe){
                    Toast.makeText(getApplicationContext(), "Field Tidak Boleh Kosong", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
