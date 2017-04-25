package com.neowang.jdsort;

/**
 * Created by cd14 on 2017/4/25.
 */

public class Category {
    private int id;
    private String name;
    private String imageUrl;
    public Category(int id,String name,String url){
        this.id = id;
        this.name = name;
        this.imageUrl = url;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
