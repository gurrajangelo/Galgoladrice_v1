package com.example.galgoladrice;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private double n1, n2, risultato;
    private EditText inputNum1, inputNum2;
    private TextView textResult;
    //private final String TAG = "MainActivity";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inputNum1 = findViewById(R.id.input_text_num1);
        inputNum2 = findViewById(R.id.input_text_num2);
        textResult = findViewById(R.id.textView3);

    }
    public void plus(View view) {
        n1 = Double.parseDouble(inputNum1.getText().toString());
        n2 = Double.parseDouble(inputNum2.getText().toString());
        risultato = n1 + n2;
        textResult.setText(getString(R.string.result_label) + risultato);
    }

    public void minus(View view) {
        n1 = Double.parseDouble(inputNum1.getText().toString());
        n2 = Double.parseDouble(inputNum2.getText().toString());
        risultato = n1 - n2;
        textResult.setText(getString(R.string.result_label) + risultato);
    }

    public void division(View view) {
        n1 = Double.parseDouble(inputNum1.getText().toString());
        n2 = Double.parseDouble(inputNum2.getText().toString());
        risultato = n1 / n2;
        textResult.setText(getString(R.string.result_label) + risultato);
    }

    public void times(View view) {
        n1 = Double.parseDouble(inputNum1.getText().toString());
        n2 = Double.parseDouble(inputNum2.getText().toString());
        risultato = n1 * n2;
        textResult.setText(getString(R.string.result_label) + risultato);
    }
}