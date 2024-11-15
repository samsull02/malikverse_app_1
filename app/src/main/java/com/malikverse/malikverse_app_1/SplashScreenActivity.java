package com.malikverse.malikverse_app_1;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

public class SplashScreenActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {  // Perbaiki typo "saveInstanceState" ke "savedInstanceState"
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        // Mengatur delay splash screen selama 3 detik (3000 ms)
        new Handler().postDelayed(() -> {
            Intent intent = new Intent(SplashScreenActivity.this, MainActivity.class);
            startActivity(intent);
            finish(); // Menutup splash screen agar tidak bisa kembali
        }, 3000);
    }
}
