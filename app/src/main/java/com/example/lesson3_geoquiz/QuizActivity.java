package com.example.lesson3_geoquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class QuizActivity extends AppCompatActivity {
    private Button mTrueButton;
    private Button mFalseButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        //boton true
        // lo ponen asi ellos mTrueButton = (Button) findViewById(R.id.true_button);
        mTrueButton = findViewById(R.id.true_button);
        mTrueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            // Does nothing yet, but soon!
                Toast.makeText(QuizActivity.this,
                                R.string.correct_toast,
                                Toast.LENGTH_SHORT).show();
            }
        });
        //boton false
        mFalseButton = findViewById(R.id.false_button);
        mFalseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            // Does nothing yet, but soon!
                Toast.makeText(QuizActivity.this,
                                R.string.incorrect_toast,
                                Toast.LENGTH_SHORT).show();
            }
        });
    }
}