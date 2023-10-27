package com.example.myapplication;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


public class BlankFragment2 extends Fragment {

    Button b1;
    TextView t1;
    String s1;

    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_blank2, container, false);
        if (getArguments() != null){
            s1 = getArguments().getString("key");
        }
        b1 = view.findViewById(R.id.toFragment1);
        t1 = view.findViewById(R.id.fragment2Txt);
        t1.setText(s1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                FragmentManager fragmentManager = getParentFragmentManager();
//                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
//                fragmentTransaction.replace(R.id.fragment1, new BlankFragment());
//                fragmentTransaction.addToBackStack(null);
//                fragmentTransaction.commit();
            }
        });


        return view;
    }
}