package com.example.demo;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

public class test {

    public static void main(String[] args) {
        System.out.println
                ("// 获取jsonArray数组内容方式一，格式如下\n" +
                        "// 1 先转化成jsonObject\n" +
                        "// 2 按照类型提取数据使用getJSONObject，getJSONArray");
        String str1 = "{\"status\":\"1\",\"msg\":\"success\",\"data\":{\"orderinfo\":[{\"orderuuid\":\"23232\",\"info\":\"1\"},{\"orderuuid\":\"231213\",\"info\":\"12\"}]}}";
        JSONObject strjson = JSONObject.parseObject(str1);
        JSONObject datajson = strjson.getJSONObject("data");
        JSONArray dataarray = datajson.getJSONArray("orderinfo");
        for (int i = 0; i < dataarray.size(); i++) {
            System.out.println(dataarray.getJSONObject(i).getString("orderuuid"));
        }
        System.out.println("**************************************************************");
        System.out.println
                ("// 获取jsonArray数组内容方式二，格式如下\n" +
                        "// 1 按照类型提取数据使用JSONObject.parseArray()");
        String str2 = "[{\"orderuuid\":\"23232\",\"info\":\"1\"},{\"orderuuid\":\"231213\",\"info\":\"12\"}]";
        JSONArray dataarray2 = JSONObject.parseArray(str2);
        for (int i = 0; i < dataarray2.size(); i++) {
            System.out.println(dataarray2.getJSONObject(i).getString("orderuuid"));
        }
    }

}
