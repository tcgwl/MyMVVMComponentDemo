package com.thunderhou.component.module.tree.ui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.thunderhou.component.library.base.router.RouterFragmentPath;
import com.thunderhou.component.module.tree.BR;
import com.thunderhou.component.module.tree.R;
import com.thunderhou.component.module.tree.databinding.TreeFragmentBinding;
import com.thunderhou.component.module.tree.ui.viewmodel.TreeViewModel;

import me.goldze.mvvmhabit.base.BaseFragment;

@Route(path = RouterFragmentPath.Tree.PAGER_TREE)
public class TreeFragment extends BaseFragment<TreeFragmentBinding, TreeViewModel> {
    @Override
    public int initContentView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return R.layout.tree_fragment;
    }

    @Override
    public int initVariableId() {
        return BR.viewModel;
    }
}
