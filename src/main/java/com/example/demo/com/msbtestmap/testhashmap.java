package com.example.demo.com.msbtestmap;

import java.util.*;

/**
 * @Date:2023-07-29-7:14 PM
 */
public class testhashmap {
    //main函数所有程序的主入口
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "aa", "bb", "cc");
        ArrayList<String> list2 = new ArrayList<>();
        Collections.addAll(list2, new String[]{"tt", "ss"});
        Collections.copy(list, list2);
        System.out.println(list);
        System.out.println(list2);
        Collections.fill(list2,"yy");
        System.out.println(list2);
        Map<String, Integer> map = new HashMap();
        System.out.println(map.put("lili", 34));
        System.out.println(map.put("lili", 45));
        System.out.println(map.put("lili3", 45));
        System.out.println(map.put("lili2", 45));
        System.out.println(map.put("lili233", 45));
        map.put("fefei", 4);
        map.remove("fefei");
        System.out.println(map.size());
        System.out.println(map);
        System.out.println(map.containsKey("lili"));
        System.out.println(map.containsValue(45));
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("lili", 45);
        System.out.println(map == map1);
        System.out.println(map.equals(map1));
        System.out.println(map.isEmpty());

        System.out.println(map.get("lili"));

        Set<String> strings = map.keySet();
        for (Object o : strings) {
            System.out.println(o);
        }
        Collection<Integer> values = map.values();
        for (Object o : values) {
            System.out.println(o);
        }

        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> o : entries) {
            System.out.println(o.getKey() + "dd" + o.getValue());

        }
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(23, "33");
        hashMap.put(23, "lili");
        hashMap.put(23, "fefe");
        hashMap.put(23, "yiny3");
        hashMap.put(23, "33");
        System.out.println(hashMap);
        System.out.println(hashMap.size());


    }
}
