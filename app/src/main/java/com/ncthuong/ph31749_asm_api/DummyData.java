package com.ncthuong.ph31749_asm_api;

import com.attt.and103_asgm.models.Address;
import com.attt.and103_asgm.models.Product;

import java.util.ArrayList;
import java.util.List;

public class DummyData {
    public static List<Product> generateDummyData() {
        List<Product> dummyData = new ArrayList<>();

        // Thêm dữ liệu giả vào danh sách dummyData
        dummyData.add(new Product("1", "Maple Tree", "Deciduous tree known for its vibrant autumn colors.", "$50", "https://images.rawpixel.com/image_png_800/cHJpdmF0ZS9sci9pbWFnZXMvd2Vic2l0ZS8yMDIzLTEwL3Jhd3BpeGVsX29mZmljZV8zMl9waG90b19vZl9hX3BsYW50X2luX2hvbWVfaXNvbGF0ZWRfb25fd2hpdGVfYl83YmViOTc1OC0wYjJlLTQzYmUtYWYxZi03YjljODA3ZjI3MzRfMS5wbmc.png"));
        dummyData.add(new Product("2", "Pine Tree", "Evergreen coniferous tree with needle-like leaves.", "$40", "https://img.lovepik.com/free-png/20210924/lovepik-plant-pot-png-image_401306819_wh1200.png"));
        dummyData.add(new Product("3", "Oak Tree", "Large, sturdy deciduous tree with broad leaves.", "$60", "https://img.freepik.com/free-psd/monstera-deliciosa-png-isolated-transparent-background_191095-11918.jpg"));
        // Thêm các loại cây khác nếu cần
        return dummyData;
    }

    public static List<Address> getAddress() {
        List<Address> dummyData = new ArrayList<>();

        // Thêm dữ liệu giả vào danh sách dummyData
        dummyData.add(new Address("1", "John Doe", "123 Main St"));
        dummyData.add(new Address("2", "Jane Doe", "456 Elm St"));
        dummyData.add(new Address("3", "John Smith", "789 Oak St"));

        return dummyData;
    }
}

