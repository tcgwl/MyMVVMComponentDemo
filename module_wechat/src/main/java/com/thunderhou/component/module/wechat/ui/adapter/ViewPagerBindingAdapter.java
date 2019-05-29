package com.thunderhou.component.module.wechat.ui.adapter;

import android.databinding.ViewDataBinding;
import android.view.ViewGroup;

import com.thunderhou.component.module.wechat.databinding.WechatItemViewpagerBinding;
import com.thunderhou.component.module.wechat.ui.viewmodel.ViewPagerItemViewModel;
import me.tatarka.bindingcollectionadapter2.BindingViewPagerAdapter;

public class ViewPagerBindingAdapter extends BindingViewPagerAdapter<ViewPagerItemViewModel> {
    @Override
    public void onBindBinding(ViewDataBinding binding, int variableId, int layoutRes, int position, ViewPagerItemViewModel item) {
        super.onBindBinding(binding, variableId, layoutRes, position, item);
        //这里可以强转成ViewPagerItemViewModel对应的ViewDataBinding，
        WechatItemViewpagerBinding _binding = (WechatItemViewpagerBinding) binding;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        super.destroyItem(container, position, object);
    }
}
