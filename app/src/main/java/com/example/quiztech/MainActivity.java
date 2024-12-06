package com.example.quiztech;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText usernameField, passwordField;
    View loginButton, signupButton;
    Databasehelper databaseHelper;
    Toast toast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this); // Enables immersive experience
        setContentView(R.layout.activity_main);

        // Initialize views
        usernameField = findViewById(R.id.username);
        passwordField = findViewById(R.id.password);
        loginButton = findViewById(R.id.loginButton);
        signupButton = findViewById(R.id.signupButton);

        // Initialize database helper
        databaseHelper = new Databasehelper(this);

        // Login button functionality
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = usernameField.getText().toString().trim();
                String password = passwordField.getText().toString().trim();

                if (username.isEmpty() || password.isEmpty()) {
                    showToast("Please enter all fields");
                } else {
                    boolean isValid = databaseHelper.checkUser(username, password);
                    if (isValid) {
                        showToast("Login Successful");
                        Intent intent = new Intent(MainActivity.this, Home.class);
                        startActivity(intent);
                    } else {
                        showToast("Invalid Credentials");
                    }
                }
            }
        });

        // Signup button functionality
        signupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Registration.class);
                startActivity(intent);
            }
        });
    }

    /**
     * Helper method to display toasts and avoid spamming
     *
     * @param message The message to be displayed
     */
    private void showToast(String message) {
        if (toast != null) {
            toast.cancel(); // Cancel any existing toast
        }
        toast = Toast.makeText(this, message, Toast.LENGTH_SHORT);
        toast.show();
    }
}
