package com.example.mca2.Service.Models;

import android.widget.ImageView;

public class Post extends User {

    int numberOfLikes;
    int numberOfComments;
    ImageView postImage;
    String description;

    public Post(int numberOfLikes, int numberOfComments, String description){
        this.numberOfComments = numberOfComments;
        this.numberOfLikes = numberOfLikes;
        this.description = description;
    }
    public int getNumberOfLikes(){
        return numberOfLikes;
    }
    public int getNumberOfComments(){
        return numberOfComments;
    }
}
