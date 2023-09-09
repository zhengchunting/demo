package com.example.demo.com.testFile.testio;

import java.io.File;

/**
 * @Date:2023-08-05-3:00 PM
 */
public class Test01 {
    //main函数所有程序的主入口
    public static void main(String[] args) {
        File f=new File("/Users/wodediannao/Downloads:\\test.txt");
        File f1=new File("/Users/wodediannao/Downloads:/test.txt");
        File f2=new File("/Users/wodediannao/Downloads:"+File.separator+"test.txt");
        System.out.println(f2.canRead());
        System.out.println(f2.canWrite());
        System.out.println(f2.getName());
        System.out.println(f2.getParent());
        System.out.println(f2.isDirectory());
        System.out.println(f2.isFile());
        System.out.println(f2.isHidden());
        System.out.println(f2.length());
        System.out.println(f2.exists());
    }
}
