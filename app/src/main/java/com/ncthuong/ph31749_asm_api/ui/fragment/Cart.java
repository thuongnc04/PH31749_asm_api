package com.ncthuong.ph31749_asm_api.ui.fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.attt.and103_asgm.DummyData;
import com.attt.and103_asgm.adapters.CardAdapter;
import com.attt.and103_asgm.databinding.FragmentCartBinding;
import com.attt.and103_asgm.models.Product;
import com.attt.and103_asgm.ui.CheckOutActivity;

import java.util.List;


public class Cart extends Fragment {

    private FragmentCartBinding binding;
    private List<Product> cartList;
    private CardAdapter
            cardAdapter;

    private Context context;
    private static final int REQUEST_CODE = 1;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentCartBinding.inflate(inflater, container, false);

        context = requireActivity();

        configAdapter();

        binding.btnProcess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), CheckOutActivity.class);
                startActivityForResult(intent, REQUEST_CODE);
            }
        });
        return binding.getRoot();
    }
    private void configAdapter() {
        cartList = DummyData.generateDummyData();
        cardAdapter = new CardAdapter(cartList, context);
        binding.rcvItem.setAdapter(cardAdapter);

    }
}