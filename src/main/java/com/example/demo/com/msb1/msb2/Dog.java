package com.example.demo.com.msb1.msb2;

/**
 * @Auther:amy.zheng
 * @Date:2022-03-12-6:42 PM
 * @Description:
 */
public class Dog {
    static {
        System.out.println("hha");
    }
    {
        System.out.println("构造快");
    }
    public  void eat(){

        int num;
        {
            int a;
        }
        System.out.println();
    }
    public void shut(){
        //System.out.println(num);
    }

    //main函数所有程序的主入口
    public static void main(String[] args) {

        Dog d=new Dog();


    }
}
