package com.example.demo.com.msb1.msb2;

import java.util.Arrays;

/**
 * @Auther:amy.zheng
 * @Date:2022-03-14-8:43 PM
 * @Description:
 */
public class Array2 {
    //main函数所有程序的主入口
    public static void main(String[] args) {
        //根据最大值，拆分1个数组
        int[] oldArray={1,2,3,4,9,5,6};
        //找最大值
        int max=oldArray[0];
        int index=0;//存储最大值的索引位置。
        for (int i = 0; i <oldArray.length ; i++) {
            if(oldArray[i]>max){
                max=oldArray[i];
                index=i;

            }

        }
        System.out.println("最大值是："+max);
        System.out.println("最大值的索引位置是："+index);


        int[] a=new int[index];
        int[] b=new int[oldArray.length-a.length-1];//原来数组的个数去掉a里面的个数，再去掉最大值的个数，剩下的就是b的个数

        System.out.println("a个数=" +a.length);
        System.out.println("b个数=" +b.length);

        //把原来数组的值，最大值前面的加到a里面。最大值后面的加到b里面
        //给a填满
        for (int i = 0; i <a.length ; i++) {
            a[i]=oldArray[i];

        }

        //给b填满
        for (int i = 0; i <b.length ; i++) {

            b[i]=oldArray[a.length+1+i];//  b0=4+1+0,b1=4+1+1,b2=4+1+2

        }

        System.out.println("a数组是" + Arrays.toString(a));
        System.out.println("b数组是" + Arrays.toString(b));

    }
}
