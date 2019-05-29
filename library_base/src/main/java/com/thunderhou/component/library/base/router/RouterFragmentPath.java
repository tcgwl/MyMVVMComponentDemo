package com.thunderhou.component.library.base.router;

/**
 * 用于组件开发中，ARouter多Fragment跳转的统一路径注册
 * 在这里注册添加路由路径，需要清楚的写好注释，标明功能界面
 */
public class RouterFragmentPath {
    /**
     * 首页组件
     */
    public static class Home {
        private static final String HOME = "/home";
        /*首页*/
        public static final String PAGER_HOME = HOME + "/Home";
    }

    /**
     * 知识体系组件
     */
    public static class Tree {
        private static final String TREE = "/tree";
        /*知识体系*/
        public static final String PAGER_TREE = TREE + "/Tree";
    }

    /**
     * 导航组件
     */
    public static class Nav {
        private static final String NAV = "/nav";
        /*导航*/
        public static final String PAGER_NAV = NAV + "/Nav";
    }

    /**
     * 用户组件
     */
    public static class User {
        private static final String USER = "/user";
        /*我的*/
        public static final String PAGER_ME = USER + "/Me";
    }

    /**
     * 项目组件
     */
    public static class Project {
        private static final String PROJECT = "/project";
        /*项目*/
        public static final String PAGER_PROJECT = PROJECT + "/Project";
    }

    /**
     * 公众号组件
     */
    public static class Wechat {
        private static final String WECHAT = "/wechat";
        /*项目*/
        public static final String PAGER_WECHAT = WECHAT + "/Wechat";
    }
}
