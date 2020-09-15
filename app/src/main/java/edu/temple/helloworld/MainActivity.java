package edu.temple.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.changeText);

        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                TextView tv = findViewById(R.id.textView);
                tv.setText("You have clicked the button!");
            }
        });
    }
}