package com.stringprogram;

public class CountVowel {
    public static void main(String[] args){
        String s="java developer";
        int count=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ){
                count++;
                System.out.println(s +"="+ s.charAt(i));
            }
        }
        System.out.println(count);
    }
}
