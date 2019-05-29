package com.thunderhou.component.module.wechat;

import android.app.Application;

import com.thunderhou.component.library.base.base.IModuleInit;

import me.goldze.mvvmhabit.utils.KLog;

public class WechatModuleInit implements IModuleInit {
    @Override
    public boolean onInitAhead(Application application) {
        KLog.e("公众号模块初始化 -- onInitAhead");
        return false;
    }

    @Override
    public boolean onInitLow(Application application) {
        KLog.e("公众号模块初始化 -- onInitLow");
        return false;
    }
}
