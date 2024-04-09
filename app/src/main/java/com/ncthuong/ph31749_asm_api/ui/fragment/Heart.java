package com.ncthuong.ph31749_asm_api.ui.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;

import com.attt.and103_asgm.DummyData;
import com.attt.and103_asgm.adapters.WishAdapter;
import com.attt.and103_asgm.config.GridSpacingItemDecoration;
import com.attt.and103_asgm.databinding.FragmentHeartBinding;
import com.attt.and103_asgm.models.Product;

import java.util.List;

public class Heart extends Fragment {

    private FragmentHeartBinding binding;

    private WishAdapter adapter;

    private List<Product> productList;
    private Context context;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentHeartBinding.inflate(inflater, container, false);

        context = requireActivity();

        configAdapter();
        return binding.getRoot();
    }
    private void configAdapter() {
        productList = DummyData.generateDummyData();
        adapter = new WishAdapter(productList, context);
        GridLayoutManager layoutManager = new GridLayoutManager(context, 2);
        int spacing = 30; // Khoảng cách giữa các item
        binding.rcvItem.addItemDecoration(new GridSpacingItemDecoration(spacing));
        binding.rcvItem.setLayoutManager(layoutManager);
        binding.rcvItem.setAdapter(adapter);

    }
}