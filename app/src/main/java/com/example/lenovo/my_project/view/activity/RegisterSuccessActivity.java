package com.example.lenovo.my_project.view.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.lenovo.my_project.R;
import com.example.lenovo.my_project.view.IBaseView;

public class RegisterSuccessActivity extends AppCompatActivity implements IBaseView {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);

        initView();
    }

    @Override
    public void initView() {

    }
}
