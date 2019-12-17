package com.example.mca2.Service.Models;

import android.widget.ImageView;

public class User {

    String username;
    String password;
    ImageView profilePicture;

    public User () {
        username = "username";
        password = "password";
    }

   /* public User (String username, String password ,ImageView profilePicture){
        this.username = username;
        this.password = password;
        this.ImageView = ImageView;
    }*/
    public String getUsername(){
        return username;
    }
    public String getPassword(){
        return password;
    }
    public ImageView getProfilePicture(){
        return profilePicture;
    }
}
