package com.ncthuong.ph31749_asm_api.ui.fragment;

import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.attt.and103_asgm.R;
import com.attt.and103_asgm.databinding.FragmentSplashBinding;

public class SplashFragment extends Fragment {

    private FragmentSplashBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentSplashBinding.inflate(inflater, container, false);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                replaceFragment();
            }
        }, 3000);
        // Inflate the layout for this fragment
        return binding.getRoot();
    }
    private void replaceFragment() {
        requireActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container_login, new LoginFragment()).commit();
    }
}