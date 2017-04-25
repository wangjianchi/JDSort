package com.neowang.jdsort;

import com.chad.library.adapter.base.entity.SectionEntity;

/**
 * Created by cd14 on 2017/4/25.
 */

public class CategorySection extends SectionEntity<Category> {
    public CategorySection(boolean isHeader, String header) {
        super(isHeader, header);
    }

    public CategorySection(Category category) {
        super(category);
    }
}
