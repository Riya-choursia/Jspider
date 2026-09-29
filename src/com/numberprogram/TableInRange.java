package com.numberprogram;

import java.util.Scanner;

public class TableInRange {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter a Number:");
        int num=scn.nextInt();
        System.out.println("Enter the Range:");
        int range=scn.nextInt();
        for(int i=1;i<=range;i++){
            System.out.println(num + "*" + i +"=" + (num*i));
        }

    }
}
