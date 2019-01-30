package com.george.mipmap;

import android.util.Log;

/**
 * Created By George
 * Description:
 */
public class MipmapUtils {
    private static final String TAG = "MipmapUtils-测试";

    /**
     * 注意：
     * 如果使用了适配方案，则这里有可能不会走对应的dpi了，可能会走适配方案。
     * 比如：mipmap-anydpi-v26
     *
     * @param xdpi
     * @param ydpi
     */
    public static void useMipmap(float xdpi, float ydpi) {
        if (xdpi >= 0 && ydpi >= 0 && xdpi <= 120 && ydpi <= 120) {
            Log.d(TAG, "use ldpi");
        } else if (xdpi >= 120 && ydpi >= 120 && xdpi <= 160 && ydpi <= 160) {
            Log.d(TAG, "use mdpi");
        } else if (xdpi >= 160 && ydpi >= 160 && xdpi <= 240 && ydpi <= 240) {
            Log.d(TAG, "use hdpi");
        } else if (xdpi >= 240 && ydpi >= 240 && xdpi <= 320 && ydpi <= 320) {
            Log.d(TAG, "use xhdpi");
        } else if (xdpi >= 320 && ydpi >= 320 && xdpi <= 480 && ydpi <= 480) {
            Log.d(TAG, "use xxhdpi");
        } else if (xdpi >= 480 && ydpi >= 480 && xdpi <= 640 && ydpi <= 640) {
            Log.d(TAG, "use xxxhdpi");
        } else {
            Log.d(TAG, "use unknown");
        }
    }
}
