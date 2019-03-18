package com.example.lenovo.my_project.view.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.lenovo.my_project.R;
import com.example.lenovo.my_project.view.IBaseView;

public class RegisterActivity extends AppCompatActivity implements IBaseView {

    EditText edtFullName;
    EditText edtEmail;
    EditText edtUserName;
    EditText edtPassword;
    EditText edtPasswordRetype;
    Button btnRgister;
    ImageView btnBack;
    TextView txtRegisterMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        initView();
    }

    @Override
    public void initView() {
        edtEmail = findViewById(R.id.txt_email);
        edtFullName = findViewById(R.id.txt_fullname);
        edtUserName = findViewById(R.id.txt_user_name);
        edtPassword = findViewById(R.id.txt_password);
        edtPasswordRetype = findViewById(R.id.txt_password_retype);
        btnRgister = findViewById(R.id.btn_register);
        btnRgister = findViewById(R.id.btn_register);
        btnBack = findViewById(R.id.btn_back);
        txtRegisterMessage = findViewById(R.id.txt_register_message);
    }
}
