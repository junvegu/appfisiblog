package com.openlab.fisiblog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    private static  final String URL_1= "http://img13.deviantart.net/60ba/i/2017/014/a/4/leaves_on_skin_by_agnes_cecile-davcpfw.jpg";
    private ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondary);
/*

        imageView = (ImageView) findViewById(R.id.id_image);

        Glide.with(this).load(URL_1).transform(new CircleTransform(this)).into(imageView);
*/




    }
}
