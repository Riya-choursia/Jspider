package com.numberprogram;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[]args){
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter a Number:");
        int num=scn.nextInt();
        if(num%2==0){
            System.out.println("Number is even: " +num);
        }
        else{
            System.out.println("Number is Odd: " +num);
        }

    }
}
