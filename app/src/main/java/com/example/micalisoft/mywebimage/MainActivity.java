package com.example.micalisoft.mywebimage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;

    String url = "https://www.academiainstintoyseduccion.com/product/wp-content/uploads/2018/06/Portada-Audio-Friend-Zone.png";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         imageView = (ImageView) findViewById(R.id.imageView);
         loadImageFromUrl(url);


    }

    private void loadImageFromUrl(String url) {

        Picasso.with(this).load(url).placeholder(R.mipmap.ic_launcher) // optional
        .error(R.mipmap.ic_launcher) // if error
        .into(imageView, new com.squareup.picasso.Callback(){

            @Override
            public void onSuccess() {

            }

            @Override
            public void onError() {

            }
        });

    }
}
