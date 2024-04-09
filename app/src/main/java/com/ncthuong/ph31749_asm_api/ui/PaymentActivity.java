package com.ncthuong.ph31749_asm_api.ui;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.attt.and103_asgm.databinding.ActivityPaymentBinding;

public class PaymentActivity extends AppCompatActivity {

    private static final String TAG = "PaymentActivity";
    private ActivityPaymentBinding binding;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityPaymentBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }
}