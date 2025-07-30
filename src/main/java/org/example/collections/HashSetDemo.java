package org.example.collections;

import java.util.Arrays;
import java.util.HashSet;

public class HashSetDemo {

    public static void main(String args[]){

//        HashSet Remote Duplicates
//        not a index based System

        int nums [] = {1 ,2 ,5 , 5,  1 , 2 , 3 , 3 , 3 ,4 , 5};
        HashSet<Integer> set = new HashSet<>();

        for(int num : nums){
            set.add(num);
        }

        System.out.println(set);
        set.add(10);
        set.add(20);
        set.add(30);

        System.out.println(set);

//        System.out.println(set.toArray().toString());

    }
}
