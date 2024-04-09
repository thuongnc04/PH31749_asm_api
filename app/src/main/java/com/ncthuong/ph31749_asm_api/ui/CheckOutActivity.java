package com.ncthuong.ph31749_asm_api.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.attt.and103_asgm.DummyData;
import com.attt.and103_asgm.adapters.AddressAdapter;
import com.attt.and103_asgm.databinding.ActivityCheckOutBinding;
import com.attt.and103_asgm.models.Address;

import java.util.ArrayList;
import java.util.List;

public class CheckOutActivity extends AppCompatActivity {

    private ActivityCheckOutBinding binding;

    private List<Address> addressList;
    private AddressAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCheckOutBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        addressList = new ArrayList<>();
        addressList = DummyData.getAddress();
        adapter = new AddressAdapter(addressList, this);
        binding.rcvItem.setAdapter(adapter);

        binding.back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                // Truyền dữ liệu nếu cần
                setResult(Activity.RESULT_OK, intent);
                finish();
            }
        });

        binding.btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CheckOutActivity.this, PaymentActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}