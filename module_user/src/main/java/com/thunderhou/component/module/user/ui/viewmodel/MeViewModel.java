package com.thunderhou.component.module.user.ui.viewmodel;

import android.app.Application;
import android.databinding.ObservableField;
import android.databinding.ObservableInt;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.view.View;

import com.alibaba.android.arouter.launcher.ARouter;
import com.thunderhou.component.library.base.contract.LoginEvent;
import com.thunderhou.component.library.base.global.SPKeyGlobal;
import com.thunderhou.component.library.base.router.RouterActivityPath;

import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import me.goldze.mvvmhabit.base.BaseViewModel;
import me.goldze.mvvmhabit.binding.command.BindingAction;
import me.goldze.mvvmhabit.binding.command.BindingCommand;
import me.goldze.mvvmhabit.bus.RxBus;
import me.goldze.mvvmhabit.bus.RxSubscriptions;
import me.goldze.mvvmhabit.utils.SPUtils;

public class MeViewModel extends BaseViewModel {
    public ObservableInt loginBtnVisible = new ObservableInt();
    public ObservableField<String> userInfoObservable = new ObservableField();
    private Disposable subscribe;

    public MeViewModel(@NonNull Application application) {
        super(application);
    }

    @Override
    public void onCreate() {
        initData();
    }

    private void initData() {
        String userInfo = SPUtils.getInstance().getString(SPKeyGlobal.USER_INFO);
        if (TextUtils.isEmpty(userInfo)) {
            loginBtnVisible.set(View.VISIBLE);
        } else {
            userInfoObservable.set(userInfo);
            loginBtnVisible.set(View.GONE);
        }
    }

    //登录按钮点击事件
    public BindingCommand startLoginOnClickCommand = new BindingCommand(new BindingAction() {
        @Override
        public void call() {
            //采用ARouter+RxBus实现组件间通信
            ARouter.getInstance().build(RouterActivityPath.Sign.PAGER_LOGIN).navigation();
            subscribe = RxBus.getDefault().toObservable(LoginEvent.class)
                    .subscribe(new Consumer<LoginEvent>() {
                        @Override
                        public void accept(LoginEvent loginEvent) throws Exception {
                            //登录成功后重新刷新数据
                            initData();
                            //解除注册
                            RxSubscriptions.remove(subscribe);
                        }
                    });
            RxSubscriptions.add(subscribe);
        }
    });

    //退出登录按钮点击事件
    public BindingCommand outLoginOnClickCommand = new BindingCommand(new BindingAction() {
        @Override
        public void call() {
            SPUtils.getInstance().put(SPKeyGlobal.USER_INFO, "");
            //退出登录后重新刷新数据
            initData();
        }
    });
}
