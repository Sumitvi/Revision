package org.example.collections;
import java.util.ArrayList;

public class ArrayList1 {

    public static void main(String args[]){
        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(10);
        arr.add(8);
        arr.add(6);
        arr.add(4);

        System.out.println(arr);

        if(arr.isEmpty()){
            System.out.println("List is Empty");
        }

        System.out.println(arr.get(0));
        System.out.println(arr.get(1));

        for (int list : arr){
            System.out.println("List is: " + list);
        }


        System.out.print("List is ");
        for(int i=0;i<arr.size();i++){
            System.out.print(" " + arr.get(i));
        }




    }
}
