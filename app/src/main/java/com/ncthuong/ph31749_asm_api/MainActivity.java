package com.ncthuong.ph31749_asm_api;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.attt.and103_asgm.databinding.ActivityMainBinding;
import com.attt.and103_asgm.ui.fragment.Cart;
import com.attt.and103_asgm.ui.fragment.Heart;
import com.attt.and103_asgm.ui.fragment.Home;
import com.attt.and103_asgm.ui.fragment.Setting;
import com.etebarian.meowbottomnavigation.MeowBottomNavigation;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private Fragment homeFragment;
    private Fragment favoriteFragment;
    private Fragment cartFragment;
    private Fragment profileFragment;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.bottomNavigation.show(1, true);
        binding.bottomNavigation.add(new MeowBottomNavigation.Model(1, R.drawable.home));
        binding.bottomNavigation.add(new MeowBottomNavigation.Model(2, R.drawable.heart_outlined_icon));
        binding.bottomNavigation.add(new MeowBottomNavigation.Model(3, R.drawable.cart_icon));
        binding.bottomNavigation.add(new MeowBottomNavigation.Model(4, R.drawable.setting_icon));

        // Khởi tạo các Fragment
        homeFragment = new Home();
        favoriteFragment = new Heart();
        cartFragment = new Cart();
        profileFragment = new Setting();

        // Mặc định hiển thị HomeFragment
        setFragment(homeFragment);

        // Xử lý sự kiện khi người dùng click vào các tab trên Navigation Bar
        binding.bottomNavigation.setOnClickMenuListener(item -> {
            switch (item.getId()) {
                case 1:
                    setFragment(homeFragment);
                    break;
                case 2:
                    setFragment(favoriteFragment);
                    break;
                case 3:
                    setFragment(cartFragment);
                    break;
                case 4:
                    setFragment(profileFragment);
                    break;
            }
            return null;
        });
    }
    // Phương thức để thay đổi Fragment
    private void setFragment(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frameLayout, fragment);
        fragmentTransaction.commit();
    }
}