package com.example.quiztech;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Kotlin extends AppCompatActivity {
    // Declare variables for each question
    RadioButton q1OptionA, q1OptionB, q1OptionC, q1OptionD;
    RadioButton q2OptionA, q2OptionB, q2OptionC, q2OptionD;
    RadioButton q3OptionA, q3OptionB, q3OptionC, q3OptionD;
    RadioButton q4OptionA, q4OptionB, q4OptionC, q4OptionD;
    RadioButton q5OptionA, q5OptionB, q5OptionC, q5OptionD;
    RadioButton q6OptionA, q6OptionB, q6OptionC, q6OptionD;
    RadioButton q7OptionA, q7OptionB, q7OptionC, q7OptionD;
    RadioButton q8OptionA, q8OptionB, q8OptionC, q8OptionD;
    RadioButton q9OptionA, q9OptionB, q9OptionC, q9OptionD;
    RadioButton q1O0OptionA, q1O0OptionB,q1O0OptionC, q1O0OptionD;

    // Add similar variables for all other questions
    TextView answer1, answer2,answer3,answer4,answer5,answer6,answer7,answer8,answer9,answer10; // Add text views for all other answers

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kotlin);

        // Initialize all radio buttons and TextViews
        q1OptionA = findViewById(R.id.q1OptionA);
        q1OptionB = findViewById(R.id.q1OptionB);
        q1OptionC = findViewById(R.id.q1OptionC);
        q1OptionD = findViewById(R.id.q1OptionD);

        q2OptionA = findViewById(R.id.q2OptionA);
        q2OptionB = findViewById(R.id.q2OptionB);
        q2OptionC = findViewById(R.id.q2OptionC);
        q2OptionD = findViewById(R.id.q2OptionD);

        q3OptionA = findViewById(R.id.q3OptionA);
        q3OptionB = findViewById(R.id.q3OptionB);
        q3OptionC = findViewById(R.id.q3OptionC);
        q3OptionD = findViewById(R.id.q3OptionD);

        q4OptionA = findViewById(R.id.q4OptionA);
        q4OptionB = findViewById(R.id.q4OptionB);
        q4OptionC = findViewById(R.id.q4OptionC);
        q4OptionD = findViewById(R.id.q4OptionD);

        q5OptionA = findViewById(R.id.q5OptionA);
        q5OptionB = findViewById(R.id.q5OptionB);
        q5OptionC = findViewById(R.id.q5OptionC);
        q5OptionD = findViewById(R.id.q5OptionD);

        q6OptionA = findViewById(R.id.q6OptionA);
        q6OptionB = findViewById(R.id.q6OptionB);
        q6OptionC = findViewById(R.id.q6OptionC);
        q6OptionD = findViewById(R.id.q6OptionD);

        q7OptionA = findViewById(R.id.q7OptionA);
        q7OptionB = findViewById(R.id.q7OptionB);
        q7OptionC = findViewById(R.id.q7OptionC);
        q7OptionD = findViewById(R.id.q7OptionD);

        q8OptionA = findViewById(R.id.q8OptionA);
        q8OptionB = findViewById(R.id.q8OptionB);
        q8OptionC = findViewById(R.id.q8OptionC);
        q8OptionD = findViewById(R.id.q8OptionD);

        q9OptionA = findViewById(R.id.q9OptionA);
        q9OptionB = findViewById(R.id.q9OptionB);
        q9OptionC = findViewById(R.id.q9OptionC);
        q9OptionD = findViewById(R.id.q9OptionD);

        q1O0OptionA = findViewById(R.id.q10OptionA);
        q1O0OptionB = findViewById(R.id.q10OptionB);
        q1O0OptionC = findViewById(R.id.q10OptionC);
        q1O0OptionD = findViewById(R.id.q10OptionD);





        // Add similar code for other questions...

        answer1 = findViewById(R.id.answer1);
        answer2 = findViewById(R.id.answer2);
        answer3 = findViewById(R.id.answer3);
        answer4 = findViewById(R.id.answer4);
        answer5 = findViewById(R.id.answer5);
        answer6 = findViewById(R.id.answer6);
        answer7 = findViewById(R.id.answer7);
        answer8 = findViewById(R.id.answer8);
        answer9 = findViewById(R.id.answer9);
        answer10 = findViewById(R.id.answer10);

        // Initialize other answer TextViews here...

        // Submit button listener
        Button submitButton = findViewById(R.id.btnSubmit);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkAnswers();
            }
        });
    }

    private void checkAnswers() {
        // Check answers for each question
        if (q1OptionB.isChecked()) {
            answer1.setText("Correct answer:   B) Mobile application development");
        } else {
            answer1.setText("Incorrect! The correct answer is   B) Mobile application development");
        }

        if (q2OptionC.isChecked()) {
            answer2.setText("Correct answer: C) Google");
        } else {
            answer2.setText("Incorrect! The correct answer is C) Google");
        }

        if (q3OptionD.isChecked()) {
            answer3.setText("Correct answer: D) Both object-oriented and functional");
        } else {
            answer3.setText("Incorrect! The correct answer is D) Both object-oriented and functional");
        }

        if (q4OptionC.isChecked()) {
            answer4.setText("Correct answer: C) It provides built-in null safety features like nullable types");
        } else {
            answer4.setText("Incorrect! The correct answer is C) It provides built-in null safety features like nullable types");
        }

        if (q5OptionB.isChecked()) {
            answer5.setText("Correct answer: B) .kt");
        } else {
            answer5.setText("Incorrect! The correct answer is B) .kt");
        }

        if (q6OptionB.isChecked()) {
            answer6.setText("Correct answer:  B) val is used to declare immutable variables");
        } else {
            answer6.setText("Incorrect! The correct answer is B) val is used to declare immutable variables");
        }

        if (q7OptionB.isChecked()) {
            answer7.setText("Correct answer:  B) An object used to replace static members in Kotlin");
        } else {
            answer7.setText("Incorrect! The correct answer is  B) An object used to replace static members in Kotlin");
        }

        if (q8OptionD.isChecked()) {
            answer8.setText("Correct answer:   D) Both A and C");
        } else {
            answer8.setText("Incorrect! The correct answer is  D) Both A and C");
        }

        if (q9OptionD.isChecked()) {
            answer9.setText("Correct answer:  D) public");
        } else {
            answer9
                    .setText("Incorrect! The correct answer is  D) public.w");
        }

        if (q1O0OptionC.isChecked()) {
            answer10.setText("Correct answer:  C) fun.");
        } else {
            answer10.setText("Incorrect! The correct answer is C) fun.");
        }



        // Add similar logic for the other questions...
    }
}