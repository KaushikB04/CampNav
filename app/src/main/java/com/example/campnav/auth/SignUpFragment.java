package com.example.campnav.auth;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

import com.example.campnav.R;
import com.example.campnav.databinding.FragmentSignUpBinding;


public class SignUpFragment extends Fragment {

    FragmentSignUpBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentSignUpBinding.inflate(inflater,container,false);
        clickedOnBack();
        setStatusBarColor();
        return binding.getRoot();
    }

    private void clickedOnBack() {
        binding.signupBtn.setOnClickListener(v -> {
            NavController navController = Navigation.findNavController(requireView());
            navController.navigate(R.id.action_signUpFragment_to_signInFragment);
        });
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