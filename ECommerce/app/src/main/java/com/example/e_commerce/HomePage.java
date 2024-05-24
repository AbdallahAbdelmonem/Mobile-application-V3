package com.example.e_commerce;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class HomePage extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        Intent in=getIntent();
//        Toast.makeText(this, "n: " +in.getStringExtra("userName"), Toast.LENGTH_SHORT).show();
    }

    public void openCartPage(View view){
        Intent in=new Intent(this, Cart.class);
        startActivity(in);
    }
    public void openFavourite(View view){
        Intent in=new Intent(this, Favourite.class);
        startActivity(in);
    }

    public void signout(View view){
        Intent in=new Intent(this, MainActivity.class);
        startActivity(in);
    }
    public void jewellery(View view){
        Intent in=new Intent(this,Jewelery.class);
        startActivity(in);
    }
    public void headphone(View view){
        Intent in=new Intent(this,Headphone.class);
        startActivity(in);
    }

    public void redShoes(View view){
        Intent in=new Intent(this,RedShoes.class);
        startActivity(in);
    }

    public void Pen(View view){
        Intent in=new Intent(this,Pen.class);
        startActivity(in);
    }

    public void SmartWatch(View view){
        Intent in=new Intent(this,Smartwatch.class);
        startActivity(in);
    }
    public void shoose(View view){
        Intent in=new Intent(this,YellowShoes.class);
        startActivity(in);
    }

}