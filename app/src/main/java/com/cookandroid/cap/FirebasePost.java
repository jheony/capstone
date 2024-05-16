package com.cookandroid.cap;

import com.google.firebase.database.Exclude;
import com.google.firebase.database.IgnoreExtraProperties;

import java.util.HashMap;
import java.util.Map;

@IgnoreExtraProperties
public class FirebasePost {
    public String head;
    public String content;

    public FirebasePost(){

    }
    public FirebasePost(String head, String content){
        this.head = head;
        this.content = content;
    }
    @Exclude
    public Map<String, Object> toMap(){
        HashMap<String, Object> result = new HashMap<>();
        result.put("head", head);
        result.put("content", content);
        return result;
    }
}
