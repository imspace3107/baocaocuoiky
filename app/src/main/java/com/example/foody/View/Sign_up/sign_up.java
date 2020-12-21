package com.example.foody.View.Sign_up;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.foody.R;
import com.example.foody.View.Sign_in.sign_in;
import com.google.android.material.textfield.TextInputEditText;

public class sign_up extends AppCompatActivity {
        TextInputEditText email,pass1,pass2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        //active
        findViewById(R.id.back_signin).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                signUp();
            }
        });

        //active
        findViewById(R.id.tv_signun_now).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
    public void signUp() {
        String em = email.getText().toString();
        String pw1 = pass1.getText().toString();
        String pw2 = pass2.getText().toString();

        if ( em.isEmpty() || pw1.isEmpty() || pw2.isEmpty()) {
            Toast.makeText(this, "Vui lòng điền đầy đủ các thông tin!", Toast.LENGTH_SHORT).show();
            return;
        }

        if (!pw1.equals(pw2)) {
            pass1.setError("Mật khẩu không trùng khớp!");
            pass2.requestFocus();
            return;
        }
    }
}