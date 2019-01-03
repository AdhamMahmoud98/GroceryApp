package com.GroceryApp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.GroceryApp.entities.ProductItem;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private ArrayList<ProductItem> productItems = new ArrayList<>();
    private Context mContext;

    public RecyclerViewAdapter(ArrayList<ProductItem> productItems, Context mContext) {
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


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.itemlist , parent,false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, final int position) {
       ProductItem productItem = productItems.get(position);
        viewHolder.itemName.setText(productItem.getName());
        viewHolder.itemDescription.setText(productItem.getDescription());
    }


    public int getItemCount() {
        return productItems.size();
    }

}
