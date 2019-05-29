package com.thunderhou.component.library.base.config;

/**
 * 组件生命周期反射类名管理，在这里注册需要初始化的组件，通过反射动态调用各个组件的初始化方法
 * 注意：以下模块中初始化的Module类不能被混淆
 */
public class ModuleLifecycleReflexs {
    private static final String BaseInit = "com.thunderhou.component.library.base.base.BaseModuleInit";
    //主业务模块
    private static final String MainInit = "com.thunderhou.component.module.main.MainModuleInit";
    //首页业务模块
    private static final String HomeInit = "com.thunderhou.component.module.home.HomeModuleInit";
    //知识体系业务模块
    private static final String TreeInit = "com.thunderhou.component.module.tree.TreeModuleInit";
    //导航业务模块
    private static final String NavInit = "com.thunderhou.component.module.nav.NavModuleInit";
    //项目业务模块
    private static final String ProjectInit = "com.thunderhou.component.module.project.ProjectModuleInit";
    //公众号业务模块
    private static final String WechatInit = "com.thunderhou.component.module.wechat.WechatModuleInit";
    //用户业务模块
    private static final String UserInit = "com.thunderhou.component.module.user.UserModuleInit";
    //登录验证模块
    private static final String SignInit = "com.thunderhou.component.module.sign.SignModuleInit";

    public static String[] initModuleNames = {
            BaseInit, MainInit,
            HomeInit, TreeInit, NavInit, UserInit,
            ProjectInit, WechatInit, SignInit
    };
}
