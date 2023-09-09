package com.example.demo.com.testsetstudey;

import java.util.TreeSet;

/**
 * @Date:2023-07-29-6:43 PM
 */
public class testtreeset {
    //main函数所有程序的主入口
    public static void main(String[] args) {
        TreeSet set=new TreeSet();
        set.add("a");
        set.add("b");
        System.out.println(set);
        TreeSet<Integer> treeSet=new TreeSet<>();
        treeSet.add(9);
        treeSet.add(2);
        treeSet.add(5);
        treeSet.add(6);
        treeSet.add(6);
        System.out.println(treeSet);
    }
}
