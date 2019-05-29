package com.thunderhou.component.module.main.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;

public class SplashActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
               gotoMain();
            }
        }, 3000);
    }

    private void gotoMain() {
        startActivity(new Intent(this, MainActivity.class));
        finish();
    }
}
