package com.ncthuong.ph31749_asm_api.ui.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.attt.and103_asgm.R;
import com.attt.and103_asgm.databinding.FragmentRegisterBinding;


public class RegisterFragment extends Fragment {

    private FragmentRegisterBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentRegisterBinding.inflate(inflater, container, false);

        userClick();
        return binding.getRoot();
    }

    private void userClick() {
        binding.tvLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container_login, new LoginFragment()).addToBackStack(null).commit();
            }
        });
    }
}