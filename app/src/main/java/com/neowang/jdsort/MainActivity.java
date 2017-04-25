package com.neowang.jdsort;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.listener.OnItemClickListener;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recycler_sort;
    private RecyclerView recycler_detail;
    private AdapterTitle adapterTitle;
    private AdatperCategorySection adapterCategorySection;
    private List<CategoryTitle> categoryTitles;
    private List<CategorySection> categorySections;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recycler_sort = (RecyclerView)findViewById(R.id.recycler_sort);
        recycler_detail = (RecyclerView)findViewById(R.id.recycler_detail);
        categoryTitles = DataManager.getInstance().getTitle();
        adapterTitle = new AdapterTitle(categoryTitles);
        recycler_sort.setLayoutManager(new LinearLayoutManager(this));
        recycler_sort.setAdapter(adapterTitle);

        categorySections = DataManager.getInstance().getCategory(0);
        adapterCategorySection = new AdatperCategorySection(categorySections,this);
        recycler_detail.setLayoutManager(new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL));
        recycler_detail.setAdapter(adapterCategorySection);

        recycler_sort.addOnItemTouchListener(new OnItemClickListener() {
            @Override
            public void onSimpleItemClick(BaseQuickAdapter adapter, View view, int position) {
                categorySections.clear();
                List<CategorySection> list = DataManager.getInstance().getCategory(position);
                categorySections.addAll(list);
                adapterCategorySection.notifyDataSetChanged();
                recycler_detail.scrollToPosition(0);
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {

                    }
                },500);
            }
        });


    }
    Handler handler = new Handler();
}
