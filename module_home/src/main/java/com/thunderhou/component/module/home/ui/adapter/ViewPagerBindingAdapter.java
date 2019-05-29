package com.thunderhou.component.module.home.ui.adapter;

import android.databinding.ViewDataBinding;
import android.view.ViewGroup;

import com.thunderhou.component.module.home.databinding.HomeItemViewpagerBinding;
import com.thunderhou.component.module.home.ui.viewmodel.ViewPagerItemViewModel;

import me.tatarka.bindingcollectionadapter2.BindingViewPagerAdapter;

public class ViewPagerBindingAdapter extends BindingViewPagerAdapter<ViewPagerItemViewModel> {
    @Override
    public void onBindBinding(ViewDataBinding binding, int variableId, int layoutRes, int position, ViewPagerItemViewModel item) {
        super.onBindBinding(binding, variableId, layoutRes, position, item);
        //这里可以强转成ViewPagerItemViewModel对应的ViewDataBinding，
        HomeItemViewpagerBinding _binding = (HomeItemViewpagerBinding) binding;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        super.destroyItem(container, position, object);
    }
}
