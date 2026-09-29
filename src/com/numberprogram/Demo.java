package com.numberprogram;

public class Demo {
    public int add(int i, int j){
        System.out.println("Inside add method");
        return i+j;
    }

    public static void main(String[] args){
        Demo d=new Demo();
        int result=d.add(2,3);
        //add the result
        System.out.println(result);
    }
}
