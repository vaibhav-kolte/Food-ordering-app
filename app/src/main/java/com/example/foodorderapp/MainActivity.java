package com.example.foodorderapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.example.foodorderapp.Adapters.MainAdapter;
import com.example.foodorderapp.Models.MainModel;
import com.example.foodorderapp.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        ArrayList<MainModel> list = new ArrayList<>();

        list.add(new MainModel(R.drawable.burger,"Burger","10","Chikan burger with extra cheess"));
        list.add(new MainModel(R.drawable.fast_food,"Nasta","5","This is simple fast food based on potato"));
        list.add(new MainModel(R.drawable.shezwan_noddles,"Shezwan Noddles","5","Best spicy Noddles"));
        list.add(new MainModel(R.drawable.veg_manchurian,"Veg Manchurian","8",
                "Today, let's make Restaurant Style Vegetable Manchurian Recipe in Gravy aka Wet Veg Manchurian is what we're making :)"));
        list.add(new MainModel(R.drawable.sauth_indian_dosa,"Sauth Indian Dossa","8","One of the best sauth Indian dossa"));
        list.add(new MainModel(R.drawable.chikan_sandwitch,"Chikan Sandwitch","2",
                "Spoil yourself for lunch with these scrumptiously stacked chicken club sandwiches"));
        list.add(new MainModel(R.drawable.pales_pizza,"Pales Pizza","7",
                "Still have pizza night, only without the grains, grain, or dairy, with this Paleo Pizza from ..."));

        MainAdapter adapter = new MainAdapter(list,this);
        binding.recylerview.setAdapter(adapter);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        binding.recylerview.setLayoutManager(layoutManager);
    }
}