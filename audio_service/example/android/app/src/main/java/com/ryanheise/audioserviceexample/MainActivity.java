package com.ryanheise.audioserviceexample;

import io.flutter.embedding.android.FlutterActivity;
import android.util.Log;
import com.ryanheise.audioservice.AudioServicePlugin;
import com.ryanheise.audioservice.AudioServiceActivity;
import androidx.annotation.NonNull;

public class MainActivity extends AudioServiceActivity {
    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("MainActivity", "onDestroy");
        // uncomment line below to release engine hold on AudioService if engine was started by the service
        // AudioServicePlugin.disposeFlutterEngine();
    }
}
