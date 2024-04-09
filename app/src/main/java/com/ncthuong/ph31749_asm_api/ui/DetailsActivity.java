package com.ncthuong.ph31749_asm_api.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.attt.and103_asgm.databinding.ActivityDetailsBinding;
import com.bumptech.glide.Glide;

public class DetailsActivity extends AppCompatActivity {

    private ActivityDetailsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetailsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        //use Glide to load image
        Glide.with(this).load("https://img.freepik.com/free-psd/monstera-deliciosa-png-isolated-transparent-background_191095-11918.jpg").into(binding.imvProduct);

        binding.back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                // Truyền dữ liệu nếu cần
                setResult(Activity.RESULT_OK, intent);
                finish();
            }
        });

    }
}