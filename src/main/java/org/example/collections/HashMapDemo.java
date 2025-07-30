package org.example.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

    public static void main(String args[]){

        HashMap<Integer , Integer> map = new HashMap<>();
//        map.put(0, 1);
//        map.put(1, 2);
//        map.put(2, 4);
//        map.put(3, 5);
//        map.put(4, 6);
//        map.put(5, 8);
        int arr[] = {1 , 1 , 2 , 3 , 4, 3 ,4 ,3 ,4 ,1 ,1};

        System.out.println(map);

//        Caluculating Frequencies in hashmap

        for(int num : arr){
            map.put(num , map.getOrDefault(num , 0) + 1);
        }

        System.out.println(map);

//        need to return the element whose frequency is 1

        for(Map.Entry<Integer , Integer> entry : map.entrySet()){
            if(entry.getValue()==1){
                System.out.println(entry.getKey());
            }
        }



    }
}
