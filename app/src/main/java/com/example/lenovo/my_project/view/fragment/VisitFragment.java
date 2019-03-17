package com.example.lenovo.my_project.view.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.lenovo.my_project.R;
import com.example.lenovo.my_project.view.IBaseView;

public class VisitFragment extends Fragment implements IBaseView {

    private View view;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.frag_home, container, false);

        return view;
    }

    @Override
    public void initView() {

    }
}
