package com.example.livescores.View.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;

import com.example.livescores.R;

import com.example.livescores.databinding.ActivityMainBinding;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       binding = DataBindingUtil.setContentView(this,R.layout.activity_main);


        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        BottomNavigationView bottomNav = binding.bottomNav;
        NavigationUI.setupWithNavController(bottomNav, navController);
    }
}