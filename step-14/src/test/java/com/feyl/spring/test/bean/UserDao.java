package com.feyl.spring.test.bean;

import com.feyl.spring.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Feyl
 */
@Component
public class UserDao {

    private static Map<String, String> hashMap = new HashMap<>();

    static {
        hashMap.put("10001", "小傅哥，北京，亦庄");
        hashMap.put("10002", "Spring，上海，尖沙咀");
        hashMap.put("10003", "Flow，香港，铜锣湾");
    }

    public String queryUserName(String uId) {
        return hashMap.get(uId);
    }
}
