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

public class Cpp extends AppCompatActivity {
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
        setContentView(R.layout.activity_cpp);

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
            answer1.setText("Correct answer:  B) System programming and application development");
        } else {
            answer1.setText("Incorrect! The correct answer is  B) System programming and application development");
        }

        if (q2OptionB.isChecked()) {
            answer2.setText("Correct answer:  B) It supports object-oriented programming.");
        } else {
            answer2.setText("Incorrect! The correct answer is  B) It supports object-oriented programming.");
        }

        if (q3OptionB.isChecked()) {
            answer3.setText("Correct answer:  B) Having multiple forms of a function or operator");
        } else {
            answer3.setText("Incorrect! The correct answer is  B) Having multiple forms of a function or operator");
        }

        if (q4OptionA.isChecked()) {
            answer4.setText("Correct answer: A) A special function that initializes an object");
        } else {
            answer4.setText("Incorrect! The correct answer is A) A special function that initializes an object");
        }

        if (q5OptionC.isChecked()) {
            answer5.setText("Correct answer: C) Inheritance allows code reusability.");
        } else {
            answer5.setText("Incorrect! The correct answer is C) Inheritance allows code reusability.");
        }

        if (q6OptionC.isChecked()) {
            answer6.setText("Correct answer:  C) Both A (Binding data and methods together) and B (Hiding implementation details)");
        } else {
            answer6.setText("Incorrect! The correct answer is C) Both A (Binding data and methods together) and B (Hiding implementation details)");
        }

        if (q7OptionB.isChecked()) {
            answer7.setText("Correct answer:  B) Private");
        } else {
            answer7.setText("Incorrect! The correct answer is  B) Private.");
        }

        if (q8OptionB.isChecked()) {
            answer8.setText("Correct answer:  B) 4 bytes");
        } else {
            answer8.setText("Incorrect! The correct answer is B) 4 bytes");
        }

        if (q9OptionD.isChecked()) {
            answer9.setText("Correct answer: D) All of the above (const int x = 10; #define x 10; etc.)");
        } else {
            answer9
                    .setText("Incorrect! The correct answer is D) All of the above (const int x = 10; #define x 10; etc.)");
        }

        if (q1O0OptionA.isChecked()) {
            answer10.setText("Correct answer:  A) It allows access to private and protected members.");
        } else {
            answer10.setText("Incorrect! The correct answer is  A) It allows access to private and protected members.");
        }



        // Add similar logic for the other questions...
    }
}