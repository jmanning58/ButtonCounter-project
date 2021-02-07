package com.example.button_counter_manning;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.view.View;
import android.widget.TextView;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private Button addB;
    private Button minusB;
    private Button quitB;
    private boolean buttonPressed = false;
    private TextView text;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addB = this.findViewById(R.id.button);
        addB.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(!buttonPressed) {
                    buttonPressed = true;
                    String count = getString(R.string.counter);
                    count = count + 1;


                }

            }
        });
    }
}