package com.moringaschool.recylerviewpractice;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    ImageView imageView;
    TextView textView1, textView2;

    String data1, data2;
    int image;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        imageView = findViewById(R.id.mainImageView);
        textView1 = findViewById(R.id.teamView);
        textView2 = findViewById(R.id.descriptionView);

        getData();
        setData();

    }

    private void getData() {
        if(getIntent().hasExtra("data1") && getIntent().hasExtra("data2") && getIntent().hasExtra("myImage")) {
            data1 = getIntent().getStringExtra("data1");
            data2 = getIntent().getStringExtra("data2");
            image = getIntent().getIntExtra("myImage", 1);
        } else {
            Toast.makeText(this, "No data!", Toast.LENGTH_SHORT).show();
        }
    }

    private void setData() {
        textView1.setText(data1);
        textView2.setText(data2);
        imageView.setImageResource(image);
    }
}
