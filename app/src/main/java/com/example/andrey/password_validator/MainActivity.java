package com.example.andrey.password_validator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button validateButton;
    EditText editPassword;
    TextView resultView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        validateButton = findViewById(R.id.valdateButton);
        editPassword = findViewById(R.id.passwordField);
        resultView = findViewById(R.id.messageView);

        validateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String tryPassword = editPassword.getText().toString();
                if (Validator.validate(tryPassword)) resultView.setText("strong password");
                else resultView.setText("weak password");
            }
        });
    }
}
