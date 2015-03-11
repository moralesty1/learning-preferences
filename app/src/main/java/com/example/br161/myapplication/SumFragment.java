package com.example.br161.myapplication;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class SumFragment extends Fragment {

    //Declare views
    private TextView tvSum;


    public SumFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_sum, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        //Map views to XML
        tvSum = (TextView) view.findViewById(R.id.tv_sum);

        //Pull arguments from passed bundle
        int firstValue = getArguments().getInt("primary", -1);
        int secondValue = getArguments().getInt("secondary", -1);

        // Add values
        int sum = firstValue + secondValue;

        //Update view with sum
        tvSum.setText(sum + "");
    }
}
