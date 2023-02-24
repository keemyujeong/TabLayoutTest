package com.example.tablayouttest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.tablayouttest.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    ArrayList<Item> items = new ArrayList<>();
    MyAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // TODO https://stackoverflow.com/questions/54978846/how-to-disable-swiping-in-viewpager2 -> 뷰페이저 스와이프 막기

        adapter = new MyAdapter(items, this);
        binding.recycler.setAdapter(adapter);
        items.add(new Item("더미데이터1","더미데이터2"));
        items.add(new Item("더미데이터1","더미데이터2"));
        items.add(new Item("더미데이터1","더미데이터2"));
        items.add(new Item("더미데이터1","더미데이터2"));
        items.add(new Item("더미데이터1","더미데이터2"));
        items.add(new Item("더미데이터1","더미데이터2"));
        items.add(new Item("더미데이터1","더미데이터2"));





    }
}