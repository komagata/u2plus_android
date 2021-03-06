package jp.u2plus;

import android.graphics.Color;
import android.os.Bundle;
import org.apache.cordova.*;

public class MainActivity extends DroidGap {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.init();
        super.setIntegerProperty("backgroundColor", Color.WHITE);
        super.setStringProperty("loadingDialog", "Loading...");
        super.setIntegerProperty("splashscreen", R.drawable.splash);
        super.loadUrl("http://u2plus.jp", 3000);
    }
}