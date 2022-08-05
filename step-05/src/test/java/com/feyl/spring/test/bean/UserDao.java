package com.feyl.spring.test.bean;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Feyl
 */
public class UserDao {

    private static Map<String, String> hashMap = new HashMap<>();

    static {
        hashMap.put("10001", "小傅哥");
        hashMap.put("10002", "Spring");
        hashMap.put("10003", "Flow");
    }

    public String queryUserName(String uId) {
        return hashMap.get(uId);
    }
}
