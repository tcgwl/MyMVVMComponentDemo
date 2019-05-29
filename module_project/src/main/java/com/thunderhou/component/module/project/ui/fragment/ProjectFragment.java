package com.thunderhou.component.module.project.ui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.thunderhou.component.library.base.router.RouterFragmentPath;
import com.thunderhou.component.module.project.BR;
import com.thunderhou.component.module.project.R;
import com.thunderhou.component.module.project.databinding.ProjectFragmentBinding;
import com.thunderhou.component.module.project.ui.viewmodel.ProjectViewModel;

import me.goldze.mvvmhabit.base.BaseFragment;

@Route(path = RouterFragmentPath.Project.PAGER_PROJECT)
public class ProjectFragment extends BaseFragment<ProjectFragmentBinding, ProjectViewModel> {
    @Override
    public int initContentView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return R.layout.project_fragment;
    }

    @Override
    public int initVariableId() {
        return BR.viewModel;
    }

    @Override
    public void initData() {
        viewModel.addData();
    }
}
