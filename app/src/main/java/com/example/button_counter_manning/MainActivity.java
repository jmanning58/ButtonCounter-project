package com.example.button_counter_manning;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.util.Log;
import android.widget.Button;
import android.view.View;
import android.widget.TextView;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private String TAG="MainActivity";
    private Button addB;
    private Button minusB;
    private Button quitB;
    private Button resetB;
    private TextView display;
    int counter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        display = this.findViewById(R.id.displayID);
        addB = this.findViewById(R.id.addButtonID);
        minusB = this.findViewById(R.id.minusButtonID);
        resetB = this.findViewById(R.id.resetButtonID);
        quitB = this.findViewById(R.id.quitButtonID);

        addB.setOnClickListener(v -> {
            int currentValue = Integer.valueOf(display.getText().toString());
            currentValue++;
            display.setText(Integer.toString(currentValue));
            });

        minusB.setOnClickListener(v -> {
            int currentValue = Integer.valueOf(display.getText().toString());
            if (currentValue == 0) {
                display.setText(Integer.toString(currentValue));
                displayToast("Cannot have a Negative of Something");
            }
            else {
                currentValue--;
                display.setText(Integer.toString(currentValue));
            }
        });

        resetB.setOnClickListener(v -> {
            counter = 0;
            display.setText(Integer.toString(counter));
        });

        quitB.setOnClickListener(v -> {
            finish();
            System.exit(0);
        });
    }
    public void displayToast(String message) {
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        String counterValue = display.getText().toString();
        outState.putString("display", counterValue);
     }

     @Override
     protected void onRestoreInstanceState(@NonNull Bundle saveInstanceState) {
        super.onRestoreInstanceState(saveInstanceState);
        String counterValue = saveInstanceState.getString("display");
        display.setText(counterValue);
     }

     @Override
     protected void onStart() {
        super.onStart();
        Log.i(TAG, "I entered onStart()");
     }

     @Override
     protected void onResume() {
        super.onResume();
        Log.i(TAG, "I entered onResume()");
     }

     @Override
     protected void onPause() {
        super.onPause();
        Log.i(TAG, "I entered onPause()");
     }

     @Override
     protected void onStop() {
        super.onStop();
        Log.i(TAG, "I entered onStop()");
     }

     @Override
     protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "I entered onRestart()");
     }

     @Override
     protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "I entered onDestroy()");
     }

}