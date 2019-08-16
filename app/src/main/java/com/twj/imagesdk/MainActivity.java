package com.twj.imagesdk;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.hust_twj.imageloderlibrary.ImageLoader;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView = findViewById(R.id.iv);

        ImageLoader.get().load("http://p3-q.mafengwo.net/s12/M00/5F/01/wKgED1va9ZeAf0k5AAijT_WanQ006.jpeg")
                .error(R.drawable.ic_launcher_background)
                .placeHolder(R.drawable.ic_launcher_background)
                .displayRaw(false)
                .into(imageView);
    }
}
