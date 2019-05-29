package com.thunderhou.component.module.project.ui.viewmodel;

import android.app.Application;
import android.databinding.ObservableArrayList;
import android.databinding.ObservableList;
import android.support.annotation.NonNull;

import com.thunderhou.component.module.project.BR;
import com.thunderhou.component.module.project.R;

import me.goldze.mvvmhabit.base.BaseViewModel;
import me.tatarka.bindingcollectionadapter2.ItemBinding;

public class ProjectViewModel extends BaseViewModel {
    public ProjectViewModel(@NonNull Application application) {
        super(application);
    }

    public void addData() {
        items.clear();
        for (int i = 0; i < 10; i++) {
            items.add(new GridItemViewModel(this, "条目" + i));
        }
    }

    //给RecyclerView添加ObservableList
    public ObservableList<GridItemViewModel> items = new ObservableArrayList<>();
    public ItemBinding<GridItemViewModel> itemBinding = ItemBinding.of(BR.viewModel, R.layout.project_item_grid);
}
