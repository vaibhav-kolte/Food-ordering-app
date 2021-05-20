package com.example.foodorderapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.example.foodorderapp.Adapters.OrdersAdapter;
import com.example.foodorderapp.Models.OrdersModel;
import com.example.foodorderapp.databinding.ActivityOrderBinding;

import java.util.ArrayList;

public class OrderActivity extends AppCompatActivity {

    ActivityOrderBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityOrderBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        ArrayList<OrdersModel> list = new ArrayList<>();

        list.add(new OrdersModel(R.drawable.pales_pizza,"Pales Pizza","3","1122443"));
        list.add(new OrdersModel(R.drawable.pales_pizza,"Pales Pizza","3","1122443"));
        list.add(new OrdersModel(R.drawable.veg_manchurian,"Veg Manchurian","6","1188443"));
        list.add(new OrdersModel(R.drawable.pales_pizza,"Pales Pizza","3","1122443"));
        list.add(new OrdersModel(R.drawable.pales_pizza,"Pales Pizza","3","1122443"));

        OrdersAdapter adapter = new OrdersAdapter(list,this);
        binding.orderRecylcerView.setAdapter(adapter);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        binding.orderRecylcerView.setLayoutManager(layoutManager);
    }
}