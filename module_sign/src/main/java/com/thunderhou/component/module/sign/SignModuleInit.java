package com.thunderhou.component.module.sign;

import android.app.Application;

import com.thunderhou.component.library.base.base.IModuleInit;

import me.goldze.mvvmhabit.utils.KLog;

public class SignModuleInit implements IModuleInit {
    @Override
    public boolean onInitAhead(Application application) {
        KLog.e("登录模块初始化 -- onInitAhead");
        return false;
    }

    @Override
    public boolean onInitLow(Application application) {
        KLog.e("登录模块初始化 -- onInitLow");
        return false;
    }
}
