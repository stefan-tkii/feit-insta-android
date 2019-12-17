package com.example.mca2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;

import com.example.mca2.Service.Models.Post;
import com.example.mca2.Service.Models.User;
import com.example.mca2.Service.myAdapter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;
    MainAdapter mAdapter;
    User user;
    Post post;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = (RecyclerView) findViewById(R.id.main_view_list);
        // privremen kod ***********
        post = new Post(2,2,"omg!");
        String pass = post.getPassword();
        String name = post.getUsername();
        ArrayList<String> info = new ArrayList<>();
        info.add(name);
        info.add(pass);
        //kraj na privremen kod **********
        mAdapter = new MainAdapter(info ,R.layout.post, this);
        mRecyclerView.setAdapter(mAdapter);


    }


}
