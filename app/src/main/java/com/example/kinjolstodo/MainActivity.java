package com.example.kinjolstodo;

import android.annotation.SuppressLint;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    final ExcerciseController excerciseController = new ExcerciseController();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView excerciseView = findViewById(R.id.skull);

        excerciseView.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                TextView excerciseText = (TextView)findViewById(R.id.excerciseTextView);
                Excercise randomExcercise = excerciseController.randomExcercise();
                if ("Plank".equals(randomExcercise.getType())) {
                    excerciseText.setText(randomExcercise.getType() + " for " + randomExcercise.getAmount() + " seconds!");
                } else {
                excerciseText.setText(randomExcercise.getType() + " " + randomExcercise.getAmount() + " times!");
                }
            }
        });
    }
}
