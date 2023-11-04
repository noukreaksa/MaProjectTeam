package com.example.maproject.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;

import com.example.maproject.API.model.Province;
import com.example.maproject.databinding.ViewHolderProvinceBinding;
import com.squareup.picasso.Picasso;

public class ProvinceAdapter extends ListAdapter<Province, ProvinceAdapter.ViewHolderProvince> {


    public ProvinceAdapter(){

        super(new DiffUtil.ItemCallback<Province>() {
            @Override
            public boolean areItemsTheSame(@NonNull Province oldItem, @NonNull Province newItem) {
                return oldItem == newItem;
            }

            @Override
            public boolean areContentsTheSame(@NonNull Province oldItem, @NonNull Province newItem) {
                return oldItem.getId() == newItem.getId();
            }
        });
    }

    @NonNull
    @Override
    public ViewHolderProvince onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

//        create Inflater
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        ViewHolderProvinceBinding binding = ViewHolderProvinceBinding.inflate(layoutInflater, parent,false);
        return new ViewHolderProvince(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderProvince holder, int position) {

        Province item = getItem(position);
        holder.bind(item);
    }

    public static class ViewHolderProvince extends RecyclerView.ViewHolder
    {

        private final   ViewHolderProvinceBinding itemBinding;
        public ViewHolderProvince(ViewHolderProvinceBinding itemBinding) {
            super(itemBinding.getRoot());
            this.itemBinding = itemBinding;
        }

        public void bind(Province province)
        {
            Picasso.get().load(province.getImageUrl()).into(itemBinding.imgProvince);
            itemBinding.nameProvince.setText(province.getName());
        }
    }
}
