package com.example.ej.employeeleavesystem.emp_leave_tabs;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ej.employeeleavesystem.R;

/**
 * Created by ej on 12/14/2017.
 */

public class emp_leave_home_new extends Fragment {
    public emp_leave_home_new(){}
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_emp_leave_home_new, container, false);

        return rootView;
    }
}