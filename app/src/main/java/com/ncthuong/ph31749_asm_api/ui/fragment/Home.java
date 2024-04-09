package com.ncthuong.ph31749_asm_api.ui.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.attt.and103_asgm.DummyData;
import com.attt.and103_asgm.adapters.FabAdapter;
import com.attt.and103_asgm.adapters.MostAdapter;
import com.attt.and103_asgm.databinding.FragmentHomeBinding;
import com.attt.and103_asgm.models.Product;

import java.util.List;

public class Home extends Fragment {

    private FragmentHomeBinding binding;
    private DummyData dummyData;

    private MostAdapter mostAdapter;
    private FabAdapter fabAdapter;

    private List<Product> productList;
    private static final int REQUEST_CODE = 1;

    private Context context;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentHomeBinding.inflate(inflater, container, false);

        context = requireActivity();

        //configAdapter
        configAdapter();
        return binding.getRoot();
    }

    private void configAdapter() {
        productList = DummyData.generateDummyData();
        mostAdapter = new MostAdapter(productList, context);
        fabAdapter = new FabAdapter(productList, context);
        binding.rcvItem.setAdapter(mostAdapter);
        binding.rcvItemFab.setAdapter(fabAdapter);

    }
}