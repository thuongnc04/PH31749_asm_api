package com.ncthuong.ph31749_asm_api.ui;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.attt.and103_asgm.R;
import com.attt.and103_asgm.ui.fragment.SplashFragment;

public class LogActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log);

        getSupportFragmentManager().beginTransaction().replace(R.id.container_login, new SplashFragment()).addToBackStack(null).commit();

    }

    //function to get the fragment manager

}