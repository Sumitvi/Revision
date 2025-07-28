package org.example.collections;
import java.util.*;

public class LinkedList1 {

    public static void main(String args[]){

        LinkedList<String> list = new LinkedList<>();
        list.addFirst("Apple");
        list.addLast("Orange");
        System.out.println(list);

        list.addFirst("Papaya");
        list.addFirst("Banana");
        list.addLast("Mango");

        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.get(0));




    }
}
