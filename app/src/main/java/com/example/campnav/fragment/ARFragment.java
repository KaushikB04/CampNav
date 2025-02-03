package com.example.campnav.fragment;

import android.os.Build;
import android.os.Bundle;

import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

import com.example.campnav.R;
import com.example.campnav.databinding.FragmentARBinding;


public class ARFragment extends Fragment {
 private FragmentARBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentARBinding.inflate(inflater,container,false);
        setStatusBarColor();
        return binding.getRoot();
    }
    private void setStatusBarColor() {
        if (getActivity() != null) {
            Window window = getActivity().getWindow();
            if (window != null) {
                int statusBarColor = ContextCompat.getColor(requireContext(), R.color.blue);
                window.setStatusBarColor(statusBarColor);

                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                    window.getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
                }
            }
        }
    }


}