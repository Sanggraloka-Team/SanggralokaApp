package com.uasppm.sanggraloka;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class LogInActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnLogin;
    private TextView tvTidakPunyaAkun, tvLogin;
    private EditText etUsername, etPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        btnLogin = (Button) findViewById(R.id.button_log_in);
        btnLogin.setOnClickListener(this);
        tvLogin = findViewById(R.id.textview_log_in);
        etPassword = findViewById(R.id.edittext_password);
        etUsername = findViewById(R.id.edittext_username);

        tvTidakPunyaAkun = (TextView) findViewById(R.id.textview_tidak_punya_akun);
        tvTidakPunyaAkun.setOnClickListener(this);

        Typeface signikaFont = Typeface.createFromAsset(getAssets(), "font/Signika-Medium.ttf");
        tvTidakPunyaAkun.setTypeface(signikaFont);
        tvLogin.setTypeface(signikaFont);
        etUsername.setTypeface(signikaFont);
        etPassword.setTypeface(signikaFont);
        btnLogin.setTypeface(signikaFont);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_log_in:
                Intent toHomeActivity = new Intent(LogInActivity.this, HomeActivity.class);
                startActivity(toHomeActivity);
                break;
            case R.id.textview_tidak_punya_akun:
                Intent toSignUpActivity = new Intent(LogInActivity.this, SignUpActivity.class);
                startActivity(toSignUpActivity);
                break;
        }
    }
}