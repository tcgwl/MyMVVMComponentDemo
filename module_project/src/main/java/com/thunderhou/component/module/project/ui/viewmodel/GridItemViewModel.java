package com.thunderhou.component.module.project.ui.viewmodel;

import android.databinding.ObservableField;
import android.support.annotation.NonNull;

import me.goldze.mvvmhabit.base.BaseViewModel;
import me.goldze.mvvmhabit.base.ItemViewModel;

public class GridItemViewModel extends ItemViewModel {
    public ObservableField<String> text = new ObservableField<>();

    public GridItemViewModel(@NonNull BaseViewModel viewModel, String text) {
        super(viewModel);
        this.text.set(text);
    }
}
