package com.example.demo.com.msb1;

/**
 * @Auther:amy.zheng
 * @Date:2022-03-12-2:45 PM
 * @Description:
 */
public class PeiGenPissa extends Pissa {
    //特有的属性
    private  int gram;
    //空构造器
    public PeiGenPissa() {
    }
    //有参构造器
    public PeiGenPissa(String name, double price, int size, int gram) {
        super(name, price, size);
        this.gram = gram;
    }

    @Override
    public void Deplay() {
        super.Deplay();
        System.out.println("培根克数:"+gram+"g");
    }

    //main函数所有程序的主入口
    public static void main(String[] args) {
        //创建培根对象
        PeiGenPissa p=new PeiGenPissa("培根披萨",189,10,30);
        p.Deplay();
    }
}
