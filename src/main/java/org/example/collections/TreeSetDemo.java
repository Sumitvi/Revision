package org.example.collections;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String args[]){

//        Tree Set is Used to Remove Duplicates
//        This give the values in sorted order

        int arr[] = {1,2 ,3 , 1, 2, 3 ,24 , 24 , 6 ,6 , 7 ,8 ,8, 8, 9};
        TreeSet< Integer> set = new TreeSet<>();

        for(int num : arr){
            set.add(num);
        }

        System.out.println(set);

    }
}
