package com.collections;

import java.util.ArrayList;

public class ArrayListProgram {

    static void main(String[] args) {
        ArrayList array = new ArrayList();
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);
        array.add(1);
        array.remove(2);

        ArrayList arraynew = new ArrayList();
        arraynew.addAll(array);
        arraynew.add(40);
        System.out.println(arraynew.isEmpty());
        System.out.println(arraynew.size());

        System.out.println(arraynew);

        System.out.println(array);

    }
}
