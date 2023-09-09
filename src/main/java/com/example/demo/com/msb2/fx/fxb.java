package com.example.demo.com.msb2.fx;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * @Date:2023-07-16-2:52 PM
 */
public class fxb<A> {
    int age;
    A sex;
    public void a (A n){

    }

    public void b(A[] n){
        System.out.println(Arrays.toString(n));
    }

    //main函数所有程序的主入口
    public static void main(String[] args) {
        fxb<String> x=new fxb<>();
        x.a("xx");
        String[] h={"3","4"};
        x.b(h);
        x.b(new String[]{"4","6"});

        LinkedList<String> linkedList=new LinkedList<>();
        linkedList.add("adb");
        linkedList.add("adb3");
        linkedList.add("adb34");
        linkedList.add("adeb");
        linkedList.add("addb");
        linkedList.add("asdb");
        linkedList.add("axdb");
        linkedList.add("axdb");
        linkedList.add("axdb");
        linkedList.add("axdb");
        System.out.println(linkedList);
        linkedList.addFirst("jj");
        linkedList.addFirst("rt");
        linkedList.addLast("r99t");

        linkedList.offer("kk");
linkedList.offerFirst("99");
linkedList.offerLast("oo");
        System.out.println(linkedList);

        System.out.println(linkedList.poll());

        System.out.println(linkedList);
        linkedList.pollFirst();
        System.out.println(linkedList);
        linkedList.removeFirst();
        System.out.println(linkedList);
        for(int i=0;i<linkedList.size();i++){
            System.out.print(linkedList.get(i)+"\t");
        }
        System.out.println("-------");
        for(String s:linkedList){
            System.out.print(s+"\t");
        }
        System.out.println("-------");

        Iterator<String> iterable=linkedList.iterator();
        while (iterable.hasNext()){
            System.out.print(iterable.next()+"\t");
        }
        System.out.println("-------");

        for (Iterator<String> it=linkedList.iterator();it.hasNext();){
            System.out.print(it.next()+"\t");
        }
        linkedList.clear();







    }
}
