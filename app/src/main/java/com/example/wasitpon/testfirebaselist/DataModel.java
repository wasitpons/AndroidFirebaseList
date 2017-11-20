package com.example.wasitpon.testfirebaselist;

/**
 * Created by Wasitpon on 11/20/2017.
 */

import java.util.HashMap;
import java.util.Map;

public class DataModel {
    String title,content,thumbnail,key;

    public DataModel(){}
    public DataModel(String title, String content, String thumbnail, String key) {
        this.title = title;
        this.content = content;
        this.thumbnail = thumbnail;
        this.key = key;
    }

    public Map<String, Object> toMap(){
        HashMap<String, Object> result = new HashMap<>();
        result.put("title",title);
        result.put("content",content);
        result.put("thumbnail",thumbnail);
        result.put("key",key);
        return result;
    }

}
