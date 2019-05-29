package com.thunderhou.component.module.nav.ui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.thunderhou.component.library.base.router.RouterFragmentPath;
import com.thunderhou.component.module.nav.BR;
import com.thunderhou.component.module.nav.R;
import com.thunderhou.component.module.nav.databinding.NavFragmentBinding;
import com.thunderhou.component.module.nav.ui.viewmodel.NavViewModel;

import me.goldze.mvvmhabit.base.BaseFragment;

@Route(path = RouterFragmentPath.Nav.PAGER_NAV)
public class NavFragment extends BaseFragment<NavFragmentBinding, NavViewModel> {
    @Override
    public int initContentView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return R.layout.nav_fragment;
    }

    @Override
    public int initVariableId() {
        return BR.viewModel;
    }
}
