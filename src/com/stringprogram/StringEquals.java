package com.stringprogram;

public class StringEquals {
    public static void main(String[] args){
        String name="Riya Choursia";
        String name2=new String("Riya Choursia");
        String name3=new String("Riya Choursia");

        System.out.println(name);
        System.out.println(name2);

        System.out.println(name==name2);
        System.out.println(name.hashCode());
        System.out.println(name2.hashCode());
        System.out.println(name.equals(name2));
    }
}
