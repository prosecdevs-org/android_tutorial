package com.example.myapplication;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.myapplication.databinding.FragmentBlankBinding;


public class BlankFragment extends Fragment {


    FragmentBlankBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_blank, container, false);
        binding.fragment1Txt.setText("Hello Someone");
        binding.toFragment2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                FragmentManager fragmentManager = getParentFragmentManager();
//                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
//                fragmentTransaction.replace(R.id.fragment1, new BlankFragment2());
//                fragmentTransaction.addToBackStack(null);
//                fragmentTransaction.commit();
                Bundle bundle = new Bundle();
                bundle.putString("key","value");
                Navigation.findNavController(view).navigate(R.id.blankFragment2,bundle);
            }
        });



        return binding.getRoot();
    }
}