package com.company;

public class Main {

    public static void main(String[] args) {

        Temp<Integer> temp1=new Temp<>(1);
        Temp<Integer> temp2=new Temp<>(2);
        Temp<Integer> temp3=new Temp<>(3);
        Temp<Integer> temp4=new Temp<>(4);
        Temp<Integer> temp5=new Temp<>(5);

        System.out.println(temp1.getId());
        System.out.println(temp2.getId());
        System.out.println(temp3.getId());
        System.out.println(temp4.getId());
        System.out.println(temp5.getId());
    }
}
