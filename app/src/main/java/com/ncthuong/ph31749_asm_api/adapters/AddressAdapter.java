package com.ncthuong.ph31749_asm_api.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.attt.and103_asgm.databinding.ItemAdressBinding;
import com.attt.and103_asgm.models.Address;

import java.util.List;

public class AddressAdapter extends RecyclerView.Adapter<AddressAdapter.ViewHolder> {
    private List<Address> productList;
    private Context context;

    public AddressAdapter(List<Address> productList, Context context) {
        this.productList = productList;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemAdressBinding binding = ItemAdressBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Address product = productList.get(position);
        holder.binding.tvName.setText(product.getName());
        holder.binding.tvAddress.setText(product.getAddress());
    }

    @Override
    public int getItemCount() {
        return productList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ItemAdressBinding binding;
        public ViewHolder(ItemAdressBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
