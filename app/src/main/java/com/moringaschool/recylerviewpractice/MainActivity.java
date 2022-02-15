package com.moringaschool.recylerviewpractice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    String s1[], s2[];
    int images[] = {R.drawable.chelsea, R.drawable.man_city, R.drawable.liverpool, R.drawable.west_ham, R.drawable.tottenham, R.drawable.real_madrid,
            R.drawable.psg, R.drawable.ajax, R.drawable.man_united, R.drawable.arsenal};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        s1 = getResources().getStringArray(R.array.football_teams);
        s2 = getResources().getStringArray(R.array.description);

        MyRecyclerViewAdapter myAdapter = new MyRecyclerViewAdapter(MainActivity.this, s1, s2, images);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
    }

}