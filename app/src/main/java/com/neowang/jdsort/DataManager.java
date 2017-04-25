package com.neowang.jdsort;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cd14 on 2017/4/25.
 */

public class DataManager {
    private static DataManager instance;

    //获取单例
    public static synchronized DataManager getInstance() {
        if (instance == null) {
            instance = new DataManager();
        }
        return instance;
    }

    public List<CategoryTitle> getTitle(){
        List<CategoryTitle> list = new ArrayList<>();
        String[] titles = {"推荐分类","京东超市","全球购","男装","女装","内衣配饰","箱包手袋","美妆个护","手机数码","家用电器","箱包手袋","美妆个护","手机数码","家用电器"};
        for (int i = 0 ; i < 14 ;i ++){
            CategoryTitle c1 = new CategoryTitle();
            c1.setId(i);
            c1.setName(titles[i]);
            list.add(c1);
        }
        return list;
    }

    public List<CategorySection> getCategory(int id){
        switch (id){
            case 0:
                return getCategory0();
            case 1:
                return getCategory1();
            case 2:
                return getCategory2();
            case 3:
                return getCategory3();
            default:
                return getCategory0();
        }
    }
    public List<CategorySection> getCategory0(){
        List<CategorySection> list = new ArrayList<>();
        list.add(new CategorySection(true,"推荐"));
        list.add(new CategorySection(new Category(1,"手机","https://img12.360buyimg.com/n5/s54x54_jfs/t4912/147/1285473015/54254/ad28d669/58ef1edcN7ac1e566.jpg")));
        list.add(new CategorySection(new Category(2,"笔记本","https://img11.360buyimg.com/n7/jfs/t2968/143/2485546147/238650/70df281e/57b12a31N8f4f75a3.jpg")));
        list.add(new CategorySection(new Category(3,"空调","https://img12.360buyimg.com/n7/jfs/t3922/152/2113081837/101983/1d02fac2/58ca3aa9Nd6c0138e.jpg")));
        list.add(new CategorySection(new Category(4,"炒锅","https://img10.360buyimg.com/imgzone/jfs/t5110/167/64979372/266152/803cf2b4/58f816c0N5b17d369.jpg")));
        list.add(new CategorySection(true,"品牌"));
        list.add(new CategorySection(new Category(1,"苹果","https://img12.360buyimg.com/n7/jfs/t3034/299/2060854617/119711/577e85cb/57d11b6cN1fd1194d.jpg")));
        list.add(new CategorySection(new Category(2,"小米","https://img14.360buyimg.com/n7/jfs/t3457/335/2158323307/437481/f8fdf0fe/584a7a5dN39c2ef36.jpg")));
        list.add(new CategorySection(new Category(3,"华为","https://img14.360buyimg.com/n7/jfs/t3250/17/1239416229/263988/a3d4f2f1/57c8d85eN6d26ef2c.jpg")));
        list.add(new CategorySection(new Category(4,"魅族","https://img11.360buyimg.com/n7/jfs/t5017/186/976404781/96259/9f67d477/58eb5b8eN9efdc9f2.jpg")));
        list.add(new CategorySection(new Category(5,"OPPO","https://img11.360buyimg.com/n7/jfs/t3334/118/950912833/79547/3301c78b/58194797N47934bdf.jpg")));
        list.add(new CategorySection(new Category(6,"VIVO","https://img10.360buyimg.com/n7/jfs/t4735/339/1082120588/158448/ae60a75e/58eca1d1N1c8ab841.jpg")));
        return list;
    }
    public List<CategorySection> getCategory1(){
        List<CategorySection> list = new ArrayList<>();
        for (int i = 0 ; i < 2; i++){
            list.add(new CategorySection(true,"生鲜"));
            list.add(new CategorySection(new Category(1,"坚果","https://img11.360buyimg.com/n2/jfs/t2881/35/2518829331/258662/9362122f/576a4213N168f49fa.jpg")));
            list.add(new CategorySection(new Category(2,"牛奶","https://img10.360buyimg.com/n2/jfs/t3082/5/2301254842/368202/bf3cf2de/57dfa7abN82525887.jpg")));
            list.add(new CategorySection(new Category(3,"欢乐果","https://img12.360buyimg.com/n2/jfs/t3226/60/5928630427/483800/946bedb0/5897e416N0207bb15.jpg")));
            list.add(new CategorySection(new Category(4,"杯子","https://img11.360buyimg.com/n2/jfs/t1912/78/769563939/79414/2065b847/5628a8b3N1bb2670f.jpg")));
            list.add(new CategorySection(true,"食品"));
            list.add(new CategorySection(new Category(1,"苹果","https://img12.360buyimg.com/n7/jfs/t3034/299/2060854617/119711/577e85cb/57d11b6cN1fd1194d.jpg")));
            list.add(new CategorySection(new Category(2,"小米","https://img14.360buyimg.com/n7/jfs/t3457/335/2158323307/437481/f8fdf0fe/584a7a5dN39c2ef36.jpg")));
            list.add(new CategorySection(new Category(3,"华为","https://img14.360buyimg.com/n7/jfs/t3250/17/1239416229/263988/a3d4f2f1/57c8d85eN6d26ef2c.jpg")));
            list.add(new CategorySection(new Category(4,"魅族","https://img11.360buyimg.com/n7/jfs/t5017/186/976404781/96259/9f67d477/58eb5b8eN9efdc9f2.jpg")));
            list.add(new CategorySection(new Category(5,"OPPO","https://img11.360buyimg.com/n7/jfs/t3334/118/950912833/79547/3301c78b/58194797N47934bdf.jpg")));
            list.add(new CategorySection(new Category(6,"VIVO","https://img10.360buyimg.com/n7/jfs/t4735/339/1082120588/158448/ae60a75e/58eca1d1N1c8ab841.jpg")));
        }
        return list;
    }
    public List<CategorySection> getCategory2(){
        List<CategorySection> list = new ArrayList<>();
        for (int i = 0 ; i < 2; i++){
            list.add(new CategorySection(true,"LV"));
            list.add(new CategorySection(new Category(1,"手机","https://img12.360buyimg.com/n5/s54x54_jfs/t4912/147/1285473015/54254/ad28d669/58ef1edcN7ac1e566.jpg")));
            list.add(new CategorySection(new Category(2,"笔记本","https://img11.360buyimg.com/n7/jfs/t2968/143/2485546147/238650/70df281e/57b12a31N8f4f75a3.jpg")));
            list.add(new CategorySection(new Category(3,"空调","https://img12.360buyimg.com/n7/jfs/t3922/152/2113081837/101983/1d02fac2/58ca3aa9Nd6c0138e.jpg")));
            list.add(new CategorySection(new Category(4,"炒锅","https://img10.360buyimg.com/imgzone/jfs/t5110/167/64979372/266152/803cf2b4/58f816c0N5b17d369.jpg")));
            list.add(new CategorySection(true,"Coco"));
            list.add(new CategorySection(new Category(1,"苹果","https://img12.360buyimg.com/n7/jfs/t3034/299/2060854617/119711/577e85cb/57d11b6cN1fd1194d.jpg")));
            list.add(new CategorySection(new Category(2,"小米","https://img14.360buyimg.com/n7/jfs/t3457/335/2158323307/437481/f8fdf0fe/584a7a5dN39c2ef36.jpg")));
            list.add(new CategorySection(new Category(3,"华为","https://img14.360buyimg.com/n7/jfs/t3250/17/1239416229/263988/a3d4f2f1/57c8d85eN6d26ef2c.jpg")));
            list.add(new CategorySection(new Category(4,"魅族","https://img11.360buyimg.com/n7/jfs/t5017/186/976404781/96259/9f67d477/58eb5b8eN9efdc9f2.jpg")));
            list.add(new CategorySection(new Category(5,"OPPO","https://img11.360buyimg.com/n7/jfs/t3334/118/950912833/79547/3301c78b/58194797N47934bdf.jpg")));
            list.add(new CategorySection(new Category(6,"VIVO","https://img10.360buyimg.com/n7/jfs/t4735/339/1082120588/158448/ae60a75e/58eca1d1N1c8ab841.jpg")));
        }
        return list;
    }
    public List<CategorySection> getCategory3(){
        List<CategorySection> list = new ArrayList<>();
        for (int i = 0 ; i < 2; i++){
            list.add(new CategorySection(true,"AMANI"));
            list.add(new CategorySection(new Category(1,"手机","https://img12.360buyimg.com/n5/s54x54_jfs/t4912/147/1285473015/54254/ad28d669/58ef1edcN7ac1e566.jpg")));
            list.add(new CategorySection(new Category(2,"笔记本","https://img11.360buyimg.com/n7/jfs/t2968/143/2485546147/238650/70df281e/57b12a31N8f4f75a3.jpg")));
            list.add(new CategorySection(new Category(3,"空调","https://img12.360buyimg.com/n7/jfs/t3922/152/2113081837/101983/1d02fac2/58ca3aa9Nd6c0138e.jpg")));
            list.add(new CategorySection(new Category(4,"炒锅","https://img10.360buyimg.com/imgzone/jfs/t5110/167/64979372/266152/803cf2b4/58f816c0N5b17d369.jpg")));
            list.add(new CategorySection(true,"BIRD"));
            list.add(new CategorySection(new Category(1,"苹果","https://img12.360buyimg.com/n7/jfs/t3034/299/2060854617/119711/577e85cb/57d11b6cN1fd1194d.jpg")));
            list.add(new CategorySection(new Category(2,"小米","https://img14.360buyimg.com/n7/jfs/t3457/335/2158323307/437481/f8fdf0fe/584a7a5dN39c2ef36.jpg")));
            list.add(new CategorySection(new Category(3,"华为","https://img14.360buyimg.com/n7/jfs/t3250/17/1239416229/263988/a3d4f2f1/57c8d85eN6d26ef2c.jpg")));
            list.add(new CategorySection(new Category(4,"魅族","https://img11.360buyimg.com/n7/jfs/t5017/186/976404781/96259/9f67d477/58eb5b8eN9efdc9f2.jpg")));
            list.add(new CategorySection(new Category(5,"OPPO","https://img11.360buyimg.com/n7/jfs/t3334/118/950912833/79547/3301c78b/58194797N47934bdf.jpg")));
            list.add(new CategorySection(new Category(6,"VIVO","https://img10.360buyimg.com/n7/jfs/t4735/339/1082120588/158448/ae60a75e/58eca1d1N1c8ab841.jpg")));
        }
        return list;
    }

}
