package com.example.demo.com.msb2.fx;

import java.util.ArrayList;
import java.util.List;

/**
 * @Date:2023-07-16-2:06 PM
 */
public class fxa {
    public static  <T> T a(T x){
        return  x;

    }

    public void b(List<?> list11){
        for(Object x:list11){
            System.out.println(x);
        }
    }

    //main函数所有程序的主入口
    public static void main(String[] args) {

        List list12=new ArrayList();
        list12.add(23);
        list12.add("lili");
        for(Object a:list12){
            System.out.println(a);
        }
        List<String> liststring=new ArrayList<>();
        liststring.add("hah");
        liststring.add("lili");
        for(int i=0;i<liststring.size();i++){
            System.out.println(liststring.get(i));
        }

        for(String  x:liststring){
            System.out.println(x);
        }

        Object[] objects=new Object[10];
        String[] strings=new String[29];
        objects=strings;
        List<Object> list=new ArrayList<>();
        List<String> list1=new ArrayList<>();
        List<Integer> list2=new ArrayList<>();
        List<?> list3=null;
        list3=list;
        list3=list2;
        list3=list1;
        fxa b=new fxa();
        b.b(new ArrayList<Object>());
        b.b(new ArrayList<String>());


    }
}
