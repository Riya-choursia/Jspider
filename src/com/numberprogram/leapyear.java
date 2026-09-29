package com.numberprogram;

import java.util.Scanner;

public class leapyear {
    public static void main(String[]args){
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter a year to check wheather it is leap year or not");
        int year= scn.nextInt();
        if(year%400==0){
            System.out.println("Leap year");
        }
        else if(year%4==0 && year%100!=0){

        }
        else{
            System.out.println("Not a Leap Year");
        }
    }
}
