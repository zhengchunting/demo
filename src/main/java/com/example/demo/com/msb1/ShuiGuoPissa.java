package com.example.demo.com.msb1;

/**
 * @Auther:amy.zheng
 * @Date:2022-03-12-2:44 PM
 * @Description:
 */
public class ShuiGuoPissa extends Pissa {
    //自己独有的属性 配料。
    private String Cailiao;

    public ShuiGuoPissa() {
    }

    public ShuiGuoPissa(String cailiao) {
        Cailiao = cailiao;
    }

    public ShuiGuoPissa(String name, double price, int size, String cailiao) {
        super(name, price, size);
        Cailiao = cailiao;
    }
    //展示


    @Override
    public void Deplay() {
        super.Deplay();
        System.out.println("配料水果： "+Cailiao);
    }

    //main函数所有程序的主入口
    public static void main(String[] args) {
        ShuiGuoPissa s=new ShuiGuoPissa("水果披萨",103,23,"苹果、香蕉");
        s.Deplay();
    }

}
