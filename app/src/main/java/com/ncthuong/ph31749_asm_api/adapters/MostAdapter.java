package com.ncthuong.ph31749_asm_api.adapters;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.attt.and103_asgm.databinding.ItemPopularBinding;
import com.attt.and103_asgm.models.Product;
import com.attt.and103_asgm.ui.DetailsActivity;
import com.bumptech.glide.Glide;

import java.util.List;

public class MostAdapter extends RecyclerView.Adapter<MostAdapter.ViewHolder> {
    private List<Product> productList;
    private Context context;
    private static final int REQUEST_CODE = 1;

    public MostAdapter(List<Product> productList, Context context) {
        this.productList = productList;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemPopularBinding binding = ItemPopularBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Product product = productList.get(position);
        //using glide to load image
        Glide.with(context).load(product.getImage()).into(holder.binding.imgProduct);
        holder.binding.tvNameProduct.setText(product.getName());
        holder.binding.tvPriceProduct.setText(product.getPrice() + "$");
        holder.binding.tvDesProduct.setText(product.getDescription());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, DetailsActivity.class);
                ((Activity) context).startActivityForResult(intent, REQUEST_CODE);
            }
        });
    }

    @Override
    public int getItemCount() {
        return productList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ItemPopularBinding binding;
        public ViewHolder(ItemPopularBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
