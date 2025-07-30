package org.example.collections;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {

    public static void main(String args[]){

//        TreeMap is Used to Store Elements in Sorted order
//        why we use wrapper class intead of int??
//        because all the wrapper classed contains compaparator that's why we use wrapper classes
        TreeMap<Integer , Integer> map = new TreeMap<>();
        int nums[] = {1 ,2 ,3 ,3 ,1 ,3 ,1,3 ,4 ,5 ,6 ,7 ,4};

        for(int num : nums){
            map.put(num , map.getOrDefault(num , 0) + 1);
        }

        System.out.println(map);

//        Print Element whose Frequency is 2

        for(Map.Entry<Integer , Integer> entry : map.entrySet()){
            if(entry.getValue()==2){
                System.out.println(entry.getKey());
            }
        }


    }
}
