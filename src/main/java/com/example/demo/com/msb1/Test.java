package com.example.demo.com.msb1;

import java.util.Scanner;

/**
 * @Auther:amy.zheng
 * @Date:2022-03-12-3:05 PM
 * @Description:
 */
public class Test {
    //main函数所有程序的主入口
    public static void main(String[] args) {
        System.out.println("请输入你想制作的披萨 1 培根披萨  2 水果披萨");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
//        GongChang.CreatePissa(num);

        PissaStore.CreatePissa(num).Deplay();


        //g.CreatePissa(num);
//        Pissa p=g.CreatePissa(num);
//        p.Deplay();

    }
}
