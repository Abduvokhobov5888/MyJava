package com.example.myjava;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.widget.CursorAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView dataList;
    List<String> titles;
    List<Integer> images;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dataList = findViewById(R.id.recyclerView);

        titles = new ArrayList<>();
        images = new ArrayList<>();

        titles.add("One");
        titles.add("Two");
        titles.add("Three");
        titles.add("Four");

        images.add(R.drawable.one);
        images.add(R.drawable.two);
        images.add(R.drawable.three);
        images.add(R.drawable.four);


        Adapter adapter = new Adapter(this, titles, images);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,2,GridLayoutManager.VERTICAL,false);
        dataList.setLayoutManager(gridLayoutManager);
        dataList.setAdapter(adapter);
    }
}