package com.example.maproject.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.maproject.databinding.FragmentHomeBinding;
import com.example.maproject.databinding.FragmentVdoBinding;

public class VdieoFragment extends Fragment {

    private FragmentVdoBinding binding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = FragmentVdoBinding.inflate(inflater,container,false);
        return binding.getRoot();
    }
}
