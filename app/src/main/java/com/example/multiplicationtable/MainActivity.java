package com.example.multiplicationtable;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
Button button;
TextView n1, n2, n3, n4, n5, n6, n7, n8, n9, n10;
EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        editText = findViewById(R.id.editTextNumber);
        n1 = findViewById(R.id.n1);
        n2 = findViewById(R.id.n2);
        n3 = findViewById(R.id.n3);
        n4 = findViewById(R.id.n4);
        n5 = findViewById(R.id.n5);
        n6 = findViewById(R.id.n6);
        n7 = findViewById(R.id.n7);
        n8 = findViewById(R.id.n8);
        n9 = findViewById(R.id.n9);
        n10 = findViewById(R.id.n10);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n = Integer.parseInt(editText.getText().toString());
                generateTable(n);
            }
        });

    }
    @SuppressLint("SetTextI18n")
    public void generateTable(int a){
        n1.setText(a + "*" + '1' + "=" + (a));
        n2.setText(a + "*" + '2' + "=" + (a * 2));
        n3.setText(a + "*" + '3' + "=" + (a * 3));
        n4.setText(a + "*" + '4' + "=" + (a * 4));
        n5.setText(a + "*" + '5' + "=" + (a * 5));
        n6.setText(a + "*" + '6' + "=" + (a * 6));
        n7.setText(a + "*" + '7' + "=" + (a * 7));
        n8.setText(a + "*" + '8' + "=" + (a * 8));
        n9.setText(a + "*" + '9' + "=" + (a * 9));
        n10.setText(a + "*" + "10" + "=" + (a * 10));

    }
}