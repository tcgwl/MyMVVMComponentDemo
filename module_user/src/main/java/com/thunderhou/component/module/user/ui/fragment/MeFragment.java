package com.thunderhou.component.module.user.ui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.thunderhou.component.library.base.router.RouterFragmentPath;
import com.thunderhou.component.module.user.BR;
import com.thunderhou.component.module.user.R;
import com.thunderhou.component.module.user.databinding.UserFragmentMeBinding;
import com.thunderhou.component.module.user.ui.viewmodel.MeViewModel;

import me.goldze.mvvmhabit.base.BaseFragment;

@Route(path = RouterFragmentPath.User.PAGER_ME)
public class MeFragment extends BaseFragment<UserFragmentMeBinding, MeViewModel> {
    @Override
    public int initContentView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return R.layout.user_fragment_me;
    }

    @Override
    public int initVariableId() {
        return BR.viewModel;
    }
}
