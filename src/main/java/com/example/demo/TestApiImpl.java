package com.example.demo;

public class TestApiImpl implements TestApi{
    @Override
    public void hello(String name) {
        System.out.println(String.format("世界 你好,%s来了", name));
    }

    @Override
    public void say(String name) {

    }

    @Override
    public void eat(String name) {

    }

    @Override
    public void sleep(String name) {

    }
    public static void main(String[] args){
        TestApiImpl tt=new TestApiImpl();
        tt.hello("郑春婷");
        System.out.println();
    }

}
