package com.george.mipmap;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity-测试";

    private ImageView img;
    private Button test;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img = findViewById(R.id.img);
        test = findViewById(R.id.test);
        test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "with:" + img.getWidth() + " height:" + img.getHeight());
            }
        });

        img.setImageResource(R.mipmap.ic_launcher);

        // 每英寸在x/y方向上的物理像素
        float xdpi = getResources().getDisplayMetrics().xdpi;
        float ydpi = getResources().getDisplayMetrics().ydpi;
        Log.d(TAG, "xdpi:" + xdpi + " ydpi:" + ydpi);
        MipmapUtils.useMipmap(xdpi,ydpi);
        Log.d(TAG, "1dp-->:" + dip2px(1));
    }
    public  int dip2px(float dpValue) {
        final float scale = getResources().getDisplayMetrics().density;
        return (int) (dpValue * scale + 0.5f);
    }
}
