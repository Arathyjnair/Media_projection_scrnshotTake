package com.example.user.media_projection_scrnshottake;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
   ConstraintLayout l1;
   ImageView image;
   Button butt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        l1=(ConstraintLayout) findViewById(R.id.constnt1);
        image=(ImageView) findViewById(R.id.imageView2);
        butt=(Button) findViewById(R.id.button2);
        butt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                View v1=l1.getRootView();
                v1.setDrawingCacheEnabled(true);
                Bitmap bp=v1.getDrawingCache();
                BitmapDrawable btmpdraw=new BitmapDrawable(bp);
                image.setBackgroundDrawable(btmpdraw);

            }
        });
    }
}
