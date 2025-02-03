package com.example.campnav.auth;

import android.content.Intent;
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
import com.example.campnav.activity.UserMainActivity;
import com.example.campnav.databinding.FragmentSignInBinding;


public class SignInFragment extends Fragment {

    FragmentSignInBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentSignInBinding.inflate(inflater,container,false);
        clickedOnNext();
        clickedOnSignUp();
        setStatusBarColor();
        return binding.getRoot();

    }

    private void clickedOnSignUp() {
        binding.tvNexttosignup.setOnClickListener(v -> {
            NavController navController =Navigation.findNavController(requireView());
            navController.navigate(R.id.action_signInFragment_to_signUpFragment);
        });
    }

    private void clickedOnNext() {
        binding.loginBtn.setOnClickListener(v -> {
            startActivity(new Intent(requireContext(),UserMainActivity.class));
            requireActivity().finish();

        });
        binding.tvForgetPass.setOnClickListener(v -> {
            NavController navController = Navigation.findNavController(requireView());
            navController.navigate(R.id.action_signInFragment_to_forgetPassFragment);
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