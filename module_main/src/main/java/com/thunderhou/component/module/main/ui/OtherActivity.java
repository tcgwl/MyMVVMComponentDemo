package com.thunderhou.component.module.main.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

import com.alibaba.android.arouter.launcher.ARouter;
import com.thunderhou.component.module.main.R;

public class OtherActivity extends AppCompatActivity {
    private static final String FRAGMENT_TARGET = "FRAGMENT_TARGET";

    public static void startActivity(Context context, String fragmentName) {
        Intent intent = new Intent(context, OtherActivity.class);
        intent.putExtra(FRAGMENT_TARGET, fragmentName);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity_other);

        String value = getIntent().getStringExtra(FRAGMENT_TARGET);
        Fragment currentFragment = (Fragment) ARouter.getInstance().build(value).navigation();
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.container, currentFragment);
        transaction.commitAllowingStateLoss();
    }
}
