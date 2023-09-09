package com.example.demo.com;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.ListIterator;

/**
 * @Date:2023-07-23-5:29 PM
 */
public class testset {
    //main函数所有程序的主入口
    public static void main(String[] args) {
        HashSet<Integer> hashSet=new HashSet<>();
        System.out.println(hashSet.add(43));
        System.out.println(hashSet.add(43));
        hashSet.add(433);
        hashSet.add(433);
        hashSet.add(432);
        System.out.println(hashSet.size());
        System.out.println(hashSet);

        HashSet<String> hashSet1=new HashSet<>();
        hashSet1.add("dd");
        hashSet1.add("dd");
        hashSet1.add("dd");
        hashSet1.add("dd");
        hashSet1.add("dd33");
        hashSet1.add("dd3");
        hashSet1.add("dd");
        System.out.println(hashSet1.size());
        System.out.println(hashSet1);

        HashSet<Student> hashSet2=new HashSet<>();
        hashSet2.add(new Student("dfd",34));
        hashSet2.add(new Student("dfd",34));
        hashSet2.add(new Student("dfd",34));
        hashSet2.add(new Student("df3d",334));
        hashSet2.add(new Student("dfd",34));
        hashSet2.add(new Student("dfd",34));
        System.out.println(hashSet2.size());
        System.out.println(hashSet2);

        ArrayList<String> list=new ArrayList<>();
        list.add("aa");
        list.add("bb");
        list.add("cc");
        list.add("ee");


//        for(String s:list){
//            if(s.equals("cc")){
//                list.add("kk");
//            }
//        }
//        Exception in thread "main" java.util.ConcurrentModificationException
//        at java.util.ArrayList$Itr.checkForComodification(ArrayList.java:911)
//        at java.util.ArrayList$Itr.next(ArrayList.java:861)
//        at com.example.demo.com.testset.main(testset.java:49)

        ListIterator<String> listIterator=list.listIterator();
        while (listIterator.hasNext()){
            if("cc".equals(listIterator.next())){
                listIterator.add("kk");
            }
        }
        System.out.println(list);
    }
}
