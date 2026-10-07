package com.stringprogram;

import java.util.Scanner;

public class KeyOccurance {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter a String");
        String s=scn.nextLine();
        System.out.println("Enter a key");
        char key=scn.next().charAt(0);
        int count=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch == key)
                count++;
        }
        System.out.println(key + "=" +count);

    }
}
