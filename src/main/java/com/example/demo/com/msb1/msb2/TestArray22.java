package com.example.demo.com.msb1.msb2;

/**
 * @Auther:amy.zheng
 * @Date:2022-03-13-9:19 PM
 * @Description:
 */
public class TestArray22 {

    //参数，给我一个数组，求最大值还是最小值  。返回最大值，最小值
    public int getMaxorMin(int[] arr,boolean flag){//flag= true最大值
        //找一个变量

        int temp=arr[0];
        // 求最大值
        //遍历数组，找值赋值给temp

        for (int i = 0; i <arr.length ; i++) {

            if(flag&&arr[i]>temp){

                    temp=arr[i];




            }else if(!flag&&arr[i]<temp){

                // 求最小值
                        temp=arr[i];
            }



        }
//返回temp
        return temp;

    }
    //main函数所有程序的主入口
    public static void main(String[] args) {
        // 求一个数组的最大值，最小值

        //数组
        int[] a={1,2,4,5,6,7,8};
        TestArray22 ax=new TestArray22();
        int temp=ax.getMaxorMin(a,true);
        System.out.println(temp);



        // 求最大值
        int max=a[0];
        for (int i = 0; i <a.length ; i++) {
            if(a[i]>max){
                max=a[i];

            }

        }
        System.out.println(max);
    }

}
