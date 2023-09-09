package com.example.demo.com.msb1.msb2;

/**
 * @Auther:amy.zheng
 * @Date:2022-03-13-9:31 PM
 * @Description:
 */
public class TestArray33 {

    public String findEle(int[] arra,int elem){

        String s="所找的元素不存在于数组中";

        for (int i = 0; i < arra.length; i++) {
            if(elem==arra[i]){
                s="所找的元素存在于数组中";

                break;
            }

        }
        return s;


    }
    //main函数所有程序的主入口
    public static void main(String[] args) {
        //给定元素，是否在数组中存在。
        int[] a={2,3,4,6,7,8};
        TestArray33 t=new TestArray33();
        String x=t.findEle(a,0);
        System.out.println(x);


//        int find=2;
//        int[] a={2,3,4,6,7,8};
//        boolean flag=false;
//
//        for (int i = 0; i < a.length; i++) {
//            if(find==a[i]){
//                System.out.println("所找的元素存在于数组中");
//                flag=true;
//                break;
//            }
//
//        }
//        if(!flag){
//        System.out.println("所找的元素不存在于数组中");}
    }
}
