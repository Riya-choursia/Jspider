package com.OOPS;
class Aa{
    int i;
    void m1(){
        System.out.println(i);
    }
}
class Bb extends Aa{
    int j;
    void m2(){
        System.out.println("j " + j);
        System.out.println("i " + i);
    }
}
public class VariableInherit {
    public static void main(String[] args){
        Bb b1=new Bb();
        b1.i=10;
        b1.j=20;
        b1.m1();
        b1.m2();
    }
}
