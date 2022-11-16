package com.uasppm.sanggraloka;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SignUpActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnSignup;
    private TextView tvPunyaAkun, tvSignup;
    private EditText etUsername, etPassword, etConfirmPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        btnSignup = (Button) findViewById(R.id.button_sign_up);
        btnSignup.setOnClickListener(this);
        tvPunyaAkun = (TextView) findViewById(R.id.textview_sign_up_help);
        tvPunyaAkun.setOnClickListener(this);
        tvSignup = findViewById(R.id.textview_sign_up);
        etUsername = findViewById(R.id.edittext_username);
        etPassword = findViewById(R.id.edittext_password);
        etConfirmPassword = findViewById(R.id.edittext_confirm_password);

        Typeface signikaFont = Typeface.createFromAsset(getAssets(), "font/Signika-Medium.ttf");
        btnSignup.setTypeface(signikaFont);
        tvPunyaAkun.setTypeface(signikaFont);
        tvSignup.setTypeface(signikaFont);
        etUsername.setTypeface(signikaFont);
        etPassword.setTypeface(signikaFont);
        etConfirmPassword.setTypeface(signikaFont);
        btnSignup.setTypeface(signikaFont);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_sign_up:
                Intent toHomeActivity = new Intent(SignUpActivity.this, HomeActivity.class);
                Toast.makeText(getApplicationContext(), "Berhasil Sign Up", Toast.LENGTH_SHORT).show();
                startActivity(toHomeActivity);
                break;
            case R.id.textview_sign_up_help:
                Intent toLogInActivity = new Intent(SignUpActivity.this, LogInActivity.class);
                startActivity(toLogInActivity);
                break;
        }
    }
}