package com.example.mca2.Service.Models;

public class Comment extends User {

    String commentText;

    public Comment(String commentText){
        this.commentText = commentText;
    }
    public String getCommentText(){
        return commentText;
    }
}
