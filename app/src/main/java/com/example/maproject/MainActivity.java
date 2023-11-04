package com.example.maproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.example.maproject.Fragment.HomeFragment;
import com.example.maproject.Fragment.MoreFragment;
import com.example.maproject.Fragment.ProductFragment;
import com.example.maproject.Fragment.ProfileFragment;
import com.example.maproject.Fragment.VdieoFragment;
import com.example.maproject.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {


    private ActivityMainBinding binding;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        showFragment(new HomeFragment());

        binding.bottomNavigationView.setOnItemSelectedListener( item -> {

            if (item.getItemId() == R.id.menuHome)
            {
                showFragment(new HomeFragment());
            }
            else if (item.getItemId() == R.id.menuVdo)
            {
                showFragment(new VdieoFragment());
            } else if (item.getItemId() == R.id.menuProfile) {

                showFragment(new ProfileFragment());

            } else if (item.getItemId() == R.id.menuProduct) {

                showFragment(new ProductFragment());

            } else if (item.getItemId() == R.id.menuMore){

                showFragment(new MoreFragment());
            }
            return true;
        });
    }

    private  void showFragment(Fragment fragment)
    {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.layoutFragment,fragment);
        fragmentTransaction.commit();
    }
}