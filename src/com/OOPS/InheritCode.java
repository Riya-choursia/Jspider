package com.OOPS;
class A{
     A(){
        System.out.println("A class Implemented");
    }
}
class B extends A{
    void m2(){
//        super.m1();
        System.out.println("B class Implemented");
    }
}
public class InheritCode {
    public static void main(String[] args){
//        A a1=new A();
//        a1.m1();
        B b1=new B();
        b1.m2();
    }

}
