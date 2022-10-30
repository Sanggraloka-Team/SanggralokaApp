package com.uasppm.sanggraloka;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class LogInActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnLogin;
    private TextView tvTidakPunyaAkun;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        btnLogin = (Button) findViewById(R.id.button_log_in);
        btnLogin.setOnClickListener(this);

        tvTidakPunyaAkun = (TextView) findViewById(R.id.textview_tidak_punya_akun);
        tvTidakPunyaAkun.setOnClickListener(this);
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