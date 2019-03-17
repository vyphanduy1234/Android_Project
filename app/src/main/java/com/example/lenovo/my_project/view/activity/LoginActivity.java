package com.example.lenovo.my_project.view.activity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;

import com.example.lenovo.my_project.R;
import com.example.lenovo.my_project.view.IBaseView;

public class LoginActivity extends AppCompatActivity implements IBaseView {

    EditText edtUserName;
    EditText edtPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);

        intitView();
    }

    private void intitView() {
        edtUserName = findViewById(R.id.txt_user_name);
        edtPassword = findViewById(R.id.txt_password);
    }

    @Override
    public void initView() {

    }
}
