package com.twj.imagesdk;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.hust_twj.imageloderlibrary.ImageLoader;
import com.hust_twj.imageloderlibrary.cache.DoubleCache;
import com.hust_twj.imageloderlibrary.config.LoaderConfig;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.iv);

    }

    public void load(View view) {
        ImageLoader.get().load("http://p3-q.mafengwo.net/s12/M00/5F/01/wKgED1va9ZeAf0k5AAijT_WanQ006.jpeg")
                .error(R.drawable.img_error)
                .placeHolder(R.drawable.img_place_holder)
                //.displayRaw(false)
                .into(imageView);
    }

}
