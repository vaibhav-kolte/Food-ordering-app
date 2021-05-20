package com.example.foodorderapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.foodorderapp.databinding.ActivityDetailsBinding;


public class DetailsActivity extends AppCompatActivity {

    ActivityDetailsBinding binding;
    int quantity;
    private int price;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetailsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        final int image = getIntent().getIntExtra("image",0);
        price = Integer.parseInt(getIntent().getStringExtra("price"));
        final String name = getIntent().getStringExtra("name");
        final String desc = getIntent().getStringExtra("description");

        binding.orderDetailsImage.setImageResource(image);
        binding.orderDeatilsFoodName.setText(name);
        binding.deatilOrderDescription.setText(desc);
        binding.detailsPrice.setText(String.valueOf(price));

        binding.add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                quantity = Integer.parseInt((String) binding.quantity.getText());
                binding.quantity.setText(String.valueOf(quantity+1));
                quantity = Integer.parseInt((String) binding.quantity.getText());
                price = quantity*price;
                binding.detailsPrice.setText(String.valueOf(price));
            }
        });

        binding.subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                quantity = Integer.parseInt((String) binding.quantity.getText());
                if(quantity>1){
                    binding.quantity.setText(String.valueOf(quantity-1));
                    quantity = Integer.parseInt((String) binding.quantity.getText());
                    price = quantity*price;
                    binding.detailsPrice.setText(String.valueOf(price));
                }
            }
        });

        DBHelper dbHelper = new DBHelper(this);
        binding.btnOrderNow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean isInserted = dbHelper.insertOrder(
                        binding.nameBox.getText().toString(),
                        binding.phoneBox.getText().toString(),
                        price,
                        image,
                        quantity,
                        desc,
                        name
                );
                if(isInserted){
                    Toast.makeText(getApplicationContext(),"Data Inserted",Toast.LENGTH_LONG).show();
                }
                else{
                    Toast.makeText(getApplicationContext(),"Data not Inserted",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}