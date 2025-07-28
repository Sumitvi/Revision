package org.example.collections;


import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListDemo {

    public static void main(String args[]){

        LinkedList<Integer> list = new LinkedList<>();
        Scanner sc = new Scanner(System.in);



        while(true){
            System.out.println("Enter Elements to Add in First");
            int ele = sc.nextInt();
            list.addFirst(ele);
            System.out.println("New LinkedList is " + list);

            System.out.println("Enter Elements to Add in Last");
            int ele1 = sc.nextInt();

            list.addLast(ele1);
            System.out.println("New LinkedList is " + list);

            if(list.size()>=4){
                break;
            }
        }

        while(true){
            System.out.println("Remove Element");
            int removeele = sc.nextInt();
            list.remove(removeele);
            System.out.println("List is " + list);

            if(list.size()>=4){
                System.out.println("No Such List Exist");
                break;
            }
        }


    }
}
