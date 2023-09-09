package com.example.demo.com.msb1;

/**
 * @Auther:amy.zheng
 * @Date:2022-03-12-2:44 PM
 * @Description:
 */
public class Pissa {

    //属性 名称 价格 大小
    private  String name;
    private double price;
    private int size;
//空构造器
    public Pissa() {
    }
//有参构造器
    public Pissa(String name, double price, int size) {
        this.name = name;
        this.price = price;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    //方法展示
    public void  Deplay(){

        System.out.println("名称："+this.name+"\n价格："+this.price+"元"+"\n大小： "+this.size+"寸");
    }



}
