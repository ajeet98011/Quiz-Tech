package com.example.quiztech;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Registration extends AppCompatActivity {

    Databasehelper databaseHelper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration); // Ensure the layout file exists
        databaseHelper = new Databasehelper(this);

        // UI elements
        EditText usernameField = findViewById(R.id.editTextUserName);
        EditText passwordField = findViewById(R.id.editTextPassword);
        EditText confirmPasswordField = findViewById(R.id.editTextConfirmPassword);
        Button submitButton = findViewById(R.id.buttonSubmit);

        // Set up Submit Button
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = usernameField.getText().toString().trim();
                String password = passwordField.getText().toString().trim();
                String confirmPassword = confirmPasswordField.getText().toString().trim();

                // Validate fields
                if (username.isEmpty() || password.isEmpty() || confirmPassword.isEmpty()) {
                    Toast.makeText(Registration.this, "All fields are required!", Toast.LENGTH_SHORT).show();
                    return;
                }

                if (!password.equals(confirmPassword)) {
                    Toast.makeText(Registration.this, "Passwords do not match!", Toast.LENGTH_SHORT).show();
                    return;
                }

                // Insert data into database
                boolean isInserted = databaseHelper.insertData(username, password, confirmPassword);
                if (isInserted) {
                    Toast.makeText(Registration.this, "Registration Successful!", Toast.LENGTH_SHORT).show();
                    // Optionally, clear input fields
                    usernameField.setText("");
                    passwordField.setText("");
                    confirmPasswordField.setText("");
                } else {
                    Toast.makeText(Registration.this, "Registration Failed!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
