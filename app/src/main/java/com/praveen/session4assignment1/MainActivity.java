package com.praveen.session4assignment1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText emailId, password;
    Button  loginButton;
    TextView signupText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        emailId = findViewById(R.id.emailId);
        password = findViewById(R.id.password);
        loginButton = findViewById(R.id.loginButton);
        signupText = findViewById(R.id.signupText);



        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String emailText = emailId.getText().toString();
                String passwordText = password.getText().toString();
                if (emailText.equalsIgnoreCase("praveen@abc.com") && passwordText.equals("praveen"))
                {
                    Toast.makeText(MainActivity.this, "Login Success for " + emailText, Toast.LENGTH_LONG).show();
                }
                else
                {
                    Toast.makeText(MainActivity.this, "Login Failed. Incorrect username or password", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
