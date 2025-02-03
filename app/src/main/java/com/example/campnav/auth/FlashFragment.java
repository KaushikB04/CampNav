package com.example.campnav.auth;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

import com.example.campnav.R;
import com.example.campnav.databinding.FragmentFlashBinding;


public class FlashFragment extends Fragment {
    FragmentFlashBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentFlashBinding.inflate(inflater,container,false);
        setStatusBarColor();
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
            @Override
            public void run() {
                    NavHostFragment.findNavController(FlashFragment.this)
                            .navigate(R.id.action_flashFragment_to_signInFragment);
                }
        }, 3000);
        return binding.getRoot();

    }

    private void setStatusBarColor() {
        if(getActivity() != null && getActivity().getWindow() != null){
            Window window = getActivity().getWindow();
            int stautsBarColor = getResources().getColor(R.color.blue);
            window.setStatusBarColor(stautsBarColor);
            window.getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        }
    }
}