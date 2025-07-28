package org.example.collections;


import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListDemo {

    public static void main(String args[]){

        LinkedList<Integer> list = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int ele = sc.nextInt();

        while(true){
            System.out.println("Enter Elements to Add in First");
            list.addFirst(ele);
            System.out.println("New LinkedList is " + list);

            System.out.println("Enter Elements to Add in Last");
            list.addLast(ele);
            System.out.println("New LinkedList is " + list);

            if(list.size()>=4){
                break;
            }
        }

    }
}
