package com.practice;

public class Demo {
    public static void main(String[] args) {
        Add add = new Add();

        int result = add.addition(10, 30);

        System.out.println(result);
        System.out.println("Added new line");


    }

    public static class Add {
        public int addition(int i, int j) {
            return i + j;
        }
    }
}


