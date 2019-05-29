package com.thunderhou.component.library.base.contract;

/**
 * 登录完成后，组件间通信的契约类
 */
public class LoginEvent {
    private String userName;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
