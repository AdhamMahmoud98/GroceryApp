package com.GroceryApp;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.GroceryApp.entities.ProductItem;
import com.bumptech.glide.Glide;

import java.util.ArrayList;

import androidx.recyclerview.widget.RecyclerView;


public class RecyclerViewAdapter extends RecyclerView.ViewHolder {

    private ArrayList<ProductItem> productItems = new ArrayList<>();
    private Context mContext;

    public RecyclerViewAdapter( View itemView, ArrayList<ProductItem> productItems, Context mContext) {
        super(itemView);
        this.productItems = productItems;
        this.mContext = mContext;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView itemName;
        TextView itemDescription;
        RelativeLayout parentLayout;

        public ViewHolder(View itemView) {
            super(itemView);
            itemName = itemView.findViewById(R.id.item_name);
            itemDescription = itemView.findViewById(R.id.item_description);

        }
    }


    public void onBindViewHolder( ViewHolder viewHolder, final int position) {
       ProductItem productItem = productItems.get(position);
        viewHolder.itemName.setText(productItem.getName());
        viewHolder.itemDescription.setText(productItem.getDescription());
    }


    public int getItemCount() {
        return productItems.size();
    }

}
