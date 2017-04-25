package com.neowang.jdsort;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

import java.util.List;

/**
 * Created by cd14 on 2017/4/25.
 */

public class AdapterTitle extends BaseQuickAdapter<CategoryTitle,BaseViewHolder> {


    public AdapterTitle(List<CategoryTitle> data) {
        super(R.layout.list_item_category_01, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, CategoryTitle item) {
        helper.setText(R.id.category_name,item.getName());
    }
}
