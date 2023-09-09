package com.example.demo.com.msb1;

import java.util.Scanner;

/**
 * @Auther:amy.zheng
 * @Date:2022-03-12-3:05 PM
 * @Description:
 */
public class GongChang  extends Pissa{
    public GongChang() {
    }

    public static  void CreatePissa(int num){
        Pissa p;
        Scanner sc=new Scanner(System.in);
        int size;
        double price;
        int gram;
        String peiliao;

        if(num==1){
            System.out.println("请输入培根的克数");
            gram=sc.nextInt();
            System.out.println("请输入披萨的大小");
            size=sc.nextInt();
            System.out.println("请输入披萨的价格");
            price=sc.nextDouble();

            p=new PeiGenPissa("培根披萨",price,size,gram);
            p.Deplay();


        }else if(num==2) {

            System.out.println("请输入你想加入的水果");
            peiliao=sc.next();
            System.out.println("请输入披萨的大小");
            size=sc.nextInt();
            System.out.println("请输入披萨的价格");
            price=sc.nextDouble();

            p=new ShuiGuoPissa("水果披萨",price,size,peiliao);
            p.Deplay();

        }else{

            System.out.println("输入的不是1或2");
            p=null;

        }



    }

}
