package com.stringprogram;

import java.util.Locale;

public class ReverseCharacter {
    public static void main(String[] args){
        String name="Riya Choursia";
        String namesmall=name.toLowerCase();
        String res="";
        for(int i=namesmall.length()-1;i>=0;i--){
            res=res+namesmall.charAt(i);
        }
        System.out.println(name);
        System.out.println(res);
    }
}
