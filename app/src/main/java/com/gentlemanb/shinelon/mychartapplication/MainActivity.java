package com.gentlemanb.shinelon.mychartapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView activity_main_rv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        activity_main_rv = (RecyclerView) findViewById(R.id.activity_main_rv);
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 365; i++) {
            list.add((int) (Math.random() * 300));
        }
        activity_main_rv.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        activity_main_rv.setAdapter(new MyRecyclerAdapter(list));
    }
}
