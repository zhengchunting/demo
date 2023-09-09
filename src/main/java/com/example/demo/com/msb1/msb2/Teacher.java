package com.example.demo.com.msb1.msb2;

/**
 * @Auther:amy.zheng
 * @Date:2022-03-12-4:40 PM
 * @Description:
 */
public class Teacher {

    //属性
    static String name;
    int age;
    double height;
    //空构造器不会对属性进行赋值。
    public Teacher() {
    }
    //有参构造器，会对属性进行赋值
    public Teacher(String name, int age){
        this.name=name;
        this.age=age;
    }
    public Teacher(String name,int age,double height){

//        this.name=name;
//        this.age=age;
        this(name,age);
        this.height=height;

    }
    public static void eat(){
        //height=23.3;
        name="89";
        System.out.println("老师吃饭");
    }
    public void study(){

        eat();
        System.out.println("吃饭之后我在学习");
    }

    //main函数所有程序的主入口
    public static void main(String[] args) {
        Teacher.name="hha";
        Teacher.eat();
        System.out.println(Teacher.name);
        Teacher t=new Teacher("hha",34);
        System.out.println(t.name+t.age);
        Teacher t2=new Teacher("xx",90);
        System.out.println(t2.name+t2.age);
        t.study();
        Teacher t3=new Teacher("hh",33,98);
        System.out.println(t3.name+"\t"+t3.age+"\t"+t3.height);
    }
}
