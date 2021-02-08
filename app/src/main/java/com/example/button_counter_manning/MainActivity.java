package com.example.button_counter_manning;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.widget.Button;
import android.view.View;
import android.widget.TextView;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button addB;
    private Button minusB;
    private Button quitB;
    private Button resetB;
    private TextView text;
    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = this.findViewById(R.id.textView);
        addB = this.findViewById(R.id.button);
        minusB = this.findViewById(R.id.button2);
        resetB = this.findViewById(R.id.button3);
        quitB = this.findViewById(R.id.button4);

        addB.setOnClickListener(v -> {
            counter++;
            text.setText(Integer.toString(counter));
            });

        minusB.setOnClickListener(v -> {
            if (counter == 0) {
                text.setText(Integer.toString(counter));
                displayToast("Cannot have a Negative of Something");
            }
            else {
                counter--;
                text.setText(Integer.toString(counter));
            }
        });

        resetB.setOnClickListener(v -> {
            counter = 0;
            text.setText(Integer.toString(counter));
        });

        quitB.setOnClickListener(v -> {
            finish();
            System.exit(0);
        });
    }
    public void displayToast(String message) {
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }
}