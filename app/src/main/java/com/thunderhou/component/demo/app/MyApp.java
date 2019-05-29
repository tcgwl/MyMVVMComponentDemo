package com.thunderhou.component.demo.app;

import com.thunderhou.component.library.base.config.ModuleLifecycleConfig;

import me.goldze.mvvmhabit.base.BaseApplication;

public class MyApp extends BaseApplication {
    @Override
    public void onCreate() {
        super.onCreate();
        //初始化组件(靠前)
        ModuleLifecycleConfig.getInstance().initModuleAhead(this);
        //....
        //初始化组件(靠后)
        ModuleLifecycleConfig.getInstance().initModuleLow(this);
    }
}
