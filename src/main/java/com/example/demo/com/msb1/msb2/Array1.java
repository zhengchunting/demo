package com.example.demo.com.msb1.msb2;

import java.util.Arrays;

/**
 * @Auther:amy.zheng
 * @Date:2022-03-14-8:25 PM
 * @Description:
 */
public class Array1 {
    public Array1()throws Exception{

    }

    public static  void check(int an) throws Exception{

        System.out.println(10/an);
    }
    //main函数所有程序的主入口
    public static void main(String[] args) {
        //Array1 array1=new Array1();
        Integer a1=new Integer("343");
        //Array1.check(2);


        //合并2个数组
        //创建2个数组
        int[] a={1,2,3,6};
        int[] b={4,5,7};
        //合并到一个新的数组中
        int[] c=new int[a.length+b.length];

        //合并思路1：把a和b的值一个个加入到新数组c中

        //合并思路2：把c新数组填满。

        for (int i = 0; i < c.length; i++) {

            //先把a填进去，知道a的长度结束
            if(i<a.length){
                c[i]=a[i];
            }else {
                c[i]=b[i-a.length];
            }

            //a的长度结束，就走到b去找元素

        }
        System.out.println(Arrays.toString(c));
    }
}
