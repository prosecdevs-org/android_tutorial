package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;

import com.example.myapplication.databinding.ActivityMain3Binding;

public class MainActivity3 extends AppCompatActivity {

    NavController navController;
    ActivityMain3Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(MainActivity3.this,R.layout.activity_main3);

        binding.btn.setText("Hello");
        navController = Navigation.findNavController(this,R.id.fragment1);
    }
}