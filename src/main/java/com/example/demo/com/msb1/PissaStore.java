package com.example.demo.com.msb1;

import java.util.Scanner;

/**
 * @Auther:amy.zheng
 * @Date:2022-03-12-3:32 PM
 * @Description:
 */
public class PissaStore extends Pissa {
    public PissaStore() {
    }

    public  static Pissa CreatePissa( int num){
        Pissa p=null;
        int gram;
        int size;
        double price;
        String peiliao;
        Scanner sc=new Scanner(System.in);
        switch (num){

            case 1: System.out.println("请输入培根的克数");
                gram=sc.nextInt();
                System.out.println("请输入披萨的大小");
                size=sc.nextInt();
                System.out.println("请输入披萨的价格");
                price=sc.nextDouble();

                p=new PeiGenPissa("培根披萨",price,size,gram);
                break;
            case 2:
            {
                System.out.println("请输入你想加入的水果");
                peiliao=sc.next();
                System.out.println("请输入披萨的大小");
                size=sc.nextInt();
                System.out.println("请输入披萨的价格");
                price=sc.nextDouble();

                p=new ShuiGuoPissa("水果披萨",price,size,peiliao);}
                break;
                default:
                    System.out.println("请输入1或2");

        }
        return p;


    }
}
