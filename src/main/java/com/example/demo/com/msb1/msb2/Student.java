package com.example.demo.com.msb1.msb2;

/**
 * @Auther:amy.zheng
 * @Date:2022-03-12-3:54 PM
 * @Description:
 */
public class Student {
    //属性
    byte b;
    short s;
    int i;
    long l;
    float f;
    double d;
    char c;
    String sh;

    //构造器
    //方法
    //main函数所有程序的主入口
    public static void main(String[] args) {
        Student s=new Student();
        //输出byet类型的默认值=0
        System.out.println(s.b);
        //输出short类型的默认值=0；
        System.out.println(s.s);
        //输出int类型的默认值=0；
        System.out.println(s.i);
        //输出long类型的默认值=0；
        System.out.println(s.l);
        //输出float类型的默认值0.0；
        System.out.println(s.f);
        //输出double类型的默认值=0.0
        System.out.println(s.d);
        //输出char类型的默认值，1个空格
        System.out.println(s.c);
        //输出string引用类型的默认值=null
        System.out.println(s.sh);

    }
}
