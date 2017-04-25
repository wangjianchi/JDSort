package com.neowang.jdsort;

import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.BaseSectionQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

import java.util.List;

/**
 * Created by cd14 on 2017/4/25.
 */

public class AdatperCategorySection extends BaseSectionQuickAdapter<CategorySection,BaseViewHolder> {
    private Context context;
    public AdatperCategorySection(List data, Context context) {
        super(R.layout.list_item_category_03, R.layout.list_item_category_02, data);
        this.context = context;
    }

    @Override
    protected void convertHead(BaseViewHolder helper, CategorySection item) {
        helper.setText(R.id.tv_catogory,item.header);
    }

    @Override
    protected void convert(BaseViewHolder helper, CategorySection item) {
        helper.setText(R.id.tv_category_name,item.t.getName());
        Glide.with(context)
                .load(item.t.getImageUrl())
                .error(R.mipmap.ic_launcher)
                .into((ImageView)helper.getView(R.id.iv_category));
    }
}