package com.project.gyanarpit.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.project.gyanarpit.R;
import com.project.gyanarpit.activity.DashboardActivity;

public class AssesmentFragment extends Fragment {

    View view;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.study_material_fragment, container, false);

        DashboardActivity.setActionBarTitle("Assesment");


        return view;
    }
}
