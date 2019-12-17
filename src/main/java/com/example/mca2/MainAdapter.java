package com.example.mca2;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainAdapter extends RecyclerView.Adapter {

    private ArrayList<String> info;
    private int post;
    private Context context;

    public MainAdapter(ArrayList<String> info, int post, Context context) {
        this.info = info;
        this.post = post;
        this.context = context;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        public TextView userName;
        public ImageView userProfilePic;
        public TextView description;
        public ImageView postImage;
        public TextView numOfLikes;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            userName = (TextView) itemView.findViewById(R.id.name_name);
            userProfilePic = (ImageView)itemView.findViewById(R.id.name_profile_image);
            description = (TextView) itemView.findViewById(R.id.text_view_1_name_description);
            postImage = (ImageView) itemView.findViewById(R.id.post_image);
            numOfLikes = (TextView) itemView.findViewById(R.id.name_likes);
        }
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
