package com.example.demo.com.msb1.msb2;

/**
 * @Auther:amy.zheng
 * @Date:2022-03-12-3:42 PM
 * @Description:
 */
public class Person {
    //属性 姓名 身高  年龄 体重
    String name;
    int age;
    double height;
    double weight;

    //动词  方法  我会吃饭  我会睡觉 我会跑步
    public void eat(){
        System.out.println("我会吃饭");
    }
    public  void sleep(){

        System.out.println("我会睡觉");
    }
    public void run(){

        System.out.println("我会跑步");
    }
//空构造函数
    public Person() {
    }
    //有参构造函数
    public Person(String name, int age, double height, double weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    //自我介绍，返还字符串
    public String intruduce(){

        return "我的姓名是："+name+"\n我的年龄是："+age+"\n我的身高是："+height+"\n我的体重是："+weight;
    }

    //main函数所有程序的主入口
    public static void main(String[] args) {
//        Person p=new Person();
//        p.weight=56.2;
//        p.height=167;
//        p.age=30;
//        p.name="郑春婷";
        //创建一个对象，并且调用了有参构造器，给属性进行初始化赋值
        Person p=new Person("郑春亭",30,53,167);
        String intruduce=p.intruduce();
        System.out.println(intruduce);

        Person person2=new Person("程鹏",29,180,180);
        System.out.println(person2.intruduce());

        Person p3=new Person("张晓",7,20,150);
        System.out.println(p3.intruduce());


    }
}
