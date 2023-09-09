package com.example.demo;

import com.alibaba.fastjson.parser.JSONScanner;

public class GetNameImpl  implements  TestApiOne{
    @Override
    public String getName(String name) {
        JSONScanner a=new JSONScanner("dfd");
        System.out.println("获取名字"+name);


        return name;
    }
    public static  void main(String[] args){


        GetNameImpl get1=new GetNameImpl();
        get1.getName(args[0]);





    }

}
