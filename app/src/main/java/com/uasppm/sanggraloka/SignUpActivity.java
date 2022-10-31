package com.uasppm.sanggraloka;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SignUpActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnSignup;
    private TextView tvPunyaAkun;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        btnSignup = (Button) findViewById(R.id.button_sign_up);
        btnSignup.setOnClickListener(this);

        tvPunyaAkun = (TextView) findViewById(R.id.textview_sign_up_help);
        tvPunyaAkun.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_sign_up:
                Intent toHomeActivity = new Intent(SignUpActivity.this, HomeActivity.class);
                startActivity(toHomeActivity);
                break;
            case R.id.textview_sign_up_help:
                Intent toLogInActivity = new Intent(SignUpActivity.this, LogInActivity.class);
                startActivity(toLogInActivity);
                break;
        }
    }
}